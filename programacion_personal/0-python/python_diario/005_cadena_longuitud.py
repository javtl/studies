'''
    -> Ejercicio ID: 005_cadena_longitud.py
        Tema Principal: Fundamentos de Python
        Subtema: Tipos de Datos String y la Función len().
        Indicación: Concepto nuevo: obtención de longitud.

    -> Enunciado:
        Escribe un programa que mida la longitud de una cadena:
        Pide al usuario su nombre completo (o cualquier frase).
        Calcula e imprime el número total de caracteres que contiene esa cadena, incluyendo espacios.
        Imprime el resultado final con un mensaje claro (ej: "Tu frase tiene X caracteres.").
'''

nombre = input("Ingrese un nombre: ")
print (f"La longuitud de su nombre({nombre}) es: ", len(nombre))    