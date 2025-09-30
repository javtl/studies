'''
Escribe un programa para pedirle al usuario las horas de trabajo y el precio por hora y
calcule el importe total del servicio.
Horas de trabajo: 6
Coste por hora: 10
Importe total: 60
'''

horas_trabajo = float(input("Ingrese sus horas de trabajo: "))
importe = float(input("Ingrese el importe por hora trabajada: "))

importe_servicio = horas_trabajo * importe

print(f"El importe de su servicio es: {importe_servicio}")