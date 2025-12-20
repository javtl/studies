# Solicita al usuario por consola un precio en formato string (ej. "2500.50"). Intenta convertirlo a entero y a flotante. 
# Si el usuario ingresa texto no numérico, el programa debe informar del error de forma limpia.
try:
    price = input("Ingrese un precio")

    int_price = int(price)
    float_price = float(price)
except ValueError:
    print("Error: El valor ingresado no es un número válido.")
