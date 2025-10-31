# Escribir un programa que almacene la cadena de caracteres contraseña 
# en una variable, pregunte al usuario por la contraseña e imprima 
# por pantalla si la contraseña introducida por el usuario coincide 
# con la guardada en la variable sin tener en cuenta mayúsculas y minúsculas.

password = "Contraseña"

pregunta = input("Ingrese la contraseña: ")

if password == pregunta :
    print("la contraseña introducida es correcta. ")
else :
    print("la contraseña introducida no es correcta. ")

