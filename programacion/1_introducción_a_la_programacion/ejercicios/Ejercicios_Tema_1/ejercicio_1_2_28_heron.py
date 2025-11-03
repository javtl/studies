# Calcular el área de un triángulo a partir de tres lados
    # con los tres lados solo puedo calcular el perimetro necesitaria la base y la altura para calcular el área


a = int(input("Introduce un lado: "))
b = int(input("Introduce un lado: "))
c = int(input("Introduce un lado: "))

p = (a+b+c) / 2

area = (p*((p-a)*(p-b)*(p-c)))**0.5

print(f"El area del triangulo es: {area}")
