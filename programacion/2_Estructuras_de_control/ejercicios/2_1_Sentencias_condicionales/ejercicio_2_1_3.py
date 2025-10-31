# Escribir un programa que pida al usuario dos números y muestre 
# por pantalla su división. Si el divisor es cero el programa debe mostrar un error.

print("Ingrese un dos números para realizar la división (dividendo/divisor) --> ")
num1 = int(input("Ingrese un dividendo para la division: "))
num2 = int(input("Ingrese un divisor para la división:"))

if num1 == 0 or num2 == 0 :
    num1 = int(input("Ingrese un dividendo para la division: "))
    num2 = int(input("Ingrese un divisor para la división:"))
else :
    division = num1 / num2

print(f"La divisón de {num1} / {num2} = {division}")