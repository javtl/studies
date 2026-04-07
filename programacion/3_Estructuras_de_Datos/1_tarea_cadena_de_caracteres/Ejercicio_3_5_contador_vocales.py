# Diseña un programa que permita contar vocales en una frase.

# 1. Definimos las vocales en un conjunto (set)
# Usar un set es más rápido que una lista para buscar con "in"
vocales = {"a", "e", "i", "o", "u"}
contador = 0

frase = input("Ingrese una frase: ")

# 2. Pasamos a minúsculas para que no ignore las "A" o "E" mayúsculas
frase_min = frase.lower()

# 3. Recorremos la cadena letra a letra
for letra in frase_min:
    if letra in vocales:
        contador += 1

print(f"La frase tiene {contador} vocales.")