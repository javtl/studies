# Escribir un programa que pida al usuario una palabra y muestre por pantalla el número
# de veces que contiene cada vocal

vocales = ["a", "e", "i", "o", "u"]

palabra = input("Introduce una palabra: ")
palabra = palabra.lower()

for vocal in vocales:
    
    contador = palabra.count(vocal)
    print(f"La vocal '{vocal}' aparece {contador} veces.")