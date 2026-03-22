# 📅 Día 7: Estructuras Jerárquicas y Persistencia JSON

## 📋 1. Árboles (Trees)

Un árbol es una estructura jerárquica (no lineal). En Python, la forma más común de representarlo sin librerías externas es mediante **diccionarios anidados**.

### 💻 Ejemplo de Código: Árbol de Navegación

```python
# Estructura de un árbol de categorías
tienda = {
    "Electrónica": {
        "Móviles": ["iPhone", "Samsung"],
        "Laptops": ["MacBook", "Dell"]
    },
    "Hogar": {
        "Cocina": ["Freidora de aire", "Cafetera"],
        "Muebles": ["Sofá", "Mesa"]
    }
}

# Acceso jerárquico (Navegando por las ramas)
print(tienda["Electrónica"]["Móviles"][0]) # Resultado: iPhone

```

---

## 📋 2. Grafos (Graphs)

Los grafos representan conexiones (redes). No hay un "arriba" o "abajo", solo nodos conectados.

### 💻 Ejemplo de Código: Red de Conexiones

```python
# Representación de un grafo mediante un "Lista de Adyacencia" (Diccionario)
conexiones_vuelos = {
    "Madrid": ["París", "Roma", "Londres"],
    "París": ["Madrid", "Berlín"],
    "Roma": ["Madrid"]
}

# Consultar conexiones
ciudad = "Madrid"
print(f"Vuelos directos desde {ciudad}: {conexiones_vuelos[ciudad]}")

```

---

## 📋 3. JSON (Persistencia de Estructuras)

JSON es el formato que permite guardar esos Árboles y Grafos en el disco duro.

### 💻 Ejemplo de Código: Guardar y Leer

```python
import json

datos = {"id": 1, "status": "activo", "tags": ["python", "dev"]}

# GUARDAR (Dump)
with open("data.json", "w") as f:
    json.dump(datos, f, indent=4)

# LEER (Load)
with open("data.json", "r") as f:
    datos_cargados = json.load(f)

```

---

## ✅ Ejercicios Resueltos (Para Estudio)

**Reto:** Crear un árbol de una empresa y mostrar los empleados de un departamento.

```python
# Solución:
empresa = {
    "IT": {"Manager": "Ana", "Devs": ["Luis", "Marta"]},
    "RRHH": {"Manager": "Pedro", "Personal": ["Lucía"]}
}

depto = "IT"
print(f"Los desarrolladores de {depto} son: {empresa[depto]['Devs']}")

```

---

## 🛠️ Ejercicios PARA RESOLVER

### Ejercicio 1: El Explorador de Árboles

Crea un diccionario llamado `biblioteca`.

1. Debe tener dos categorías: `"Ficción"` y `"No Ficción"`.
2. Dentro de cada una, añade dos autores (claves) y que sus valores sean una **lista** de sus libros.
3. **Reto:** Haz que el programa pregunte al usuario qué categoría quiere ver, luego qué autor, y finalmente imprima la lista de libros de ese autor.

### Ejercicio 2: El Grafo de Rutas

Crea un grafo llamado `metro_ciudad` donde las claves sean estaciones y los valores sean listas de estaciones conectadas directamente.

1. Añade al menos 4 estaciones.
2. **Reto:** Crea una función llamada `estan_conectadas(estacion1, estacion2)` que devuelva `True` si la segunda está en la lista de conexiones de la primera.

### Ejercicio 3: De Memoria a Disco (El gran final del día)

1. Toma el diccionario `biblioteca` del Ejercicio 1.
2. Guárdalo en un archivo llamado `mi_biblioteca.json`.
3. Crea una función llamada `añadir_libro(categoria, autor, titulo)` que:
* Cargue el JSON.
* Añada el libro a la lista correspondiente.
* Vuelva a guardar el JSON actualizado.

