'''
Suponiendo que se han ejecutado las siguientes sentencias de asignación:
ancho = 17
alto = 12.0

Para cada una de las expresiones siguientes, intenta adivinar el valor de la expresión y su
tipo sin ejecutarlas en el intérprete:
1. ancho / 2
2. ancho // 2
3. alto / 3
4. 1 + 2 * 5
'''
ancho = int(input("Ingrese el ancho: "))
alto = int(input("Ingrese el alto: "))

n1 = ancho / 2
n2 = ancho // 2
n3 = alto / 3
n4 = 1 + 2 * 5

print(f"{n1}")
print(f"{n2}")
print(f"{n3}")
print(f"{n4}")
