# escribir un programa que pida al usuario un número entero
# y muestre por pantalla si es par o impar

def es_par (num) :
    if num%2==0:
        return True
    else:
        return False
    
try:
    numero = int(input("Introduce un valor: "))
except ValueError:
    print("Valor númerico no válido. ")

