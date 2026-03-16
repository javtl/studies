# Chuleta rápida — Tipos de subconsultas

| Tipo                       | Qué hace                                         | Cuándo se ejecuta                               | Ejemplo mental                           |
| -------------------------- | ------------------------------------------------ | ----------------------------------------------- | ---------------------------------------- |
| Subconsulta normal         | Devuelve un valor o conjunto de valores          | **Una sola vez**                                | comparar con el promedio global          |
| Subconsulta correlacionada | Depende de la fila actual de la consulta externa | **Una vez por cada fila**                       | comparar con promedio de su departamento |
| `IN`                       | Comprueba si un valor está dentro de una lista   | La subconsulta genera **varios valores**        | departamento dentro de una lista         |
| `EXISTS`                   | Comprueba si **existe al menos una fila**        | Se detiene al encontrar la primera coincidencia | comprobar si hay subordinados            |

---

# 1. Subconsulta normal

Se ejecuta **una sola vez**.

Ejemplo: empleados que ganan más que el promedio de la empresa.

```sql
SELECT first_name, salary
FROM employees
WHERE salary > (
    SELECT AVG(salary)
    FROM employees
);
```

✔ El promedio se calcula **una sola vez**.

---

# 2. Subconsulta correlacionada

Depende de la fila actual de la consulta principal.

```sql
SELECT first_name, salary
FROM employees e1
WHERE salary > (
    SELECT AVG(salary)
    FROM employees e2
    WHERE e2.department_id = e1.department_id
);
```

✔ El promedio se calcula **para cada departamento**.

💡 Pista para detectarla:

```
e1.columna
```

aparece dentro de la subconsulta.

---

# 3. `IN`

Sirve para comparar **con varios valores**.

```sql
SELECT first_name
FROM employees
WHERE department_id IN (
    SELECT department_id
    FROM employees
    WHERE salary > 10000
);
```

✔ La subconsulta devuelve **una lista de valores**.

---

# 4. `EXISTS`

Solo comprueba **si existe al menos una fila**.

```sql
SELECT first_name
FROM employees e1
WHERE EXISTS (
    SELECT 1
    FROM employees e2
    WHERE e2.manager_id = e1.employee_id
);
```

✔ Devuelve **TRUE o FALSE**.

✔ Se detiene cuando encuentra **la primera coincidencia**.

---

# Regla mental rápida

**4 preguntas para identificar el tipo:**

1️⃣ ¿Devuelve **un valor único**? → subconsulta normal
2️⃣ ¿Depende de la fila actual? → correlacionada
3️⃣ ¿Compara con **una lista de valores**? → `IN`
4️⃣ ¿Solo comprueba **si existe algo**? → `EXISTS`

---

💡 **Mini truco para examen**

Si ves esto:

```
WHERE e2.columna = e1.columna
```

→ casi seguro es **subconsulta correlacionada**.
