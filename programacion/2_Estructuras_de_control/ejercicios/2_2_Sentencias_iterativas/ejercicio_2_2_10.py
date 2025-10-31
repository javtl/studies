# Escribir un programa que pida al usuario un número entero 
# y muestre por pantalla si es un número primo o no.

numero = float(input("Ingrese un numero: "))
for n in range(2,numero) :
        if numero % n == 0:
            print(True)
        else:
            print(False)