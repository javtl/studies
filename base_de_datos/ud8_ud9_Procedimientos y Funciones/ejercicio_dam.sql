
-- Crea un procedimiento que recorra todos los empleados. 
-- Si su salario es menor de 3000, súbele un 10%. 
-- Si es mayor, súbele solo un 5%. Al final, devuelve cuántos empleados has actualizado.

-- 1. Cambiamos el delimitador para que el ; interno no corte el proceso
DELIMITER $$

CREATE PROCEDURE actualizar_salarios_dam(OUT p_conteo INT)
BEGIN
    -- 2. Declaramos variables para guardar lo que leamos
    DECLARE v_id INT;
    DECLARE v_sueldo DECIMAL(10,2);
    DECLARE fin INT DEFAULT 0;

    -- 3. Definimos el cursor (la lista de empleados)
    DECLARE cur_emp CURSOR FOR 
        SELECT id, salario FROM empleados;
    
    -- 4. El sensor que nos avisa cuando la lista se acaba
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin = 1;

    -- 5. Inicializamos el contador y abrimos la lista
    SET p_conteo = 0;
    OPEN cur_emp;
    
    -- 6. Empezamos a recorrer la lista uno a uno
    bucle: LOOP
        FETCH cur_emp INTO v_id, v_sueldo;
        
        -- Si el sensor dice que no hay más filas, nos vamos
        IF fin = 1 THEN 
            LEAVE bucle; 
        END IF;

        -- 7. Lógica: según el sueldo, aplicamos una subida u otra
        IF v_sueldo < 3000 THEN
            UPDATE empleados SET salario = salario * 1.10 WHERE id = v_id;
        ELSE
            UPDATE empleados SET salario = salario * 1.05 WHERE id = v_id;
        END IF;
        
        -- 8. Contamos este empleado como actualizado
        SET p_conteo = p_conteo + 1;

    END LOOP bucle;

    -- 9. Cerramos la lista y terminamos
    CLOSE cur_emp;
END$$

-- 10. Devolvemos el delimitador a su estado normal
DELIMITER ;