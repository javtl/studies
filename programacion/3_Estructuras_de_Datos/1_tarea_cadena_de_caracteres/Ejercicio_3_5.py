# Diseña un programa que permita contar vocales en una frase.
contador = 0
vocales = {"a","e","i","o","u"}

cadena = input("Ingrese una frase: ")

cadena_lower = cadena.lower()
for letra in cadena_lower : 
    if letra in vocales:

        contador +=1
print (contador)
