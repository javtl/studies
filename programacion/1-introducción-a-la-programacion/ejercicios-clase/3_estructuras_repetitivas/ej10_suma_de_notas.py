'''
Dibuja un ordinograma de un programa que lee una secuencia de notas (con valores que van de
0 a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10
'''
hay_diez = False  

nota = int(input("Ingrese una nota (o -1 para terminar): "))

while nota != -1: 
    if nota == 10:   
        hay_diez = True
    nota = int(input("Ingrese una nota (o -1 para terminar): "))


if hay_diez:
    print("Hubo al menos una nota con valor 10.")
else:
    print("No hubo ninguna nota con valor 10.")
