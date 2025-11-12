# Escribe un programa que lea repetidamente números hasta que el usuario introduzca "fin"
# Una vez se haya introducido "fin" muestra por pantalla el total 
# la cantidda de números y la media de esos números
# Dando error si el usuario no introduce un valor numérico

sumador = 0
contador = 0
valor_introducido = ""

while valor_introducido != "fin" or valor_introducido != "FIN":
        
        valor_introducido = input("Ingrese un valor:")

        if valor_introducido == "fin":
           print("Programa Finalizado")
        else:
            try :
             
                float_valor_introducido = float(valor_introducido)
                sumador = sumador + float_valor_introducido
                contador = contador + 1
                print(f"la suma de todos los {contador} valores es: {sumador}")
    
            except ValueError : 
                print("Valor incorrecto")
   