# Solicitar al usuario el ingreso de una frase y de una letra (que puede o no estar en la  
# frase). Recorrer la frase, carácter a carácter, comparando con la letra buscada. Si el 
# carácter no coincide, indicar que no hay coincidencia en esa posición (imprimiendo la 
# posición) y continuar. Si se encuentra una coincidencia, indicar en qué posición se 
# encontró y finalizar la ejecución. 

def buscar_letra_en_frase():
    
    try:
        frase = input("Ingrese una frase: ")
        letra_buscada = input("Ingrese una letra a buscar: ")
        
        
        if not letra_buscada:
            return "Error: Debe ingresar al menos un carácter para buscar."
        
        
        letra_a_buscar = letra_buscada[0] 
        
        print("\n--- INICIANDO BÚSQUEDA ---")
        
        
        for posicion, caracter_actual in enumerate(frase):
            
            if caracter_actual == letra_a_buscar:
                
                print(f"¡Coincidencia! La letra '{letra_a_buscar}' se encontró en la posición: {posicion}")
                
                
                break
            else:
                
                print(f"Posición {posicion}: No hay coincidencia ('{caracter_actual}' != '{letra_a_buscar}')")
        
        
        else: 
            
            print(f"Fin de la frase. La letra '{letra_a_buscar}' no se encontró en ninguna posición.")

    except Exception as e:
        return f"Ocurrió un error: {e}"


buscar_letra_en_frase()