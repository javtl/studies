'''
008_concatenacion_frase.py
    Tema Principal: Fundamentos de Python
    Subtema: Strings y Formato (F-Strings).
    Referencia: Este es el camino correcto para hacer lo que quizás harías con el operador + (concatenación simple), 
    pero de forma más legible y eficiente, como se promueve en PEP 8.
    Indicación: Buenas prácticas y eficiencia en strings.
Enunciado:
Crea un programa que construya una frase completa pidiendo los datos al usuario y usando la técnica de f-strings:
    Pide al usuario su ciudad de residencia.
    Pide al usuario el país de residencia.
    Utiliza una única instrucción print() y una f-string para imprimir la siguiente frase exactamente:
    "Vivo en [Ciudad], [País] y me encanta programar en Python."
Requisito clave: Debes usar una f-string (cadena literal formateada) para insertar los valores de tus variables dentro del texto.
'''
ciudad = input("Ingrese su ciudad de residencia: ")
pais = input("Ingrese su pais de residencia: ")

print(f"Vivo en {ciudad}, {pais} y me encanta Programar")