import xml.etree.ElementTree as ET
from datetime import datetime

# Cargar el archivo XML
tree = ET.parse('catalogo.xml')
root = tree.getroot()

# Crear un nuevo árbol XML reestructurado
nuevo_catalogo = ET.Element('catalogo')

# Definir el año de corte
fecha_corte = datetime(2022, 1, 1)

# Reestructurar los libros por editorial
editoriales = {}

# Recorremos todos los libros
for libro in root.findall('libro'):
    # Obtener la editorial del libro
    editorial = libro.find('editorial').text
    
    # Filtrar libros publicados antes de 2022
    fecha_publicacion = datetime.strptime(libro.find('publicacion/fecha').text, '%Y-%m-%d')
    if fecha_publicacion < fecha_corte:
        continue  # Excluir libros publicados antes de 2022
    
    # Si la editorial no está en el diccionario, crear una nueva lista de libros
    if editorial not in editoriales:
        editoriales[editorial] = ET.SubElement(nuevo_catalogo, 'editorial', nombre=editorial)
    
    # Crear un nuevo libro con el nuevo esquema
    libro_nuevo = ET.SubElement(editoriales[editorial], 'libro')
    
    # Renombrar los elementos según el nuevo esquema
    nombre = ET.SubElement(libro_nuevo, 'nombre')
    nombre.text = libro.find('titulo').text
    
    escritor = ET.SubElement(libro_nuevo, 'escritor')
    escritor.text = libro.find('autor').text
    
    costo = ET.SubElement(libro_nuevo, 'costo', moneda=libro.find('precio').get('moneda'))
    costo.text = libro.find('precio').text

# Guardar el nuevo archivo XML reestructurado
tree_reestructurado = ET.ElementTree(nuevo_catalogo)
tree_reestructurado.write('catalogo_reestructurado.xml', encoding='utf-8', xml_declaration=True)

# Crear un XML simplificado con solo título, autor y precio
simplificado_catalogo = ET.Element('catalogo_simplificado')

for libro in root.findall('libro'):
    fecha_publicacion = datetime.strptime(libro.find('publicacion/fecha').text, '%Y-%m-%d')
    if fecha_publicacion < fecha_corte:
        continue  # Excluir libros publicados antes de 2022

    libro_simplificado = ET.SubElement(simplificado_catalogo, 'libro')
    
    # Crear elementos simplificados
    nombre = ET.SubElement(libro_simplificado, 'titulo')
    nombre.text = libro.find('titulo').text
    
    autor = ET.SubElement(libro_simplificado, 'autor')
    autor.text = libro.find('autor').text
    
    costo = ET.SubElement(libro_simplificado, 'precio', moneda=libro.find('precio').get('moneda'))
    costo.text = libro.find('precio').text

# Guardar el archivo XML simplificado
tree_simplificado = ET.ElementTree(simplificado_catalogo)
tree_simplificado.write('catalogo_simplificado.xml', encoding='utf-8', xml_declaration=True)

print("Transformaciones completadas.")
