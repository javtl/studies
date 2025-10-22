# Escribir un programa para una empresa que tiene **salas de juegos** para todas las edades y quiere calcular 
# automáticamente el **precio de entrada**. El programa debe preguntar al usuario la edad del cliente y mostrar el precio:
# - Menor de 4 años → **Gratis**
# - Entre 4 y 18 años → **5 €**
# - Mayor de 18 años → **10 €**

edad = int(input("Ingrese su edad: "))

if edad <= 4 :
    print("La entrada es gratuita")
elif edad > 5 and edad < 18 :
    print("La entrada son 5€")
else :
    print("La entrada son 10€")
