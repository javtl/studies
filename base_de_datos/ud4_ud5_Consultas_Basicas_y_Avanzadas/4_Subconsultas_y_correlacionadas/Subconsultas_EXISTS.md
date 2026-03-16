En **MariaDB**, `EXISTS` se usa en **subconsultas correlacionadas o no correlacionadas** para verificar **si la subconsulta devuelve al menos una fila**. No devuelve datos de la subconsulta: solo **TRUE o FALSE**.

Es muy útil para **filtrar registros en la consulta principal** cuando existe relación con otra tabla.

---

# 1. Sintaxis básica

```sql
SELECT columnas
FROM tabla_principal t1
WHERE EXISTS (
    SELECT 1
    FROM tabla_secundaria t2
    WHERE t2.columna = t1.columna
);
```

### Cómo funciona

1. La consulta externa recorre `tabla_principal`.
2. Para cada fila ejecuta la subconsulta.
3. Si la subconsulta devuelve **al menos una fila → EXISTS = TRUE**.
4. Si no devuelve filas → **FALSE**.

> El `SELECT 1` es convencional porque **no importa qué se seleccione**, solo importa si hay filas.

---

# 2. Ejemplo práctico

### Tablas

**clientes**

| id | nombre |
| -- | ------ |
| 1  | Ana    |
| 2  | Luis   |
| 3  | Pedro  |

**pedidos**

| id | cliente_id |
| -- | ---------- |
| 10 | 1          |
| 11 | 1          |
| 12 | 3          |

### Consulta

Clientes que **tienen pedidos**:

```sql
SELECT nombre
FROM clientes c
WHERE EXISTS (
    SELECT 1
    FROM pedidos p
    WHERE p.cliente_id = c.id
);
```

Resultado:

| nombre |
| ------ |
| Ana    |
| Pedro  |

Porque existe al menos un pedido relacionado.

---

# 3. `NOT EXISTS`

Se usa para buscar registros **sin coincidencias**.

```sql
SELECT nombre
FROM clientes c
WHERE NOT EXISTS (
    SELECT 1
    FROM pedidos p
    WHERE p.cliente_id = c.id
);
```

Resultado:

| nombre |
| ------ |
| Luis   |

Luis no tiene pedidos.

---

# 4. `EXISTS` vs `IN`

Ejemplo equivalente:

```sql
SELECT nombre
FROM clientes
WHERE id IN (SELECT cliente_id FROM pedidos);
```

Pero **EXISTS suele ser mejor cuando:**

* La subconsulta devuelve muchas filas
* Hay índices
* Es una subconsulta correlacionada

**EXISTS puede detenerse en la primera coincidencia**, lo que mejora rendimiento.

---

# 5. Ejemplo con correlación más compleja

Productos que **han sido vendidos**:

```sql
SELECT p.nombre
FROM productos p
WHERE EXISTS (
    SELECT 1
    FROM ventas v
    WHERE v.producto_id = p.id
);
```

---

# 6. Uso típico en consultas reales

* Filtrar registros relacionados
* Validaciones de existencia
* Sustituir `JOIN` cuando solo importa la existencia
* Consultas de integridad de datos

---

💡 **Regla mental útil:**

> **EXISTS = “¿existe al menos una fila que cumpla la condición?”**

---
💡 Tip típico en ejercicios de EXISTS

La estructura casi siempre es:

```sql
SELECT ...
FROM tabla1 t1
WHERE EXISTS (
    SELECT 1
    FROM tabla2 t2
    WHERE condicion_relacion
);
```