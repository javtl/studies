Con este último bloque cerramos el catálogo completo de funciones de tus apuntes. Estas funciones son de utilidad general y control de flujo. La función `DECODE` es especialmente importante porque funciona como un "IF-THEN-ELSE" dentro de una consulta.

Aquí tienes la sección final para tus apuntes `.md`:

---

```markdown
# 🛠️ 7. Otras Funciones (Utilidad y Lógica)

Estas funciones proporcionan información sobre la sesión actual o permiten aplicar lógica condicional directamente en el `SELECT`.

| Función | Propósito |
| :--- | :--- |
| **USER** | Devuelve el nombre del usuario que está conectado actualmente a la base de datos. |
| **UID** | Devuelve el identificador numérico único del usuario actual. |
| **DECODE(var, v1, c1, v2, c2, ..., def)** | Compara una variable con una lista de valores y devuelve un resultado específico si coincide, o un valor por defecto si no. |

---

## 🧠 Profundizando en DECODE

La función `DECODE` es una de las más potentes para personalizar la salida de tus informes. Funciona siguiendo esta lógica:
- Si `var` = `val1` entonces devuelve `cod1`.
- Si no, si `var` = `val2` entonces devuelve `cod2`.
- Si no coincide con ninguno, devuelve el `valor-por-defecto`.

### 💡 Ejemplo Práctico de DECODE
Imagina que en tu tabla `empleados` tienes una columna `id_departamento` con números, pero quieres que el resultado muestre el nombre del departamento:

```sql
SELECT nombre, 
       DECODE(id_departamento, 
              10, 'Contabilidad', 
              20, 'Investigación', 
              30, 'Ventas', 
              'Otro departamento') AS nombre_depto
FROM empleados;

```

---

> [!NOTE]
> **Diferencia MariaDB / Oracle**: Al igual que `NVL`, `DECODE` es una función muy característica de **Oracle**. En MariaDB estándar se suele utilizar la sentencia **`CASE`** o la función **`IF()`**, pero para tu examen debes dominar `DECODE` tal como aparece en tus requisitos.

```



