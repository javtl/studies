'''
Escribe un programa que le pida al usuario una temperatura en grados Celsius, la
convierta a grados Fahrenheit e imprima por pantalla la temperatura convertida.
'''

c = int(input("Ingrese Grados Celsius :"))

f = (c * 1.8) + 32

print(f"{c} grados Celsius son: {f} grados Fahrenheit.")