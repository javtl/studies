import os
from pymongo import MongoClient
from dotenv import load_dotenv

load_dotenv()
URI = f"mongodb+srv://{os.getenv('MONGO_USER')}:{os.getenv('MONGO_PASS')}@{os.getenv('MONGO_CLUSTER')}.mongodb.net/"
client = MongoClient(URI)
db = client['biblioteca_digital']

# 2. Autores 
db.autores.insert_many([
    {'nombre': 'Cervantes', 'nacionalidad': 'Española', 'año_nacimiento': 1547},
    {'nombre': 'J.K. Rowling', 'nacionalidad': 'Británica', 'año_nacimiento': 1965},
    {'nombre': 'Tolkien', 'nacionalidad': 'Británica', 'año_nacimiento': 1892}
])

# 3. Libros 
db.libros.insert_many([
    {'titulo': 'El Quijote', 'autor_nombre': 'Cervantes', 'año': 1605, 'genero': 'Novela', 'disponible': True, 'copias': 5},
    {'titulo': 'Harry Potter', 'autor_nombre': 'J.K. Rowling', 'año': 1997, 'genero': 'Fantasía', 'disponible': True, 'copias': 10},
    {'titulo': 'El Hobbit', 'autor_nombre': 'Tolkien', 'año': 1937, 'genero': 'Fantasía', 'disponible': True, 'copias': 0}
])

# 4. Préstamos 
db.prestamos.insert_many([
    {'usuario': 'Alex', 'libro_titulo': 'El Quijote', 'fecha_prestamo': '2024-03-01', 'devuelto': False},
    {'usuario': 'Maria', 'libro_titulo': 'El Hobbit', 'fecha_prestamo': '2024-03-05', 'devuelto': True}
])

# 7. Devolución y aumento de copias 
db.prestamos.update_one({'usuario': 'Alex'}, {'$set': {'devuelto': True}})
db.libros.update_one({'titulo': 'El Quijote'}, {'$inc': {'copias': 1}})

# 9. Borrar préstamos devueltos 
db.prestamos.delete_many({'devuelto': True})

# 10. Recuento total 
for col_name in db.list_collection_names():
    print(f"Colección {col_name}: {db[col_name].count_documents({})} documentos")