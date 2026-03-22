'''
Ejercicio ID: 032_funcion_retorno.py
    Tema Principal: Funciones (Con retorno)
    Subtema: Palabra clave return
    Indicación: La diferencia crucial entre imprimir y devolver un valor.
Enunciado:
Escribe un programa que utilice una función que calcule el doble de un número y devuelva ese resultado.
    Define una función llamada calcular_doble que acepte un parámetro numérico (numero).
    Dentro de la función, calcula el doble del número (numero * 2).
    La función debe retornar este resultado utilizando la palabra clave return.
    Fuera de la función:
        Llama a calcular_doble pasándole un valor (ej: 15).
        Guarda el valor retornado en una nueva variable llamada resultado_final.
        Imprime el contenido de resultado_final para verificar que el valor fue correctamente devuelto y capturado.
'''

def calcular_doble(numero) :
    doble = numero * 2
    return doble

doble_15 = calcular_doble(15)
print(doble_15)
