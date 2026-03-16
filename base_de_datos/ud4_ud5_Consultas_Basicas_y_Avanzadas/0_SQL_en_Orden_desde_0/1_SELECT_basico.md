# 1. `SELECT` básico (`FROM`, `WHERE`)

### Concepto

* `SELECT` → indica **qué columnas** quieres ver.
* `FROM` → indica **de qué tabla** se toman los datos.
* `WHERE` → filtra **filas según condiciones**, devolviendo solo las que cumplen la regla.

### Ejemplo

```sql id="sel1"
SELECT first_name, last_name
FROM employees
WHERE department_id = 10;
```

### Explicación paso a paso

1. `FROM employees` → estamos mirando la tabla `employees`.
2. `SELECT first_name, last_name` → queremos mostrar solo **los nombres y apellidos**.
3. `WHERE department_id = 10` → mostramos solo los empleados **del departamento 10**.

### Resultado esperado (ejemplo ficticio)

| first_name | last_name |
| ---------- | --------- |
| John       | Doe       |
| Alice      | Smith     |

### Notas importantes

* Puedes seleccionar **todas las columnas** con `*`:

```sql
SELECT * FROM employees;
```

* Puedes usar **condiciones más complejas** en `WHERE`:

```sql
SELECT first_name, salary
FROM employees
WHERE department_id = 10 AND salary > 3000;
```

* Operadores comunes en `WHERE`:

| Operador | Ejemplo                    | Significado            |
| -------- | -------------------------- | ---------------------- |
| =        | salary = 5000              | Igual a                |
| >        | salary > 3000              | Mayor que              |
| <        | salary < 6000              | Menor que              |
| >=       | salary >= 4000             | Mayor o igual          |
| <=       | salary <= 7000             | Menor o igual          |
| <> / !=  | salary <> 5000             | Diferente de           |
| AND      | dept_id=10 AND salary>3000 | Ambas condiciones      |
| OR       | dept_id=10 OR dept_id=20   | Alguna condición       |
| LIKE     | first_name LIKE 'J%'       | Coincidencia de patrón |

---
