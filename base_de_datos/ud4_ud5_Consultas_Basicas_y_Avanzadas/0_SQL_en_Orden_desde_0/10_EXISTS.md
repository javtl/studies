# 10. `EXISTS` / `NOT EXISTS`

### Concepto

* `EXISTS` se usa para **comprobar si existe al menos una fila** que cumpla una condición dentro de una subconsulta.
* No devuelve datos de la subconsulta, solo **TRUE o FALSE**.
* `NOT EXISTS` devuelve TRUE si **no existe ninguna fila** que cumpla la condición.
* Muy útil para filtrar filas de la tabla principal según la existencia de relaciones en otra tabla.

---

### Ejemplo básico con `EXISTS`

```sql id="ex1"
-- Empleados que tienen subordinados
SELECT first_name, last_name
FROM employees e1
WHERE EXISTS (
    SELECT 1
    FROM employees e2
    WHERE e2.manager_id = e1.employee_id
);
```

---

### Explicación paso a paso

1. La subconsulta `SELECT 1 FROM employees e2 WHERE e2.manager_id = e1.employee_id` busca **si hay algún empleado cuyo jefe sea el empleado actual** (`e1`).
2. `EXISTS` devuelve TRUE si **la subconsulta encuentra al menos una fila**.
3. La consulta principal muestra **solo los empleados que tienen subordinados**.

---

### Ejemplo con `NOT EXISTS`

```sql id="ex2"
-- Empleados que no tienen subordinados
SELECT first_name, last_name
FROM employees e1
WHERE NOT EXISTS (
    SELECT 1
    FROM employees e2
    WHERE e2.manager_id = e1.employee_id
);
```

* Devuelve los empleados que **no son jefes**.

---

### Notas importantes

* El `SELECT 1` es un **truco convencional**, porque no importa qué columna se seleccione, solo si existe alguna fila.
* `EXISTS` suele ser más eficiente que `IN` cuando la subconsulta es **correlacionada y grande**, porque **se detiene al encontrar la primera coincidencia**.
* `EXISTS` se puede combinar con **subconsultas correlacionadas** para consultas complejas.

---

💡 **Tip de aprendizaje:**

Piensa en `EXISTS` como la pregunta:

> “¿Existe al menos una fila que cumpla esta condición?”

y en `NOT EXISTS` como:

> “¿No existe ninguna fila que cumpla esta condición?”

---

