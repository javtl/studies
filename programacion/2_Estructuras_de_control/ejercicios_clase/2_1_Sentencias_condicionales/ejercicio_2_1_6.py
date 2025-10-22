# Los alumnos de un curso se han dividido en dos grupos A y B 
# de acuerdo al sexo y el nombre. El grupo A esta formado por 
# las mujeres con un nombre anterior a la M y los hombres con un nombre 
# posterior a la N y el grupo B por el resto. 
# Escribir un programa que pregunte al usuario su nombre y sexo, 
# y muestre por pantalla el grupo que le corresponde.

nombre = input("Ingrese su nombre: ")
sexo = input("Ingrese su sexo: ")

nombre_formateado = nombre.lower()
sexo_formateado = sexo.lower()

if sexo_formateado == "femenino" and nombre_formateado[0] <= "m" :
    print("Grupo A")
elif sexo_formateado =="masculino" and nombre_formateado[0] >= "n" :
    print("grupo A")
else : 
    print("Grupo B")