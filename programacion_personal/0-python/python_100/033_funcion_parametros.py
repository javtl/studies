'''
Ejercicio ID: 033_funcion_parametros.py
    Tema Principal: Funciones (Múltiples parámetros)
    Subtema: Manejo de dos o más parámetros posicionales
    Indicación: Aplicación práctica de una fórmula matemática que requiere múltiples entradas.
Enunciado:
Crea una función que calcule el área de un triángulo, una operación que requiere dos dimensiones.
    Define una función llamada area_triangulo que acepte dos parámetros posicionales: base y altura.
    Dentro de la funcion, calcula el área usando la fórmula:
    Aˊrea=2base×altura​
    La función debe retornar el valor del área calculada.
    Fuera de la función:
        Llama a area_triangulo con una base de 10 y una altura de 5.
        Guarda el resultado en una variable llamada area_calculada.
        Imprime el resultado final con un mensaje claro: "El área del triángulo es: [valor]".
'''

def area_triangulo(base ,altura):
    area = base * altura

