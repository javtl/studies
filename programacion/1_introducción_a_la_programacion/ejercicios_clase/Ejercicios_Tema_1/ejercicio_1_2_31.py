# Mostrar todos los divisores de un número

numero = int(input("Ingresa un número: "))

print(f"Los divisores de {numero}, son: ")

for i in range (1, numero + 1) :
    if numero % i == 0 :
        print(i)