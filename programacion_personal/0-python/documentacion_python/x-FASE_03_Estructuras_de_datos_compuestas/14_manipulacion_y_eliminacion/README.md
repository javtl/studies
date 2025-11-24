### 🔹 Punto 14 — Manipulación y Eliminación (`del`)

El objetivo clave de este punto es **aprender a eliminar elementos o porciones de la lista** utilizando la instrucción `del`.

#### 1️⃣ Explicación clara y simple

La instrucción `del` es una sentencia fundamental de Python que permite la **eliminación definitiva de elementos**. Se utiliza principalmente para:

1.  **Eliminar un elemento específico** de una lista usando su índice.
2.  **Eliminar un rango completo de elementos** (un *slice* o segmento) de una lista, borrando de un solo golpe una porción de la secuencia.
3.  **Eliminar la variable de la lista (o cualquier variable) completamente** del espacio de nombres (memoria).

A diferencia del método `pop()` (que elimina y *devuelve* el elemento) o `remove()` (que elimina el elemento por *valor*), **la instrucción `del` no devuelve nada y opera directamente sobre la estructura o la variable misma**.

#### 2️⃣ Ejemplo cotidiano o conceptual

Imagina que estás gestionando una biblioteca física (la lista).

Si utilizas métodos de lista como `pop()` o `remove()`, estás sacando libros para leerlos o reubicarlos.

La instrucción **`del`** es como el bibliotecario que decide **desechar permanentemente** (eliminar) un libro específico de un estante (por índice), o deshacerse de toda una sección completa de libros obsoletos (por porción/segmento). Si usas `del` sobre el nombre del estante, ¡el estante y todos sus contenidos desaparecen completamente de la biblioteca!

#### 3️⃣ Código de ejemplo (Python, comentado)

```python
# 3a. Inicializamos una lista de nombres de colores
colores = ['Rojo', 'Verde', 'Azul', 'Amarillo', 'Púrpura']

print(f"Lista inicial: {colores}") # ['Rojo', 'Verde', 'Azul', 'Amarillo', 'Púrpura']

# 3b. Eliminando un solo elemento por índice (el tercer elemento, 'Azul')
# Se elimina el elemento en el índice 2
del colores
print(f"Después de del colores: {colores}") # Resultado: ['Rojo', 'Verde', 'Amarillo', 'Púrpura']

# 3c. Eliminando un segmento (slice) de elementos
# Eliminamos desde el índice 1 (incluido) hasta el final (excluido)
del colores[1:3]
print(f"Después de del colores[1:3]: {colores}") # Resultado: ['Rojo', 'Púrpura']

# 3d. Eliminando completamente la lista (la variable) del espacio de nombres
lista_a_eliminar =
del lista_a_eliminar

# Intentar usar la variable ahora causaría un NameError (comentar para evitar error):
# print(lista_a_eliminar)
```

#### 4️⃣ Ejercicio resuelto (pasos)

*   **Enunciado:** Tienes una lista de temperaturas históricas. Usa la instrucción `del` para **eliminar las últimas tres temperaturas** registradas.

*   **Paso 1: Definir la lista inicial:**
    `temperaturas = [18.5, 20.1, 22.0, 25.4, 23.9, 21.1]`

*   **Paso 2: Determinar el segmento a eliminar:** Las últimas tres posiciones se pueden seleccionar usando segmentación negativa (desde el índice `-3` hasta el final).

*   **Paso 3: Aplicar la instrucción `del`:**

```python
temperaturas = [18.5, 20.1, 22.0, 25.4, 23.9, 21.1]
del temperaturas[-3:]
# Resultado: temperaturas ahora es [18.5, 20.1, 22.0]
```

#### 5️⃣ Ejercicios propuestos

eliminacion_por_indice.py
*   **Fácil:** Dada la lista `ciudades = ['Madrid', 'París', 'Roma', 'Berlín']`, usa la instrucción `del` para **eliminar únicamente 'París'** de la lista.
eliminacion_total_variables.py
*   **Intermedio:** Crea una lista llamada `datos_sensibles` con 5 elementos. Después de manipularla, usa la instrucción `del` para **eliminar completamente la variable** `datos_sensibles` del programa y verifica (mediante un comentario) qué tipo de error ocurriría si intentaras acceder a ella inmediatamente después.