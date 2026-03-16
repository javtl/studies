# 16. Funciones de ventana (`OVER`, `ROW_NUMBER`, etc.)

### Concepto

* Las **funciones de ventana** calculan valores **por fila**, manteniendo todas las filas en la tabla.
* A diferencia de las funciones agregadas normales, **no colapsan las filas**, pero permiten cálculos como totales acumulados, ranking o promedios por grupo.
* Se usan con `OVER()` y opcionalmente `PARTITION BY` y `ORDER BY`.

---

### Ejemplo básico

```sql id="win1"
SELECT first_name, department_id, salary,
       ROW_NUMBER() OVER (PARTITION BY department_id ORDER BY salary DESC) AS fila
FROM employees;
```

---

### Explicación paso a paso

1. `ROW_NUMBER() OVER (...)` → asigna un **número de fila** a cada empleado dentro de su partición.
2. `PARTITION BY department_id` → divide los empleados **por departamento**.
3. `ORDER BY salary DESC` → dentro de cada departamento, el empleado con **mayor salario** recibe fila 1, el siguiente fila 2, etc.
4. La consulta mantiene **todas las filas**, no agrupa ni elimina información.

---

### Resultado esperado (ejemplo ficticio)

| first_name | department_id | salary | fila |
| ---------- | ------------- | ------ | ---- |
| Alice      | 10            | 7000   | 1    |
| John       | 10            | 5000   | 2    |
| Bob        | 20            | 6000   | 1    |

---

### Otras funciones de ventana útiles

| Función               | Qué hace                                                            |
| --------------------- | ------------------------------------------------------------------- |
| `RANK()`              | Similar a `ROW_NUMBER()`, pero los empates reciben el mismo número. |
| `DENSE_RANK()`        | Como `RANK()`, pero sin saltos en los empates.                      |
| `SUM(...) OVER (...)` | Calcula suma acumulada o por grupo sin colapsar filas.              |
| `AVG(...) OVER (...)` | Promedio por grupo sin colapsar filas.                              |

---

### Notas importantes

* Muy útiles para **ranking, acumulados, promedios por grupo**, reportes y dashboards.
* `PARTITION BY` → define los grupos.
* `ORDER BY` dentro de `OVER()` → define el orden de cálculo.
* Mantienen **todas las filas originales**, a diferencia de `GROUP BY` que colapsa filas.

---

💡 **Tip de aprendizaje:**

Piensa en funciones de ventana como **“agregados avanzados que no eliminan filas”**, perfectos para ranking, totales acumulados y análisis por grupo.

---

