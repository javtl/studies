'''
Ejercicio ID: 019_anotacion_suspensos.py
    Tema Principal: Fundamentos de Python
    Subtema: Operador Lógico not
    Indicación: Aplicación del operador not para invertir una condición booleana.
Enunciado:
Crea un programa que determine si una nota de un examen es de aprobado o suspenso:
    Pide al usuario que ingrese una nota (un número entre 0 y 10).
    Utiliza una estructura if/else y el operador lógico not para evaluar la condición.
    La condición principal debe ser: si la nota NO es mayor o igual a 5 (not (nota >= 5)).
    Si la condición del if es verdadera (es decir, la nota es menor a 5), imprime: "Suspenso.".
    En el bloque else, imprime: "Aprobado.".
'''

nota = int(input("Ingrese una nota:"))

if nota < 5 :
    print("Suspenso")
else :
    print("aprobado")