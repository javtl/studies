USE banco_db;
-- 1
DELIMITER $$

CREATE PROCEDURE realizar_transferencia(
    IN p_origen CHAR(24), 
    IN p_destino CHAR(24), 
    IN p_importe DECIMAL(14,2), 
    OUT p_resultado VARCHAR(100)
)
BEGIN
    -- Solo declaramos variables si son estrictamente necesarias
    DECLARE v_saldo_actual DECIMAL(14,2) DEFAULT 0;
    DECLARE v_estado VARCHAR(20);
    DECLARE v_existe_destino INT DEFAULT 0;

    -- 1. Miramos si la cuenta origen existe y qué saldo/estado tiene
    -- Si no existe, las variables se quedan vacías (NULL)
    SELECT saldo, estado INTO v_saldo_actual, v_estado 
    FROM cuentas WHERE iban = p_origen;

    -- 2. Comprobamos si la cuenta destino existe (guardamos un 1 si existe)
    SELECT COUNT(*) INTO v_existe_destino 
    FROM cuentas WHERE iban = p_destino;

    -- 3. VALIDACIONES (Usamos IF simples, más fáciles de leer)
    IF v_saldo_actual IS NULL THEN
        SET p_resultado = 'La cuenta origen no existe';
    
    ELSEIF v_estado <> 'activa' THEN
        SET p_resultado = 'La cuenta no está activa';
    
    ELSEIF v_saldo_actual < p_importe THEN
        SET p_resultado = 'No tienes dinero suficiente';
        
    ELSEIF v_existe_destino = 0 THEN
        SET p_resultado = 'La cuenta destino no existe';

    ELSE
        -- 4. SI TODO ESTÁ BIEN, HACEMOS LOS CAMBIOS
        
        -- Restar dinero a uno
        UPDATE cuentas SET saldo = saldo - p_importe WHERE iban = p_origen;
        
        -- Sumar dinero al otro
        UPDATE cuentas SET saldo = saldo + p_importe WHERE iban = p_destino;

        -- Registrar los dos movimientos (lo más sencillo posible)
        INSERT INTO movimientos (cuenta_id, tipo, importe, saldo_tras_op, descripcion)
        SELECT id, 'transferencia', p_importe, saldo, 'Envío dinero' 
        FROM cuentas WHERE iban = p_origen;

        INSERT INTO movimientos (cuenta_id, tipo, importe, saldo_tras_op, descripcion)
        SELECT id, 'transferencia', p_importe, saldo, 'Recibo dinero' 
        FROM cuentas WHERE iban = p_destino;

        SET p_resultado = 'OK';
    END IF;

END$$

DELIMITER ;

-- 2
-- Añadimos la columna primero
ALTER TABLE clientes ADD COLUMN categoria VARCHAR(20);

DELIMITER $$

CREATE PROCEDURE clasificar_clientes()
BEGIN
    DECLARE v_id INT;
    DECLARE v_suma DECIMAL(14,2);
    DECLARE v_cat VARCHAR(20);
    DECLARE fin INT DEFAULT 0;

    -- Definimos el cursor para sacar los IDs
    DECLARE cur_cli CURSOR FOR SELECT id FROM clientes;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin = 1;

    OPEN cur_cli;

    -- Usamos un WHILE sencillo
    WHILE fin = 0 DO
        FETCH cur_cli INTO v_id;

        IF fin = 0 THEN
            -- Sumamos el saldo de las cuentas del cliente
            SELECT SUM(saldo) INTO v_suma 
            FROM cuentas 
            WHERE cliente_id = v_id AND estado = 'activa';

            -- Si no tiene cuentas, la suma es NULL, lo ponemos a 0
            IF v_suma IS NULL THEN 
                SET v_suma = 0; 
            END IF;

            -- Lógica de categorías
            IF v_suma >= 50000 THEN
                SET v_cat = 'PREMIUM';
            ELSEIF v_suma >= 10000 THEN
                SET v_cat = 'STANDARD';
            ELSE
                SET v_cat = 'BASICO';
            END IF;

            -- Guardamos el resultado en la tabla clientes
            UPDATE clientes SET categoria = v_cat WHERE id = v_id;
        END IF;
    END WHILE;

    CLOSE cur_cli;
END$$

DELIMITER ;


-- 3

DELIMITER $$

