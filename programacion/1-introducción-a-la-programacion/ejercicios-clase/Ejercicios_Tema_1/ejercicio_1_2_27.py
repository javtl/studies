'''
Escribir un programa que pregunte el nombre el un producto, su precio y un número de
unidades y muestre por pantalla una cadena con el nombre del producto seguido de su
precio unitario con 6 dígitos enteros y 2 decimales, el número de unidades con tres dígitos
y el coste total con 8 dígitos enteros y 2 decimales.
'''
nombre = input("Ingrese el nombre del producto: ")
precio_unitario = float(input("Ingrese su precio por unidad: "))
numero_unidades = int(input("Ingrese el numero de unidades: "))

coste_total = precio_unitario * numero_unidades
print(f"{nombre}")
print(f"{precio_unitario:09.2f}")
print(f"{numero_unidades:03d}")
print(f"{coste_total:010.2f}")



