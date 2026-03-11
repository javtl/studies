USE ejemplo_ventas;

/* Queremos ver el ID de la venta y una nueva columna llamada beneficio_neto 
(que es importe_venta menos importe_coste),
pero solo para aquellas ventas donde ese beneficio sea mayor de 500 euros. */

SELECT id_pedido, (importe_venta - importe_coste) AS beneficio_neto
FROM ventas
WHERE (importe_venta - importe_coste) > 500;

/* Queremos saber cuántas unidades totales se han vendido por cada tipo de producto, 
pero solo para los productos que son de la zona 'Europa'. */

SELECT tipo_producto, SUM(unidades_vendidas)
FROM ventas
WHERE zona = 'Europa'
GROUP BY tipo_producto;

/* Queremos un listado de los países y su importe medio de venta (AVG), 
pero solo para aquellos países cuyo importe medio de venta sea superior a 500.000.*/

SELECT pais, AVG(importe_venta)
FROM ventas
GROUP BY pais
HAVING AVG (importe_venta) > 500000;

/*
Queremos ver todos los datos de la venta (SELECT *) que tenga el importe_venta más alto de toda la tabla.
*/

SELECT *
FROM ventas
WHERE (
	SELECT  MAX (importe_venta)
	FROM ventas
);

/* Quiero saber el id_cliente y el total de dinero gastado (SUM) de cada cliente, 
pero SOLO de aquellos clientes que han gastado en total más que la media de gasto de todos los clientes. */

SELECT id_cliente, SUM(importe_venta) AS total_cliente
FROM ventas
GROUP BY id_cliente
HAVING SUM(importe_venta) > (SELECT AVG(importe_venta) FROM ventas);

/*
Necesito saber qué localidades tienen más de 3 clientes registrados en la tabla clientes. Muestra el nombre de la localidad y el número de clientes.
*/
SELECT localidad_cp, COUNT(id)
FROM clientes
GROUP BY localidad_cp
HAVING COUNT(id) > 3;


/*
Saca el id_cliente y el importe_venta de las 5 ventas más caras de la tabla ventas.
*/

SELECT id_cliente, importe_venta
FROM ventas
ORDER BY importe_venta DESC
LIMIT 5;

/*
Queremos saber cuántas ventas ha hecho cada cliente, pero SOLO de las ventas que han ocurrido en la zona 'Europa'. 
Y además, solo queremos ver a los clientes que hayan hecho más de 2 ventas en esa zona.
*/

SELECT id_cliente, COUNT(*) AS numero_ventas
FROM ventas  
WHERE zona = 'Europa'
HAVING COUNT(*) > 2;

/*Dime el nombre de los productos (tipo_producto) y el total de unidades vendidas de cada uno,
pero solo de los productos que hayan vendido más de 100 unidades en total.*/

SELECT tipo_producto, SUM(unidades) AS total_vendido
FROM ventas
GROUP BY tipo_producto
HAVING SUM(unidades) > 100;

/*
Necesito un informe que muestre el tipo_producto y el beneficio total 
(que es la suma de importe_venta menos importe_coste) 
para todos los pedidos realizados en la zona 'África'
*/

SELECT tipo_producto, SUM(importe_venta - importe_coste) AS beneficio_total
FROM ventas
WHERE  zona = 'Africa'
GROUP BY tipo_producto;

/*
Necesitamos saber cuántos pedidos de 'Prioridad Alta' se han hecho en cada pais, 
pero solo para las ventas realizadas a partir del 1 de enero de 2017. Además, 
solo queremos ver los países que tengan más de 10 pedidos de ese tipo
*/
SELECT pais, COUNT(*) 
FROM ventas
WHERE fecha_pedido >= '2017-01-01' AND prioridad = 'Alta'
GROUP BY  pais
HAVING COUNT(*) > 10;

/*
Queremos saber cuál es el importe total de venta que hemos conseguido con cada tipo_producto, 
pero SOLO de las ventas realizadas a través del canal_venta 'Online'
*/
SELECT tipo_producto, SUM(importe_venta) AS total_dinero
FROM ventas
WHERE canal_venta = 'Online'
GROUP BY tipo_producto
ORDER BY total_dinero DESC;

/*
Dime el pais y el promedio (media) del precio_unitario de sus productos, 
pero solo de aquellos países que tengan una prioridad 'Media' 
y cuyo promedio de precio sea mayor a 150. Ordena los países alfabéticamente
*/

SELECT pais, AVG(precio_unitario) AS media_precio
FROM ventas
WHERE prioridad = 'Media' 
GROUP BY pais
HAVING AVG(pecio_unitario) > 150
ORDER BY pais ASC;

/*
Dime el id_cliente y la suma del importe_venta, pero solo para el canal_venta 'Offline' 
y solo si la suma es menor a 5.000
*/

SELECT id_cliente, SUM(importe_venta) AS total_venta
FROM ventas
WHERE canal_venta = 'Offline'
GROUP BY id_cliente
HAVING total_venta > 5000
ORDER BY id_cliente;

/*
Dime el id_pedido y el importe_venta de todos los pedidos que superen 
el importe de la venta más cara del canal 'Online'
*/

SELECT id_pedido, importe_venta
FROM ventas
WHERE importe_venta > (
	SELECT MAX(importe_venta)
	FROM ventas
	WHERE canal_venta = 'Online');