CREATE PROCEDURE bloquear_cuentas_impagadas(OUT p_total INT)
BEGIN
    DECLARE v_id INT;
    DECLARE fin INT DEFAULT 0;
    
    -- Cursor para clientes con impagos
    DECLARE cur_imp CURSOR FOR 
        SELECT DISTINCT cliente_id FROM prestamos WHERE estado = 'impagado';
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin = 1;

    SET p_total = 0;
    OPEN cur_imp;

    bucle: LOOP
        FETCH cur_imp INTO v_id;
        IF fin = 1 THEN LEAVE bucle; END IF;

        -- Sumamos al total cuántas cuentas vamos a bloquear ahora
        SET p_total = p_total + (SELECT COUNT(*) FROM cuentas WHERE cliente_id = v_id AND estado = 'activa');

        -- Registramos el movimiento de castigo (0.01)
        INSERT INTO movimientos (cuenta_id, tipo, importe, saldo_tras_op, descripcion)
        SELECT id, 'comision', 0.01, saldo - 0.01, 'Bloqueo por impago'
        FROM cuentas WHERE cliente_id = v_id AND estado = 'activa';

        -- Bloqueamos y restamos el céntimo
        UPDATE cuentas 
        SET saldo = saldo - 0.01, estado = 'bloqueada'
        WHERE cliente_id = v_id AND estado = 'activa';

    END LOOP;

    CLOSE cur_imp;
END$$

DELIMITER ;

-- 4

CREATE TABLE IF NOT EXISTS extractos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cuenta_id INT,
    periodo CHAR(7),
    num_movimientos INT,
    importe_total DECIMAL(14,2),
    generado_en DATETIME,
    UNIQUE (cuenta_id, periodo)
);

DELIMITER $$

CREATE PROCEDURE generar_extracto(IN p_mes CHAR(7))
BEGIN
    DECLARE v_id INT;
    DECLARE v_cant INT;
    DECLARE v_total DECIMAL(14,2);
    DECLARE fin INT DEFAULT 0;

    -- Cursor que agrupa movimientos por cuenta para el mes dado
    DECLARE cur_ext CURSOR FOR 
        SELECT cuenta_id, COUNT(*), SUM(importe)
        FROM movimientos
        WHERE DATE_FORMAT(fecha_hora, '%Y-%m') = p_mes
        GROUP BY cuenta_id;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin = 1;

    OPEN cur_ext;

    -- Bucle REPEAT: se ejecuta y luego comprueba
    REPEAT
        FETCH cur_ext INTO v_id, v_cant, v_total;

        IF fin = 0 THEN
            -- Insertar o actualizar si ya existe la combinación cuenta-periodo
            INSERT INTO extractos (cuenta_id, periodo, num_movimientos, importe_total, generado_en)
            VALUES (v_id, p_mes, v_cant, v_total, NOW())
            ON DUPLICATE KEY UPDATE 
                num_movimientos = v_cant,
                importe_total = v_total,
                generado_en = NOW();
        END IF;

    UNTIL fin = 1 END REPEAT;

    CLOSE cur_ext;
END$$

DELIMITER ;
-- 5

DELIMITER $$

CREATE PROCEDURE actualizar_interes_prestamos(
    IN p_incremento DECIMAL(5,4), 
    IN p_max DECIMAL(5,4), 
    OUT p_total INT
)
BEGIN
    DECLARE v_id INT;
    DECLARE v_cap DECIMAL(12,2);
    DECLARE v_int DECIMAL(5,4);
    DECLARE v_meses INT;
    DECLARE fin INT DEFAULT 0;

    -- Cursor para préstamos activos
    DECLARE cur_pres CURSOR FOR 
        SELECT id, capital, tipo_interes, plazo_meses FROM prestamos WHERE estado = 'activo';
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin = 1;

    SET p_total = 0;
    OPEN cur_pres;

    WHILE fin = 0 DO
        FETCH cur_pres INTO v_id, v_cap, v_int, v_meses;

        IF fin = 0 THEN
            -- Miramos si al subir el interés nos pasamos del tope
            IF (v_int + p_incremento) <= p_max THEN
                
                -- Actualizamos interés y recalculamos la cuota con la fórmula
                UPDATE prestamos 
                SET tipo_interes = tipo_interes + p_incremento,
                    cuota_mensual = (v_cap * ((tipo_interes + p_incremento) / 12)) / 
                                    (1 - POW(1 + (tipo_interes + p_incremento) / 12, -v_meses))
                WHERE id = v_id;

                -- Contamos que este sí se ha actualizado
                SET p_total = p_total + 1;
            END IF;
        END IF;
    END WHILE;

    CLOSE cur_pres;
END$$

DELIMITER ;
