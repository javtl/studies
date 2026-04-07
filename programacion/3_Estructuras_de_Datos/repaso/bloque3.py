inventario = [
    {"nombre": "raton", "precio": 20, "stock": 10},
    {"nombre": "teclado", "precio": 50, "stock": 0},
    {"nombre": "monitor", "precio": 150, "stock": 5},
    {"nombre": "altavoces", "precio": 30, "stock": 12}
]

# Crea una lista llamada `disponibles` que contenga solo los **nombres** de los
# productos que tienen `stock` mayor a 0. (Usa **List Comprehension**).

disponibles = [p["nombre"] for p in inventario if p["stock"] > 0]

print("productos disponibles: ", disponibles)

# Calcula el `precio_total` de todos los productos en stock sumando sus precios.
precio_total = 0

for i in range(0,len(inventario)):
	precio_total = precio_total + inventario[i]["precio"]

print(precio_total)

# Imprime el nombre del último producto de la lista original usando
# **índices negativos**.

ultimo_producto = inventario[-1]["nombre"]
print(ultimo_producto)