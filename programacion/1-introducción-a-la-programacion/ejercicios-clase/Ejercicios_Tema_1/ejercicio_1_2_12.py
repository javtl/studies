'''
Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule
el índice de masa corporal y lo almacene en una variable, y muestre por pantalla la frase
Tu índice de masa corporal es donde es el índice de masa corporal calculado redondeado
con dos decimales.
'''
altura = float(input("Ingrese su altura formato (0.00) : "))
peso = float(input("Ingrese su peso formato(00.00): "))

imc = peso / (altura * altura)

print(f"Su imc es: {imc}")