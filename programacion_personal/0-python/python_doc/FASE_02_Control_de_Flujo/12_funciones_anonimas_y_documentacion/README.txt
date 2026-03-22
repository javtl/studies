¡Excelente! Dadas nuestras restricciones de tiempo (una hora) y el enfoque en el **Punto 12: Funciones Anónimas y Documentación**, procederemos de inmediato con la explicación detallada extraída de la documentación y la plantilla de estudio.

Este punto se encuentra dentro de la **FASE 2: Control de Flujo y Funciones** y aborda las secciones **4.9.6. Expresiones lambda** y **4.9.7. Cadenas de texto de documentación** del tutorial de Python 3.13.8.

---

## 🔹 Punto 12 — Funciones Anónimas y Documentación

### 1️⃣ Explicación clara y simple

Este punto cubre dos herramientas de función clave para escribir código más conciso y mejor documentado:

1.  **Funciones Anónimas (Lambda)**:
    *   **Qué son:** Son funciones pequeñas, **sin nombre**, que se definen en una sola línea de expresión.
    *   **Para qué sirven:** Son ideales para operaciones sencillas y temporales donde definir una función completa con `def` sería excesivo.

2.  **Cadenas de Documentación (Docstrings)**:
    *   **Qué son:** Son bloques de texto que se colocan entre triples comillas (`"""`) justo al inicio de una función, clase o módulo.
    *   **Por qué se usan:** Son vitales para la **legibilidad** y permiten la **documentación automática** en Python, explicando el propósito, los parámetros y el valor que retorna el código.

### 2️⃣ Ejemplo cotidiano o conceptual

*   **Lambda (Lupa de un solo uso):** Imagina que necesitas una lupa para ver un detalle minúsculo rápidamente. Esa lupa es una **lambda**: una herramienta de un solo uso y muy específica que se descarta después de realizar la tarea.
*   **Docstring (Etiqueta de producto):** Un **docstring** es como la etiqueta nutricional o de instrucciones de un producto en el supermercado. Te dice exactamente qué contiene, para quién es y cómo usarlo (argumentos, retorno, propósito), sin necesidad de abrir el paquete o revisar el código fuente completo.

### 3️⃣ Bloque de código de ejemplo (Python, comentado)

#### **Ejemplos de Expresiones Lambda**

Las expresiones lambda son frecuentemente utilizadas como argumentos de funciones de orden superior (como `sorted()`, `filter()` o `map()`).

```python
# 3a. Ejemplo Básico de Lambda: Multiplicar por un valor fijo (ej. 10)

# La función lambda toma el argumento 'x' y devuelve 'x * 10'
multiplicar_por_diez = lambda x: x * 10

print(f"Lambda (5 * 10): {multiplicar_por_diez(5)}") # Resultado: 50

# 3b. Ejemplo de Lambda usada con sorted()

pares = [(1, 'dos'), (3, 'cuatro'), (2, 'uno')]

# Usamos lambda para decirle a sorted() que ordene basándose en el elemento
# (el string) de cada tupla, en lugar del elemento  (el número).
ordenado_por_str = sorted(pares, key=lambda item: item)

print(f"Ordenado por string: {ordenado_por_str}")
# Resultado esperado: [(2, 'uno'), (1, 'dos'), (3, 'cuatro')]
```

#### **Ejemplo de Docstring**

```python
# 3c. Ejemplo de Docstring en una función

def calcular_area_rectangulo(ancho, alto):
    """
    Calcula el área de un rectángulo.

    Argumentos:
        ancho (float): La dimensión horizontal del rectángulo.
        alto (float): La dimensión vertical del rectángulo.

    Retorna:
        float: El área total (ancho * alto).
    """
    return ancho * alto

# Accediendo a la documentación usando el atributo especial __doc__
print("\n--- Docstring ---")
print(calcular_area_rectangulo.__doc__) # Imprime el contenido entre las triples comillas
```

### 4️⃣ Ejercicio resuelto paso a paso

**Enunciado:** Usar una función lambda para filtrar de una lista de números solo aquellos que sean **mayores a 10**, utilizando la función `filter()`.

*   **Paso 1: Definir la lista inicial.**
    `numeros =`

*   **Paso 2: Definir la expresión lambda que actúa como criterio de filtrado.**
    La lambda debe evaluar si el número (`n`) es mayor a 10.
    `criterio = lambda n: n > 10`

*   **Paso 3: Aplicar `filter()` con la lambda y convertir el resultado a lista.**
    La función `filter()` aplica el `criterio` a cada elemento de `numeros`.
    `mayores_diez = list(filter(criterio, numeros))`

*   **Resultado:** ``

### 5️⃣ Ejercicios propuestos

Para practicar los conceptos aprendidos en esta sesión de una hora:

*   **Fácil:** Define una función lambda que reciba una cadena de texto y devuelva su longitud.
*   **Intermedio:** Define una función llamada `obtener_info(dato)` que tome cualquier cosa, devuelva una docstring explicando que el dato es de tipo `dato.__class__.__name__`, y luego llama a esa función con un número entero e imprime su docstring.
*   **Otro:** Usar una función lambda dentro de sorted() para ordenar una lista compleja por un criterio específico. Tienes una lista de productos, donde cada producto es una tupla: (nombre, precio, stock).
---

