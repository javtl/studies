## 🐍 Lección 6: Persistencia y Manejo de Archivos

En Python, no solo "abrimos" archivos, sino que gestionamos **flujos de datos** (streams). La forma profesional de hacerlo es con la sentencia `with`.

### 1. El Context Manager (`with open`)

Es la mejor práctica. Se encarga de abrir el archivo y, lo más importante, de **cerrarlo automáticamente** incluso si el programa da un error.

```python
with open("archivo.txt", "modo") as f:
    # Aquí haces cosas con 'f'

```

### 2. Los 3 Modos Maestros

Es vital elegir el modo correcto para no borrar datos por accidente:

* **`'r'` (Read / Leer):** Es el modo por defecto. Abre el archivo para leer. Si no existe, lanza un error.
* **`'w'` (Write / Escribir):** **Peligro.** Crea el archivo si no existe, pero si ya existe, **borra todo su contenido** y empieza desde cero.
* **`'a'` (Append / Añadir):** Abre el archivo y coloca el puntero al final. Lo que escribas se añade a lo que ya había.

### 3. Métodos principales

* `.write("texto")`: Escribe una cadena. Recuerda añadir `\n` para saltos de línea.
* `.read()`: Lee todo el contenido como un solo string.
* `.readlines()`: Lee el archivo y crea una **lista**, donde cada línea es un elemento.
