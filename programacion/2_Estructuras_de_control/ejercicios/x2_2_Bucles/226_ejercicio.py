def triangulo_rectangulo():
    
    try:
        
        altura = int(input("Ingrese la altura del triángulo (número entero positivo): "))
        
        if altura <= 0:
            return "Error: La altura debe ser un número entero positivo."
        
    except ValueError:
        return "Error de entrada: Ingrese un número entero válido."

    
    for i in range(1, altura + 1):
        
       
        linea_de_asteriscos = "*" * i
        
     
        print(linea_de_asteriscos)
        
    
print(triangulo_rectangulo())