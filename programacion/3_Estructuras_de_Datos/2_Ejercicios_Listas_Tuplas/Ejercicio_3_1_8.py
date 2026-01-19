# Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un
# palíndromo.



def es_palindromo():
    palabra = input("Ingrese una palabra: ").strip.lower()

    palabra_invertida = palabra[::-1]

    if palabra == palabra_invertida:
        print("Es palindromo")
    else:
        print("No es palindromo")