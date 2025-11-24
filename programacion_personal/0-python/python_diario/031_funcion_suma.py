'''
Ejercicio ID: 031_funcion_suma.py
    Tema Principal: Funciones (Sin retorno)
    Subtema: Definición (def) y un parámetro
    Indicación: Introducción al concepto de modularidad y el uso de parámetros.
Enunciado:
Escribe un programa que contenga una función simple para saludar:
    Define una función llamada saludar_nombre que acepte un único parámetro llamado nombre.
    Dentro de la función, utiliza una f-string para imprimir el saludo: "Hola, [Nombre], ¡bienvenido al Diario Python!".
    Llama a la función al menos dos veces con diferentes nombres (ej: "Ana", "Carlos") para demostrar que la función es reutilizable.
'''
def saludar_nombre(nombre) :
    print( f"Hola, {nombre}, ¡bienvenido al Diario Python!")

saludar_nombre("Programador")