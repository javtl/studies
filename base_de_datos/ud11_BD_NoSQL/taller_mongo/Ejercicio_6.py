import os
from pymongo import MongoClient
from dotenv import load_dotenv

load_dotenv()
URI = f"mongodb+srv://{os.getenv('MONGO_USER')}:{os.getenv('MONGO_PASS')}@{os.getenv('MONGO_CLUSTER')}.mongodb.net/"
client = MongoClient(URI)
db = client['agenda']
col = db['contactos']

# 2. Insertar 5 contactos 
col.insert_many([
    {'nombre': 'Ana', 'telefono': '600111222', 'email': 'ana@mail.com', 'grupo': 'amigos'},
    {'nombre': 'Luis', 'telefono': '600222333', 'email': 'luis@emp.com', 'grupo': 'trabajo'},
    {'nombre': 'María', 'telefono': '600333444', 'email': 'maria@mail.com', 'grupo': 'familia'},
    {'nombre': 'Pedro', 'telefono': '600444555', 'email': 'pedro@emp.com', 'grupo': 'trabajo'},
    {'nombre': 'Elena', 'telefono': '600555666', 'email': 'elena@mail.com', 'grupo': 'familia'}
])

# 3. Mostrar contactos de trabajo 
for c in col.find({'grupo': 'trabajo'}): print(f"Trabajo: {c['nombre']}")

# 4. Actualizar teléfono 
col.update_one({'nombre': 'Ana'}, {'$set': {'telefono': '699000111'}})

# 5. Favorito a familia 
col.update_many({'grupo': 'familia'}, {'$set': {'favorito': True}})

# 6. Eliminar trabajo 
col.delete_many({'grupo': 'trabajo'})

# 7. Recuento final 
for g in ['amigos', 'familia']:
    print(f"{g}: {col.count_documents({'grupo': g})}")