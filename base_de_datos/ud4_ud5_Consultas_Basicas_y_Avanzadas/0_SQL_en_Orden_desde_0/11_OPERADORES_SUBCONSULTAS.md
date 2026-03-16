# 11. Operadores con subconsulta (`IN`, `ANY`, `ALL`)

### Concepto

* Estos operadores se usan para **comparar un valor con los resultados de una subconsulta**.
* Son útiles cuando la subconsulta devuelve **varios valores**.
* Diferencias principales:

| Operador | Qué hace                                                                            |
| -------- | ----------------------------------------------------------------------------------- |
| `IN`     | Comprueba si un valor **está dentro de una lista de valores**.                      |
| `ANY`    | Devuelve TRUE si el valor cumple la condición con **cualquiera** de los resultados. |
| `ALL`    | Devuelve TRUE si el valor cumple la condición con **todos** los resultados.         |

---

### Ejemplo con `IN`

```sql id="in1"
-- Empleados que trabajan en departamentos donde hay alguien con salario > 6000
SELECT first_name, department_id
FROM employees
WHERE department_id IN (
    SELECT department_id
    FROM employees
    WHERE salary > 6000
);
```

* La subconsulta devuelve todos los `department_id` con salarios mayores a 6000.
* La consulta principal muestra **empleados cuyo departamento está en esa lista**.

---

### Ejemplo con `ANY`

```sql id="any1"
-- Empleados cuyo salario es mayor que algún salario del departamento 10
SELECT first_name, salary
FROM employees
WHERE salary > ANY (
    SELECT salary
    FROM employees
    WHERE department_id = 10
);
```

* `salary > ANY` → TRUE si **el salario del empleado es mayor que al menos uno de los salarios del departamento 10**.

---

### Ejemplo con `ALL`

```sql id="all1"
-- Empleados cuyo salario es mayor que todos los salarios del departamento 10
SELECT first_name, salary
FROM employees
WHERE salary > ALL (
    SELECT salary
    FROM employees
    WHERE department_id = 10
);
```

* `salary > ALL` → TRUE solo si **el salario del empleado supera a todos los salarios del departamento 10**.

---

### Notas importantes

* `IN` es equivalente a `= ANY` en muchos casos, pero más legible.
* `ANY` y `ALL` son útiles cuando quieres comparar **relación con todos o algunos valores** de la subconsulta.
* Siempre que uses estos operadores con subconsultas, asegúrate de que **la subconsulta devuelve la misma columna que se compara**.

---

💡 **Tip de aprendizaje:**

* `IN` → “Está en esta lista de valores”.
* `ANY` → “Mayor o menor que **alguno** de estos valores”.
* `ALL` → “Mayor o menor que **todos** estos valores”.

---
