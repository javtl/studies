-- 1 Añadir un nuevo cliente

INSERT INTO clientes (id, nombre_completo, fecha_nacimiento, direccion, localidad_cp, telefono, email, fecha_alta)
VALUES ('C1001', 'Jhon Smith', '1987-02-15', 'Callejón de la Berrea, nº7', 'Polopos 18345', '555543985', 'jsmith@gmail.com', '2025-11-21');

-- 2 Añadir un nuevo proveedor

INSERT INTO proveedores (id, proveedor, contacto, telefono, saldo, fecha_ult_compra)
VALUES ('P1000', 'ACME', 'Fulgencio Collote', '555543985', 500, '2024-05-04');

-- 3 Añadir 5 ventas al cliente C1001

INSERT INTO venta (id_pedido, id_cliente, tipo_producto, fecha_pedido, fecha_envio, unidades, precio_unitario, importe_venta)
VALUES 
('V001', 'C1001', 'Teclado', NOW(), NULL, 1, 15.00, 15.00),
('V002', 'C1001', 'Monitor', NOW(), NULL, 2, 120.00, 240.00),
('V003', 'C1001', 'Ratón', NOW(), NULL, 5, 10.00, 50.00),
('V004', 'C1001', 'Cable HDMI', NOW(), NULL, 1, 8.50, 8.50),
('V005', 'C1001', 'Alfombrilla', NOW(), NULL, 10, 2.00, 20.00);

-- 4. Modificar email del proveedor P1000

UPDATE proveedores 
SET email = 'colloteveloz@gmail.com' 
WHERE id = 'P1000';

-- 5 Cambiar teléfono en clientes y proveedores

UPDATE clientes SET telefono = '666666666' WHERE telefono = '555543985';
UPDATE proveedores SET telefono = '666666666' WHERE telefono = '555543985';


-- 6 Ajustar id_cliente en la tabla venta (Operador Módulo)

SET SQL_SAFE_UPDATES = 0;

-- 1. Extraer número, aplicar módulo y asegurar que no sea 0
UPDATE venta SET id_cliente = (RIGHT(id_cliente, 4) % 999) + 1;

-- 2. Formatear de nuevo a 'C0000'
UPDATE venta SET id_cliente = CONCAT('C', LPAD(id_cliente, 4, '0'));

SET SQL_SAFE_UPDATES = 1;



-- 7 Añadir atributo id_Proveedor y FK

-- Añadir la columna
ALTER TABLE venta ADD COLUMN id_Proveedor VARCHAR(10);

-- Añadir la Clave Ajena (FK)

ALTER TABLE venta 
ADD CONSTRAINT fk_venta_proveedor 
FOREIGN KEY (id_Proveedor) REFERENCES proveedores(id) 
ON UPDATE CASCADE ON DELETE SET NULL;



-- 8. Rellenar id_Proveedor basado en id_Cliente

UPDATE venta 
SET id_Proveedor = CONCAT('P', SUBSTRING(id_cliente, 2));


-- 9. Recalcular importe_venta

UPDATE venta 
SET importe_venta = unidades * precio_unitario;

-- 10. Borrar ventas anteriores al 5 de enero de 2020

DELETE FROM venta 
WHERE fecha_pedido < '2020-01-05';

-- 11 Borrar cliente C1001 y sus ventas Debido a la integridad referencial, primero borramos las ventas (si no hay un `ON DELETE CASCADE` configurado).
-- Primero las ventas

DELETE FROM venta WHERE id_cliente = 'C1001';

-- Después el cliente
DELETE FROM clientes WHERE id = 'C1001';

