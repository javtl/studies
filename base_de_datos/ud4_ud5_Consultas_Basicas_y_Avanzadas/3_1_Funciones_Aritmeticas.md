# 🧮 3. Funciones en SQL

Las funciones permiten transformar los datos al consultarlos. Se dividen según cuántos valores procesan a la vez.

---

## 🟢 3.1. Funciones de Valores Simples (Fila a Fila)
Operan sobre un único número, variable o columna de una fila específica.

| Función | Propósito |
| :--- | :--- |
| **ABS(n)** | Valor absoluto de *n*. |
| **CEIL(n)** | Redondea al entero igual o superior más cercano. |
| **FLOOR(n)** | Redondea al entero igual o inferior más cercano. |
| **MOD(m, n)** | Resto de la división de *m* entre *n*. |
| **POWER(m, exp)** | Calcula $m^{exp}$. |
| **SIGN(valor)** | Devuelve el signo del valor (1 si es positivo, -1 si es negativo). |
| **SQRT(n)** | Raíz cuadrada de *n*. |
| **ROUND(n, m)** | Redondea *n* a *m* decimales. |
| **TRUNC(n, m)** | Trunca *n* para que tenga solo *m* decimales (sin redondear). |
| **NVL(val, exp)** | **¡Importante!** Si *val* es `NULL`, lo sustituye por *exp*. |

---

## 🟡 3.2. Funciones de Listas (Multicolumna)
Trabajan con varias columnas dentro de una **misma fila**.

* **GREATEST(v1, v2, ...)**: Obtiene el mayor valor de la lista de columnas proporcionada.
* **LEAST(v1, v2, ...)**: Obtiene el menor valor de la lista de columnas proporcionada.

---

## 🔵 3.3. Funciones de Grupos de Valores (Agregación)
Se usan para realizar estadísticas sobre **múltiples filas**. Los valores `NULL` no se tienen en cuenta en estos cálculos.

| Función | Propósito |
| :--- | :--- |
| **AVG(n)** | Media aritmética. |
| **COUNT(*)** | Cuenta el número total de filas. |
| **COUNT(exp)** | Cuenta cuántas veces aparece un valor (ignora NULLs). |
| **MAX(exp)** | Valor máximo. |
| **MIN(exp)** | Valor mínimo. |
| **SUM(exp)** | Suma total de los valores. |
| **VARIANCE(exp)** | Varianza estadística. |

---

## 💡 Ejemplo de uso combinado

Imagina que queremos saber el salario medio de los empleados, pero si alguien no tiene salario asignado (`NULL`), queremos que cuente como $0$ para no alterar la estadística (aunque `AVG` ignora NULLs, esto es un ejemplo de lógica):

```sql
SELECT AVG(NVL(salario, 0)) AS salario_medio_real
FROM empleados;

```

O comparar dos columnas de la misma fila para saber cuál es mayor:

```sql
SELECT nombre, GREATEST(salario_fijo, salario_variable) AS mejor_pago
FROM comerciales;

```

### Un detalle técnico importante:
En **MariaDB** (y MySQL), la función `NVL` de tus apuntes (que es típica de Oracle) se suele escribir como **`IFNULL(valor, expresión)`** o **`COALESCE(valor, expresión)`**. Si tu profesor usa específicamente `NVL` en el examen, memorízalo así, pero ten en cuenta que en la consola de MariaDB podrías necesitar `IFNULL`.

