'''
Ejercicio ID: 020_bisiesto_simple.py
    Tema Principal: Fundamentos de Python
    Subtema: Condicional Simple (if/else) y Divisibilidad.
    Indicación: Cierre del bloque de condicionales. Aplicación de la regla de divisibilidad más básica.
Enunciado:
Crea un programa que verifique de manera simple si un año ingresado por el usuario es un año bisiesto.
    Pide al usuario que ingrese un año (número entero).
    Utiliza el operador módulo (%) para verificar si el año es divisible por 4 (es decir, si el resto de la división es 0).
    Utiliza una estructura if/else para:
        Si el año es divisible por 4, imprime: "El año [valor] es bisiesto.".
        En cualquier otro caso (else), imprime: "El año [valor] no es bisiesto.".
(Nota: Para este ejercicio, ignora las reglas más complejas del calendario gregoriano (divisible por 100 pero no por 400). Céntrate únicamente en la regla básica de divisibilidad por 4.)
'''

numero = int(input("Introduzca un año: "))

if numero % 4 == 0 :
    print("El año es bisiesto.")
else:
    print("El año no es Bisiesto.")