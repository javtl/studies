'''
Una panadería vende barras de pan a 3.49€ cada una. El pan que no es el día tiene un
descuento del 60%. Escribir un programa que comience leyendo el número de barras
vendidas que no son del día. Después el programa debe mostrar el precio habitual de una
barra de pan (establecido en el programa como una constante), el descuento que se le hace
por no ser fresca y el coste final total de todas las barras no frescas
'''

BARRA_PAN = 3.49
barra_con_descuento = BARRA_PAN +(BARRA_PAN*0.6) 

barras_vendidas = int(input("¿Cuantas barras de pan no se han vendido?: "))
print(f"El precio habitual de una barra de pan es: {BARRA_PAN}")
print(f"Se le descuenta: {barra_con_descuento}")
precio_total_barras = barra_con_descuento * barras_vendidas
print(f"El precio Total de las barras con descuento es: {precio_total_barras}")
