'''
Escribir un programa que pregunte por consola por los productos de una cesta de la
compra, separados por comas, y muestre por pantalla cada uno de los productos en una
línea distinta.
'''
print("Ejemplo lista: Tomate, Zanahoria, Lechuga, Manzanas")
lista = input("Ingrese una lista de productos separados por una coma ',' ")
lista_separada = lista.split(',')

for i in range (0,len(lista_separada)) : 
    print(f"{lista_separada[i]}")
    