#Escribir un programa que pida al usuario un número entero y muestre por pantalla un 
#triángulo rectángulo como el de más abajo.  
# 1 
# 3 1 
# 5 3 1 
# 7 5 3 1 
# 9 7 5 3 1 

def generar_triangulo():
    
    try:
        altura = int(input("Ingrese la altura del triángulo (ej. 5): "))
        
        if altura <= 0:
            return "Error: La altura debe ser un número entero positivo."
            
    except ValueError:
        return "Error de entrada: Ingrese un número entero válido."

    
    
    
    for i in range(1, altura + 1):
        
        
        inicio_secuencia = 2 * i - 1
        
        
        for numero in range(inicio_secuencia, 0, -2):
            
            
            print(numero, end=" ")
            
        print() 
        
    
print(generar_triangulo())