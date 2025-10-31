# Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual y el número de años, 
# y muestre por pantalla el capital obtenido en la inversión cada año que dura la inversión.
#**Fórmula para calcular el capital tras un año:**
#amount *= 1 + interest / 100
#Donde:
#* `amount`: Cantidad a invertir
#* `interest`: Interés porcentual anual

cantidad = float(input("Ingrese la cantidad a invertir: "))
porcentaje = float(input("Ingrese el porcentaje anual: "))
yr = int(input("Ingrese el número de años: "))

capital = cantidad * 1 + (porcentaje/100)
total = capital*yr
print(f"El capital anual es: {capital}")
print(f"El capital invertido: {cantidad} x {yr}: {total}")