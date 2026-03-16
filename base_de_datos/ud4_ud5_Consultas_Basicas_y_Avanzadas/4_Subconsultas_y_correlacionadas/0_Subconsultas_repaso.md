# Chuleta rápida — Subconsultas SQL

## 1. Qué es una subconsulta

Una **subconsulta** es una consulta dentro de otra consulta.

Sirve para **obtener datos que la consulta principal utilizará para filtrar o comparar resultados**.

Estructura general:

```sql
SELECT columnas
FROM tabla
WHERE columna operador (
    SELECT columna
    FROM tabla
);
```

---

# 2. Subconsulta escalar (devuelve un solo valor)

Se usa con operadores de comparación.

Ejemplo: empleado con el salario máximo.

```sql
SELECT first_name, salary
FROM employees
WHERE salary = (
    SELECT MAX(salary)
    FROM employees
);
```

💡 La subconsulta devuelve **un único valor**.

---

# 3. Subconsulta con varios valores (`IN`)

Cuando la subconsulta devuelve **varias filas**.

Ejemplo: empleados que trabajan en departamentos con salarios altos.

```sql
SELECT first_name
FROM employees
WHERE department_id IN (
    SELECT department_id
    FROM employees
    WHERE salary > 10000
);
```

💡 `IN` permite comparar con **varios valores**.

---

# 4. Subconsulta correlacionada

Depende de la fila actual de la consulta principal.

Ejemplo: empleados que ganan más que el promedio de su departamento.

```sql
SELECT first_name, salary, department_id
FROM employees e1
WHERE salary > (
    SELECT AVG(salary)
    FROM employees e2
    WHERE e1.department_id = e2.department_id
);
```

💡 La subconsulta **se ejecuta una vez por cada fila**.

---

# 5. Subconsultas con `EXISTS`

Sirve para comprobar **si existe al menos una fila** que cumpla una condición.

Ejemplo: empleados que tienen subordinados.

```sql
SELECT first_name
FROM employees e1
WHERE EXISTS (
    SELECT 1
    FROM employees e2
    WHERE e2.manager_id = e1.employee_id
);
```

💡 `EXISTS` devuelve **TRUE o FALSE**.

---

# 6. `NOT EXISTS`

Para encontrar registros **sin relación**.

Ejemplo: empleados que no tienen subordinados.

```sql
SELECT first_name
FROM employees e1
WHERE NOT EXISTS (
    SELECT 1
    FROM employees e2
    WHERE e2.manager_id = e1.employee_id
);
```

---

# 7. Subconsulta en `FROM`

Se usa como **tabla temporal**.

```sql
SELECT *
FROM (
    SELECT department_id, AVG(salary) AS avg_salary
    FROM employees
    GROUP BY department_id
) t;
```

💡 Siempre necesita **alias**.

---

# 8. Dónde pueden aparecer subconsultas

| Lugar    | Uso                          |
| -------- | ---------------------------- |
| `WHERE`  | Filtrar datos                |
| `SELECT` | Calcular valores             |
| `FROM`   | Crear tabla temporal         |
| `HAVING` | Filtrar resultados agregados |

---

# 9. Diferencia rápida entre operadores

| Operador | Uso                    |
| -------- | ---------------------- |
| `=`      | Un valor               |
| `IN`     | Varios valores         |
| `EXISTS` | Comprobar si hay filas |
| `ANY`    | Comparar con alguno    |
| `ALL`    | Comparar con todos     |

---

# 10. Errores típicos en exámenes

❌ Subconsulta devuelve varios valores con `=`

```sql
WHERE salary = (SELECT salary FROM employees)
```

✔ Solución:

```sql
WHERE salary IN (SELECT salary FROM employees)
```

---

❌ Falta alias en subconsulta en `FROM`

```sql
SELECT *
FROM (SELECT * FROM employees)
```

✔ Correcto:

```sql
SELECT *
FROM (SELECT * FROM employees) t
```

---

# Regla mental para recordar

**3 tipos clave de subconsultas:**

1️⃣ **Escalar** → devuelve **1 valor**
2️⃣ **Múltiple** → devuelve **varios valores (`IN`)**
3️⃣ **Correlacionada** → depende de la **fila actual**

