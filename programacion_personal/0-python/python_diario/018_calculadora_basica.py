'''
Ejercicio ID: 018_calculadora_basica.py
    Tema Principal: Fundamentos de Python
    Subtema: Estructura de Control Condicional (if/elif/else) y lógica de menú.
    Referencia: Este ejercicio consolida el uso de if/elif/else para tomar decisiones basadas en la entrada de un string.
    Indicación: Uso combinado de input(), if/elif/else y operadores aritméticos.
Enunciado:
Crea una calculadora básica que pueda realizar suma, resta, multiplicación y división:
    Pide al usuario que ingrese el primer número (num1).
    Pide al usuario que ingrese el segundo número (num2).
    Pide al usuario que ingrese la operación que desea realizar (+, -, *, o /).
    Utiliza una estructura if/elif/else para evaluar la operación ingresada y realizar el cálculo correspondiente.
    Imprime el resultado de la operación.
    Añade una cláusula else final para manejar el caso en que el usuario ingrese un símbolo de operación no válido, imprimiendo: "Error: Operación no válida."
'''
print("Calculadora Básica de suma, resta, multiplicación y división:")
num1 = int(input("Ingresa un primer número: "))
num2 = int(input("Ingresa un segundo número: "))

op = input("Ingrese la operación a realizar(+, -, *, o /): ")

if op == "+" :
    print(f"la suma de {num1} + {num2} es: {num1+num2}")
elif op == "-" :
    print(f"la resta de {num1} - {num2} es: {num1-num2}")
elif op == "*" :
    print(f"la resta de {num1} * {num2} es: {num1*num2}")
elif op == "/" :
    print(f"la resta de {num1} / {num2} es: {num1/num2}")

else :

    print("La opción no es correcta. ")
