# Los tramos impositivos para la declaración de la renta en un determinado país son los
# siguientes:
# Renta Tipo impositivo
# Menos de 10000€ 5%
# Entre 10000€ y 20000€ 15%
# Entre 20000€ y 35000€ 20%
# Entre 35000€ y 60000€ 30%
# Más de 60000€ 45%

def tipo_renta(renta):
    """
    Calcula el tipo impositivo que corresponde a una renta anual.
    Lanza una excepción si la renta es negativa.
    """
    if renta < 0:
        
        raise ValueError("La renta anual no puede ser negativa.")
    else:
        
        if renta < 10000:
            resultado = 0.05
        elif renta < 20000:
            
            resultado = 0.15
        elif renta < 35000:
            resultado = 0.20
        elif renta < 60000:
            resultado = 0.30
        else:  
            resultado = 0.45
            
    return resultado


# PROGRAMA PRINCIPAL
try:
    
    renta_bruta = float(input("Ingrese su renta anual en euros (€): "))
    
    
    tipo_impositivo = tipo_renta(renta_bruta)
    
    
    impuesto_a_pagar = renta_bruta * tipo_impositivo
    renta_neta = renta_bruta - impuesto_a_pagar
    
    print("-" * 40)
    print(f"Tipo impositivo correspondiente: {tipo_impositivo * 100:.0f}%")
    print(f"Impuesto total a pagar: {impuesto_a_pagar:,.2f}€")
    print(f"La renta neta (después de impuestos) es: {renta_neta:,.2f}€")
    print("-" * 40)

except ValueError as e:
    print("\n--- ¡Error de Entrada! ---")
    print(f"Mensaje: {e}")
    print("Asegúrese de ingresar un número válido y positivo para la renta anual.")

except Exception as e:
    print(f"\nAlgo salió muy mal y no esperábamos esto: {e}")