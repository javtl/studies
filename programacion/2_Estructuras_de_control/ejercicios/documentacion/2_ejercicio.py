# Documenta correctamente la función que resuelve ecuaciones de segundo grado. 
# Usa en esta ocasión la técnica docstring para la documentación de la función y los comentarios 
# de código para explicar el algoritmo a otros programadores (como si fuera a ti mismo después 
# de algún tiempo sin trabajar en este proyecto)

import math

def ecuacion_segundo_grado(a, b, c):
    """
    Resuelve ax^2 + bx + c = 0 usando la fórmula cuadrática.
    Return:
    devuelve: Las raíces (soluciones) o un mensaje si no hay soluciones reales.
    """

    # Calculamos el discriminante
    discriminante = (b**2) - (4 * a * c)

    # Si 'a' es cero, no es de segundo grado.
    if a == 0:
        raise ValueError("'a' no puede ser 0.")

    # 1. Dos soluciones reales distintas.
    if discriminante > 0:
        # Usamos la fórmula: (-b +/- sqrt(discriminante)) / (2a)
        raiz1 = (-b + math.sqrt(discriminante)) / (2 * a)
        raiz2 = (-b - math.sqrt(discriminante)) / (2 * a)
        return (raiz1, raiz2)
    
    # 2. Una única solución real (discriminante es cero).
    elif discriminante == 0:
        # La solución es simple: -b / (2a)
        raiz_unica = -b / (2 * a)
        return (raiz_unica)
    
    # 3. No hay soluciones reales (discriminante es negativo).
    else: 
        return "No hay soluciones reales."