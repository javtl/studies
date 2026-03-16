# 3. Funciones básicas (`COUNT`, `SUM`, `AVG`, `MIN`, `MAX`)

### Concepto

* Las **funciones agregadas** sirven para **resumir datos** de una columna.
* Se usan mucho junto con `GROUP BY`, pero también pueden usarse sin él.
* Funciones más comunes:

| Función   | Qué hace                           |
| --------- | ---------------------------------- |
| `COUNT()` | Cuenta el número de filas          |
| `SUM()`   | Suma los valores de una columna    |
| `AVG()`   | Calcula el promedio de una columna |
| `MIN()`   | Devuelve el valor mínimo           |
| `MAX()`   | Devuelve el valor máximo           |

---

### Ejemplo básico

```sql id="fun1"
SELECT COUNT(*) AS total_empleados,
       AVG(salary) AS salario_promedio,
       MAX(salary) AS salario_maximo,
       MIN(salary) AS salario_minimo
FROM employees;
```

---

### Explicación paso a paso

1. `COUNT(*)` → cuenta **todas las filas** de la tabla `employees`.
2. `AVG(salary)` → calcula el **promedio de todos los salarios**.
3. `MAX(salary)` → muestra el **salario más alto**.
4. `MIN(salary)` → muestra el **salario más bajo**.
5. `AS nombre_columna` → da un **alias** a la columna calculada, para que el resultado sea más legible.

---

### Resultado esperado (ejemplo ficticio)

| total_empleados | salario_promedio | salario_maximo | salario_minimo |
| --------------- | ---------------- | -------------- | -------------- |
| 6               | 5200             | 7000           | 3500           |

---

### Notas importantes

* Estas funciones **ignoran valores `NULL`** en la mayoría de los casos (excepto `COUNT(*)`).
* Se pueden usar **en combinación con `WHERE`** para filtrar antes de calcular:

```sql id="fun2"
SELECT COUNT(*) AS total_altos_salarios
FROM employees
WHERE salary > 5000;
```

* También se usan con `GROUP BY` para calcular resúmenes **por grupo**, por ejemplo por departamento:

```sql id="fun3"
SELECT department_id, AVG(salary) AS salario_promedio
FROM employees
GROUP BY department_id;
```

> Esto calcula el salario promedio **para cada departamento**.

---

💡 **Tip de aprendizaje:**

Piensa en estas funciones como **resúmenes automáticos** de tus datos: cuántos, cuánto suman, el promedio, el máximo y el mínimo. Son la base de muchos informes en SQL.

---