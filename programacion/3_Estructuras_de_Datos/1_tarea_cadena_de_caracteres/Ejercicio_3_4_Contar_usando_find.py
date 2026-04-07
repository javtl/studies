# Hay un método de cadenas llamado find, que es similar a count.
# Escribe el código necesario para invocar a este método find y contar el número de 
# veces que una letra aparece en “banana”.

palabra = "banana"
buscado = "a"
contador = 0
indice = 0

# Mientras find encuentre la letra (devuelve -1 si no la encuentra)
while palabra.find(buscado, indice) != -1:
    # Buscamos la siguiente 'a' a partir de la posición 'indice'
    posicion = palabra.find(buscado, indice)
    
    # Si la encontramos, sumamos 1 al contador
    contador += 1
    
    # ¡IMPORTANTE! Actualizamos el índice para que la próxima 
    # búsqueda empiece DESPUÉS de la letra encontrada
    indice = posicion + 1

print(f"La letra '{buscado}' aparece {contador} veces.")
