# Escribir un programa que almacene el abecedario en una lista, elimine de la lista las
# letras que ocupen posiciones múltiplos de 3, y muestre por pantalla la lista resultante.

abecedario = [
    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", 
    "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
]

resultado=[]

for i in range(0,len(abecedario)):
    posicion = i + 1

    if posicion % 3 !=0:
        resultado.append(abecedario[i]) 

print(resultado)