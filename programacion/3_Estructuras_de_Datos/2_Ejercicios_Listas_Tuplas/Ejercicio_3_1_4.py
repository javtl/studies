# Escribir un programa que pregunte al usuario los números ganadores de la lotería
# primitiva, los almacene en una lista y los muestre por pantalla ordenados de menor a
# mayor.
primitiva = []

for i in range (0,7):
    numero = int(input("Ingrese un numero: "))
    primitiva.append(numero)

c = primitiva[-2] # complementario
r = primitiva[-1] # reintegro

primitiva_ordenada = sorted(primitiva)
print(primitiva_ordenada)


