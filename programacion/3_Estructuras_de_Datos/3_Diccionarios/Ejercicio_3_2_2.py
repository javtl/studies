# Escribir un programa que pregunte al usuario su nombre, edad, dirección y teléfono y lo
# guarde en un diccionario. Después debe mostrar por pantalla el mensaje <nombre>
# tiene <edad> años, vive en <dirección> y su número de teléfono es
# <teléfono>.



datos = {"nombre":"","edad":"","direccion":"","telefono":""}

nombre = input("Ingrese su nombre:")
edad  = int(input("Ingrese su eda:"))
direccion  = input("Ingrese su dirección:")
telefono = input("Ingrese su telefono:")

datos["nombre"] = nombre
datos["edad"] = edad
datos["direccion"] = direccion
datos["telefono"] = telefono