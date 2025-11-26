# Utiliza el método “”” Docstrings””” para documentar el algoritmo de ordenación  
# burbuja. Debe haber una diferencia clara entre los comentarios orientados a otros 
# desarrolladores y la documentación modular.


"""
esta función ordena los numeros de una arreglo de números desordenados
"""
def burbuja(arr):
    n = len(arr)
    # Bucle Principal
    for i in range(n):
        swapped = False
        # Bucle anidado
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True
        if not swapped: break


# Array con números desordenados         
x = [9, 8, 7, 5, 4, 3, 0]

burbuja(x)
print(x)
