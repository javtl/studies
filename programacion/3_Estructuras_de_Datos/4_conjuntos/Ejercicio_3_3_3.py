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
        if indice == n:
            resultado.append(set(actual))
            return
        
        
        generar_subconjuntos(indice + 1, actual)
        
        
        actual.append(lista_s[indice])
        generar_subconjuntos(indice + 1, actual)
        actual.pop() 

    generar_subconjuntos(0, [])
    return resultado