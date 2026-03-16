# 5. `HAVING`

### Concepto

* `HAVING` se usa para **filtrar grupos** creados con `GROUP BY`.
* Es como un `WHERE`, pero **aplica a grupos**, no a filas individuales.
* Muy útil cuando quieres filtrar según **funciones agregadas**, como `AVG`, `SUM`, `COUNT`.

---

### Ejemplo básico

```sql id="hav1"
SELECT department_id, AVG(salary) AS salario_promedio
FROM employees
GROUP BY department_id
HAVING AVG(salary) > 5000;
```

---

### Explicación paso a paso

1. `FROM employees` → usamos la tabla `employees`.
2. `GROUP BY department_id` → agrupamos por departamento.
3. `AVG(salary)` → calculamos el promedio de salario por departamento.
4. `HAVING AVG(salary) > 5000` → mostramos **solo los departamentos con promedio mayor a 5000**.

---

### Resultado esperado (ejemplo ficticio)

| department_id | salario_promedio |
| ------------- | ---------------- |
| 20            | 6000             |

---

### Notas importantes

* `WHERE` filtra **filas antes de agrupar**.
* `HAVING` filtra **grupos después de agrupar**.
* Se puede combinar con varias condiciones:

```sql id="hav2"
SELECT department_id, COUNT(*) AS total_empleados
FROM employees
GROUP BY department_id
HAVING COUNT(*) > 3 AND AVG(salary) > 4000;
```

> Esto devuelve solo los departamentos con **más de 3 empleados** y **salario promedio mayor a 4000**.

---

💡 **Tip de aprendizaje:**

Piensa en `HAVING` como un **filtro sobre los resultados resumidos**, mientras que `WHERE` filtra **filas individuales antes del resumen**.

---

