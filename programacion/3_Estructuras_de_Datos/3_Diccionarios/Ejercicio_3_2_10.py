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

# 1. Creamos el diccionario donde guardaremos las parejas (español: inglés)
diccionario_traductor = {}

# 2. Pedimos al usuario la lista de traducciones
# Formato esperado: "palabra:traducción,palabra:traducción"
entrada = input("Introduce las palabras (español:inglés) separadas por comas:\n> ")

# 3. Procesamos la entrada del usuario
# .split(',') crea una lista de strings tipo ["hola:hello", "casa:house"]
lista_parejas = entrada.split(',')

for pareja in lista_parejas:
    # .split(':') separa cada elemento en [clave, valor]
    if ":" in pareja:
        esp, eng = pareja.split(':')
        # .strip() elimina espacios accidentales y guardamos en el diccionario
        diccionario_traductor[esp.strip().lower()] = eng.strip().lower()

# 4. Pedimos la frase a traducir
frase_esp = input("\nIntroduce una frase en español para traducir: ").lower()

# 5. Traducimos palabra por palabra
palabras_frase = frase_esp.split() # Separa la frase por espacios
frase_traducida = []

for palabra in palabras_frase:
    # .get() busca la traducción. Si no existe, deja la palabra original
    traduccion = diccionario_traductor.get(palabra, palabra)
    frase_traducida.append(traduccion)

# 6. Mostramos el resultado uniendo la lista de nuevo en un string
print("\n--- RESULTADO DE LA TRADUCCIÓN ---")
print(" ".join(frase_traducida))
