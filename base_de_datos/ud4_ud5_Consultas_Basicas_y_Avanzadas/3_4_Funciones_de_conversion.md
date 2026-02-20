# 🔄 4. Funciones de Conversión

Estas funciones son esenciales para transformar un tipo de dato en otro, permitiendo formatear salidas o preparar datos para cálculos específicos.

| Función | Propósito |
| :--- | :--- |
| **TO_CHAR(fecha, 'formato')** | Convierte una fecha (`DATE`) a una cadena de texto (`VARCHAR2`) con un formato específico. |
| **TO_CHAR(numero, 'formato')** | Convierte un valor numérico (`NUMBER`) a texto, útil para añadir símbolos de moneda o separadores. |
| **TO_DATE(cad, 'formato')** | Convierte un texto (`CHAR/VARCHAR2`) en una fecha real, interpretándolo según el formato indicado. |
| **TO_NUMBER(cad, ['formato'])**| Convierte una cadena de texto en un número para poder realizar operaciones aritméticas. |

---

## 🎨 Formatos comunes (Máscaras)

Para usar estas funciones, necesitas conocer las "marcas" o formatos. Según la documentación de referencia:

### Para Fechas:
* **YYYY**: Año de 4 dígitos.
* **MM**: Mes en número (01-12).
* **MONTH**: Nombre del mes completo.
* **DD**: Día del mes.
* **DAY**: Nombre del día de la semana completo.
* **HH24**: Hora en formato de 24h.

### Para Números:
* **9**: Representa un dígito.
* **0**: Fuerza la visualización de un cero inicial.
* **L**: Símbolo de moneda local (ej. €).
* **.** o **,**: Separadores de decimales y millares.

---

## 💡 Ejemplos de Conversión

### 1. Formatear una fecha para un informe
```sql
-- Resultado ejemplo: 'Hoy es FRIDAY, 20 FEBRUARY de 2026'
SELECT 'Hoy es ' || TO_CHAR(SYSDATE, 'DAY, DD MONTH "de" YYYY') FROM DUAL;

```

### 2. Convertir texto a fecha para filtrar

```sql
-- Útil cuando recibes una fecha como texto desde un formulario
SELECT * FROM pedidos 
WHERE fecha_pedido > TO_DATE('01/01/2024', 'DD/MM/YYYY');

```

### 3. Formatear dinero

```sql
-- Convierte el número 1500.5 en '1.500,50€' (dependiendo de la máscara)
SELECT TO_CHAR(salario, '9G999D99L') FROM empleados;

```

```



---

### 📝 Resumen de tus apuntes completados:
1.  **Sentencia SELECT**: Aprendiste que el orden en que escribes (`SELECT... FROM... WHERE...`) no es el orden en que MariaDB lo ejecuta.
2.  **JOINS**: Ahora dominas cómo unir círculos (tablas) para obtener datos combinados o registros que no tienen pareja.
3.  **Funciones**: Tienes un catálogo completo de herramientas para números, textos, fechas y conversiones.

