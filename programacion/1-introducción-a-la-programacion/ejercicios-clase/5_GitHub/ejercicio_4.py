'''
Escribe un programa que le pida al usuario una temperatura en grados Celsius, la
convierta a grados Fahrenheit e imprima por pantalla la temperatura convertida.
'''

celsius = float(input("Ingrese la temperatura en grados Celsius (°C): "))
fahrenheit = (celsius * 9/5) + 32
print(f"{celsius}°C equivalen a {fahrenheit}°F")