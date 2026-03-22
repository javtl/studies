'''
Ejercicio ID: 029_continue_pares.py
    Tema Principal: Bucle for y continue
    Subtema: Saltar una iteración específica
    Indicación: Uso de continue junto con el módulo para filtrar la salida.
Enunciado:
Escribe un programa que recorra los números del 1 al 10 (ambos incluidos) y solo imprima los números impares.
    Usa un bucle for con range(1, 11) para iterar sobre todos los números.
    Dentro del bucle, usa una condición if y el operador módulo (%) para verificar si el número actual es PAR (numero % 2 == 0).
    Si el número es PAR, usa la palabra clave continue para saltar inmediatamente al siguiente número del bucle, sin ejecutar el print.
    Si el número NO es par (es decir, es impar), imprime el número.
'''
for i in range(1,11) :
    if i % 2 == 1 :
        continue
    else:
        print(i)