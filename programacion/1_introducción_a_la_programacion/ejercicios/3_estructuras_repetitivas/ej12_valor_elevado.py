'''
12. Dibuja un ordinograma de un programa que calcule el valor A elevado a B (A^B) sin hacer uso
del operador de potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el
resultado por pantalla.

'''

valor_a = int(input("Introduzca un valor para A: "))
valor_b = int(input("Introduzca un valor para B: "))

resultado = valor_a ** valor_b

print(f"El resultado de elevar {valor_a} a {valor_b} es: {resultado}")