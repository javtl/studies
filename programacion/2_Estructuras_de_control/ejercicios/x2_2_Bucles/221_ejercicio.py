# Escribir un programa que pida al usuario una palabra y la muestre por pantalla 10 veces. 

def palabrax10() :
    palabra = input("Ingrese la palabra a repetir 10 veces: ")
    for i in range (1,10):
        print(palabra)


palabrax10()
