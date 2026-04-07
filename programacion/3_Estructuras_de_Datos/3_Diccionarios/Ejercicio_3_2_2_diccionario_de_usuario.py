# Escribir un programa que pregunte al usuario su nombre, edad, dirección y teléfono y lo
# guarde en un diccionario. Después debe mostrar por pantalla el mensaje <nombre>
# tiene <edad> años, vive en <dirección> y su número de teléfono es
# <teléfono>.

# Podemos crear el diccionario directamente con los inputs
nombre = input("Ingrese su nombre: ")
edad = input("Ingrese su edad: ") # Aquí lo dejo como texto para el print
direccion = input("Ingrese su dirección: ")
telefono = input("Ingrese su teléfono: ")

# Guardamos todo en el diccionario
usuario = {
    "nombre": nombre,
    "edad": edad,
    "direccion": direccion,
    "telefono": telefono
}

# Mostramos el mensaje accediendo a las llaves
print(f"{usuario['nombre']} tiene {usuario['edad']} años, "
      f"vive en {usuario['direccion']} y su número de teléfono es {usuario['telefono']}.")