'''
Cálculo Agregado: Crea una lista de números (ej. ). 
Usa un bucle for para iterar sobre esta lista y calcular la suma total de sus elementos. 
(El ejemplo del sitio web de Python muestra cómo un bucle for puede usarse en una lista para calcular un producto, 
lo cual te da una idea de la sintaxis requerida)
'''
lista = [1,2,3,4,5,6,7,8,9,10]
acumulador = 0
for i in range(1, len(lista)) :
    print(lista[i])
    acumulador = acumulador+ lista[i]
