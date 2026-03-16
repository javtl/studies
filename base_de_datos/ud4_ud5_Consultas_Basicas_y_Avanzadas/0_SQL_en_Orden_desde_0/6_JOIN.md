# 6. `JOIN` (INNER JOIN)

### Concepto

* `JOIN` se usa para **combinar filas de dos o más tablas** según una condición común.
* `INNER JOIN` devuelve **solo las filas que tienen coincidencia en ambas tablas**.
* Es fundamental cuando los datos están **relacionados** en varias tablas.

---

### Ejemplo básico

```sql id="join1"
SELECT e.first_name, e.last_name, d.department_name
FROM employees e
INNER JOIN departments d
ON e.department_id = d.department_id;
```

---

### Explicación paso a paso

1. `FROM employees e` → usamos la tabla `employees` con alias `e`.
2. `INNER JOIN departments d` → unimos con la tabla `departments` con alias `d`.
3. `ON e.department_id = d.department_id` → condición de coincidencia: el departamento del empleado debe ser igual al de la tabla `departments`.
4. `SELECT e.first_name, e.last_name, d.department_name` → mostramos nombre, apellido y nombre del departamento.

---

### Resultado esperado (ejemplo ficticio)

| first_name | last_name | department_name |
| ---------- | --------- | --------------- |
| John       | Doe       | Ventas          |
| Alice      | Smith     | Finanzas        |
| Bob        | Brown     | Ventas          |

---

### Notas importantes

* **Solo devuelve filas que tengan coincidencia en ambas tablas**.
* Se pueden unir **más de dos tablas** usando varios `JOIN`:

```sql id="join2"
SELECT e.first_name, e.last_name, d.department_name, m.first_name AS jefe
FROM employees e
INNER JOIN departments d ON e.department_id = d.department_id
INNER JOIN employees m ON e.manager_id = m.employee_id;
```

* Alias (`e`, `d`, `m`) facilitan escribir consultas y entender qué columna pertenece a qué tabla.

---

💡 **Tip de aprendizaje:**

Piensa en `INNER JOIN` como **solo los “emparejamientos perfectos”**: si no hay coincidencia, la fila no aparece.

---

