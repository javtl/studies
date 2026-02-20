# 🔤 4. Funciones de Cadena de Caracteres

Estas funciones permiten manipular y analizar textos (strings). Se dividen según el tipo de dato que devuelven.

---

## 🅰️ 3.1. Funciones que devuelven Caracteres
Transforman el texto original en uno nuevo.

| Función | Propósito |
| :--- | :--- |
| **CHR(n)** | Devuelve el carácter correspondiente al valor binario/ASCII *n*. |
| **CONCAT(cad1, cad2)** | Une (concatena) dos cadenas de texto. |
| **UPPER(cad)** | Convierte todo el texto a **MAYÚSCULAS**. |
| **LOWER(cad)** | Convierte todo el texto a **minúsculas**. |
| **INITCAP(cad)** | Pone en mayúscula solo la **P**rimera **L**etra de cada palabra. |
| **SUBSTR(cad, m [,n])** | Extrae una parte de la cadena desde la posición *m* con una longitud *n*. |
| **REPLACE(cad, busq, sust)** | Sustituye todas las apariciones de una palabra por otra. |
| **TRANSLATE(c1, c2, c3)** | Intercambia caracteres específicos de *c1* que estén en *c2* por los de *c3*. |

### Relleno y Limpieza (Padding & Trimming)
* **LPAD / RPAD(cad, n [,relleno])**: Añade caracteres por la **Izquierda (L)** o **Derecha (R)** hasta que el texto tenga una longitud total de *n*.
* **LTRIM / RTRIM(cad [,set])**: Elimina espacios o caracteres específicos del conjunto *set* por la **Izquierda** o **Derecha**.

---

## 🔢 3.2. Funciones que devuelven Números
Analizan el texto y nos dan información numérica sobre él.

| Función | Propósito |
| :--- | :--- |
| **ASCII(cad)** | Devuelve el código ASCII de la **primera** letra de la cadena. |
| **LENGTH(cad)** | Devuelve la longitud total (número de caracteres) de la cadena. |
| **INSTR(c1, c2 [,ini [,m]])** | Busca la cadena *c2* dentro de *c1*. Devuelve la **posición** donde la encuentra. |

---

## 💡 Ejemplos Prácticos de Cadena

### 1. Limpieza de nombres
Si tenemos nombres con espacios extra o en formatos mixtos:
```sql
-- Convierte a "Juan" y quita espacios a la derecha
SELECT RTRIM(INITCAP(nombre)) FROM usuarios;

```

### 2. Generar códigos ocultos (Padding)

```sql
-- Convierte el ID 123 en "000123"
SELECT LPAD(id_usuario, 6, '0') FROM usuarios;

```

### 3. Extraer iniciales

```sql
-- Obtiene la primera letra del nombre
SELECT SUBSTR(nombre, 1, 1) FROM empleados;

```

```



---

### ⚠️ Nota de Compatibilidad (MariaDB vs Oracle)
Al igual que con `NVL`, algunas funciones de tu lista son muy comunes en **Oracle SQL**:
1.  **INITCAP**: MariaDB no tiene `INITCAP` de forma nativa (se suele crear una función personalizada), pero es vital que la sepas para el examen de tu profesor.
2.  **SUBSTR**: En MariaDB también se puede usar `SUBSTRING()`.
3.  **TRANSLATE**: Es una función de Oracle que MariaDB implementó recientemente (versión 10.4+).

