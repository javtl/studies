'''
Ejercicio ID: 017_rango_numerico.py
    Tema Principal: Fundamentos de Python
    Subtema: Condicionales Avanzados: Uso del Operador Lógico and para definir rangos.
    Indicación: Uso de dos operadores de comparación (>= y <=) unidos por and.
Enunciado:
Crea un programa que verifique si un número ingresado por el usuario se encuentra dentro del rango de 10 a 20 (ambos inclusive):
    Pide al usuario que ingrese un número entero.
    Utiliza una única estructura if para establecer la condición, combinando dos comparaciones con el operador lógico and:
        La primera comparación debe verificar si el número es mayor o igual a 10.
        La segunda comparación debe verificar si el número es menor o igual a 20.
    Si ambas condiciones se cumplen, imprime: "Número [valor] dentro del rango 10-20.".
    Utiliza la estructura else para cualquier otro caso, imprimiendo: "Número [valor] fuera del rango 10-20.".
'''

num = int(input("Ingrese un número: "))

if num < 10 and num > 20 : 
    print("El numero no esta en el rango entre 10 y 20")
else : 
    print("El número esta en el rango entre 10 y 20 ambos incluidos")