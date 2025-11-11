# Diseña una función en Python llamada contar_letras_a(cadena) que reciba una cadena de texto 
# y devuelva cuántas veces aparece la letra 'a' (mayúscula o minúscula).

def contar_letras_a(cadena) :
    cadena = input("Ingrese una cadena de caracteres: ")
    contador = 0
    if "a" in cadena:
        contador= contador+1
    print(f"La cadena {cadena} tiene {contador} 'a' ")
    