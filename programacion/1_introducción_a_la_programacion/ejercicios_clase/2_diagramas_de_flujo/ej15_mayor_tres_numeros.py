#15. Dibuja un ordinograma que lea tres números distintos
#  y nos diga cuál es el mayor.
numero1 = int (input("introduce un número: "))
numero2 = int (input("introduce un número: "))
numero3 = int (input("introduce un número: "))

if numero1 > numero2 and numero1 > numero3:
    print(f"el número mayor es {numero1}")

elif numero2 > numero1 and numero2 > numero3:
    print(f"el número mayor es {numero2}")

else:
    print(f"El numero mayor es {numero3}")

        # Para mostrar el numero dentro de la variable 
        # Se debe poner antes del las comillas una f