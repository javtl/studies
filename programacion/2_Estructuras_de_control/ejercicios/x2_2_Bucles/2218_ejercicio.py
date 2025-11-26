# Solicitar al usuario que ingrese números enteros positivos y, por cada uno, imprimir la 
# suma de los dígitos que lo componen. La condición de corte es que se ingrese el número 
# -1. Al finalizar, mostrar cuántos de los números ingresados por el usuario fueron 
# números pares. 

def sumar_digitos(numero_str):
    """Calcula la suma de los dígitos de un número dado como cadena."""
    suma = 0
    
    for digito_char in numero_str:
        
        suma += int(digito_char)
    return suma

def sumar_numeros_y_contar_pares():
    
    pares_totales = 0
    num_ingresado = 0 
    
    print("--- SUMA DE DÍGITOS Y CONTEO DE PARES ---")
    print("Ingrese números enteros positivos (-1 para finalizar).")
    
    
    while num_ingresado != -1:
        try:
            num_str = input("Número: ")
            
            num_ingresado = int(num_str) 
            
            
            if num_ingresado == -1:
                break 

            
            if num_ingresado > 0:
                
                
                suma = sumar_digitos(num_str) 
                print(f"  Suma de dígitos de {num_ingresado}: {suma}")
                
                if num_ingresado % 2 == 0:
                    pares_totales += 1
            else:
                print("  ⚠️ Solo se procesan números positivos.")
            
        except ValueError:
            print("❗ Error de entrada: Ingrese solo números enteros.")

    return f"Proceso finalizado. Cantidad total de números pares ingresados (positivos): {pares_totales}"

print(sumar_numeros_y_contar_pares())