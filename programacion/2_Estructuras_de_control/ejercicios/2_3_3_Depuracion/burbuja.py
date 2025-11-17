# Algoritmo de ordenación burbuja

# Algoritmo de ordenación burbuja
def burbuja (numeros):
    
    for i in range(0,len(numeros) - 1):
        for j in range(0,len(numeros) - 1):
            if numeros[j] > numeros[j + 1]:
                # Intercambio de elementos si están en orden incorrecto
                numeros[j], numeros[j + 1] = numeros[j + 1], numeros[j]
    
# PROGRAMA PRINCIPAL

numeros = [34, 12, 5, 66, 1, 89, 23]
print(numeros)
burbuja(numeros)
print(numeros)