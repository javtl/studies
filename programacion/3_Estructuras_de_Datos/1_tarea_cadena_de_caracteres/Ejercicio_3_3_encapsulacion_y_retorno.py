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

def cuenta(palabra, letra):
    cont = 0
    # Usamos el bucle for más sencillo (estilo Python pro)
    for l in palabra:
        if l == letra:
            cont += 1
    
    # ¡ESTA ES LA CLAVE! Para que la variable guarde el dato
    return cont 

# LLAMADA CORRECTA
numero_de_os = cuenta("consuelo", "o")
print(f"Resultado: {numero_de_os}") # Ahora sí imprimirá 2