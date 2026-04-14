

USE hotel_db;

-- INSERT 1

INSERT INTO paises (nombre, codigo) 
VALUES ('Portugal', 'PT');

INSERT INTO ciudades (nombre, pais_id) 
VALUES ('Lisboa', LAST_INSERT_ID());

INSERT INTO hoteles (nombre, ciudad_id, categoria) 
VALUES ('Bairro Alto Suites', LAST_INSERT_ID(), 4);
-- INSERT 2

INSERT INTO huespedes (nombre, email, pasaporte, pais_id)
VALUES ('Carlos Ferreira', 'c.ferreira@mail.pt', 'PT998877',(
	SELECT id
    FROM paises
    WHERE codigo = 'PT'));

-- INSERT 3

INSERT INTO habitaciones (hotel_id, tipo_id, numero, estado)
VALUES 
((SELECT id FROM hoteles WHERE nombre = 'Bairro Alto Suites' LIMIT 1), 
 (SELECT id FROM tipos_habitacion WHERE nombre = 'Suite' LIMIT 1), 501, 'disponible'),
((SELECT id FROM hoteles WHERE nombre = 'Bairro Alto Suites' LIMIT 1), 
 (SELECT id FROM tipos_habitacion WHERE nombre = 'Suite' LIMIT 1), 502, 'disponible'),
((SELECT id FROM hoteles WHERE nombre = 'Bairro Alto Suites' LIMIT 1), 
 (SELECT id FROM tipos_habitacion WHERE nombre = 'Suite' LIMIT 1), 503, 'disponible');


-- INSERT 4

-- UPDATE 1

UPDATE tipos_habitacion
SET precio_base = precio_base * 1.12
WHERE nombre = 'Suite';

-- UPDATE 2

UPDATE habitaciones 
SET estado = 'mantenimiento'
WHERE hotel_id = (
	SELECT id
    FROM hoteles
    WHERE nombre ='Bairro Alto Suites');


-- DELETE 1
DELETE FROM reservas_servicios 
WHERE reserva_id = (
    SELECT id FROM reservas 
    WHERE huesped_id = (SELECT id FROM huespedes WHERE pasaporte = 'PT998877') 
    LIMIT 1
);

DELETE FROM reservas
WHERE huesped_id = (
	SELECT id 
    FROM huesped
    WHERE pasaporte = 'PT998877'
);
 





























-- INSERT
INSERT INTO employees (employee_id, first_name, last_name, email, hire_date, job_id)
VALUES (300, 'Pepe', 'García', 'PGARCIA', SYSDATE, 'IT_PROG');

INSERT INTO employees_copia
SELECT * FROM employees WHERE department_id = 60;

-- UPDATE
UPDATE employees
SET salary = salary * 1.1,
    commission_pct = 0.2
WHERE employee_id = 101;

UPDATE employees
SET salary = salary * 1.1
WHERE department_id = (SELECT department_id FROM departments WHERE department_name = 'IT');

-- DELETE
DELETE FROM employees
WHERE employee_id = 200;