# El directorio de los clientes de una empresa está organizado en una cadena de texto 
# como la de más abajo, donde cada línea contiene la información del nombre, email, 
# teléfono, nif, y el descuento que se le aplica. Las líneas se separan con el carácter de 
# cambio de línea \n y la primera línea contiene los nombres de los campos con la 
# información contenida en el directorio.

# "nif;nombre;email;teléfono;descuento\n01234567L;Luis 
# González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena 
# Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José 
# Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen 
# Sánchez;carmen@mail.com;667677855;15.7"

# Escribir un programa que genere un diccionario con la información del directorio, 
# donde cada elemento corresponda a un cliente y tenga por clave su nif y por valor otro 
# diccionario con el resto de la información del cliente. Los diccionarios con la 
# información de cada cliente tendrán como claves los nombres de los campos y como 
# valores la información de cada cliente correspondientes a los campos. Es decir, un 
# diccionario como el siguiente

# {'01234567L': {'nombre': 'Luis González', 'email': 
# 'luisgonzalez@mail.com', 'teléfono': '656343576', 'descuento': 12.5}, 
# '71476342J': {'nombre': 'Macarena Ramírez', 'email': 
# 'macarena@mail.com', 'teléfono': '692839321', 'descuento': 8.0}, 
# '63823376M': {'nombre': 'Juan José Martínez', 'email': 
# 'juanjo@mail.com', 'teléfono': '664888233', 'descuento': 5.2}, 
# '98376547F': {'nombre': 'Carmen Sánchez', 'email': 'carmen@mail.com', 
# 'teléfono': '667677855', 'descuento': 15.7}}
import pprint # Importamos para que la salida sea legible

datos_raw = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"

def generar_directorio(cadena):
    directorio = {}
    
    # 1. Separamos el bloque de texto en una lista de líneas
    lineas = cadena.split('\n')
    
    # 2. Identificamos los nombres de los campos (la primera fila)
    cabeceras = lineas[0].split(';')
    
    # 3. Procesamos los datos (desde la línea 1 hasta el final)
    for linea in lineas[1:]:
        valores = linea.split(';')
        
        # El NIF (índice 0) actúa como LLAVE PRINCIPAL
        nif = valores[0]
        
        # El resto de datos forman un DICCIONARIO INTERNO (valor)
        info_cliente = {
            cabeceras[1]: valores[1],        # 'nombre'
            cabeceras[2]: valores[2],        # 'email'
            cabeceras[3]: valores[3],        # 'teléfono'
            cabeceras[4]: float(valores[4])  # 'descuento' (convertido a número)
        }
        
        # Guardamos la relación NIF -> Datos
        directorio[nif] = info_cliente
        
    return directorio

resultado = generar_directorio(datos_raw)
pprint.pprint(resultado)