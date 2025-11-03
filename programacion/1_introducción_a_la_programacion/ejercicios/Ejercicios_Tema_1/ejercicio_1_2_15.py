'''
Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés
al año. Estos ahorros debido a intereses, que no se cobran hasta finales de año, se te añaden
al balance final de tu cuenta de ahorros. Escribir un programa que comience leyendo la
cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario. Después
el programa debe calcular y mostrar por pantalla la cantidad de ahorros tras el primer,
segundo y tercer años. Redondear cada cantidad a dos decimales.
Calcula el interés: capital * (1 + interes)
'''
cantidad_ahorrada = float(input("Ingrese la cantidad ahorrada: "))

y1 = cantidad_ahorrada * (1+(cantidad_ahorrada*0.4))
y2 = cantidad_ahorrada * (2+(cantidad_ahorrada*0.4))
y3 = cantidad_ahorrada * (3+(cantidad_ahorrada*0.4))

print(f"La cantidad ahorrada en el primer año es: {y1}")
print(f"La cantidad ahorrada en el segundo año es: {y2}")
print(f"La cantidad ahorrada en el tercer año es: {y3}")

