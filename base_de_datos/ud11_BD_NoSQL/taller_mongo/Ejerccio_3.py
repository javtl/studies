import os
from pymongo import MongoClient
from dotenv import load_dotenv

load_dotenv()
URI = f"mongodb+srv://{os.getenv('MONGO_USER')}:{os.getenv('MONGO_PASS')}@{os.getenv('MONGO_CLUSTER')}.mongodb.net/"
client = MongoClient(URI)
db = client['empresa']

# 2. Crear la colección 'empleados' con validación 
try:
    db.create_collection('empleados', validator={
        '$jsonSchema': {
            'bsonType': 'object',
            'required': ['nombre', 'departamento', 'salario'], 
            'properties': {
                'nombre': {'bsonType': 'string'}, 
                'departamento': {'bsonType': 'string'}, 
                'salario': {'bsonType': 'number'} 
            }
        }
    })
except Exception as e:
    print("Nota: La colección ya existe o el clúster no permite validación.")

col = db['empleados']

# 3. Insertar documento válido e inválido 
print("Intentando inserción válida...")
col.insert_one({'nombre': 'Luis', 'departamento': 'IT', 'salario': 35000}) 

print("Intentando inserción inválida (sin salario)...")
try:
    col.insert_one({'nombre': 'Error Test', 'departamento': 'RRHH'}) 
except Exception as e:
    print("Error de validación capturado con éxito:", e) 