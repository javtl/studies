# 4. `GROUP BY`

### Concepto

* `GROUP BY` se usa para **agrupar filas que tienen el mismo valor** en una o varias columnas.
* Muy útil cuando se combina con **funciones agregadas** (`COUNT`, `SUM`, `AVG`, `MIN`, `MAX`).
* Permite obtener **resúmenes por categoría**, como por departamento o por proyecto.

---

### Ejemplo básico

```sql id="grp1"
SELECT department_id, AVG(salary) AS salario_promedio
FROM employees
GROUP BY department_id;
```

---

### Explicación paso a paso

1. `FROM employees` → usamos la tabla `employees`.
2. `GROUP BY department_id` → agrupamos los empleados **por departamento**.
3. `AVG(salary)` → calculamos el promedio de salario **para cada grupo**.
4. `SELECT department_id, AVG(salary) AS salario_promedio` → mostramos el departamento y su salario promedio.

---

### Resultado esperado (ejemplo ficticio)

| department_id | salario_promedio |
| ------------- | ---------------- |
| 10            | 5000             |
| 20            | 6000             |
| 30            | 4500             |

---

### Notas importantes

* Todas las columnas en el `SELECT` que **no están en funciones agregadas** deben estar en `GROUP BY`.
* Se puede agrupar por **varias columnas**:

```sql id="grp2"
SELECT department_id, manager_id, AVG(salary) AS avg_salary
FROM employees
GROUP BY department_id, manager_id;
```

* Se puede combinar con **`WHERE`** para filtrar antes de agrupar:

```sql id="grp3"
SELECT department_id, COUNT(*) AS total_empleados
FROM employees
WHERE salary > 4000
GROUP BY department_id;
```

* Para **filtrar grupos después de agrupar**, usamos `HAVING` (que veremos después).

---

💡 **Tip de aprendizaje:**

Piensa en `GROUP BY` como **clasificar tus datos en cajas** según una columna, y luego aplicar funciones agregadas dentro de cada caja para obtener resúmenes.
