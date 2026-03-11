USE ejemplo_ventas;
-- DESCRIBE ventas;

-- 1. El error del Alias en el WHERE Este es el error nº1. Recuerda: el WHERE no conoce los nombres que inventas en el SELECT.
-- ERROR: Intenta usar el alias 'beneficio' en el WHERE antes de ser creado
/* SELECT id_pedido, (importe_venta - importe_coste) AS beneficio
FROM ventas
WHERE beneficio > 500; */

-- SOLUCIÓN: Tienes que repetir la operación matemática en el WHERE
SELECT id_pedido, (importe_venta - importe_coste) AS beneficio
FROM ventas
WHERE (importe_venta - importe_coste) > 500;

-- 2. El error del GROUP BY incompleto
-- Si usas una función de agregado (como SUM, AVG, COUNT), cualquier otra columna que pongas en el SELECT debe estar en el GROUP BY.
-- ERROR: Pides el 'pais' pero no agrupas por él. MySQL no sabe qué país mostrar para la suma total.
/* SELECT pais, SUM(importe_venta)
FROM ventas; */	

-- SOLUCIÓN: Todo lo que no sea la función de suma, va al GROUP BY
SELECT pais, SUM(importe_venta)
FROM ventas
GROUP BY pais;

-- 3. El error de WHERE vs HAVING Nunca pongas una función de agregado (SUM, AVG...) dentro de un WHERE. 
-- ERROR: El WHERE filtra filas individuales, no puede filtrar sumas de grupos.
/*SELECT zona, SUM(unidades_vendidas)
FROM ventas
WHERE SUM(unidades_vendidas) > 1000
GROUP BY zona; */

-- SOLUCIÓN: Usa HAVING para filtrar el resultado de la suma
SELECT zona, SUM(unidades_vendidas)
FROM ventas
GROUP BY zona
HAVING SUM(unidades_vendidas) > 1000;

-- 4. El error de la Subconsulta Escalar (Operadores) Cuando una subconsulta devuelve varios resultados, no puedes usar =. Tienes que usar IN.
/* -- ERROR: Si hay varios clientes en 'Bronx', el '=' fallará porque espera un solo valor.
SELECT id_pedido FROM ventas
WHERE id_cliente = (SELECT id FROM clientes WHERE localidad = 'Bronx'); */

-- SOLUCIÓN: Usamos 'IN' para comparar con la lista completa de IDs
SELECT id_pedido FROM ventas
WHERE id_cliente IN (SELECT id FROM clientes WHERE localidad = 'Bronx');

-- 5. El error de los Nulos En SQL, el nulo no es un valor, es una "ausencia". No se puede comparar con =.
/* -- ERROR: Esto devolverá 0 resultados siempre, aunque haya nulos.
SELECT * FROM clientes WHERE telefono = NULL; */ME

-- SOLUCIÓN: Usa el operador especial IS NULL
SELECT * FROM clientes WHERE telefono IS NULL;