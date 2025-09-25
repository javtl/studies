'''
Dibuja un ordinograma de un programa que lea una secuencia de números no nulos hasta que
se introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y
cuantos negativos.
'''

parada = 1
positivos = 0
negativos = 0

while parada != 0 :
    valor=int(input("Introduce valor: "))
    parada = valor
    if valor > 0:
        positivos+=1
    else:
        negativos+=1

