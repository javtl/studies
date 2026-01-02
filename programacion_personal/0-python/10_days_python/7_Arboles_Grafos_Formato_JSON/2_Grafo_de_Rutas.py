# Crea un grafo llamado `metro_ciudad` donde las claves sean estaciones y los valores sean listas de estaciones conectadas directamente.

# 1. Añade al menos 4 estaciones.
# 2. **Reto:** Crea una función llamada `estan_conectadas(estacion1, estacion2)` que devuelva `True` si la segunda está en la lista de conexiones de la primera.

metro_ciudad = {
    "Centro": ["Norte", "Sur", "Oeste", "Este"],
    "Norte": ["Centro"],
    "Sur": ["Centro"],
    "Oeste": ["Centro"],
    "Este": ["Centro"]
}

def estan_conectadas(estacion1, estacion2):
    # Verificamos si estacion1 existe y si estacion2 está en su lista de conexiones
    if estacion1 in metro_ciudad and estacion2 in metro_ciudad[estacion1]:
        return True
    return False

# Prueba del programa
e1 = input("Estación de origen: ")
e2 = input("Estación de destino: ")

if estan_conectadas(e1, e2):
    print(f"✅ ¡Sí! Hay una conexión directa entre {e1} y {e2}.")
else:
    print(f"❌ No hay conexión directa entre {e1} y {e2}.")