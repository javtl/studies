# Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números 
# impares desde 1 hasta ese número separados por comas.

numero = int(input("Ingrese un número: "))

for i in range(1, numero+1) :
    if i % 2 == 1 :
        print(i)
    