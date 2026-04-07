'''
Ejercicio 3.3.4
Dadas las siguientes listas:
frutas1 = ["manzana", "pera", "naranja", "plátano", "uva"]
frutas2 = ["manzana", "pera", "durazno", "sandía", "uva"]
1. Crea conjuntos a partir de estas listas y nómbralos set_frutas1 y 
set_frutas2.
2. Encuentra las frutas que están en ambas listas y guárdalas en un nuevo conjunto 
llamado frutas_comunes.
3. Encuentra las frutas que están en frutas1 pero no en frutas2 y guárdalas en un 
conjunto llamado frutas_solo_en_frutas1.
4. Encuentra las frutas que están en frutas2 pero no en frutas1 y guárdalas en un 
conjunto llamado frutas_solo_en_frutas2.
5. Encuentra las frutas que están en frutas 1 pero no en frutas 2 y los que están en 
frutas 2 pero no están en frutas 1. Guárdalas en un conjunto llamado frutas_raras
'''
frutas1 = ["manzana", "pera", "naranja", "plátano", "uva"]
frutas2 = ["manzana", "pera", "durazno", "sandía", "uva"]

# 1. Crear conjuntos
set_frutas1 = set(frutas1)
set_frutas2 = set(frutas2)

# 2. Frutas en ambas listas (Intersección)
frutas_comunes = set_frutas1.intersection(set_frutas2)

# 3. Frutas solo en frutas1 (Diferencia A - B)
frutas_solo_en_frutas1 = set_frutas1.difference(set_frutas2)

# 4. Frutas solo en frutas2 (Diferencia B - A)
frutas_solo_en_frutas2 = set_frutas2.difference(set_frutas1)

# 5. Frutas que NO están en ambos a la vez (Diferencia Simétrica)
# Es decir: (Solo en 1) + (Solo en 2)
frutas_raras = set_frutas1.symmetric_difference(set_frutas2)

# --- MOSTRAR RESULTADOS ---
print(f"Comunes: {frutas_comunes}")
print(f"Solo en 1: {frutas_solo_en_frutas1}")
print(f"Solo en 2: {frutas_solo_en_frutas2}")
print(f"Raras (Diferencia simétrica): {frutas_raras}")