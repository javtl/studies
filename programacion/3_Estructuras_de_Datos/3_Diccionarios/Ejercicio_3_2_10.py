# Escribir un programa que permita gestionar la base de datos de clientes de una empresa. 
# Los clientes se guardarán en un diccionario en el que la clave de cada cliente será su 
# NIF, y el valor será otro diccionario con los datos del cliente (nombre, dirección, 
# teléfono, correo, preferente), donde preferente tendrá el valor True si se trata de un 
# cliente preferente. El programa debe preguntar al usuario por una opción del siguiente 
# menú: (1) Añadir cliente, (2) Eliminar cliente, (3) Mostrar cliente, (4) Listar todos los 
# clientes, (5) Listar clientes preferentes, (6) Terminar. En función de la opción elegida el 
# programa tendrá que hacer lo siguiente:

# 1. Preguntar los datos del cliente, crear un diccionario con los datos y añadirlo a la 
# base de datos.
# 2. Preguntar por el NIF del cliente y eliminar sus datos de la base de datos.
# 3. Preguntar por el NIF del cliente y mostrar sus datos.
# 4. Mostrar lista de todos los clientes de la base datos con su NIF y nombre.
# 5. Mostrar la lista de clientes preferentes de la base de datos con su NIF y nombre.
# 6. Terminar el programa.

clientes = {}
opcion = ""

while opcion != "6":
    print("\n--- MENÚ DE GESTIÓN DE CLIENTES ---")
    print("1. Añadir cliente")
    print("2. Eliminar cliente")
    print("3. Mostrar cliente")
    print("4. Listar todos los clientes")
    print("5. Listar clientes preferentes")
    print("6. Terminar")
    opcion = input("Elija una opción: ")

    if opcion == "1":
        nif = input("NIF del cliente: ")
        nombre = input("Nombre: ")
        direccion = input("Dirección: ")
        telefono = input("Teléfono: ")
        correo = input("Correo: ")
        
        vip = input("¿Es cliente preferente? (si/no): ").lower() == "si"
        
       
        datos_cliente = {
            "nombre": nombre,
            "dirección": direccion,
            "teléfono": telefono,
            "correo": correo,
            "preferente": vip
        }
        
        clientes[nif] = datos_cliente

    elif opcion == "2":
        nif = input("Introduce el NIF del cliente a eliminar: ")
        if nif in clientes:
            del clientes[nif]
            print(f"Cliente {nif} eliminado.")
        else:
            print("No existe un cliente con ese NIF.")

    elif opcion == "3":
        nif = input("Introduce el NIF del cliente: ")
        if nif in clientes:
            print(f"\nDatos del cliente {nif}:")
            for clave, valor in clientes[nif].items():
                print(f"{clave.capitalize()}: {valor}")
        else:
            print("Cliente no encontrado.")

    elif opcion == "4":
        print("\nLISTA DE TODOS LOS CLIENTES:")
        for nif, datos in clientes.items():
            print(f"NIF: {nif} - Nombre: {datos['nombre']}")

    elif opcion == "5":
        print("\nLISTA DE CLIENTES PREFERENTES:")
        for nif, datos in clientes.items():
            if datos["preferente"]: # Si es True
                print(f"NIF: {nif} - Nombre: {datos['nombre']}")

print("Saliendo del sistema...")