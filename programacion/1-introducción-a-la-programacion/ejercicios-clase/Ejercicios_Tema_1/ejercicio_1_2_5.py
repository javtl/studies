'''
Escribe un programa que pida el importe sin IVA de un artículo y el tipo de IVA a aplicar
y calcule e imprima por pantalla el precio final del artículo.
'''

importe_sin_iva = float(input("Ingrese el importe sin iva del articulo: "))
iva =  float(input("Ingrese el importe de iva a aplicar: "))

importe_con_iva = (importe_sin_iva * iva) + importe_sin_iva

print(f"El precio final del producto es: {importe_con_iva}")