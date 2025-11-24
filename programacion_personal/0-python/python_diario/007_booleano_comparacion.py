'''
007_booleano_comparacion.py
    Tema Principal: Fundamentos de Python
    Subtema: Tipos de Datos Booleanos y Operadores de Comparación (>=).
    Referencia: Este ejercicio es la base para el futuro if/else (ejercicios 011 en adelante).
    Indicación: Introducción al flujo de control.

    Enunciado:
    Crea un programa para verificar si una persona es mayor de edad:
    Define una variable entera llamada EDAD_LIMITE y asígnale el valor de 18. (Utiliza mayúsculas para indicar que es una constante, siguiendo una buena práctica de estilo).
    Pide al usuario que ingrese su edad actual y guárdala en una variable llamada mi_edad.
    Crea una tercera variable, es_mayor_de_edad, cuyo valor sea el resultado de una comparación booleana entre mi_edad y EDAD_LIMITE.
    Imprime el valor de la variable es_mayor_de_edad.

    Resultado Esperado:

    La salida debe ser estrictamente True o False.

    Ejemplo:
    Si el usuario ingresa 20, el programa debe imprimir: True.
    Si el usuario ingresa 15, el programa debe imprimir: False.

'''

EDAD_LIMITE = 18
mi_edad = int(input("Ingrese su edad: "))
es_mayor_de_edad = mi_edad >= EDAD_LIMITE

print(es_mayor_de_edad)