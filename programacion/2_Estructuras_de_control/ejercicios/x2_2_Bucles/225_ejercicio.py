# Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual y 
# el número de años, y muestre por pantalla el capital obtenido 
# en la inversión cada año  que dura la inversión. 


def capital_anual():

    try:
        
        capital_inicial = float(input("Ingrese la cantidad a invertir ($): "))
        interes_anual = float(input("Ingrese el interés porcentual anual (%): "))
        num_años = int(input("Ingrese el número de años de la inversión: "))
        
        
        if capital_inicial <= 0 or interes_anual < 0 or num_años <= 0:
            return "Error: Todos los valores (Capital, Interés, Años) deben ser positivos."

    except ValueError:
        return "Error de entrada: Asegúrese de ingresar solo números (enteros o decimales)."
    
    
    capital_actual = capital_inicial
    
    
    for año in range(1, num_años + 1):
        
        
        capital_actual *= (1 + interes_anual / 100)
        
        
        print(f"Año {año}: Capital obtenido: ${capital_actual:.2f}")

    return "Cálculo de inversión finalizado."


capital_anual()
