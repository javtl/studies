
def tablas_de_multiplicar():
    
    
    
    for factor1 in range(1, 11):
        
        print(f"\nTabla del {factor1}:")
        print("--------------------")
        
        
        for factor2 in range(1, 11):
            
            resultado = factor1 * factor2
            
            print(f"{factor1} x {factor2} = {resultado}")
            


print(tablas_de_multiplicar())