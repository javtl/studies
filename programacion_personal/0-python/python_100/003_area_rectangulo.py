'''
Ejercicio ID: 003_area_rectangulo.py
    Tema Principal: Fundamentos de Python
    Subtema: Entrada de Datos (input())  Conversión de Tipo (int()).
    Indicación: Repaso y avance en interacción con el usuario.

    Enunciado: Escribe un programa que haga lo siguiente:  Pida al usuario el largo de un rectángulo.
        Pida al usuario el ancho de un rectángulo.
        Calcula el área del rectángulo.
        Imprime el resultado final con un mensaje descriptivo.
        Asegúrate de que la entrada del usuario se convierta a un tipo numérico (entero, int) antes de la multiplicación.
'''
largo = int(input("Ingrese el largo del rectangulo: "))
ancho = int(input("Ingrese el ancho del rectangulo: "))
area = largo * ancho 
print(f"El area de rectangulo es {area}")