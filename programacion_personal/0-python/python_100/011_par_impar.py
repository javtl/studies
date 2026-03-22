'''
Ejercicio ID: 011_par_impar.py
    Tema Principal: Fundamentos de Python
    Subtema: Estructura de Control Condicional (if/else) y Operador Módulo (%).
    Indicación: Primer uso de la estructura de decisión.
Enunciado:
Escribe un programa que determine si un número entero ingresado por el usuario es par o impar:
    Pide al usuario que ingrese un número entero.
    Utiliza el operador módulo (%) para verificar si el número es divisible por 2 (es decir, si el resto es 0).
    Utiliza la estructura if para imprimir "Es par" si el número es divisible por 2.
    Utiliza la estructura else para imprimir "Es impar" si no lo es.
'''
numero = int(input("Ingrese un numero: "))

if numero % 2 == 0 :
    print("El número es par")
else :
    print("El número es impar")