
# 📅 3. Funciones de Fecha

En SQL, el tipo de dato **DATE** no solo guarda el día; es un contenedor de precisión temporal.

### 📋 El tipo de dato DATE
* **Formato predeterminado**: `'dd/mm/yy'` (puede variar según la configuración del sistema).
* **Información almacenada**: Siglo, Año, Mes, Día, Hora, Minutos y Segundos.
* **Modificación**: Su formato de visualización se puede cambiar con la función `TO_CHAR`.

---

## 🛠️ Funciones para el manejo de fechas

| Función | Propósito |
| :--- | :--- |
| **SYSDATE** | Devuelve la fecha y hora actual del sistema. |
| **ADD_MONTHS(fecha, n)** | Suma *n* meses a la fecha indicada. |
| **LAST_DAY(fecha)** | Devuelve la fecha del último día del mes de esa fecha. |
| **MONTHS_BETWEEN(f1, f2)** | Calcula la diferencia en meses entre dos fechas. |
| **NEXT_DAY(fecha, cad)** | Devuelve la fecha del primer día de la semana (*cad*) posterior a la fecha dada. |

---

## 💡 Ejemplos Prácticos con Fechas

### 1. Calcular antigüedad
Si queremos saber cuántos meses lleva un empleado en la empresa:
```sql
SELECT nombre, MONTHS_BETWEEN(SYSDATE, fecha_ingreso) AS meses_antiguedad
FROM empleados;

```

### 2. Calcular vencimientos

Para saber cuándo caduca una suscripción de 6 meses contratada hoy:

```sql
SELECT ADD_MONTHS(SYSDATE, 6) AS fecha_vencimiento FROM DUAL;

```

### 3. Próximo lunes

Si queremos saber qué día será el primer lunes después de hoy:

```sql
SELECT NEXT_DAY(SYSDATE, 'MONDAY') FROM DUAL;

```

> [!TIP]
> **Nota sobre MariaDB**: Al igual que con las funciones anteriores, `SYSDATE` y `ADD_MONTHS` son estándar, pero para `NEXT_DAY` o `MONTHS_BETWEEN`, MariaDB suele usar otras alternativas como `DATE_ADD()` o `DATEDIFF()`. **Para tu examen, cíñete estrictamente a las de esta tabla.**

```



---

### 🎓 Conclusión del Tema de Funciones
Con este bloque hemos terminado de estructurar:
1. **Sentencia SELECT** (Orden de ejecución).
2. **JOINS** (Lógica de conjuntos).
3. **Funciones Aritméticas**.
4. **Funciones de Cadena**.
5. **Funciones de Fecha**.

