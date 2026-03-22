### 🔹 Punto 13 — Listas Avanzadas

Este punto corresponde a la sección **5.1. Más sobre listas** dentro de *El tutorial de Python*. Las listas ya fueron introducidas previamente (en 3.1.3. Listas) como uno de los tipos de datos compuestos de Python que puede ser indexado y segmentado.

El objetivo central de este punto es dominar las técnicas avanzadas de manipulación de listas.

**Objetivo Clave:** Uso de listas como **pilas y colas**, y dominio de la **Comprensión de listas** (*list comprehensions*), una técnica poderosa del lenguaje.

---

**1️⃣ Explicación clara y simple: Usos avanzados de las Listas**

El estudio de las Listas Avanzadas se divide principalmente en tres áreas clave (Sección 5.1 del tutorial):

1.  **Listas como Pilas (5.1.1):** Las listas se pueden utilizar como **estructuras de datos de pila**. Una pila opera bajo el principio LIFO (*Last In, First Out*), lo que significa que el último elemento añadido es el primer elemento que se recupera.
2.  **Listas como Colas (5.1.2):** Las listas también pueden utilizarse como **estructuras de datos de cola**. Una cola opera bajo el principio FIFO (*First In, First Out*), donde el primer elemento añadido es el primero que se recupera.
3.  **Comprensión de Listas (5.1.3 y 5.1.4):** La **Comprensión de listas** (*list comprehensions*) es una técnica fundamental y poderosa del lenguaje. Permite construir listas de manera concisa a partir de iterables, a menudo en una sola línea de código, sustituyendo bucles `for` y `list.append()`. Incluye también el manejo de **Listas por comprensión anidadas**.

Además, en este punto se estudiará el manejo avanzado (*slicing* avanzado) y el uso de métodos específicos de las listas.

**2️⃣ Ejemplo cotidiano o conceptual**

*   **Pilas (Stacks) y Colas (Queues):**
    *   Una **pila (stack)** se asemeja a una pila de libros: solo puedes tomar el libro que está en la parte superior (el último que pusiste).
    *   Una **cola (queue)** se asemeja a una fila en el supermercado: el primero en llegar es el primero en ser atendido.
*   **Comprensión de Listas (*List Comprehensions*):**
    *   Imagina que tienes una lista de nombres de frutas. La **comprensión de listas** es el proceso rápido y automatizado de decirle al sistema: "Toma todos estos nombres de frutas y devuélveme una nueva lista donde cada nombre esté en mayúsculas". Es una manera muy eficiente de generar secuencias de datos.
*  
📚 Profundizando: Listas como Pilas (LIFO) y Colas (FIFO)

1. Listas como Pilas (Stacks): Principio LIFO

Para simular una Pila (Stack), se aplica el principio LIFO (Last In, First Out). Esto se logra utilizando los métodos de lista que interactúan con el final de la lista.
Operación	Método	Descripción	Principio LIFO
Push (Entrada)	.append(elemento)	Añade un elemento al final.	Último en Entrar.
Pop (Salida)	.pop()	Quita y devuelve el último elemento.	Primero en Salir.

    🛑 Error a Evitar: Usar .pop(índice) (ej. pila.pop(0)) rompe la lógica LIFO, ya que obliga a la lista a actuar como una estructura indexada o, específicamente con pop(0), como una Cola (FIFO).

Python

# ✅ Demostración del Comportamiento LIFO
pila = []

pila.append("Libro 1")
pila.append("Libro 2")
pila.append("Libro 3") # <- Último en entrar

elemento_1 = pila.pop() # Saca "Libro 3"
elemento_2 = pila.pop() # Saca "Libro 2"

# La salida de la Pila sigue el orden inverso a la entrada.
print(f"Elemento extraído 1: {elemento_1}") # Salida: Libro 3
print(f"Pila final: {pila}") # Salida: ['Libro 1']

2. Listas como Colas (Queues): Principio FIFO y Rendimiento

Las Colas operan bajo el principio FIFO (First In, First Out).
Acción	Método	Advertencia de Rendimiento
Simulación con list.pop(0)	Entrada: list.append() → Salida: list.pop(0)	¡Lento! Eliminar el primer elemento en una lista estándar requiere desplazar todos los demás (O(n)).
Solución Recomendada	collections.deque	Usa append() para entrar y popleft() para salir. Altamente eficiente para operaciones FIFO (O(1)).

🧑‍💻 Ejercicio Resuelto (Simulación de Cola con deque)

````Python

from collections import deque

cola = deque(["Tarea A", "Tarea B"])

# 1. Añade "Tarea C" a la cola (Entrada)
cola.append("Tarea C")

# 2. Extrae (sirve) el primer elemento de la cola (Salida FIFO)
elemento_servido = cola.popleft() # Esto extrae "Tarea A"

# 3. Imprime el resultado
print(f"El elemento extraído (FIFO) es: {elemento_servido}")
print(f"La cola final es: {cola}")
# Salida: El elemento extraído (FIFO) es: Tarea A
# Salida: La cola final es: deque(['Tarea B', 'Tarea C'])
````

**3️⃣ Código de ejemplo (Python)**

*(Nota: Los fragmentos de código específicos para las secciones 5.1.1, 5.1.2 y 5.1.4 no se encuentran explícitamente en los extractos proporcionados para el Punto 13. Sin embargo, la fuente sí proporciona un ejemplo de la potencia de la comprensión de listas, que es un objetivo clave, demostrando cómo transformar una lista de elementos en otra de manera concisa):*

```python
# EJEMPLO DE COMPRENSIÓN DE LISTAS (List Comprehension)
# Este ejemplo es un objetivo clave del Punto 13.

fruits = ['Banana', 'Apple', 'Lime']

# Creamos una nueva lista aplicando el método .upper() a cada elemento
# Esta sintaxis es mucho más concisa que un bucle 'for'
loud_fruits = [fruit.upper() for fruit in fruits] 

print(loud_fruits)
# Resultado: ['BANANA', 'APPLE', 'LIME'] 
```
*(Para complementar su estudio de la documentación, deberá consultar ejemplos de `append()` y `pop()` para usar listas como pilas, y la función `collections.deque` o manipulación de `pop(0)` para listas como colas.)*

**4️⃣ Ejercicio resuelto (pasos)**

*   **Enunciado:** Usar la Comprensión de Listas para generar una lista que contenga el cuadrado de todos los números impares del 1 al 10.
*   **Paso 1: Definir el rango de números:** Usamos `range(1, 11)` (el último número es exclusivo).
*   **Paso 2: Definir el criterio (condición):** Solo queremos números impares (`if n % 2 != 0`).
*   **Paso 3: Definir la expresión (transformación):** Queremos el cuadrado del número (`n * n`).
*   **Resultado (Comprensión de Lista):**
    ```python
    cuadrados_impares = [n * n for n in range(1, 11) if n % 2 != 0]
    # Resultado:
    ```

**5️⃣ Ejercicios propuestos**

comprension_de_listas.py
*   **Fácil:** Partiendo de una lista inicial de nombres, usa la comprensión de listas para crear una nueva lista donde solo se incluyan los nombres que tienen más de 5 letras.
  
simulacion_pila.py
*   **Intermedio:** Simula la operación de una **Pila (Stack)** utilizando una lista, donde se añaden tres elementos (`push`) y luego se extraen dos elementos (`pop`) para demostrar el comportamiento LIFO (último en entrar, primero en salir).

