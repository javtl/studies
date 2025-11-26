# Escribir un programa que pida al usuario una palabra y luego muestre por pantalla una a 
# una las letras de la palabra introducida empezando por la última. 

def invertir_orden():
    
    try:
        palabra = input("Ingrese una palabra: ")
        
        if not palabra:
            print("❗ Error: Debe ingresar una palabra válida.")
            return

        print("\n--- LECTURA INVERSA ---")
        
        # 1. Obtener la longitud (length) de la palabra.
        longitud = len(palabra)
        
        
        for i in range(longitud - 1, -1, -1):
            
            
            letra = palabra[i]
            
            print(letra)
            
    except Exception:
        print("ERROR")


invertir_orden()