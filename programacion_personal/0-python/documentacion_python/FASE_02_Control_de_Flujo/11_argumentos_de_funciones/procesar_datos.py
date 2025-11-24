# Investiga la sintaxis de Parámetros únicamente posicionales (4.9.3.2) y Argumentos únicamente de palabras clave (4.9.3.3).
# Diseña una función procesar_datos(a, b, /, *, c, d) y comprueba qué sucede si intentas pasar a o b 
# usando la sintaxis de palabra clave, o si intentas pasar c o d sin usar la sintaxis de palabra clave.

def procesar_datos(a,b, *,c,d):
    suma = a+b+c+d

    return suma