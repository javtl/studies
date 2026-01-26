# Escribir un programa que guarde en un diccionario los precios de las frutas de la tabla,
# pregunte al usuario por una fruta, un número de kilos y muestre por pantalla el precio de
# ese número de kilos de fruta. Si la fruta no está en el diccionario debe mostrar un
# mensaje informando de ello

frutas = {
    "Plátano":1.35,
    "Manzana":0.80,
    "Pera":0.85,
    "Naranja":0.70}

fruta = input("Ingrese la fruta que desea comprar: ")
cantidad = int(input("Ingrese la cantidad que desea: "))

if fruta in frutas:
    precio = frutas[fruta.values()] * cantidad
    print(f"El precio de {cantidad} de {fruta} es: {precio}" )
else: 
    print("la fruta que usted a ingresado no esta en la lista de frutas")
