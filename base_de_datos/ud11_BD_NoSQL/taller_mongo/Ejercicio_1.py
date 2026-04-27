import os
from pymongo import MongoClient
from dotenv import load_dotenv

# Cargar variables de entorno
load_dotenv()
USER = os.getenv("MONGO_USER")
PASS = os.getenv("MONGO_PASS")
CLUSTER = os.getenv("MONGO_CLUSTER")

# Configuración de URI y Cliente
URI = f"mongodb+srv://{USER}:{PASS}@{CLUSTER}.mongodb.net/?retryWrites=true&w=majority"
client = MongoClient(URI)

# 1. Listar todas las BDs disponibles
print("Bases de datos iniciales:", client.list_database_names())

# 2. Seleccionar base de datos 'academia'
db = client['academia']

# 3. Verificar que no aparece todavía (está vacía)
print("'academia' en lista:", 'academia' in client.list_database_names())

# 4. Insertar documento para materializar la BD 
db['prueba'].insert_one({'temp': True})

# 5. Confirmar que ya aparece 
print("'academia' tras inserción:", 'academia' in client.list_database_names())

# 6. Eliminar la base de datos y comprobar 
client.drop_database('academia')
print("Lista final:", client.list_database_names())