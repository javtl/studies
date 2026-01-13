# Comprueba que una palabra dada está en una frase

frase = input("Ingrese una frase: ")

palabra = input("Ingrese una palabra: ")

if palabra in frase :
    print(f"la palabra {palabra}, esta en la frase")
else:
    print(f"la palabra {palabra}, NO esta en la frase")