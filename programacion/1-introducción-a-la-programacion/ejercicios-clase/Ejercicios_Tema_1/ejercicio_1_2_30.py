# Escribir un programa que determine si un número es primo

numero = int(input("Introduzca un número: "))

if numero > 1 and numero%numero == 0 :
    print("es primo")
else :
    print("No es primo")
