'''
Ejercicio ID: 034_funcion_default.py
    Tema Principal: Funciones (Parámetros default)
    Subtema: Argumentos opcionales
    Indicación: Cómo hacer que una función sea invocada de forma flexible sin errores si falta un argumento.
Enunciado:
Crea una función de saludo que sea personalizable, permitiendo que el mensaje sea opcional.
    Define una función llamada saludo_personalizado que acepte dos parámetros:
        nombre (obligatorio)
        mensaje (opcional, con un valor por defecto de "Hola").
    La función debe retornar una f-string combinando el mensaje y el nombre: "[Mensaje], [Nombre]!".
    Fuera de la función, realiza dos llamadas diferentes y observa el resultado:
        Llamada 1 (Completa): Llama a la función proporcionando ambos argumentos (ej: saludo_personalizado("María", "Buenos días")).
        Llamada 2 (Default): Llama a la función proporcionando solo el nombre (ej: saludo_personalizado("Pedro")).
    Imprime el valor retornado en ambas llamadas.
'''

def saludo_personalizado(saludo="Hola",nombre="Usuario"):
    return f"{saludo}, {nombre}. Bienvenido."

print(saludo_personalizado(nombre="Juan"))