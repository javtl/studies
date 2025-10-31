# Escribir un programa que almacene la cadena de caracteres `contraseña` en una variable, 
# pregunte al usuario por la contraseña hasta que introduzca la correcta.

PASSWORD = "contraseña"

try_password = input("Ingrese la contraseña: ")

while try_password != PASSWORD :
    try_password = input("Ingrese de nuevo la contraseña: ")