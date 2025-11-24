'''
004_conversion_celsius.py
    Tema Principal: Fundamentos de Python
    Subtema: Entrada de Datos (input()) y Conversión de Tipos (Casting a float).
    Indicación: Refuerzo de input() y manejo de decimales.

Enunciado:
    Escribe un programa que haga lo siguiente:
    Pida al usuario una temperatura en grados Celsius.
    Convierte esa temperatura a grados Fahrenheit usando la fórmula: F=C×59​+32.
    Imprime el resultado.

    Pista: La función input() devuelve siempre un string. Para hacer la operación matemática con decimales, necesitarás convertir la entrada a un tipo de dato que maneje números de punto flotante.
'''

celsius = int(input("Ingrese una temperatura en celsius: "))
conversion_fahrenheit = (celsius * 59) + 32

print(f"{celsius} grados celsius son: {conversion_fahrenheit} grados fahrenheit. ")