'''
010_potencia_cuadrado.py
    Tema Principal: Fundamentos de Python
    Subtema: Operador de Potencia (**).
    Referencia: Cómo elevar un número a una potencia, de forma simple y directa.
    Indicación: Uso de input() y operador **.
Enunciado:
Crea un programa simple que calcule el cuadrado de un número:
    Pide al usuario que ingrese un número entero (la base).
    Utiliza el operador de potencia (**) para calcular el cuadrado (elevar el número a la potencia de 2).
    Imprime el resultado con un mensaje claro.
Ejemplo de Salida Esperada:
Si el usuario ingresa 9, la salida debería ser:
El cuadrado de 9 es: 81
'''
numero = int(input("Ingrese un número entero: "))
cuadrado_numero = numero**2

print(f"El cuadrado del numero {numero} es: {cuadrado_numero}")