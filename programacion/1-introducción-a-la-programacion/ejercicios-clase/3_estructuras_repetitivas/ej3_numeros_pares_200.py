#Dibuja un ordinograma de un programa que 
# muestre los números pares comprendidos entre el
#1 y el 200. Esta vez utiliza un contador sumando de 1 en 1.

for contador in range (1,200,1):
    if contador % 2 == 0 :
        print(f"{contador}")