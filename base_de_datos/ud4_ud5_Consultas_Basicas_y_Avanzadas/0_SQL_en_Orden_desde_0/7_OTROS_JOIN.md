# 7. Otros `JOIN` (`LEFT JOIN`, `RIGHT JOIN`, `SELF JOIN`)

### Concepto

* **`LEFT JOIN`** → devuelve **todas las filas de la tabla izquierda**, y las filas coincidentes de la tabla derecha. Si no hay coincidencia, la tabla derecha muestra `NULL`.
* **`RIGHT JOIN`** → devuelve **todas las filas de la tabla derecha**, y las filas coincidentes de la tabla izquierda.
* **`SELF JOIN`** → une una tabla **consigo misma**, útil para relaciones jerárquicas (ej. empleados y jefes).

---

### Ejemplos

#### a) `LEFT JOIN`

```sql id="left1"
SELECT e.first_name, e.last_name, d.department_name
FROM employees e
LEFT JOIN departments d
ON e.department_id = d.department_id;
```

* Devuelve **todos los empleados**, aunque no tengan departamento asignado (`department_name` será `NULL`).

---

#### b) `RIGHT JOIN`

```sql id="right1"
SELECT e.first_name, e.last_name, d.department_name
FROM employees e
RIGHT JOIN departments d
ON e.department_id = d.department_id;
```

* Devuelve **todos los departamentos**, aunque no tengan empleados (`first_name` y `last_name` serán `NULL`).

---

#### c) `SELF JOIN`

```sql id="self1"
SELECT e1.first_name AS empleado, e2.first_name AS jefe
FROM employees e1
LEFT JOIN employees e2
ON e1.manager_id = e2.employee_id;
```

* `e1` = empleado
* `e2` = jefe
* Permite mostrar **quién es el jefe de cada empleado** usando la misma tabla.

---

### Notas importantes

* `LEFT JOIN` y `RIGHT JOIN` son útiles para **no perder información** aunque la otra tabla no tenga coincidencias.
* `SELF JOIN` siempre necesita **alias diferentes** para la misma tabla.
* Se pueden combinar múltiples JOINs en la misma consulta.

---

💡 **Tip de aprendizaje:**

* `INNER JOIN` → solo coincidencias exactas.
* `LEFT JOIN` → todas las filas de la izquierda.
* `RIGHT JOIN` → todas las filas de la derecha.
* `SELF JOIN` → relaciona una tabla **consigo misma**.

---
