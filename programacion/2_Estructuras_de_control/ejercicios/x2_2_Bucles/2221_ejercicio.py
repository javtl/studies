#Crear un programa que permita al usuario ingresar los montos de las compras de un 
#cliente (se desconoce la cantidad de datos que cargará, la cual puede cambiar en cada 
#ejecución), cortando el ingreso de datos cuando el usuario ingrese el monto 0. Si ingresa 
#un monto negativo, no se debe procesar y se debe pedir que ingrese un nuevo monto. Al 
#finalizar, informar el total a pagar teniendo que cuenta que, si las ventas superan el total 
#de $1000, se le debe aplicar un 10% de descuento. 

def calcular_total_compras_con_descuento():
    
    total_acumulado = 0.0
    monto_ingresado = -1.0 
    
    print("--- CALCULADORA DE COMPRAS ---")
    print("Ingrese el monto de cada compra (0 para finalizar el proceso).")
    
    
    while monto_ingresado != 0:
        try:
            
            monto_ingresado = float(input("Monto de la compra: $"))
            
            
            if monto_ingresado < 0:
                print("Monto negativo no procesado. Ingrese un nuevo monto.")
                continue 

            
            if monto_ingresado > 0:
                total_acumulado += monto_ingresado # Acumulamos el monto al total

            
            
        except ValueError:
            
            print("Error de entrada: Ingrese un valor numérico válido.")

    
    
    if total_acumulado > 1000:
       
        descuento = total_acumulado * 0.10
        total_final = total_acumulado - descuento
        
        return (f"Total sin descuento: ${total_acumulado:.2f}\n"
                f"Aplicado 10% de descuento (${descuento:.2f}).\n"
                f"Total a pagar: ${total_final:.2f}")
    else:
        
        return f"Total a pagar: ${total_acumulado:.2f} (No aplica descuento.)"


print(calcular_total_compras_con_descuento())