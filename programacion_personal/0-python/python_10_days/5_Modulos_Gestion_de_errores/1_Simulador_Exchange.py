# **Tu misión:** Crear un script que simule la compra de una criptomoneda con validaciones reales.

# 1. **Módulos:** Importa la librería `random`.
# 2. **Función de Precio:** Crea una función `obtener_precio_actual()` que devuelva un número aleatorio entre 30000 y 60000 usando `random.randint(30000, 60000)`.
# 3. **Lógica Principal:**
# * Pide al usuario por consola (`input`) cuánto dinero (USD) quiere invertir.
# * Usa un bloque **`try...except`** para convertir ese input a `float`. Si el usuario escribe letras en lugar de números, muestra un error amigable y detén el proceso.
# 
# 4. **Cálculo:**
# * Llama a tu función para obtener el precio actual.
# * Calcula cuántos BTC puede comprar el usuario (**Cantidad = Inversión / Precio**).
# 
# 5. **Resultado Final:**
# * Muestra un "Ticket de Compra" usando **f-strings**.
# * Debe incluir: Precio de la moneda, inversión realizada y cantidad adquirida (formateada a 8 decimales).
import random

def obtener_precio_actual():
    num_random = random.randint(30000, 60000)

    return num_random

try:

    inversion = input("¿Cuanto Dinero desea invertir ?: ")
    float_inversion = float(inversion)

    precio_actual = obtener_precio_actual()

    cantidad = float_inversion / precio_actual

    print("-> Ticket de Compra: ")
    print("------------------------------------------")
    print(f"Precio de la moneda: {precio_actual}")
    print(f"Inversión realizada: {inversion}")
    print(f"Cantidad Adquirida: {cantidad}")
    print("------------------------------------------")


except ValueError:
    print("Debe introducir un valor numérico")

