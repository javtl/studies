# Ejercicio 4: Indicar si un número es par

def es_par(numero) :
    if numero % 2==0:
        return True
    else:
        return False

numero = input("Ingrese un número: ")

print(es_par(numero))