# Escribir un programa que almacene las asignaturas de un curso (por ejemplo,
# Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la
# nota que ha sacado en cada asignatura, y después las muestre por pantalla con el
# mensaje En <asignatura> has sacado <nota> donde <asignatura> es cada una de
# las asignaturas de la lista y <nota> cada una de las correspondientes notas introducidas
# por el usuario. Usa funciones siempre que se pueda.

asignaturas = ["Matematicas","Fisica","Quimica","Historia","Lengua"]
notas = [len(asignaturas)]

for i in range (0,len(asignaturas)) :
    notas[i] = input(f"Ingrese la nota de {asignaturas[i]}: ")

for i in range (0,len(asignaturas)) :
    print(f"Usted ha sacado {notas[i]}, en la asignatura {asignaturas[i]}")