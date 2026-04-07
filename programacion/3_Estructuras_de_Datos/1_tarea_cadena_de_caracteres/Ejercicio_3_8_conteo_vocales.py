# Contar cuántas veces aparece una letra.

vocales = {"a", "e", "i", "o", "u"}
contador = 0
cadena = input("Ingrese una cadena: ")

# Convertimos a minúsculas para no saltarnos ninguna vocal
cadena_min = cadena.lower()

# Forma Pro: Recorrer el objeto directamente
for letra in cadena_min:
    if letra in vocales:
        contador += 1

print(f"Total de vocales: {contador}")