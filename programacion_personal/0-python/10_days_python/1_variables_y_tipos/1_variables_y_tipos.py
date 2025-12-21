# Crea un script que declare variables para almacenar el nombre de una criptomoneda (string), 
# su precio actual (float), la cantidad que posees (float) y si es una inversión de riesgo (boolean). 
# Calcula el valor total de tu inversión y muestra un resumen formateado.

name = "Crypto"
actual_price = 9.99
quantity = 7
risk = False

total_value = actual_price * quantity

print(f"Crypto Name: {name}, Price: {actual_price}, Quantity: {quantity}, Risk: {risk}, TOTAL: {total_value}")