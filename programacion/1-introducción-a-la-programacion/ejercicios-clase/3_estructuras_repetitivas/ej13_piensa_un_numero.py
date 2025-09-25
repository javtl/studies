'''
Dibuja un ordinograma de un programa donde el usuario "piensa" un número del 1 al 100 y el
ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez
hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor, menor o igual al número
que ha pensado).

'''

def adivinar_numero():
    print("Piensa un número entre 1 y 100, yo intentaré adivinarlo.")
    input("Cuando lo tengas, pulsa ENTER...")

    minimo = 1
    maximo = 100
    intentos = 0

    while True:
        intentos += 1
        propuesta = (minimo + maximo) // 2
        print(f"¿Es {propuesta} tu número?")
        respuesta = input("Responde con 'mayor', 'menor' o 'igual': ").lower()

        if respuesta == "mayor":
            minimo = propuesta + 1
        elif respuesta == "menor":
            maximo = propuesta - 1
        elif respuesta == "igual":
            print(f"¡Genial! He adivinado tu número ({propuesta}) en {intentos} intentos 🎉")
            break
        else:
            print("Respuesta no válida, usa 'mayor', 'menor' o 'igual'.")

adivinar_numero()
