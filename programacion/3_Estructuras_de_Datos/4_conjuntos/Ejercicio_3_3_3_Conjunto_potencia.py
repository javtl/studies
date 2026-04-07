# El conjunto potencia de un conjunto S es el conjunto de todos los subconjuntos de S.
# Por ejemplo, el conjunto potencia de {1,2,3} es:

# {∅,{1},{2},{3},{1,2},{1,3},{2,3},{1,2,3}}

# Escriba la función conjunto_potencia(s) que reciba como parámetro un conjunto 
# cualquiera s y retorne su «lista potencia» (la lista de todos sus subconjuntos):
# >>> conjunto_potencia({6, 1, 4})
# [set(), set([6]), set([1]), set([4]), set([6, 1]), set([6, 4]), 
# set([1, 4]), set([6, 1, 4])]

def conjunto_potencia(s):
    lista_s = list(s)
    n = len(lista_s)
    resultado = []

    def generar_subconjuntos(indice, actual):
        # CASO BASE: Si ya revisamos todos los elementos de la lista
        if indice == n:
            resultado.append(set(actual)) # Guardamos una copia del subconjunto formado
            return
        
        # OPCIÓN 1: El elemento NO se incluye en este subconjunto
        generar_subconjuntos(indice + 1, actual)
        
        # OPCIÓN 2: El elemento SÍ se incluye
        actual.append(lista_s[indice])
        generar_subconjuntos(indice + 1, actual)
        
        # BACKTRACKING: Quitamos el elemento para volver al estado anterior
        actual.append(lista_s[indice])
        actual.pop() 

    generar_subconjuntos(0, [])
    return resultado

# Prueba de fuego
print(conjunto_potencia({6, 1, 4}))