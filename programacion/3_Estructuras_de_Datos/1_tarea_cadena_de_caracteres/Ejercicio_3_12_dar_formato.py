# Dada una frase, convierte una cadena a mayúsculas, a minúsculas y la primera letra de cada
# palabra a mayúscula

frase = input("Ingrese una frase: ")

frase_upper = frase.upper()         # TODO MAYÚSCULAS
frase_lower = frase.lower()         # todo minúsculas
frase_first_upper = frase.title()   # Primera Letra De Cada Palabra

print(frase_upper)
print(frase_lower)
print(frase_first_upper)