'''
040_docstring_funcion.py
    Tema Principal: Funciones
    Subtema: Documentación (Docstrings)
    Indicación: Cierre del bloque de funciones. Buenas prácticas de documentación esenciales para cualquier código que se comparta o mantenga.
Enunciado:
Define una función y documéntala correctamente utilizando un Docstring.
    Define una función simple llamada restar_numeros que acepte dos parámetros, a y b, y retorne la resta de a−b.
    Inmediatamente después de la línea de definición (def), añade un Docstring multi-línea (usando triple comilla """...""").
    El Docstring debe describir claramente:
        Qué hace la función (ej: "Calcula la diferencia entre dos números.").
        La sección Parameters (Parámetros), describiendo a y b (ej: "a (int/float): El minuendo.").
        La sección Returns (Retorno), indicando qué valor devuelve.
    Llama a la función y, en otra línea, imprime el Docstring de la función usando la propiedad especial __doc__.
'''
def restar_numeros(a,b) :
    '''
        realiza la resta de a y b (a-b)
    '''
    return a-b

print(restar_numeros.__doc__)