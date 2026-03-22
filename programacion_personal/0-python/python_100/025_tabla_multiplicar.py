'''
Ejercicio ID: 025_tabla_multiplicar.py
    Tema Principal: Bucle for (Input)
    Subtema: Combinación de input(), range() y bucle
    Indicación: Creación de un formato de salida estructurado.
Enunciado:
Escribe un programa que pida al usuario un número entero y luego imprima su tabla de multiplicar completa (del 1 al 10) utilizando un bucle for.
    Pide al usuario el número para el cual se calculará la tabla.
    Usa un bucle for y range() para generar los multiplicadores del 1 al 10.
    Dentro del bucle, calcula el producto y utiliza una f-string para imprimir cada línea en el formato exacto:
    [Número] x [Multiplicador] = [Resultado]
Ejemplo de salida para el número 7:
7 x 1 = 7
7 x 2 = 14
...
7 x 10 = 70
'''

numero = int(input("Ingrese un numero: "))

for i in range(1,11) :

    print(f"{i} x {numero} = {i*numero}")
