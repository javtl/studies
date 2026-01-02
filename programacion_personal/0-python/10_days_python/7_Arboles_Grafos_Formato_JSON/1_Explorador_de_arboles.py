# Ejercicio 1: El Explorador de Árboles
# Crea un diccionario llamado `biblioteca`.
# 1. Debe tener dos categorías: `"Ficción"` y `"No Ficción"`.
# 2. Dentro de cada una, añade dos autores (claves) y que sus valores sean una **lista** de sus libros.
# 3. **Reto:** Haz que el programa pregunte al usuario qué categoría quiere ver, luego qué autor, y finalmente imprima la lista de libros de ese autor.

biblioteca = {
    "Ficción": {
        "Autor 1": ["Titulo 1", "Titulo 2"],
        "Autor 2": ["Titulo 3", "Titulo 4"]
    },
    "No Ficción": {
        "Autor 3": ["Titulo 5", "Titulo 6"],
        "Autor 4": ["Titulo 7", "Titulo 8"]
    }
}

categoria = input("¿Qué categoría quiere ver? (Ficción/No Ficción): ")
autor = input("¿Qué autor quiere ver?: ")

# Acceso encadenado: Diccionario -> Clave 1 -> Clave 2
try:
    libros = biblioteca[categoria][autor]
    print(f"\nLos libros de {autor} en {categoria} son: {libros}")
except KeyError:
    print("\nError: Asegúrate de escribir bien la categoría y el autor.")