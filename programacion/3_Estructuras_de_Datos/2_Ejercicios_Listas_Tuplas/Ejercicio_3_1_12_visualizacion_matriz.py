# Escribir un programa que almacene las matrices
# matriz 2x3
# A=
# 1, 2, 3
# 4, 5, 6
# matriz 3x2
# B=
# −1, 0
# 0, 1
# 1, 1


# Una matriz 2x3 (2 filas, 3 columnas)
matriz_a = [
    [1, 2, 3],
    [4, 5, 6]
]

# Una matriz 3x2 (3 filas, 2 columnas)
matriz_b = [
    [-1, 0],
    [0, 1],
    [1, 1]
]

# Función para mostrar matrices "bonitas" (Muy recomendada para examen)
def imprimir_matriz(nombre, matriz):
    print(f"Matriz {nombre}:")
    for fila in matriz:
        print(fila)
    print() # Espacio en blanco

imprimir_matriz("A", matriz_a)
imprimir_matriz("B", matriz_b)