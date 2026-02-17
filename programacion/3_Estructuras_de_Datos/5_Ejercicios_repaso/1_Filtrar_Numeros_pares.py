# 1. Lista: Filtrar números pares
# Dada una lista de números, crea una nueva lista que contenga solo los números pares.
# Pista: es una estructura mutable

numeros = [1, 5, 8, 12, 15, 20, 21]

pares = []

for n in numeros:
    if n % 2 == 0:
        
        pares.append(n)


print(pares)