# Escribir un programa que pida al usuario una palabra y muestre por pantalla el número
# de veces que contiene cada vocal

vocales = ["a", "e", "i", "o", "u"]
palabra = input("Introduce una palabra: ").lower()

# Recorremos la lista de vocales fija
for vocal in vocales:
    contador = palabra.count(vocal)
    
    # OPCIONAL: Solo mostrar si aparece al menos una vez
    if contador > 0:
        print(f"La vocal '{vocal}' aparece {contador} veces.")
    else:
        print(f"La vocal '{vocal}' no está presente.")