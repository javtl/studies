/* SCRIPT DE RESOLUCIÓN DE EJERCICIOS - TEMA 4
   Base de Datos: Ventas (MariaDB)
*/

-- 1. Añadir un nuevo cliente con los datos proporcionados
INSERT INTO clientes (id, nombre, fecha_nacimiento, direccion, localidad_cp, telefono, email, fecha_alta)
VALUES ('C1001', 'Jhon Smith', '1987-02-15', 'Callejón de la Berrea, nº7', 'Polopos 18345', '555543985', 'jsmith@gmail.com', '2025-11-21');

-- 2. Añadir un nuevo proveedor con los datos proporcionados
INSERT INTO proveedores (id, proveedor, contacto, telefono, saldo, fecha_ult_compra)
VALUES ('P1000', 'ACME', 'Fulgencio Collote', '555543985', 500, '2024-05-04');

-- 3. Añade 5 ventas realizadas al cliente id C1001
-- Se usa CURDATE() para la fecha del sistema y NULL para la fecha de envío
INSERT INTO venta (id_cliente, unidades, precio_unitario, fecha_pedido, fecha_envio) VALUES 
('C1001', 2, 10.00, CURDATE(), NULL),
('C1001', 1, 50.00, CURDATE(), NULL),
('C1001', 5, 5.50, CURDATE(), NULL),
('C1001', 3, 25.00, CURDATE(), NULL),
('C1001', 10, 2.00, CURDATE(), NULL);

-- 4. Modifica el proveedor con id:P1000 para añadir el email
-- Nota: Si la columna email no existe en la tabla proveedores, habría que hacer un ALTER TABLE primero
UPDATE proveedores 
SET email = 'colloteveloz@gmail.com' 
WHERE id = 'P1000';

-- 5. Cambia el teléfono de todos los clientes y proveedores que tengan el 555543985 por 666666666
UPDATE clientes SET telefono = '666666666' WHERE telefono = '555543985';
UPDATE proveedores SET telefono = '666666666' WHERE telefono = '555543985';

-- 6. Modifica los id_cliente de la tabla venta usando el operador módulo %
-- Esto asegura que los IDs estén en el rango C0001 - C0999 (ajustando la parte numérica)
UPDATE venta 
SET id_cliente = CONCAT('C', LPAD(CAST(SUBSTRING(id_cliente, 2) AS UNSIGNED) % 1000, 4, '0'));

-- 7. Añade a la tabla venta un nuevo atributo id_Proveedor con clave ajena a proveedores(id)
-- Primero creamos la columna
ALTER TABLE venta ADD COLUMN id_proveedor CHAR(5);

-- Luego establecemos la relación de integridad
ALTER TABLE venta 
ADD CONSTRAINT fk_venta_proveedores 
FOREIGN KEY (id_proveedor) REFERENCES proveedores(id);

-- 8. Rellena el nuevo atributo id_Proveedor basándote en el id_Cliente
-- Cambiamos el prefijo 'C' por 'P'
UPDATE venta 
SET id_proveedor = REPLACE(id_cliente, 'C', 'P');

-- 9. Recalcula los valores de importe_venta
UPDATE venta 
SET importe_venta = unidades * precio_unitario;

-- 10. Borra todas las ventas cuya fecha_pedido sea anterior al 5 de enero de 2020
DELETE FROM venta 
WHERE fecha_pedido < '2020-01-05';

-- 11. Borra al cliente con id C1001 y todas sus ventas
-- Primero borramos las ventas (hijas) para respetar la integridad referencial
DELETE FROM venta WHERE id_cliente = 'C1001';
-- Luego borramos al cliente (padre)
DELETE FROM clientes WHERE id = 'C1001';