# Escribir un programa que cree un diccionario simulando una cesta de la compra. El 
# programa debe preguntar el artículo y su precio y añadir el par al diccionario, hasta que 
# el usuario decida terminar. Después se debe mostrar por pantalla la lista de la compra y 
# el coste total, con el siguiente formato

cesta = {}
total = 0

# 1. Entrada de datos
articulo = input("Artículo (Enter para finalizar): ").strip().capitalize()

while articulo != "":
    precio = float(input(f"Precio de '{articulo}': "))
    cesta[articulo] = precio
    
    # Volvemos a pedir para la siguiente iteración
    articulo = input("Siguiente artículo (Enter para finalizar): ").strip().capitalize()

# 2. Mostrar resultados con formato de tabla
print("\n" + "="*20)
print(" LISTA DE LA COMPRA ")
print("="*20)

for prod, pvp in cesta.items():
    # Usamos \t (tabulador) para separar columnas
    print(f"{prod}\t{pvp:.2f}€")
    total += pvp

print("-" * 20)
print(f"TOTAL\t{total:.2f}€")
print("="*20)