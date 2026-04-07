# Mostrar la posición que ocupa cada letra dentro de la cadena

cadena = input("Ingrese una cadena: ")

# Usamos range(len) porque el enunciado pide la POSICIÓN (el número i)
for i in range(0, len(cadena)):
    print(f"Posición {i}: {cadena[i]}")