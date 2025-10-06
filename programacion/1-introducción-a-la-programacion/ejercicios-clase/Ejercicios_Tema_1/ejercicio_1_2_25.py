'''
Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato
dd/mm/aaaa y muestra por pantalla, el día, el mes y el año. Adaptar el programa anterior
para que también funcione cuando el día o el mes se introduzcan con un solo carácter.
'''
print("Formato fecha: dd/mm/aaaa")
fecha = input("Ingrese su fecha de nacimiento: ")
fecha_separada = fecha.split('/')
print(f"El dia es:{fecha_separada[0]}, el mes es: {fecha_separada[1]}, el año es: {fecha_separada[2]}")