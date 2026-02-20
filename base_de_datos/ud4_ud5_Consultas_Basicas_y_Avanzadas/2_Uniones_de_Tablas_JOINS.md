## 🖇️ 2. Uniones de Tablas (JOINS)

Los JOINS permiten combinar filas de dos tablas (A y B) basándose en una columna relacionada. La imagen proporcionada muestra los cuatro tipos principales basados en la teoría de conjuntos.

### 🔄 INNER JOIN
Es el tipo de unión más común. Solo devuelve las filas que tienen una coincidencia exacta en **ambas** tablas. 
- **Visualmente**: Es la intersección donde los círculos A y B se solapan.

### ⬅️ LEFT (OUTER) JOIN
Devuelve **todas** las filas de la tabla izquierda (A), junto con las filas que coincidan de la tabla derecha (B). 
- **Resultado**: Si no hay coincidencia en la tabla B, verás los datos de A y valores vacíos (`NULL`) en las columnas de B.

### ➡️ RIGHT (OUTER) JOIN
Es lo opuesto al anterior. Devuelve **todas** las filas de la tabla derecha (B) y las que coincidan de la tabla izquierda (A).
- **Resultado**: Si no hay coincidencia en la tabla A, verás los datos de B y valores vacíos (`NULL`) en las columnas de A.

### 🌐 FULL (OUTER) JOIN
Devuelve **todos** los registros de ambas tablas, coincidan o no. 
- **Visualmente**: Es la unión completa de ambos círculos.
- **Nota para MariaDB**: MariaDB no tiene una sentencia `FULL OUTER JOIN` nativa. Para conseguir este resultado, se suele realizar un `LEFT JOIN`, un `RIGHT JOIN` y combinarlos con un `UNION`.

---

### 💡 Ejemplo Práctico de JOINS

Imagina una tabla **Clientes (A)** y una tabla **Pedidos (B)**:

```sql
-- Queremos ver qué cliente hizo cada pedido (solo si han hecho pedidos)
SELECT Clientes.nombre, Pedidos.id_pedido
FROM Clientes
INNER JOIN Pedidos ON Clientes.id = Pedidos.id_cliente;

-- Queremos ver TODOS los clientes, incluso los que NO han comprado nada aún
SELECT Clientes.nombre, Pedidos.id_pedido
FROM Clientes
LEFT JOIN Pedidos ON Clientes.id = Pedidos.id_cliente;

```

### 💡 Otro Ejemplo 

Imagina que estamos gestionando una base de datos de una **Librería**. Tenemos estas dos tablas:

* **Tabla `Autores**`: `id_autor`, `nombre`
* **Tabla `Libros**`: `id_libro`, `titulo`, `id_autor`, `precio`

### 📖 El Reto:

"Queremos una lista de los títulos de los libros y el nombre de su autor, pero solo de los libros que cuestan más de **20€**, ordenados por título de la A a la Z."

### La Consulta SQL:

```sql
SELECT Libros.titulo, Autores.nombre
FROM Libros
INNER JOIN Autores ON Libros.id_autor = Autores.id_autor
WHERE Libros.precio > 20
ORDER BY Libros.titulo ASC;

```

---

### ⚙️ ¿Qué está pasando realmente? (Según tus apuntes)

Aplicando el **orden de ejecución lógico** y la **lógica de conjuntos**:

1. **FROM + INNER JOIN**: MariaDB primero busca ambas tablas y busca la "intersección". Crea una gran tabla temporal donde cada libro está pegado a su autor correspondiente gracias a que sus `id_autor` coinciden.
2. **WHERE**: De esa gran tabla combinada, el motor "tacha" y elimina todos los libros que cuestan 20€ o menos. Solo sobreviven los caros.
3. **SELECT**: Ahora que tiene las filas filtradas, MariaDB mira las columnas y se queda solo con `titulo` y `nombre`, ignorando el precio y los IDs.
4. **ORDER BY**: Finalmente, toma esa lista y la ordena alfabéticamente por el título.

---

### 💡 Una variante avanzada: El "Saber quién no ha escrito nada"

Si usamos el **LEFT JOIN** de tu esquema:

```sql
SELECT Autores.nombre, Libros.titulo
FROM Autores
LEFT JOIN Libros ON Autores.id_autor = Libros.id_autor;

```

* **Resultado**: Aquí verías a **TODOS** los autores. Si un autor todavía no ha publicado ningún libro, verías su nombre y en la columna de título aparecería un `NULL` (vacío). Esto es la "parte A" del círculo que no se solapa con la B.

