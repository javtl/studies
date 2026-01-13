# Tienes este código:

#   palabra = 'banana'
#   contador = 0
#   for letra in palabra:
#       if letra == 'a':
#           contador = contador + 1
#   print(contador)

# Encapsúlalo en una función llamada cuenta, y hazla genérica de tal modo que pueda
# aceptar una cadena y una letra como argumentos. De tal forma que pueda hacer la

# siguiente llamada:
# numero_de_os = cuenta("consuelo","o") # Resultado debe ser 2

def cuenta(palabra,letra):
    
    cont = 0
    for i in range (0, len(palabra)):
        if palabra[i] == letra:
            cont += 1

    print(cont)

# EJEMPLO
numero_de_os = cuenta("consuelo","o")