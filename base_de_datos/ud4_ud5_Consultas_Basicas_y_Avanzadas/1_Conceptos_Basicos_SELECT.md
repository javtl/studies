# Consultas con la Sentencia SELECT

La sentencia `SELECT` es la herramienta principal para recuperar datos. Aunque nosotros la escribimos empezando por "SELECT", MariaDB sigue un orden interno específico para procesar la información.

---

## ⚙️ 1. Orden de Ejecución Lógica (El "Pipeline")
Para generar los resultados, el motor de la base de datos sigue estos pasos en este orden exacto. **No se empieza por el SELECT.**

1. **FROM**: Localiza la tabla o tablas de origen.
2. **WHERE**: Filtra fila por fila según las condiciones.
3. **GROUP BY**: Agrupa las filas filtradas (basado en expresiones).
4. **HAVING**: Filtra los grupos ya creados.
5. **SELECT**: Extrae las columnas finales de las filas que sobrevivieron.
6. **SELECT DISTINCT**: Elimina duplicados si se ha solicitado.
7. **ORDER BY**: Ordena el resultado final para mostrarlo.
8. **Operadores de Conjunto (UNION/INTERSECT/MINUS)**: Si hay varias consultas combinadas, se repite el proceso y luego se aplican estos operadores.

---

## 📝 2. Sintaxis Oficial de SELECT
Aquí se detalla la estructura completa. Recuerda la leyenda de símbolos:
* `[]` : Opcional.
* `|`  : Elegir uno u otro.
* `{}` : Elección obligatoria.

```sql
SELECT [DISTINCT | ALL] {* | expresión-1, expresión-2, ..., expresión-n}
FROM tabla-1[, tabla-2, ..., tabla-n]
[ WHERE condicion_where]
[ GROUP BY expresión-1[, expresión-2, ..., expresión-n]]
[ HAVING condicion_having]
[{ UNION | INTERSECT | MINUS} SELECT ...]
[ ORDER BY {expresión | pos_columna} [ASC | DESC] [,...]];

```

---

## 🔍 3. Componentes de la Sentencia

### La Expresión

En SQL, una **expresión** no es solo el nombre de una columna. Puede ser:

* **Constantes:** Un número o un texto fijo (ej: `10`, `'Hola'`).
* **Referencias:** El nombre de una columna (ej: `nombre_empleado`).
* **Aritmética:** Cálculos directos (ej: `salario * 1.15`).

### Cláusulas de Visualización

* **DISTINCT**: Solo muestra filas diferentes. Si hay 10 personas de "Madrid", con `DISTINCT` solo aparecerá "Madrid" una vez.
* **ALL**: Es el comportamiento por defecto; muestra todos los registros aunque se repitan.
* **El Asterisco (`*`)**: Comodín que indica "todas las columnas de la tabla".

---

> [!IMPORTANT]
> **Nota del profesor:** Aunque los puntos de `GROUP BY`, `HAVING` y los operadores de conjunto (`UNION`, etc.) se verán más adelante, es vital entender que ocurren **antes (agrupación)** o **después (ordenación)** del SELECT.

## 💡 Ejemplo Práctico: ¿Cómo se procesa una consulta?

Imagina que tenemos una tabla llamada `empleados` con las columnas: `nombre`, `departamento`, `salario` y `ciudad`.

Queremos obtener los **departamentos distintos** de los empleados de **'Madrid'**, ordenados alfabéticamente.

### La Consulta SQL:
```sql
SELECT DISTINCT departamento 
FROM empleados 
WHERE ciudad = 'Madrid' 
ORDER BY departamento ASC;