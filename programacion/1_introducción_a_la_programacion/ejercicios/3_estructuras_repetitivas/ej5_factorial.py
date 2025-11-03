'''
5. Dibuja un ordinograma de un programa que lea un número positivo N y calcule y visualice su
factorial N! Siendo el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2) * … * 1
'''

numero = int(input("Introduce un numero: "))

resultado = 1

for i in range(1,numero):
     Resultado+=1


print(f"El resultado es: {resultado}")