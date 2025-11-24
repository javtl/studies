# Crea una lista llamada datos_sensibles con 5 elementos. Usa del para eliminar completamente la variable.

datos_sensibles = ["elemento 1","elemento 2","elemento 3", "elemento 4", "elemento 5"]
print(f"{datos_sensibles}, la longuitud de la cadena es: {len(datos_sensibles)}")
print("-"*60)

del datos_sensibles
print(datos_sensibles, len(datos_sensibles))
