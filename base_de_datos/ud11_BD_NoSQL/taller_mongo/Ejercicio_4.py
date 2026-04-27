import os
import pymongo
from pymongo import MongoClient
from dotenv import load_dotenv

load_dotenv()
URI = f"mongodb+srv://{os.getenv('MONGO_USER')}:{os.getenv('MONGO_PASS')}@{os.getenv('MONGO_CLUSTER')}.mongodb.net/"
client = MongoClient(URI)
db = client['tienda_online'] 
col = db['productos']

# 2. Insertar producto individual 
col.insert_one({'nombre': 'Libro Python', 'precio': 34.95, 'stock': 200, 'categoria': 'libros'})

# 3. Insertar 4 productos de diversas categorías 
col.insert_many([
    {'nombre': 'Smartphone', 'precio': 499, 'stock': 30, 'categoria': 'electronica'},
    {'nombre': 'Camiseta', 'precio': 19.99, 'stock': 150, 'categoria': 'ropa'},
    {'nombre': 'Tablet', 'precio': 299, 'stock': 45, 'categoria': 'electronica'},
    {'nombre': 'Zapatillas', 'precio': 65, 'stock': 80, 'categoria': 'ropa'}
])

# 4. Mostrar todos los documentos 
print("Todos los productos:")
for doc in col.find(): print(doc)

# 5. Filtrar productos con precio > 50€ 
print("\nProductos caros (> 50€):")
for doc in col.find({'precio': {'$gt': 50}}): print(doc)

# 6. Proyección (nombre, precio) y Orden (barato a caro) 
print("\nListado ordenado (proyección):")
# id: 0 excluye el identificador de la vista 
for doc in col.find({}, {'nombre': 1, 'precio': 1, '_id': 0}).sort('precio', 1):
    print(doc)