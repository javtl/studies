#Crea una función `calcular_area(ancho, alto=5)` que use un valor por omisión para la altura. 
# Llama a la función de dos formas: 
# a) omitiendo la altura, 
# b) especificando la altura de 15 utilizando la palabra clave `alto=` (4.9.2).

def calcular_area(ancho, alto=5) :
    area = ancho * alto
    return area

print(calcular_area(5))