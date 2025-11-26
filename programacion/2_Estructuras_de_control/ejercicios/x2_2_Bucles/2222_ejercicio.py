
#### Ejercicio 2.2.22  
# Crear un programa que solicite el ingreso de números enteros positivos, hasta que el 
# usuario ingrese el 0. Por cada número, informar cuántos dígitos pares y cuántos impares 
# tiene. Al finalizar, informar la cantidad de dígitos pares y de dígitos impares leídos en 
# total. 

def contar_digitos_par_impar(numero_str):
    
    pares = 0
    impares = 0
    
    
    for digito_char in numero_str:
        
        digito = int(digito_char) 
        
        
        if digito % 2 == 0:
            pares += 1
        else:
            impares += 1
            
    
    return pares, impares

def procesar_conteo_total():
   
    total_pares_acumulado = 0
    total_impares_acumulado = 0
    num_ingresado = -1 
    
 
    print("Ingrese números enteros positivos (0 para finalizar).")
    
    
    while num_ingresado != 0:
        try:
            
            num_str = input("Número: ")
            num_ingresado = int(num_str) 

            if num_ingresado == 0:
                break 
                
            if num_ingresado > 0:
                
                pares_num, impares_num = contar_digitos_par_impar(num_str)
                
                
                print(f"  Resultado: {pares_num} dígitos pares, {impares_num} dígitos impares.")
                
                
                total_pares_acumulado += pares_num
                total_impares_acumulado += impares_num
            else:
                print("Solo se procesan números enteros POSITIVOS.")

        except ValueError:
            
            print("Error de entrada: Ingrese solo números enteros.")

    
    print("\n--- RESUMEN FINAL ---")
    print(f"Total de dígitos pares leídos: {total_pares_acumulado}")
    print(f"Total de dígitos impares leídos: {total_impares_acumulado}")


procesar_conteo_total()