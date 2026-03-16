# Subconsultas correlacionadas en SQL

Una **subconsulta correlacionada** es una subconsulta que **depende de la consulta principal**.

Esto significa que la subconsulta **usa valores de la consulta externa**, por lo que **se ejecuta una vez por cada fila** de la consulta principal.

A diferencia de las subconsultas normales, **no puede ejecutarse de forma independiente**.

---

# 1. Sintaxis básica

```sql
SELECT columnas
FROM tabla1 t1
WHERE columna operador (
    SELECT funcion(columna)
    FROM tabla2 t2
    WHERE t2.columna_relacion = t1.columna_relacion
);
```

### Cómo funciona

1. La consulta principal toma **una fila de `tabla1`**.
2. La subconsulta usa **valores de esa fila**.
3. Se ejecuta la subconsulta con ese valor.
4. Se compara el resultado.
5. Se repite **para cada fila de la consulta principal**.

---

# 2. Ejemplo práctico

### Problema

Mostrar los **empleados que ganan más que el promedio de su departamento**.

```sql
SELECT first_name, salary, department_id
FROM employees e1
WHERE salary > (
    SELECT AVG(salary)
    FROM employees e2
    WHERE e2.department_id = e1.department_id
);
```

### Qué ocurre

1. Se toma un empleado (`e1`).
2. La subconsulta calcula el **promedio de su departamento**.
3. Se compara su salario con ese promedio.
4. Si gana más → se muestra.
5. Se repite con el siguiente empleado.

---

# 3. Diferencia con subconsulta normal

### Subconsulta normal

Se ejecuta **una sola vez**.

```sql
SELECT first_name
FROM employees
WHERE salary > (
    SELECT AVG(salary)
    FROM employees
);
```

Aquí el promedio se calcula **solo una vez**.

---

### Subconsulta correlacionada

Se ejecuta **muchas veces (una por fila)**.

```sql
SELECT first_name
FROM employees e1
WHERE salary > (
    SELECT AVG(salary)
    FROM employees e2
    WHERE e1.department_id = e2.department_id
);
```

Aquí el promedio se calcula **para cada departamento**.

---

# 4. Identificar una subconsulta correlacionada

Hay una pista muy clara:

💡 **La subconsulta usa columnas de la consulta externa.**

Ejemplo:

```sql
WHERE e2.department_id = e1.department_id
```

`e1` pertenece a la consulta externa.

---

# 5. Otro ejemplo típico

Empleados que ganan **más que algún compañero de su departamento**.

```sql
SELECT first_name, salary
FROM employees e1
WHERE salary > (
    SELECT MIN(salary)
    FROM employees e2
    WHERE e1.department_id = e2.department_id
);
```

---

# 6. Cuándo se usan mucho

Las subconsultas correlacionadas se usan para:

* Comparar con **promedios de grupos**
* Comparar con **máximos o mínimos dentro de un grupo**
* Buscar registros **relacionados con otros de la misma tabla**
* Filtrar datos **dependiendo del contexto de cada fila**

---

# 7. Uso frecuente con `EXISTS`

Muchas subconsultas correlacionadas usan `EXISTS`.

Ejemplo: empleados que tienen subordinados.

```sql
SELECT first_name
FROM employees e1
WHERE EXISTS (
    SELECT 1
    FROM employees e2
    WHERE e2.manager_id = e1.employee_id
);
```

Aquí la subconsulta depende del `employee_id` del empleado actual.

---

# Regla mental para recordar

> **Subconsulta correlacionada = subconsulta que usa datos de la fila actual de la consulta principal.**

---

💡 **Truco rápido para detectarlas en un examen**

Si dentro de la subconsulta aparece algo como:

```
e1.columna
```

entonces **seguramente es correlacionada**.

