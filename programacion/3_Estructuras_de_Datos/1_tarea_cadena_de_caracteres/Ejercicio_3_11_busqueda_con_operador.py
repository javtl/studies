# Comprueba que una palabra dada está en una frase

frase = input("Ingrese una frase: ")
palabra = input("Ingrese una palabra a buscar: ")

# PROBLEMA: Si el usuario escribe "Hola" y busca "hola", dirá que NO está.
# SOLUCIÓN: Normalizar a minúsculas para una búsqueda real.

if palabra.lower() in frase.lower():
    print(f"La palabra '{palabra}' SÍ está en la frase.")
else:
    print(f"La palabra '{palabra}' NO está en la frase.")