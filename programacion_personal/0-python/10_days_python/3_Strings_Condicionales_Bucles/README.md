## 🐍 Lección 3: Strings, Condicionales y Bucles

### 1. Manipulación de Strings (Cadenas de Texto)

En Python, los strings son **objetos inmutables**. Esto significa que cada vez que aplicas un método, Python crea una nueva cadena en memoria en lugar de modificar la original.

| Método / Técnica | Ejemplo de Código | Descripción |
| --- | --- | --- |
| **Slicing** | `texto[0:3]` | Extrae una parte (del índice 0 al 2). |
| **Limpieza** | `texto.strip()` | Elimina espacios al inicio y final (`trim()` en Java). |
| **Case** | `texto.upper()` / `.lower()` | Transforma a mayúsculas o minúsculas. |
| **Búsqueda** | `"BTC" in texto` | Devuelve `True` si el texto contiene la palabra. |
| **Reemplazo** | `texto.replace("A", "B")` | Cambia un carácter o frase por otra. |

### 2. Estructuras Condicionales (`if`, `elif`, `else`)

Python elimina la necesidad de llaves `{}` y paréntesis `()` mediante el uso de **indentación obligatoria** y los dos puntos `:`.

```python
precio = 50000

if precio > 60000:
    print("Venta masiva")
elif precio > 40000:
    print("Mantener posición")
else:
    print("Comprar más")

```

* **`elif`**: Es la abreviatura de `else if`. Puedes usar tantos como necesites.
* **Indentación**: Si no dejas exactamente 4 espacios (o un tabulador) en el bloque interno, Python lanzará un `IndentationError`.

### 3. Bucles e Iteraciones

Python se enfoca en la legibilidad y en iterar directamente sobre los objetos.

#### A. El Bucle `for`

Se usa principalmente para recorrer colecciones (listas, tuplas, diccionarios) o rangos numéricos.

```python
# Uso con range(inicio, fin_excluido)
for i in range(1, 5):
    print(f"Iteración {i}") # Imprime 1, 2, 3, 4

```

#### B. El Bucle `while`

Se repite mientras una condición sea verdadera.

```python
contador = 5
while contador > 0:
    print(contador)
    contador -= 1  # Importante: Python no tiene i++ como Java. Se usa i += 1.

```

### 4. Diferencias Clave con Java

* **Sintaxis**: En Java usas `for(int i=0; i<n; i++)`. En Python, el `for` es por naturaleza un **Iterator**.
* **Operadores Lógicos**: En lugar de `&&` y `||`, en Python usamos las palabras reservadas **`and`** y **`or`**, lo que hace que el código parezca lenguaje natural.
