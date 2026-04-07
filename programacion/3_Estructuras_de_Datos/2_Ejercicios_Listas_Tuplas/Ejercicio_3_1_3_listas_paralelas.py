# Escribir un programa que almacene las asignaturas de un curso (por ejemplo,
# Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la
# nota que ha sacado en cada asignatura, y después las muestre por pantalla con el
# mensaje En <asignatura> has sacado <nota> donde <asignatura> es cada una de
# las asignaturas de la lista y <nota> cada una de las correspondientes notas introducidas
# por el usuario. Usa funciones siempre que se pueda.

# 1. Definimos las funciones
def pedir_notas(lista_materias):
    lista_vacia = [] # Empezamos con una lista vacía
    for materia in lista_materias:
        nota = input(f"¿Qué nota has sacado en {materia}?: ")
        lista_vacia.append(nota) # Añadimos la nota al final
    return lista_vacia

def mostrar_resultados(materias, notas):
    for i in range(len(materias)):
        print(f"En {materias[i]} has sacado {notas[i]}")

# --- PROGRAMA PRINCIPAL ---
asignaturas = ["Matemáticas", "Física", "Química", "Historia", "Lengua"]

# Llamamos a las funciones
mis_notas = pedir_notas(asignaturas)
mostrar_resultados(asignaturas, mis_notas)