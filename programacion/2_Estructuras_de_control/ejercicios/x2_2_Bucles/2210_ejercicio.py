# Escribir un programa que pida al usuario un número entero y muestre por pantalla si es 
# un número primo o no

def es_primo():

    try:
        numero = int(input("Ingrese un número entero positivo para verificar si es primo: "))
        
        
        if numero <= 1:
            print(f" El número {numero} NO es primo (es menor o igual a 1).")
            return
        
        
        if numero == 2:
            print(f" El número {numero} es primo.")
            return

        
        for i in range(2, numero):
            
            
            if numero % i == 0:
                print(f" El número {numero} NO es primo. Es divisible por {i}.")
                
                break 
        
        
        else:
            print(f" El número {numero} es primo.")

    except ValueError:
        print(" Error de entrada: Ingrese un número entero válido.")


es_primo()