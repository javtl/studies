# 2. `ORDER BY`

### Concepto

* `ORDER BY` sirve para **ordenar los resultados** de una consulta.
* Se puede ordenar por **una o varias columnas**.
* Por defecto, el orden es **ASC (ascendente)**, pero también se puede usar **DESC (descendente)**.
* Se puede combinar con `SELECT` y `WHERE`.

---

### Ejemplo básico

```sql id="ord1"
SELECT first_name, last_name, salary
FROM employees
WHERE department_id = 10
ORDER BY salary DESC;
```

---

### Explicación paso a paso

1. `FROM employees` → miramos la tabla `employees`.
2. `WHERE department_id = 10` → filtramos empleados del **departamento 10**.
3. `SELECT first_name, last_name, salary` → mostramos **nombre, apellido y salario**.
4. `ORDER BY salary DESC` → ordenamos los resultados de **mayor a menor salario**.

---

### Resultado esperado (ejemplo ficticio)

| first_name | last_name | salary |
| ---------- | --------- | ------ |
| Alice      | Smith     | 7000   |
| John       | Doe       | 5000   |
| Bob        | Brown     | 4000   |

---

### Notas importantes

* Para ordenar **ascendentemente** (de menor a mayor):

```sql id="ord2"
ORDER BY salary ASC;
```

* Puedes ordenar por **varias columnas**:

```sql id="ord3"
SELECT first_name, last_name, department_id, salary
FROM employees
ORDER BY department_id ASC, salary DESC;
```

> Primero se ordena por `department_id` ascendente, y dentro de cada departamento por `salary` descendente.

* `ORDER BY` **siempre va al final** de la consulta, después de `WHERE` y antes de `LIMIT` si lo hay.

---

💡 **Tip de aprendizaje:**

`ORDER BY` no cambia los datos en la tabla, solo **cómo se muestran**. Es muy útil para reportes o cuando quieres ver los **mejores o peores salarios, fechas más recientes, etc.**

---

