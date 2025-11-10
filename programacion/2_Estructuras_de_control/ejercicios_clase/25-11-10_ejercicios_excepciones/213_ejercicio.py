# Escribir un programa que pida al usuario dos números y muestre 
# por pantalla su división. Si el divisor es cero el programa 
# debe mostrar un error.

def dividir(a,b):
    if b==0:
        raise ZeroDivisionError("INDETERMINACIÓN")
    else:
        return a/b


try :
    numerador = input("Introduce numerador: ")
    denominador = input("Introduce denominador: ")
    resultado = dividir(numerador,denominador)
except ValueError :
    print ("Valor no valido")
except : 
    print("Cuidado divisón por CERO")
else: 
    print(f"El resultadodo es {resultado}")