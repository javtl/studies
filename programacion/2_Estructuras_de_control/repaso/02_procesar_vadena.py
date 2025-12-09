# Diseña una función en Python llamada procesar_cadena que reciba una cadena de texto y realice dos tareas simultáneamente:
# 1. Devuelva la cadena en mayúsculas.
# 2. Devuelva la longitud de la cadena.

cadena = str(input("Ingrese una cadena de texto: "))
def procesar_cadena(cadena) :
    """
    Docstring for procesar_cadena
    La función procesa una cadena de caracteres ingresada por el usuario
    :param cadena: Description
    Return:
    Devuelve ña cadena en Mayusculas y la longuitud de la cadena
    """
    cadena_upper = cadena.upper() # Convierte la cadena en mayusculas con  el método .upper()
    cadena_length = len(cadena) # Duvuelve la longuitud de la cadena  con  el método len()

    return f"La cadena en mayuscula es: {cadena_upper}, la longuitud de la cadena es: {cadena_length}"
