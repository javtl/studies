#  Define una variable global contador_global con valor 0. Luego, define una función incrementar_local que 
# defina su propia variable local contador_global con valor 10 e imprima ese valor. 
# Finalmente, llama a la función e imprime el valor de la variable global después de la llamada.

contador_global = 0

def incrementar_local() :
    contador_global = 10
    print(f"En esta función el contador vale: {contador_global}")

print("Funcion incrementar local")
incrementar_local()

print(f"Valor variable contador global: {contador_global}")