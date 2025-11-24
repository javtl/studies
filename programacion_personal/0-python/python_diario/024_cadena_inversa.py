'''
Ejercicio ID: 024_cadena_inversa.py
    Tema Principal: Bucle for (String)
    Subtema: Iteración sobre una cadena y el concepto de reversa.
    Indicación: Uso de slicing para invertir la cadena.
Enunciado:
Escribe un programa que tome una palabra o frase del usuario y la imprima completamente invertida.
    Pide al usuario que ingrese una palabra o frase.
    Utiliza la notación de slicing de Python para invertir la cadena (esta es la forma más "pythónica" de hacerlo).
    Imprime la cadena resultante.
Nota: Aunque este ejercicio se puede resolver con un bucle for que construya la cadena al revés
    el objetivo principal aquí es que recuerdes y apliques la sintaxis de slicing para la reversión, que es la solución más eficiente y común en Python.
'''
# ¡El slicing es tu atajo! Recuerda la forma [inicio:fin:paso] y cómo usar un paso negativo.
cadena = input("Ingrese una palabra o frase")

invertida = cadena[::-1]

print(cadena)
print(invertida)