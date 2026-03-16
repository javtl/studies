# 12. `UNION` / `UNION ALL`

### Concepto

* `UNION` combina los resultados de **dos o más consultas** en un solo conjunto de resultados.
* `UNION` **elimina duplicados** automáticamente.
* `UNION ALL` **incluye todos los registros**, incluso duplicados.
* Todas las consultas deben tener **el mismo número de columnas** y **tipos de datos compatibles**.

---

### Ejemplo con `UNION`

```sql id="uni1"
-- Empleados de departamento 10 y 20
SELECT first_name, department_id
FROM employees
WHERE department_id = 10

UNION

SELECT first_name, department_id
FROM employees
WHERE department_id = 20;
```

* Combina los resultados de las dos consultas, eliminando duplicados.

---

### Ejemplo con `UNION ALL`

```sql id="uni2"
-- Empleados de departamento 10 y 20, incluyendo duplicados
SELECT first_name, department_id
FROM employees
WHERE department_id = 10

UNION ALL

SELECT first_name, department_id
FROM employees
WHERE department_id = 20;
```

* Incluye todos los registros, **sin eliminar duplicados**.

---

### Notas importantes

* Se puede combinar más de **dos consultas** usando múltiples `UNION` o `UNION ALL`.
* Por defecto, el conjunto final está **ordenado arbitrariamente**, pero se puede usar `ORDER BY` al final de todo el `UNION`:

```sql id="uni3"
SELECT first_name, department_id
FROM employees
WHERE department_id = 10

UNION

SELECT first_name, department_id
FROM employees
WHERE department_id = 20
ORDER BY first_name;
```

---

💡 **Tip de aprendizaje:**

* `UNION` → quieres **una lista única** de resultados.
* `UNION ALL` → quieres **todos los resultados**, incluso repetidos.

---

