# Dibuja un ordinograma que dado el precio de un artículo y el precio de venta real nos muestre
#el porcentaje de descuento realizado.

precio_original = float(input("Introduzca el precio original del producto: "))
precio_venta = float(input("Introduzca su precio de venta: "))

descuento = precio_original - precio_venta
porcentaje = (descuento / precio_original) * 100

print(f"El precio del producto original es: {precio_original}")
print(f"El precio del producto en venta  es: {precio_venta}")
print(f"El precio del producto con descuento es: {descuento}")
print(f"El porcentaje de descuento del producto es: {porcentaje}")
