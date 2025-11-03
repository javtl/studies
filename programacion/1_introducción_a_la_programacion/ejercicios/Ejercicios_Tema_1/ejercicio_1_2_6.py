'''
Escribe un programa que pida el importe final de un artículo y calcule e imprima por
pantalla el IVA que se ha pagado y el importe sin IVA (suponiendo que se ha aplicado un
tipo de IVA del 10%)
'''

importe_sin_iva = float(input("Ingrese el importe sin iva del articulo: "))
iva = 0.10

importe_con_iva = (importe_sin_iva * iva) + importe_sin_iva

print(f"El precio final del producto es: {importe_con_iva}")
print(f"IVA aplicado {iva}")