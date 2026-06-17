-- FUNCTION

DELIMITER $$

CREATE FUNCTION antiguedad_cuenta_dias(p_cuenta_id INT) 
RETURNS INT
NOT DETERMINISTIC
READS SQL DATA
BEGIN
    
    DECLARE v_fecha DATE DEFAULT NULL;
    
    SELECT fecha_apertura INTO v_fecha
    FROM cuentas
    WHERE id = p_cuenta_id;
    
    IF v_fecha IS NULL THEN
        RETURN -1;
    ELSE
        
        RETURN DATEDIFF(CURDATE(), v_fecha);
    END IF;

END$$

DELIMITER ;


-- TRIGGER

DELIMITER $$

CREATE TRIGGER trg_auditoria_bloqueo
AFTER UPDATE ON cuentas
FOR EACH ROW
BEGIN
    
    IF (OLD.estado != 'bloqueada' AND NEW.estado = 'bloqueada') THEN
        
        
        INSERT INTO auditoria (usuario_bd, operacion, tabla_obj, resultado)
        VALUES (
            CURRENT_USER(),
            CONCAT('CUENTA BLOQUEADA ', NEW.iban, ' TRAS LA ACTUALIZACION DE LA CUENTA ESTADO ANTERIOR: ', OLD.estado),
            'cuentas',
            'ok'
        );
        
    END IF;
END$$

DELIMITER ;