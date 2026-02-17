lista_a = [1, 2, 3, 4, 5]
lista_b = [4, 5, 6, 7, 8]


set_a = set(lista_a)
set_b = set(lista_b)

comunes = set_a & set_b

print(f"Elementos comunes: {list(comunes)}") 
