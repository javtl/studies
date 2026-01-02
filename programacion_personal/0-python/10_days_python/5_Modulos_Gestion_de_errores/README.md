## 🐍 Lección 5: Módulos y Gestión de Errores (Robustez)

### 1. Módulos: El Superpoder de la Comunidad

Python es famoso por sus librerías. No tienes que programar todo desde cero; puedes importar funciones que otros ya escribieron.

* **`import math`**: Para operaciones matemáticas complejas.
* **`import random`**: Para generar datos aleatorios.
* **`import datetime`**: Para manejar fechas y horas.

### 2. Manejo de Errores (`try...except`)

En Java usas `try-catch`. En Python es casi igual, pero más legible. Sirve para que, si algo falla (como una división por cero o un archivo que no existe), el programa no se detenga bruscamente.

```python
try:
    resultado = 10 / 0
except ZeroDivisionError:
    print("No puedes dividir por cero, genio.")
finally:
    print("Esto se ejecuta siempre, haya error o no.")

````