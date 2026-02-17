texto = "hola mundo hola python mundo hola"
palabras = texto.split() 

contador = {}

for p in palabras:
    if p in contador:
        
        contador[p] += 1
    else:
        
        contador[p] = 1

print(contador)