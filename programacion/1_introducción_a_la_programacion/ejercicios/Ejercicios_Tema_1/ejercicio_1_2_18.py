'''
Escribir un programa que pregunte el nombre completo del usuario en la consola y
después muestre por pantalla el nombre completo del usuario tres veces, una con todas
las letras minúsculas, otra con todas las letras mayúsculas y otra solo con la primera letra
del nombre y de los apellidos en mayúscula. El usuario puede introducir su nombre
combinando mayúsculas y minúsculas como quiera.
'''

nombre = input("Ingrese su nombre: ")
apellido1 = input("Ingrese su primer apellido: ")
apellido2 = input("Ingrese su segundo apellido: ")

for i in range (0,3) :
    print(nombre.upper())
    print(apellido1.upper())
    print(apellido2.upper())

    print(nombre.lower())
    print(apellido1.lower())
    print(apellido2.lower())

    print(nombre.capitalize()) 
    print(apellido1.capitalize())
    print(apellido2.capitalize())