# 14. `CASE`

### Concepto

* `CASE` permite **crear condiciones dentro de una consulta** para asignar valores según reglas.
* Es similar a un **“if”** en otros lenguajes de programación.
* Puede aparecer en `SELECT`, `WHERE`, `ORDER BY`, etc.

---

### Ejemplo básico

```sql id="case1"
SELECT first_name,
       salary,
       CASE
           WHEN salary > 5000 THEN 'Alto'
           ELSE 'Bajo'
       END AS nivel_salarial
FROM employees;
```

---

### Explicación paso a paso

1. `SELECT first_name, salary` → mostramos nombre y salario del empleado.
2. `CASE ... END AS nivel_salarial` → creamos una **columna calculada** llamada `nivel_salarial`.
3. `WHEN salary > 5000 THEN 'Alto'` → si el salario es mayor a 5000, pone “Alto”.
4. `ELSE 'Bajo'` → si no cumple la condición, pone “Bajo”.

---

### Resultado esperado (ejemplo ficticio)

| first_name | salary | nivel_salarial |
| ---------- | ------ | -------------- |
| Alice      | 7000   | Alto           |
| John       | 4500   | Bajo           |
| Bob        | 5000   | Bajo           |

---

### Notas importantes

* Se puede tener **varios WHEN**:

```sql id="case2"
CASE
    WHEN salary > 7000 THEN 'Muy Alto'
    WHEN salary > 5000 THEN 'Alto'
    ELSE 'Bajo'
END AS nivel_salarial
```

* Puede usarse también en **`ORDER BY`** para ordenar según condiciones:

```sql id="case3"
SELECT first_name, salary
FROM employees
ORDER BY CASE WHEN salary > 5000 THEN 1 ELSE 2 END;
```

* Es muy útil para **clasificar datos sin modificar la tabla original**.

---

💡 **Tip de aprendizaje:**

Piensa en `CASE` como **una etiqueta dinámica** para los datos, según reglas que tú defines.

---
