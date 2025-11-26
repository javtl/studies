#Escribir un programa que solicite el ingreso de una cantidad indeterminada de números 
#mayores que 1, finalizando cuando se reciba un cero. Imprimir la cantidad de números 
#primos ingresados.

def es_primo(numero):
    
    
    if numero <= 1:
        return False
    
    
    for i in range(2, numero):
        if numero % i == 0:
            return False 
            
   
    return True

def contar_primos_ingresados():
   
    contador_primos = 0
    num_ingresado = -1 
    
    
    while num_ingresado != 0:
        try:
            
            num_str = input("Ingrese un número (> 1), o 0 para finalizar: ")
            num_ingresado = int(num_str)
            
            
            if num_ingresado == 0:
                break 
            
            
            if num_ingresado > 1:
               
                if es_primo(num_ingresado):
                    contador_primos += 1
                    print(f"{num_ingresado} es primo. Primos contados: {contador_primos}")
                else:
                    print(f"{num_ingresado} no es primo.")
            else:
                print("El número debe ser mayor que 1 para ser procesado.")

        except ValueError:
            
            print("Error de entrada: Ingrese solo números enteros válidos.")
            
    return f"Proceso finalizado. Cantidad total de números primos ingresados: {contador_primos}"



print(contar_primos_ingresados())