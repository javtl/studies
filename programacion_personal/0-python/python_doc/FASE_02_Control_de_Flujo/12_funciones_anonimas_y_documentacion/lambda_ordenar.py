# Usar una función lambda dentro de sorted() para ordenar una lista compleja por un criterio específico.
# Tienes una lista de productos, donde cada producto es una tupla: (nombre, precio, stock).

'''
productos = [
    ("Laptop", 1200, 15),
    ("Monitor", 300, 30),
    ("Teclado", 75, 50),
    ("Mouse", 25, 100),
    ("Impresora", 150, 10)
]
'''

productos = [
    ("Laptop", 1200, 15),
    ("Monitor", 300, 30),
    ("Teclado", 75, 50),
    ("Mouse", 25, 100),
    ("Impresora", 150, 10)
]

# La lambda toma un 'item' (una tupla) y devuelve el elemento en el índice [2]
ordenado_por_stock = sorted(productos, key=lambda item: item[2])

print("Lista de productos ordenada por Stock (Ascendente):")
for producto in ordenado_por_stock:
    print(producto)