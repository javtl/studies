# Buscar la primera aparición de una letra

cadena = input("Ingrese una cadena: ")

# .find() busca la subcadena y devuelve el ÍNDICE (posición)
# de la PRIMERA vez que aparece.
indice = cadena.find("a")

print(f"Cadena original: {cadena}")

if indice != -1:
    print(f"La primera 'a' está en la posición: {indice}")
else:
    print("La letra 'a' no se encuentra en la cadena.")