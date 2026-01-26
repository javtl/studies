# Escribir un programa que cree un diccionario simulando una cesta de la compra. El 
# programa debe preguntar el artículo y su precio y añadir el par al diccionario, hasta que 
# el usuario decida terminar. Después se debe mostrar por pantalla la lista de la compra y 
# el coste total, con el siguiente formato

cesta = {}
total = 0

articulo = input("Introduce el nombre del artículo (o deja vacío para terminar): ")

while articulo != "":
    precio = float(input(f"Introduce el precio de '{articulo}': "))
    
    # Guardamos en el diccionario
    cesta[articulo] = precio
    
    # Volvemos a preguntar para la siguiente vuelta
    articulo = input("Introduce el nombre del siguiente artículo (o deja vacío para terminar): ")

# Mostrar resultados
print("\nLista de la compra")
for prod, pvp in cesta.items():
    print(f"{prod}\n{pvp}")
    total += pvp

print(f"\nTotal\n{total}")