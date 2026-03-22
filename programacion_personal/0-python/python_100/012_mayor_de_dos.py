'''
Ejercicio ID: 012_mayor_de_dos.py
    Tema Principal: Fundamentos de Python
    Subtema: Estructura de Control Condicional (if/else) y Operadores de Comparación.
    Indicación: Refuerzo de if/else y aplicación directa de operadores.

Enunciado:
Crea un programa que pida al usuario dos números diferentes y determine cuál de ellos es el mayor:
    Pide al usuario que ingrese el primer número entero (numero_a).
    Pide al usuario que ingrese el segundo número entero (numero_b).
    Utiliza una estructura if/else para comparar los dos números:
        Si numero_a es mayor que numero_b, imprime: "El primer número ([valor de A]) es el mayor."
        En caso contrario, imprime: "El segundo número ([valor de B]) es el mayor."
Requisito de Diseño: Asegúrate de que el mensaje de salida muestre claramente el valor del número que fue determinado como el mayor.
'''

numero_a = int(input("Ingrese un primer número: "))
numero_b = int(input("Ingrese un segundo número: "))

if numero_a > numero_b :
    print(f"El numero {numero_a} es mayor que el numero {numero_b}" )
else :
    print(f"El numero {numero_b} es mayor que el numero {numero_a}" )