import os

# Primera versión de una calculadora
def suma(a,b):
    solucion=a+b
    return solucion

def resta(a,b):
    #Devuelve el resultado en positivo
    if a==b:
        return 0
    elif a<b:
        return (b-a)
    else:
        return (a-b)    

def multiplica(a,b):
    resultado=a*b
    return resultado

def divide(a,b):
    if b!=0:
        resultado=a/b
        return resultado
    else:
        return None    

# PROGRAMA PRINCIPAL
valor1=2
valor2=4

def pintaMenu():

    os.system('cls')
    print("1. SUMAR")
    print("2. RESTAR")
    print("3. MULTIPLICAR")
    print("4. DIVIDIR")

    print ("0. SALIR DEL PROGRAMA")

def espera():
    os.system('pause')

#PROGRAMA PRINCIPAL
if __name__=='__main__':
    opcion=1
    while opcion!=0:

        pintaMenu()
        opcion=int(input("Introduce Opción (cero para salir): "))

        match opcion:
            case 1: 
                print("La suma es: ", suma(valor1,valor2))
                espera()
            case 2: 
                print("La resta es: ", resta(valor1,valor2))
                espera()
            case 3: 
                resultado=multiplica(valor1,valor2)
                print("La multiplicación da: ", resultado)
                espera()        
            case 4: 
                resultado=divide(valor1,valor2)
                print("La división da: ", resultado)
                espera()
            case 0: print("Hasta luego.....")
            case _: print ("OPCION NO VÁLIDA.")

    