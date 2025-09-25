# 9. Dibuja un ordinograma de un programa que calcula y escribe la suma y el producto de los 10
# primeros números naturales.

producto = 1
suma = 0

for contador in range(1,11) :
    suma += contador
    producto *= contador
print(suma)