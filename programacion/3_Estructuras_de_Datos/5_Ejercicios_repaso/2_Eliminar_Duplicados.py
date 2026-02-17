def limpiar_lista(lista_original):
    auxiliar = []
    for elemento in lista_original:
        if elemento not in auxiliar:
            auxiliar.append(elemento)
    return auxiliar

mi_lista = [1, 2, 2, 3, 4, 4, 5, 1]
print(limpiar_lista(mi_lista))