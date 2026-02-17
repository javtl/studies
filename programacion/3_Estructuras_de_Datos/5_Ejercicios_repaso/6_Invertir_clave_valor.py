diccionario = {"rojo": "red", "azul": "blue", "verde": "green"}

invertido = {}


for clave, valor in diccionario.items():
    
    invertido[valor] = clave

print(invertido) 