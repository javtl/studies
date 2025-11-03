'''
Escribir un programa que pregunte por consola el precio de un producto en euros con dos
decimales y muestre por pantalla el número de euros y el número de céntimos del precio
introducido.

'''
precio = (input("Introduza el precio del producto: "))
precio_separado = precio.split('.')
print(f"El precio de euros  son {precio_separado[0]} y de decimales son {precio_separado[1]}")