# 13. Subconsultas en `FROM` (tablas derivadas)

### Concepto

* Una **subconsulta en `FROM`** se trata como una **tabla temporal** dentro de la consulta principal.
* Permite **hacer cálculos o filtros primero**, y luego trabajar con esos resultados como si fueran una tabla normal.
* Siempre se necesita **un alias** para la subconsulta.

---

### Ejemplo básico

```sql id="from1"
SELECT department_id, avg_salary
FROM (
    SELECT department_id, AVG(salary) AS avg_salary
    FROM employees
    GROUP BY department_id
) t;
```

---

### Explicación paso a paso

1. La subconsulta:

```sql id="from2"
SELECT department_id, AVG(salary) AS avg_salary
FROM employees
GROUP BY department_id
```

* Calcula el **salario promedio por departamento**.

2. La consulta principal:

```sql id="from3"
SELECT department_id, avg_salary
FROM (...) t;
```

* Trata los resultados de la subconsulta como la tabla `t`.
* Permite seleccionar o filtrar esos resultados fácilmente.

---

### Resultado esperado (ejemplo ficticio)

| department_id | avg_salary |
| ------------- | ---------- |
| 10            | 5000       |
| 20            | 6000       |
| 30            | 4500       |

---

### Notas importantes

* La subconsulta **necesita un alias**, aquí usamos `t`.
* Se puede combinar con **`WHERE` o `ORDER BY`** en la consulta externa:

```sql id="from4"
SELECT department_id, avg_salary
FROM (
    SELECT department_id, AVG(salary) AS avg_salary
    FROM employees
    GROUP BY department_id
) t
WHERE avg_salary > 5000
ORDER BY avg_salary DESC;
```

* Muy útil para **filtrar o transformar resultados antes de la consulta principal**.

---

💡 **Tip de aprendizaje:**

Piensa en las subconsultas en `FROM` como **“tablas temporales creadas sobre la marcha”**, que luego puedes usar como cualquier otra tabla.

---
