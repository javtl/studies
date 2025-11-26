# Escribir un programa en el que se pregunte al usuario por una frase y una letra, y 
# muestre por pantalla el número de veces que aparece la letra en la frase. 

def contar_letra_en_frase():
   
    try:
        frase = input("Ingrese una frase: ")
        letra_buscada = input("Ingrese una letra a buscar: ")
        
        
        if not letra_buscada:
            return " Error: Debe ingresar al menos un carácter para buscar."
                
        letra_a_buscar = letra_buscada[0].lower() 
        frase_procesada = frase.lower() 
        contador = 0
        
        for caracter in frase_procesada:
            
            if caracter == letra_a_buscar:
                contador += 1 # Acumulamos el conteo
                
        
        return f"La letra '{letra_buscada[0]}' aparece {contador} veces en la frase."

    except Exception as e:
        return f" Ocurrió un error: {e}"


print(contar_letra_en_frase())