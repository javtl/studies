import os

from pymongo import MongoClient
from dotenv import load_dotenv

load_dotenv()
USER = os.getenv("MONGO_USER")
PASS = os.getenv("MONGO_PASS")
CLUSTER = os.getenv("MONGO_CLUSTER")

URI = f"mongodb+srv://{USER}:{PASS}@{CLUSTER}.mongodb.net/?retryWrites=true&w=majority"
client = MongoClient(URI)
db = client['tienda_online']
col = db['productos']

# 1. Actualizar precio del Libro Python 
col.update_one({'nombre': 'Libro Python'}, {'$set': {'precio': 29.95}})

# 2. Añadir campo 'descuento' a electrónica 
col.update_many({'categoria': 'electronica'}, {'$set': {'descuento': 10}})

# 3. Incrementar stock de libros en 50 
col.update_many({'categoria': 'libros'}, {'$inc': {'stock': 50}})

# 4. Upsert: añadir Auriculares si no existen 
col.update_one(
    {'nombre': 'Auriculares'},
    {'$set': {'precio': 89.99, 'stock': 60}},
    upsert=True
)

# 5. Eliminar campo 'descuento' 
col.update_many({}, {'$unset': {'descuento': ""}})

# 6. Mostrar estado final 
for doc in col.find({}, {'_id': 0}):
    print(doc)