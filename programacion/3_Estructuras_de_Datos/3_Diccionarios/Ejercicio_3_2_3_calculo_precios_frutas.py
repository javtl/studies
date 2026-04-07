# Escribir un programa que guarde en un diccionario los precios de las frutas de la tabla,
# pregunte al usuario por una fruta, un número de kilos y muestre por pantalla el precio de
# ese número de kilos de fruta. Si la fruta no está en el diccionario debe mostrar un
# mensaje informando de ello

frutas = {
    "Plátano": 1.35,
    "Manzana": 0.80,
    "Pera": 0.85,
    "Naranja": 0.70
}

# 1. Pedimos los datos y normalizamos la fruta con .title() 
# (Convierte "pera" en "Pera" para que coincida con la llave)
fruta = input("¿Qué fruta desea comprar?: ").strip().title()
kilos = float(input("¿Cuántos kilos desea?: "))

# 2. Comprobamos si la fruta existe
if fruta in frutas:
    # ACCESO CORRECTO: nombre_diccionario[llave]
    precio_unitario = frutas[fruta]
    total = precio_unitario * kilos
    print(f"El precio de {kilos}kg de {fruta} es: {total:.2f}€")
else:
    print(f"Lo sentimos, la fruta '{fruta}' no está disponible.")