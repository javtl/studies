'''
Escribe un programa que pida el importe final de un artículo y calcule e imprima por
pantalla el IVA que se ha pagado y el importe sin IVA (suponiendo que se ha aplicado un
tipo de IVA del 10%).
'''
tipo_iva = 0.10  

importe_final = float(input("Ingrese el importe final del artículo (con IVA incluido) (€): "))
divisor = 1 + tipo_iva
importe_sin_iva = importe_final / divisor
iva_pagado = importe_final - importe_sin_iva

print("\n--- Desglose del Precio (IVA del 10%) ---")

print(f"Importe FINAL (con IVA): {importe_final:.2f} €")
print(f"Importe SIN IVA:         {importe_sin_iva:.2f} €")
print(f"Cantidad de IVA pagada:  {iva_pagado:.2f} €")