#Dibuja un ordinograma que lea un valor correspondiente a una distancia en millas marinas y escriba la distancia en metros. 
# Sabiendo que una milla marina equivale a 1.852 metros.

millas = int(input("Ingrese un valor en millas enteras: "))
conversion_metros = millas*1852
print(f"El valor de {millas} en metros es: {conversion_metros}")