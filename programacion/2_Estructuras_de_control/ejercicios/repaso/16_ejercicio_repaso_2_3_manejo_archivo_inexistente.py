# Al intentar leer o escribir archivos, el programa fallará si la ruta es incorrecta o el archivo no existe. 
# Usar try...except te permite crear el archivo o notificar al usuario en su lugar.

nombre_archivo = "datos_inexistentes.txt"

try :
    with open (nombre_archivo, 'r') as archivo :
        contenido = archivo.read()
        print("✅ Archivo leído con éxito.")
except FileExistsError :
    print(f"📄 Error: El archivo '{nombre_archivo}' no fue encontrado.")
    with open(nombre_archivo, 'w') as archivo :
        archivo.write("Creación automática")
        print("-> Archivo creado automáticamente para corregir.")