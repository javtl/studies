# Escribir un programa que pregunte al usuario los números ganadores de la lotería
# primitiva, los almacene en una lista y los muestre por pantalla ordenados de menor a
# mayor.
primitiva = []

i=0
while i<6:
    try:
        numero=int(input("introduce el numero: "))
        if (numero>0) and (numero<50):
            primitiva.append(numero)
            i+=1
        else:
            raise NameError("Fuera de rango!")
    except Exception as e:
        print(e)

primitiva.sort()

if len(primitiva) ==6:
    pintaCombinacion(primitiva)
else:
    print("hubo un error al introducir el número!")
for i in range (0,7):
    numero = int(input("Ingrese un numero: "))
    primitiva.append(numero)


