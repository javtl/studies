'''
Escribe un programa que pida el importe sin IVA de un artículo y el tipo de IVA a aplicar
y calcule e imprima por pantalla el precio final del artículo.
'''


importe_sin_iva = float(input("Ingrese el importe del artículo SIN IVA (€): "))
tipo_iva_porcentaje = float(input("Ingrese el tipo de IVA a aplicar (ej: 21, 10, 4): "))

factor_iva = tipo_iva_porcentaje / 100
importe_iva = importe_sin_iva * factor_iva
precio_final = importe_sin_iva + importe_iva

print("\n--- Resultado del Cálculo ---")
print(f"Importe sin IVA: {importe_sin_iva:.2f} €")
print(f"Tipo de IVA:     {tipo_iva_porcentaje:.2f} %")
print(f"Importe de IVA:  {importe_iva:.2f} €")
print(f"Precio FINAL:    {precio_final:.2f} €")