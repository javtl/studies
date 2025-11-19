# Escribir un programa que pida al usuario un número entero positivo y muestre por 
# pantalla todos los números impares desde 1 hasta ese número separados por comas. 

def lista_numeros_separados():
    numero = float(input("Ingrese un número: "))
    for i in range(1,numero):
        if i % 2 == 1 :
            print(i)
        
            