# Subconsultas en SQL

Una **subconsulta** es una consulta **dentro de otra consulta**.
Se usa para **obtener un valor o conjunto de valores** que la consulta principal utilizará para filtrar, comparar o calcular resultados.

Las subconsultas suelen aparecer en:

* `WHERE`
* `FROM`
* `SELECT`
* `HAVING`

---

# 1. Sintaxis básica

```sql
SELECT columnas
FROM tabla
WHERE columna operador (
    SELECT columna
    FROM otra_tabla
);
```

### Cómo funciona

1. Primero se ejecuta la **subconsulta**.
2. La subconsulta devuelve **un valor o varios valores**.
3. La consulta principal usa ese resultado para **filtrar o comparar datos**.

---

# 2. Subconsulta simple (no correlacionada)

Es una subconsulta que **no depende de la consulta externa**.

### Ejemplo

Empleado con el **salario más alto**:

```sql
SELECT first_name, salary
FROM employees
WHERE salary = (
    SELECT MAX(salary)
    FROM employees
);
```

### Qué ocurre

1. La subconsulta calcula el **salario máximo**.
2. La consulta principal muestra el empleado que tiene ese salario.

---

# 3. Subconsulta que devuelve varios valores

Cuando la subconsulta devuelve **varios resultados**, se usan operadores como `IN`.

### Ejemplo

Empleados que trabajan en departamentos donde hay empleados con salario mayor a 10000.

```sql
SELECT first_name, department_id
FROM employees
WHERE department_id IN (
    SELECT department_id
    FROM employees
    WHERE salary > 10000
);
```

---

# 4. Subconsulta correlacionada

Una **subconsulta correlacionada** depende de la fila que se está evaluando en la consulta principal.

Esto significa que la subconsulta **se ejecuta para cada fila** de la consulta externa.

### Ejemplo

Empleados que ganan **más que el promedio de su departamento**:

```sql
SELECT first_name, salary, department_id
FROM employees e1
WHERE salary > (
    SELECT AVG(salary)
    FROM employees e2
    WHERE e1.department_id = e2.department_id
);
```

### Qué ocurre

1. Se toma un empleado (`e1`).
2. La subconsulta calcula el **promedio de su departamento**.
3. Se compara su salario con ese promedio.
4. Se repite para cada empleado.

---

# 5. Subconsultas con `EXISTS`

Se utilizan cuando solo interesa **saber si existe al menos una fila** que cumpla una condición.

```sql
SELECT first_name
FROM employees e1
WHERE EXISTS (
    SELECT 1
    FROM employees e2
    WHERE e2.manager_id = e1.employee_id
);
```

Esta consulta muestra **empleados que tienen subordinados**.

---

# 6. Dónde pueden aparecer las subconsultas

### En `WHERE` (lo más común)

```sql
SELECT *
FROM employees
WHERE salary > (
    SELECT AVG(salary) FROM employees
);
```

---

### En `FROM`

Se usan como **tabla temporal**.

```sql
SELECT *
FROM (
    SELECT department_id, AVG(salary) AS avg_salary
    FROM employees
    GROUP BY department_id
) t;
```

---

### En `SELECT`

Para calcular valores por fila.

```sql
SELECT first_name,
       (SELECT AVG(salary) FROM employees) AS salario_promedio
FROM employees;
```

---

# 7. Tipos de subconsultas (resumen rápido)

| Tipo              | Qué devuelve                   | Operadores comunes      |
| ----------------- | ------------------------------ | ----------------------- |
| Escalar           | Un solo valor                  | `=`, `>`, `<`           |
| Múltiples valores | Varias filas                   | `IN`, `ANY`, `ALL`      |
| Correlacionada    | Depende de la consulta externa | `EXISTS`, comparaciones |
| En `FROM`         | Tabla temporal                 | alias obligatorio       |

---

💡 **Regla mental útil para estudiar**

> **Subconsulta = consulta que genera datos para que otra consulta pueda decidir qué mostrar.**

---

✅ **Truco para repasar rápido antes de un examen**

Piensa en estas **3 preguntas clave**:

1. ¿La subconsulta devuelve **1 valor o varios**?
2. ¿Depende de la consulta externa (**correlacionada**)?
3. ¿Se usa para **comparar**, **filtrar** o **comprobar existencia**?

