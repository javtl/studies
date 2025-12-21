## 🐍 Lección 2: Listas, Operadores y Formateo

### 1. Listas: Colecciones Dinámicas

En Python, las listas son equivalentes a los `ArrayList` de Java, pero mucho más potentes. Pueden crecer, achicarse y guardar tipos de datos mezclados (aunque no es recomendable).

| Acción | Código Python | Nota |
| --- | --- | --- |
| **Crear** | `mi_lista = ["BTC", "ETH", "SOL"]` | Se usan corchetes `[]`. |
| **Acceder** | `print(mi_lista[0])` | Índices empiezan en 0. |
| **Último elemento** | `print(mi_lista[-1])` | El "truco" Senior: indexado negativo. |
| **Añadir** | `mi_lista.append("ADA")` | Agrega al final de la lista. |
| **Modificar** | `mi_lista[1] = "DOT"` | Las listas son **mutables**. |
| **Tamaño** | `len(mi_lista)` | Equivale al `.size()` de Java. |

### 2. Operadores Básicos

Además de los matemáticos (`+`, `-`, `*`, `/`), en Python usamos operadores de identidad y pertenencia que hacen el código más legible:

* **Pertenencia (`in` / `not in`):** Devuelve un booleano.
```python
criptos = ["BTC", "ETH"]
print("BTC" in criptos)  # True

```


* **División Entera (`//`):** Devuelve solo la parte entera.
* **Módulo (`%`):** Devuelve el resto (muy útil para algoritmos).
* **Potencia (`**`):** Ejemplo: `2 ** 3` es 8.

### 3. String Formatting (f-strings)

Es la forma más eficiente y legible de concatenar variables en texto desde Python 3.6.

```python
precio = 45000.78912
# Formatear a 2 decimales y con separador de miles:
print(f"El precio es: ${precio:,.2f}") 
# Resultado: El precio es: $45,000.79

```

* **`:f`** indica que es un float.
* **`.2`** indica el número de decimales.
* **`,`** añade el separador de miles automáticamente.

### 4. Comparación Conceptual con Java

* En **Java**, los Arrays tienen tamaño fijo. En **Python**, las listas son dinámicas por defecto.
* En **Java**, usas `equals()` para comparar contenido de Strings o elementos. En **Python**, el operador `==` ya compara el contenido (valor), mientras que `is` compara la identidad (referencia en memoria).

