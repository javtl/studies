import os
from pymongo import MongoClient
from dotenv import load_dotenv

load_dotenv()
URI = f"mongodb+srv://{os.getenv('MONGO_USER')}:{os.getenv('MONGO_PASS')}@{os.getenv('MONGO_CLUSTER')}.mongodb.net/"
client = MongoClient(URI)
db = client['biblioteca'] 

# 1. Crear colecciones con un documento inicial 
db['libros'].insert_one({'titulo': 'El Quijote', 'año': 1605})
db['autores'].insert_one({'nombre': 'Cervantes'})
db['socios'].insert_one({'nombre': 'Ana García'})

# 2. Listar colecciones para verificar 
print("Colecciones creadas:", db.list_collection_names())

# 3. Renombrar la colección 'socios' a 'usuarios' 
db['socios'].rename('usuarios')

# 4. Eliminar la colección 'autores' 

# 5. Estado final de las colecciones 
print("Estado final biblioteca:", db.list_collection_names())