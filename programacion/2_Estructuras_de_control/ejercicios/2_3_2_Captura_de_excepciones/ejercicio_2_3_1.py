# Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido 
# (desde 1 hasta su edad)

try :
    edad = int(input("Introduzca su edad: "))
    print(f"Años cumplidos desde 1 hasta {edad}")
    for i in range(1,edad+1) :
        print (i)
except ValueError:
    print("Número no válido, Ingrese un número entero. ")