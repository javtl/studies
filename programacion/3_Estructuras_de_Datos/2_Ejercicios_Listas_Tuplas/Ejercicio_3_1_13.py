# Escribir un programa que pregunte por una muestra de números, separados por comas,
# los guarde en una lista y muestre por pantalla su media y desviación típica

import math


entrada = input("Introduce una muestra de números separados por comas: ")

muestra = [float(i) for i in entrada.split(',')]

n = len(muestra)
media = sum(muestra) / n

suma_cuadrados = 0
for x in muestra:
    suma_cuadrados += (x - media) ** 2

desviacion = math.sqrt(suma_cuadrados / n)

print(f"Resultados para la muestra: {muestra}")
print(f"Media: {media}")
print(f"Desviación típica: {desviacion}")