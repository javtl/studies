# Escribe un bucle while que comience con el último carácter en la cadena y haga un
# recorrido hacia atrás hasta el primer carácter en la cadena, imprimiendo cada letra en
# una línea independiente.

cadena = input("Ingrese una cadena de caracteres: ")


while i <= len(cadena):
    print(cadena[-i])
    i+=1