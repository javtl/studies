# Calcular la serie de Fibonacci hasta un número dado

num = int(input("Ingresa un número: "))

a = 0
b = 1

print(f"Serie de Fibonacci hasta: {num} :")

while a <= num :
    print(a)
    c = a+b
    a = b
    b = c

