# 9. Subconsultas correlacionadas

### Concepto

* Una **subconsulta correlacionada** depende de **cada fila de la consulta principal**.
* Se ejecuta **una vez por cada fila** de la tabla externa.
* Sirve para comparar un valor con un cálculo relacionado a esa fila, como un promedio o un máximo dentro de un grupo.

---

### Ejemplo básico

```sql id="subcor1"
-- Empleados que ganan más que el promedio de su propio departamento
SELECT first_name, salary, department_id
FROM employees e1
WHERE salary > (
    SELECT AVG(salary)
    FROM employees e2
    WHERE e2.department_id = e1.department_id
);
```

---

### Explicación paso a paso

1. `e1` → representa una fila de la tabla `employees` en la consulta principal.
2. La subconsulta `(SELECT AVG(salary) FROM employees e2 WHERE e2.department_id = e1.department_id)` calcula el **salario promedio del departamento del empleado actual**.
3. Se compara `salary > AVG(salary)` para decidir si mostrar la fila.
4. Se repite **para cada empleado**.

---

### Resultado esperado (ejemplo ficticio)

| first_name | salary | department_id |
| ---------- | ------ | ------------- |
| Alice      | 7000   | 10            |
| Bob        | 6000   | 20            |

> Solo se muestran los empleados que ganan más que el promedio de su departamento.

---

### Notas importantes

* La subconsulta **no puede ejecutarse sola**, depende de la consulta externa (`e1`).
* Se diferencia de una subconsulta simple porque **usa columnas de la fila externa**:

```id="subcor2"
WHERE e2.department_id = e1.department_id
```

* Muy útil para **comparaciones dentro de grupos**, como salarios por departamento, máximos o mínimos, etc.

---

💡 **Tip de aprendizaje:**

Piensa en una subconsulta correlacionada como un **mini cálculo que se recalcula para cada fila**, usando datos de esa fila para tomar decisiones.

---
