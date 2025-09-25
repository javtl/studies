# Dibuja un ordinograma de un programa que suma independientemente los pares y los impares
#   de los números comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
contador = 99
suma_par = 0
suma_impar = 0

for contador in range (100,201) :
    if contador % 2 == 0 :
        suma_par = suma_par + contador
    else:
        suma_impar = suma_impar + contador 

   
print(f"La Suma de los Numeros pares entre 100 y 200 es: {suma_par}")
print(f"La Suma de los Numeros impares entre 100 y 200 es: {suma_impar}")