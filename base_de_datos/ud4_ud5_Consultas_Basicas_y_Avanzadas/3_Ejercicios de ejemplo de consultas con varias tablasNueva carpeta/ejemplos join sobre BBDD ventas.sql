use ejemplo_ventas;
select * from venta;
select * from clientes;
select * from proveedores;

/* mostrar para cada venta realizada (id_pedido, tipo_producto, fecha_pedido, 
fecha_envío, unidades, precio_unitario, importe_venta, id_Cliente) para las ventas
 realizadas a clientes que tengan 'Nadal' como parte de su nombre  */
        
select id_pedido, tipo_producto, fecha_pedido, fecha_envío, unidades, precio_unitario, importe_venta, id_Cliente
from venta
where id_Cliente in (select id from clientes where nombre_completo like '%Nadal%');

select id_pedido, tipo_producto, fecha_pedido, fecha_envío, unidades, precio_unitario, 
		importe_venta, id_Cliente
from venta v join clientes c on v.id_Cliente = c.id 
where nombre_completo like '%Nadal%';

/* Modifica la consulta anterior para que también aparezca para cada venta el
 nombre completo del cliente  */
select id_pedido, tipo_producto, fecha_pedido, fecha_envío, unidades, precio_unitario, 
		importe_venta, id_Cliente, nombre_completo
from venta v join clientes c on v.id_Cliente = c.id 
where nombre_completo like '%Nadal%';
    
/* mostrar para cada venta realizada (id_pedido, tipo_producto, fecha_pedido, fecha_envío,
 unidades, precio_unitario, importe_venta, id_proveedor, [nombre de proveedor] y 
 [persona de contacto] */


select id_pedido, tipo_producto, fecha_pedido, fecha_envío, unidades, precio_unitario, 
		importe_venta, p.proveedor, p.contacto
from venta v join proveedores p on v.id_proveedor = p.id;

/* mostrar todas las ventas pero añadiendo tanto el nombre completo del cliente 
como el nombre y persona de contacto del proveedor */

select id_pedido, tipo_producto, fecha_pedido, fecha_envío, unidades, precio_unitario, 
		importe_venta, v.id_Cliente, c.nombre_completo, v.id_proveedor,
        p.proveedor, p.contacto
from (venta v join clientes c on v.id_Cliente=c.id)
		join proveedores p on v.id_proveedor=p.id;

/* mostrar todas las ventas donde esté involucrado alguien con apellido 'Nadal'... 
sea el cliente o la persona de contacto en el proveedor */

select id_pedido, tipo_producto, fecha_pedido, fecha_envío, unidades, precio_unitario, 
		importe_venta, c.id, c.nombre_completo, p.id,
        p.proveedor, p.contacto
from (proveedores p join venta v on p.id=v.id_proveedor)
			join clientes c on v.id_Cliente = c.id 
where c.nombre_completo like '%Nadal%' or p.contacto like '%Nadal%';

/* quiero ver para cada cliente (id, nombre_completo) y además cuantas ventas se le han 
hecho y el importe total de las mismas */

select c.id, c.nombre_completo, count(v.id_pedido) as 'Num. Ventas', 
		sum(v.importe_venta) as 'Suma total'
from venta v join clientes c on v.id_Cliente=c.id
group by c.id;

/* quiero ver una relación de los nombres de los clientes con los nombres
 y persona de contacto de los proveedores que les han vendido algo */

select c.nombre_completo, p.proveedor, p.contacto
from (clientes c join venta v on v.id_Cliente=c.id)
		join proveedores p on p.id=v.id_proveedor;


