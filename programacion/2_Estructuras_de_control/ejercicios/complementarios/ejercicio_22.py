# Realiza un programa que diga si un número introducido por teclado 
# es par y/o divisible entre 5.

def es_par_divisible_cinco():
    """
    Docstring for es_par_divisible_cinco
    Pide un número entero por teclado y determina si es par y/o divisible entre 5.
    Utiliza try/except para manejar entradas no numéricas.
    """

    try:
        # 1. Petición de entrada de datos
        numero_str = input("Introduce un número entero: ")
        
        # Convertimos la entrada a un número entero. Aquí puede saltar ValueError
        numero = int(numero_str)
        
        # 2. Inicializamos las variables booleanas para las condiciones
        es_par = (numero % 2 == 0)      # Evalúa si es par
        es_divisible_5 = (numero % 5 == 0) # Evalúa si es divisible por 5
        
        # 3. Construcción del mensaje de resultado (Condicionales)
        if es_par and es_divisible_5:
            mensaje = f"✅ El número {numero} es par Y divisible entre 5."
        
        
        elif es_par:
            mensaje = f"☑️ El número {numero} es par, pero NO es divisible entre 5."
            
        
        elif es_divisible_5:
            mensaje = f"☑️ El número {numero} es impar, pero SÍ es divisible entre 5."
            
        
        else:
            mensaje = f"El número {numero} no es par y no es divisible entre 5."
            
        
        print(f"{mensaje}")

    # 5. Manejo de Excepciones (Try/Except)
    except ValueError:
        
        print("ERROR Debes introducir un número entero válido.")
    except Exception as e:
        
        print(f"ERROR inesperado: {e}")


es_par_divisible_cinco()