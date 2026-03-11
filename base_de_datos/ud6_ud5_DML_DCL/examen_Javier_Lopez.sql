/*
Parte 1.- Introduce en la BBDD los datos del siguiente supuesto, inventa
los datos que no se proporcionan (como códigos) o déjalos en blanco si
es posible.
*/

USE empresa;

INSERT INTO Trabajos (Codigo, Nombre, Salario_Min, Salario_Max) VALUES
(10, 'Aux. Administrativo', 800, 1300),
(20, 'Administrativo', 1000, 1500),
(30, 'Vendedor', 1000, 2000),
(40, 'Jefe de sección', 1500, 2000),
(50, 'Jefe de departamento', 2000, 8000),
(60, 'Director general', 2500, 9999),
(70, 'CEO', 3000, 9999),
(80, 'carterista', 0, 600),
(90, 'matón', 400, 900),
(100, 'cobrador', 500, 1200),
(110, '“ejecutivo”', 1500, 3000);


/*Parte 3.- Modificar los siguientes departamentos para añadir su jefe y su
presupuesto: */
USE empresa;

UPDATE Departamentos 
SET Jefe = '12345678Z', 
    Presupuesto = 1000000 
WHERE Nombre_Dpto = 'Cobros, Ejecuciones y Lanzamientos';

UPDATE Departamentos 
SET Jefe = '55555555K', 
    Presupuesto = 800000 
WHERE Nombre_Dpto = 'Contabilidad y Finanzas';

/*
Parte 4.- Modifica todos los sueldos que se hayan dado integramente
entre 1948 y el 1954, aumentándolos en un 15%.
*/

USE empresa;

UPDATE Historial_Salarial
SET Salario = Salario * 1.15
WHERE Fecha_Comienzo >= '1948-01-01' 
  AND Fecha_Fin <= '1954-12-31';


/*
Parte 5.- Borra del historial laboral todos los trabajos de auxiliar
administrativo que se hayan acabado antes del año 1948.
*/

USE empresa;

DELETE FROM Historial_Laboral
WHERE Trabajo_Cod = (SELECT Codigo FROM Trabajos WHERE Nombre = 'Aux. Administrativo')
  AND Fecha_Fin < '1948-01-01';


/*
Parte 2.- Añadir los datos del personal de la empresa en las tablas
correspondientes:
*/

USE empresa;

INSERT INTO Empleados (DNI, Nombre, Apellido1, Apellido2, Sexo, Fecha_Nac) VALUES
('11111111H', 'Vito', 'Corleone', NULL, 'H', '1899-08-01'),
('12345678Z', 'Michael', 'Corleone', NULL, 'H', '1920-12-25'),
('55555555K', 'Valeria', 'Genovesse', NULL, 'M', '1930-04-06'),
('12123123F', 'Ichiro', 'Nakamoto', NULL, 'O', '1980-09-16'),
('45887966E', 'Francisco', 'Guirado', 'Ruiz', 'H', '1992-09-16');

INSERT INTO Trabajos (Codigo, Nombre, Salario_Min, Salario_Max) VALUES