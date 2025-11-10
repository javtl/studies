# Ejercicio 7: Contar vocales, en una palabra

def contar_vocales(texto):
    return sum(map(texto.lower().count, "aeiouáéíóú"))