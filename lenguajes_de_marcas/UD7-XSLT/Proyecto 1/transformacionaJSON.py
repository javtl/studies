import xml.etree.ElementTree as ET
import json

# Cargar el archivo XML
tree = ET.parse('catalogo.xml')
root = tree.getroot()

# Crear una lista para almacenar los libros en formato JSON
libros_json = []

# Recorrer cada libro en el XML
for libro in root.findall('libro'):
    libro_json = {
        "id": libro.get('id'),
        "titulo": libro.find('titulo').text,
        "autor": libro.find('autor').text,
        "editorial": libro.find('editorial').text,
        "precio": {
            "valor": float(libro.find('precio').text),
            "moneda": libro.find('precio').get('moneda')
        },
        "publicacion": {
            "fecha": libro.find('publicacion/fecha').text,
            "pais": libro.find('publicacion/pais').text
        },
        "temas": [tema.text for tema in libro.findall('temas/tema')]
    }
    libros_json.append(libro_json)

# Convertir la lista de libros a JSON
json_output = json.dumps(libros_json, indent=4)

# Guardar el archivo JSON
with open('libros.json', 'w') as json_file:
    json_file.write(json_output)

# Mostrar el contenido del archivo JSON en consola (opcional)
print(json_output)
