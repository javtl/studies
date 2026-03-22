'''
Ejercicio ID: 043_lista_modificar.py
    Tema Principal: Listas (Mutabilidad)
    Subtema: Asignación por índice
    Indicación: Demostrar que puedes cambiar el valor de un elemento de la lista sin recrear la lista.
Enunciado:
Crea una lista y cambia uno de sus elementos:
    Crea una lista llamada colores con al menos cuatro colores (ej: "Rojo", "Verde", "Azul", "Amarillo").
    Imprime la lista original.
    Utiliza la indexación para cambiar el valor del tercer elemento de la lista (el color "Azul") por un color diferente (ej: "Violeta").
    Imprime la lista modificada para confirmar el cambio.
'''

colores = ["Rojo", "Verde", "Azul", "Amarillo"]

print(colores)

colores[2] = "violeta"

print(colores)