# 8. Subconsultas simples

### Concepto

* Una **subconsulta simple** es una consulta **dentro de otra consulta** que devuelve un **solo valor** o un conjunto de valores.
* Se usa para **filtrar o comparar datos** en la consulta principal.
* Puede aparecer en `WHERE`, `SELECT` o `FROM`.

---

### Ejemplo básico

```sql id="sub1"
-- Empleado con el salario máximo
SELECT first_name, salary
FROM employees
WHERE salary = (
    SELECT MAX(salary) FROM employees
);
```

---

### Explicación paso a paso

1. La subconsulta `(SELECT MAX(salary) FROM employees)` devuelve **el salario más alto de toda la tabla**.
2. La consulta principal selecciona **los empleados cuyo salario sea igual a ese máximo**.
3. Esto devuelve **solo las filas que cumplen la condición**.

---

### Resultado esperado (ejemplo ficticio)

| first_name | salary |
| ---------- | ------ |
| Alice      | 7000   |

---

### Notas importantes

* La subconsulta **devuelve un valor único** que se usa en la consulta externa.
* También se pueden usar con **operadores** como `>`, `<`, `=`:

```sql id="sub2"
SELECT first_name, salary
FROM employees
WHERE salary > (
    SELECT AVG(salary) FROM employees
);
```

* Aquí la consulta devuelve **empleados que ganan más que el salario promedio**.

---

💡 **Tip de aprendizaje:**

Piensa en la subconsulta como un **“mini cálculo”** que se hace antes de filtrar los resultados de la consulta principal.

---