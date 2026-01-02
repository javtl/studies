# 1. Toma el diccionario `biblioteca` del Ejercicio 1.
# 2. Guárdalo en un archivo llamado `mi_biblioteca.json`.
# 3. Crea una función llamada `añadir_libro(categoria, autor, titulo)` que:
# * Cargue el JSON.
# * Añada el libro a la lista correspondiente.
# * Vuelva a guardar el JSON actualizado.

import json

archivo = "mi_biblioteca.json"

# Diccionario inicial (Basado en el Ejercicio 1)
datos_iniciales = {
    "Ficción": {"Autor 1": ["Libro A"], "Autor 2": []},
    "No Ficción": {"Autor 3": [], "Autor 4": []}
}

# 1. Crear el archivo por primera vez
with open(archivo, "w", encoding="utf-8") as f:
    json.dump(datos_iniciales, f, indent=4)

def añadir_libro(cat, aut, tit):
    # A. CARGAR: Abrimos en modo lectura 'r'
    with open(archivo, "r", encoding="utf-8") as f:
        datos = json.load(f)
    
    # B. MODIFICAR: Añadimos el nuevo título a la lista del autor
    if cat in datos and aut in datos[cat]:
        datos[cat][aut].append(tit)
        
        # C. GUARDAR: Abrimos en modo escritura 'w' para sobreescribir con el cambio
        with open(archivo, "w", encoding="utf-8") as f:
            json.dump(datos, f, indent=4)
        print(f"Successfully added '{tit}' to {aut}.")
    else:
        print("Categoría o autor no encontrados en el archivo.")

# Uso del programa
c = input("Categoría: ")
a = input("Autor: ")
t = input("Título del libro: ")

añadir_libro(c, a, t)