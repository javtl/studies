# Reemplazar palabras enteras dentro de una cadena

cadena = input("Ingrese una frase: ")

# El método .replace(antiguo, nuevo) busca TODAS las apariciones
# y devuelve una CADENA NUEVA.
cadena_modificada = cadena.replace("Hola", "Python")

print(f"Original: {cadena}")
print(f"Modificada: {cadena_modificada}")