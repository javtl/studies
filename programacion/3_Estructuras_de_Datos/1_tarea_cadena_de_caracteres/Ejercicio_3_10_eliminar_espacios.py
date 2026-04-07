# Elimina los espacios de una frase

frase = input("Ingrese una frase con espacios: ")

# Reemplazamos el carácter espacio " " por nada ""
frase_sin_espacios = frase.replace(" ", "")

print(f"Resultado final: '{frase_sin_espacios}'")