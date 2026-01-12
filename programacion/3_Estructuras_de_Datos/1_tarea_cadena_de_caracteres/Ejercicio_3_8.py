# Contar cuántas veces aparece una letra.
vocales = {"a","e","i","o","u"}
contador = 0
cadena = input("Ingrese una cadena: ")

for i in range(0, len(cadena)):
    if cadena[i] in vocales:
        contador += 1
print(contador)