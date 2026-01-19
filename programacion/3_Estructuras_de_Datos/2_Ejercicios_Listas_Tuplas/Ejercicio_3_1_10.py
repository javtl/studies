# Escribir un programa que almacene en una lista los siguientes precios: 50, 75, 46,
# 22, 80, 65, 8 y muestre por pantalla el menor y el mayor de los precios.

precios = [50, 75, 46, 22, 80, 65, 8]

precios_ordenados = sorted(precios)

primero = precios_ordenados[0]
ultimo = precios_ordenados[-1]
print(f"de la lista precios: {precios} , el mayor es: {primero} y el ultimo es: {ultimo}")