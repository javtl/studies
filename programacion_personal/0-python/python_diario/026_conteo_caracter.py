'''
Ejercicio ID: 026_conteo_caracter.py
    Tema Principal: Bucle for (Contador)
    Subtema: Contador manual en iteración
    Indicación: Aplicación práctica del bucle for para analizar una cadena.
Enunciado:
Escribe un programa que cuente cuántas veces aparece un carácter específico dentro de una frase:
    Pide al usuario que ingrese una frase o texto largo.
    Pide al usuario que ingrese el carácter específico que desea contar.
    Inicializa una variable llamada contador_caracter a cero (0).
    Utiliza un bucle for para recorrer cada carácter de la frase ingresada.
    Dentro del bucle, usa una condición if para verificar si el carácter actual de la frase es igual al carácter buscado.
    Si son iguales, incrementa tu contador_caracter en 1 (usando += 1).
    Al finalizar el bucle, imprime el resultado final en el formato: "El carácter '[carácter buscado]' aparece [contador] veces."
'''

frase = input("Ingrese una frase: ")
caracter = int(input("Ingrese el caracter que desea saber de la frase: "))
contador_caracter = 0

for i in range( 1, len(frase)) :
    
    print(frase[i])
    print(frase[caracter])
