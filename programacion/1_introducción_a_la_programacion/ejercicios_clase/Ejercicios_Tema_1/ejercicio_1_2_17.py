'''
Escribir un programa que pregunte el nombre del usuario en la consola y un número
entero e imprima por pantalla en líneas distintas el nombre del usuario tantas veces como
el número introducido
'''

nombre = input("Ingrese su nombre: ")
n = int (input("Ingrese el numero de veces que quiere que se repita: "))

for i in range (0, n) : 
    print(nombre)