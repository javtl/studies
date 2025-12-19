### 🔹 Punto 15 — Tuplas y Conjuntos (Sets)

El objetivo de este punto es comprender las **colecciones inmutables** (tuplas) y las **colecciones de elementos únicos** (conjuntos), aprendiendo cuándo usar cada una frente a las listas tradicionales.

#### 1️⃣ Explicación clara y simple

Python ofrece diferentes formas de agrupar datos según nuestras necesidades:

1. **Tuplas (`tuple`):** Son secuencias de elementos muy parecidas a las listas, pero con una diferencia vital: **son inmutables**. Una vez que creas una tupla, no puedes cambiar, añadir ni eliminar sus elementos. Se usan para datos que "van juntos" (como coordenadas o fechas).
2. **Conjuntos (`set`):** Son colecciones desordenadas de elementos **únicos**. Si intentas añadir un elemento que ya existe, el conjunto simplemente lo ignora. Son perfectos para eliminar duplicados y realizar operaciones matemáticas como uniones o intersecciones.

#### 2️⃣ Ejemplo cotidiano o conceptual

* **La Tupla es como un Diploma:** Una vez impreso, contiene tu nombre, la fecha y la carrera. No puedes "editar" el papel para cambiar la fecha; si algo cambia, tendrías que hacer un diploma (tupla) nuevo.
* **El Conjunto es como una Caja de Canicas:** No importa el orden en que las guardes, y si intentas meter dos canicas exactamente iguales (mismo color, tamaño y marca), para la lógica del conjunto, solo tienes "una de ese tipo". Es ideal para saber qué colores tienes sin importar cuántos de cada uno hay.

#### 3️⃣ Código de ejemplo (Python, comentado)

```python
# --- TRABAJANDO CON TUPLAS ---
# 3a. Creación y Desempaquetado
punto_gps = (40.4167, -3.70325) # Latitud y Longitud de Madrid
lat, lon = punto_gps # Desempaquetado: lat = 40.4167, lon = -3.70325

print(f"Coordenadas: Latitud {lat}, Longitud {lon}")

# 3b. Intento de modificación (Esto daría error)
# punto_gps[0] = 41.0  # TypeError: 'tuple' object does not support item assignment

# --- TRABAJANDO CON CONJUNTOS ---
# 3c. Creación desde una lista con duplicados
frutas_lista = ['manzana', 'pera', 'manzana', 'naranja', 'pera']
frutas_unicas = set(frutas_lista)

print(f"Set de frutas (sin duplicados): {frutas_unicas}") # {'manzana', 'naranja', 'pera'}

# 3d. Pertenencia rápida
print('manzana' in frutas_unicas) # True

```

#### 4️⃣ Ejercicio resuelto (pasos)

* **Enunciado:** Tienes una lista de códigos de producto donde algunos se repiten. Obtén el número total de **productos únicos** y asegúrate de que el código "A1" esté presente.
* **Paso 1: Definir la lista inicial:**
`codigos = ["A1", "B2", "A1", "C3", "B2", "D4"]`
* **Paso 2: Convertir a conjunto para limpiar duplicados:**
`unicos = set(codigos)`
* **Paso 3: Contar y verificar:**

```python
codigos = ["A1", "B2", "A1", "C3", "B2", "D4"]
unicos = set(codigos)

print(f"Total productos únicos: {len(unicos)}") # Resultado: 4
print(f"¿Está el A1?: {'A1' in unicos}")       # Resultado: True

```

#### 5️⃣ Ejercicios propuestos

**misterio_inmutabilidad.py**

* **Fácil:** Crea una tupla llamada `mi_ciudad` que contenga el nombre de una ciudad, su población y su país. Intenta cambiar el valor de la población y escribe en un comentario qué mensaje de error te devuelve Python.

**desempaquetado_veloz.py**

  * **Intermedio:** Dada la tupla `datos = (2025, "Enero", 15)`, utiliza el desempaquetado para asignar esos valores a las variables `anio`, `mes` y `dia`. Imprime una frase usando esas tres variables.

**filtro_invitados.py**

* **Avanzado:** Tienes dos listas de invitados: `invitados_boda = {"Ana", "Luis", "Juan"}` e `invitados_cena = {"Juan", "Marta", "Pedro"}`. Usa el operador `&` (intersección) para descubrir quién está invitado a **ambos** eventos.
