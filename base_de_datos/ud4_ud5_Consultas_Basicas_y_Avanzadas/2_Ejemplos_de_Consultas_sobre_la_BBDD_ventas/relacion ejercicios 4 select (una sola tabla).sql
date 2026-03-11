use ejemplo_ventas;

/* Tema 4 DML SELECT */

/* Ejercicio 1: listado de clientes (id, nombre_completo, telefono, email) de 
todos los clientes del grupo E que se dieron de alta después del 1 de enero de 2015 */
SELECT 
	id, 
	CONCAT(nombre, ' ', apellidos),
    telefono,
    email
FROM
clientes
WHERE grupo = 'E'
	AND  fecha_alta > '2015-01-01';
    
/* Ejercicio 2: listado de clientes (id, nombre_completo, localidad_cp) de los clientes
localidad de Poughkeepsie*/
SELECT 
	id,
    CONCAT(nombre, ' ', apellidos),
    CONCAT (localidad, '(', cp, ')') AS localidad_cp
FROM clientes
WHERE localidad = 'Poughkeepsie';
    
/* Ejercicio 3: listado de proveedores (mostrar todos los atributos) que tengan un saldo
por encima de la media  ordenados por saldo de mayor a menor */
SELECT * 
FROM proveedores
WHERE saldo > (SELECT AVG(saldo) FROM proveedores)
ORDER BY saldo DESC;

/* Ejercicio 4: localiza la venta Online que ha obtenido mayor beneficio */
SELECT *, (precio_venta - precio_coste) AS beneficio
FROM ventas
WHERE tipo_venta = 'Online'
ORDER BY beneficio DESC
LIMIT 1;

/* Ejercicio 5: quiero saber cuantos tipos de producto distintos se han vendido */
SELECT COUNT(DISTINCT id_producto) AS tipos_productos_vendidos
FROM ventas;

/* Ejercicio 6: quiero saber el precio_unitario medio de cada tipo de producto que se vende Online 
(mostrar solo los tipos de producto que tengan más de 3 ventas) */
SELECT 
	tipo_producto,
    AVG (precio_unitario) AS precio_medio
FROM ventas
WHERE canal_venta = 'Online'
GROUP BY tipo_producto
HAVING COUNT(*) > 3; 

/* Ejercicio 7: para cada pais y cada tipo_producto quiero saber cuantas ventas ha habido 
de ese producto en ese pais y cual ha sido su precio máximo ordenadas de mayor a menor 
(primero el pais, producto de los cuales ha habido más ventas.... 
		Indonesia, Cuidado personal, 4, 81.73€) */
SELECT 
	pais,
	tipo_producto,
	COUNT(*) AS total_ventas,
	MAX(precio_unitario) AS precio_maximo
FROM ventas
GROUP BY pais, tipo_producto
ORDER BY pais ASC, total_ventas DESC;

/* Ejercicio 8: importe total de ventas Online en cada país considerando 
solo los paises con al menos 5 clientes */ 
SELECT
	pais,
    SUM(importe_total) AS total_ventas_online
FROM ventas
WHERE canal_venta = 'Online'
	AND pais IN (
		SELECT pais
        FROM clientes
        GROUP BY pais
        HAVING COUNT(id) >=5
        )
GROUP BY pais;


/* Ejercicio 9: importe_venta medio de la zona donde se encuentre el cliente 
con la venta con el importe_coste más alto  */
SELECT AVG (importe_venta) AS importe_medio_zona
FROM ventas
WHERE zona (
	SELECT zona
    FROM clientes
    WHERE id=(
		SELECT id_cliente
        FROM ventas
        ORDER BY importe_coste DESC
        LIMIT 1
        )
);

/* Ejercicio 10: quiero saber el tiempo medio de entrega (fecha_envío-fecha_pedido [hay una función para restar 
fechas]) de cada tipo de producto en cada pais, considerar solo la zona 'Europa' */

SELECT 
	pais,
    tipo_producto,
    AVG (DATEDIFF (fecha_envio, fecha_pedido)) AS tiempo_medio_entrega_dias
FROM ventas
WHERE zona = 'Europa'
GROUP BY pais, tipo_producto
ORDER BY tiempo_medio_entrega_dias DESC;

/* Ejercicio 11: numero total de unidades vendidas en cada zona, en los paises que tengan la palabra 'Republic' 
en su nombre, mostrar solo las zonas con venta de más de tres tipos de producto distintos */
SELECT
	zona,
    SUM(unidades_vendidas) AS total_unidades
