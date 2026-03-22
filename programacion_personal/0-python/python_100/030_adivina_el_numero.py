'''
Ejercicio ID: 030_adivina_numero.py
    Tema Principal: Bucle while (Juego)
    Subtema: Integración total de control de flujo (while, if/elif/else, break)
    Indicación: Creación de un juego interactivo basado en un número secreto.
Enunciado:
Crea un programa de adivinanza simple:
    Define una variable secreta llamada NUMERO_SECRETO (elige un número entero, por ejemplo, 7).
    Usa un bucle while True para permitir intentos ilimitados.
    Dentro del bucle:
        Pide al usuario que ingrese su intento como número entero.
        Condición 1 (Victoria): Si el intento es igual al NUMERO_SECRETO, imprime un mensaje de éxito: "¡Felicidades! Has adivinado el número." y usa break para terminar el bucle.
        Condición 2 (Pista Mayor): Si el intento es mayor que el número secreto, imprime: "Demasiado alto. Intenta un número menor.".
        Condición 3 (Pista Menor): Si el intento es menor que el número secreto, imprime: "Demasiado bajo. Intenta un número mayor.".
'''

NUMERO_SECRETO = 7
numero = 0

while numero != NUMERO_SECRETO :
    numero = int(input("Adivina el número, ingrese un número:"))
    if numero == NUMERO_SECRETO :
        print("VICTORIA!")
    elif numero > NUMERO_SECRETO :
        print("El numero secreto es mayor que el número ingresado")
    else :
        print("El numero secreto es menor que el número ingresado")
