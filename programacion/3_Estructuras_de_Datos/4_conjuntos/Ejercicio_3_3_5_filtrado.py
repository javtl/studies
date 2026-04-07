'''
Ejercicio 3.3.5
Dado el conjunto de números enteros:
numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
1. Crea un conjunto pares que contenga los números pares del conjunto numeros.
2. Crea un conjunto multiplos_de_tres que contenga los números que son 
múltiplos de tres del conjunto numeros.
3. Encuentra la intersección entre los conjuntos pares y multiplos_de_tres y 
guárdala en un conjunto llamado pares_y_multiplos_de_tres.
4. Indica si el conjunto números es un superconjunto de pares.
'''

numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

# 1. Conjunto de pares
# Usamos una "Set Comprehension" para filtrar
pares = {n for n in numeros if n % 2 == 0}

# 2. Conjunto de múltiplos de tres
multiplos_de_tres = {n for n in numeros if n % 3 == 0}

# 3. Intersección (Números que son pares Y múltiplos de 3, es decir, múltiplos de 6)
pares_y_multiplos_de_tres = pares.intersection(multiplos_de_tres)

# 4. Comprobar si 'numeros' es superconjunto de 'pares'
es_superconjunto = numeros.issuperset(pares)

# --- RESULTADOS ---
print(f"Pares: {pares}")
print(f"Múltiplos de 3: {multiplos_de_tres}")
print(f"Intersección: {pares_y_multiplos_de_tres}")
print(f"¿Es 'numeros' un superconjunto de 'pares'?: {es_superconjunto}")
