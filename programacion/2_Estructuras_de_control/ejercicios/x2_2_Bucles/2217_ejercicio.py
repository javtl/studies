# Leer un número entero positivo desde teclado e imprimir la suma de los dígitos que lo 
# componen. 

def suma_digitos(num):
    
    suma = 0
    
    for digito_char in num:
        
        suma += int(digito_char)
    return suma

def proceso_principal_suma_digitos():
    
    try:
        num = input("Ingrese un número entero positivo: ")
        
        
        if not num.isdigit() or int(num) <= 0:
            return " Error: Por favor, ingrese un número entero estrictamente positivo."
        
        
        resultado = suma_digitos(num)
        
        return f"La suma de los dígitos de {num} es: {resultado}"

    except ValueError:
        
        return " Error de entrada: La entrada no pudo ser procesada como número."
    except Exception as e:
        return f" Ocurrió un error inesperado: {e}"


print(suma_digitos())