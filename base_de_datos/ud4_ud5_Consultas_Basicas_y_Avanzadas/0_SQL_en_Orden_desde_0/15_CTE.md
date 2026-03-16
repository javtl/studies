# 15. CTE (`WITH`)

### Concepto

* **CTE** (Common Table Expression) o `WITH` permite crear **subconsultas reutilizables** que se comportan como tablas temporales dentro de una consulta.
* Mejora la **legibilidad** y la **organización** de consultas complejas.
* Se puede usar para simplificar subconsultas o preparar resultados intermedios.

---

### Ejemplo básico

```sql id="cte1"
WITH dept_avg AS (
    SELECT department_id, AVG(salary) AS avg_salary
    FROM employees
    GROUP BY department_id
)
SELECT e.first_name, e.salary, d.avg_salary
FROM employees e
JOIN dept_avg d ON e.department_id = d.department_id;
```

---

### Explicación paso a paso

1. `WITH dept_avg AS (...)` → creamos un **CTE** llamado `dept_avg`.
2. La subconsulta dentro del CTE calcula **el salario promedio por departamento**.
3. En la consulta principal, hacemos un `JOIN` con `dept_avg` para mostrar **el salario del empleado y el promedio de su departamento**.
4. La ventaja: podemos usar `dept_avg` como si fuera una **tabla temporal**, varias veces si queremos.

---

### Resultado esperado (ejemplo ficticio)

| first_name | salary | avg_salary |
| ---------- | ------ | ---------- |
| Alice      | 7000   | 5000       |
| John       | 4500   | 5000       |
| Bob        | 6000   | 6000       |

---

### Notas importantes

* Se pueden crear **varios CTEs** separados por comas:

```sql id="cte2"
WITH dept_avg AS (
    SELECT department_id, AVG(salary) AS avg_salary
    FROM employees
    GROUP BY department_id
),
high_salary AS (
    SELECT *
    FROM employees
    WHERE salary > 5000
)
SELECT h.first_name, h.salary, d.avg_salary
FROM high_salary h
JOIN dept_avg d ON h.department_id = d.department_id;
```

* Facilita **consultas largas y complejas**, evitando repetir subconsultas.

---

💡 **Tip de aprendizaje:**

Piensa en CTE como **una tabla “preparada” para usar dentro de tu consulta**, que mejora legibilidad y evita repetir cálculos.

---