FROM ventas
WHERE pais LIKE '%Republic%'
GROUP BY zona
HAVING COUNT(DISTINCT tipo_producto) > 3;

/* Ejercicio 12: numero total de unidades vendidas en cada zona, para aquellas zonas que tengan un total de unidades
que sea al menos el 10% del total de unidades vendidas en todo el mundo */
SELECT 
	zona,
	SUM(unidades_vendidas) AS unidades_zona
FROM ventas
GROUP BY zona
HAVING unidades_zona >= (SELECT SUM(unidades_vendidas) * 0.10 FROM ventas);

/* Ejercicio 13: paises con tiempo de entrega promedio  de mas de 10 días 
y que el importe mínimo de venta sea mayor que el importe de venta medio */
SELECT 
	pais,
    AVG(DATEDIFF (fecha_emvio, fecha_pedido)) AS promedio_entrega,
    MIN(importe_venta) AS venta_minima_pais
FROM ventas
GROUP BY pais
HAVING promedio_entrega > 10
	AND venta_minima_pais > (SELECT AVG (importe_venta) FROM ventas);
    

/* Ejercicio 14: paises que el importe mínimo de venta del país sea mayor que el más bajo de 
los máximos por zona */
SELECT 
	pais,
    MIN(importe_venta) AS minimo_pais
FROM ventas
GROUP BY pais
HAVING minimo_pais > (
	SELECT MIN(max_por_zona)
    FROM (
    SELECT MAX (importe_venta) AS max_por_zona
    FROM ventas
    GROUP BY zona
    ) AS tabla_maximos
);
/* Ejercicio 15: ventas Online con fecha_pedido anterior a 2022 y con beneficio superior a la media */
SELECT *, (importe_venta - importe_coste) AS beneficio
FROM ventas
WHERE canal_venta = 'Online'
	AND fecha_pedido < `2022-01-01`
    AND (importe_venta - importe_coste) > (
		SELECT AVG(importe_venta - importe_coste)
        FROM ventas
);

/* Ejercicio 16: ventas en Europa de países que tengan una total de ventas (suma importe_venta) mayor
de un millón */
SELECT 
	pais,
    SUM (importe_venta) AS total_ventas_pais
FROM ventas
WHERE zona = 'Europa'
GROUP BY pais
HAVING total_ventas_pais > 1000000;

/* Ejercicio 17: quiero saber los paises (pais, suma total de importes de venta) donde el precio unitario 
mínimo es mayor que el precio unitario medio para todo el mundo y que estén en una zona
donde la media de importe_venta de la zona sea mayor que la media mundial de importe_venta */
SELECT 
    pais, 
    SUM(importe_venta) AS total_ventas_pais
FROM ventas
GROUP BY pais
HAVING MIN(precio_unitario) > (SELECT AVG(precio_unitario) FROM ventas)
   AND zona IN (
       SELECT zona 
       FROM ventas 
       GROUP BY zona 
       HAVING AVG(importe_venta) > (SELECT AVG(importe_venta) FROM ventas)
   );

/* Subconsultas con IN: */
/* Ejercicio 18 mostrar todos los pedidos (id_pedido, [tiempo de entrega], unidades, precio_unitario
importe_venta, id_Cliente) de los clientes que viven en el Bronx */
SELECT 
    id_pedido, 
    DATEDIFF(fecha_envio, fecha_pedido) AS tiempo_entrega, 
    unidades, 
    precio_unitario, 
    importe_venta, 
    id_cliente
FROM ventas
WHERE id_cliente IN (
    SELECT id
    FROM clientes
    WHERE localidad = 'Bronx'
);

/* Ejercicio 19 cuantos pedidos hay  por cada pais realizados por clientes del grupo 'A', mostrando solo los paises con más de 3 clientes
de ese grupo */
SELECT 
    pais, 
    COUNT(id_pedido) AS total_pedidos
FROM ventas
WHERE id_cliente IN (
    SELECT id 
    FROM clientes 
    WHERE grupo = 'A'
)
GROUP BY pais
HAVING COUNT(DISTINCT id_cliente) > 3;

/* Ejercicio 20: total de pedidos por cada pais, mostrando solo los paises con más de 3 clientes
del grupo 'A' */
SELECT 
    pais, 
    COUNT(id_pedido) AS total_pedidos_pais
FROM ventas
WHERE pais IN (
    SELECT pais
    FROM clientes
    WHERE grupo = 'A'
    GROUP BY pais
    HAVING COUNT(id) > 3
)
GROUP BY pais;

