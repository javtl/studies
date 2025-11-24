'''
Ejercicio ID: 015_dia_laboral_finsemana.py
    Tema Principal: Fundamentos de Python
    Subtema: Operadores Lógicos (or).
    Indicación: Uso del operador or para crear un conjunto de condiciones equivalentes.
Enunciado:
Crea un programa que determine si un día ingresado por el usuario es un día laboral o parte del fin de semana:
    Pide al usuario que ingrese el nombre de un día de la semana (ej: "Lunes", "Sábado").
    Utiliza la estructura if/else y el operador lógico or para verificar si el día ingresado es "Sábado" o "Domingo".
    Si la condición usando or es verdadera, imprime: "Es fin de semana, ¡a descansar!".
    En cualquier otro caso (else), imprime: "Es día laboral, ¡a programar!".
Requisito de Diseño: Para evitar problemas de mayúsculas/minúsculas, convierte la entrada del usuario a minúsculas (.lower()) o a mayúsculas (.upper()) antes de realizar la comparación. Esto hace que tu código sea más robusto.
'''
print("Ingrese un día de la Semana ejemplo: Lunes, Sábado ...")

dia = input("Ingrese un dia:")
dia = dia.lower()

if dia == "sabado" or dia == "domingo" :
    print("Es fin de semana, ¡a descansar!")
else :
    print("Es día laboral, ¡a programar!")