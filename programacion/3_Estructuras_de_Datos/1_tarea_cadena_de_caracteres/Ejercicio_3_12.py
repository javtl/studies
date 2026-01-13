# Dada una frase, convierte una cadena a mayúsculas, a minúsculas y la primera letra de cada
# palabra a mayúscula

frase = input("Ingrese una frase: ")

frase_upper = frase.upper()
frase_lower = frase.lower()
frase_first_upper = frase.title()

print(frase_upper)
print(frase_lower)
print(frase_first_upper)