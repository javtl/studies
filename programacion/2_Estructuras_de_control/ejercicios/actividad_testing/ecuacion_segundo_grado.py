# ecuacion_segundo_grado.py
import math

def resolver_ecuacion(a, b, c):
    """
    Resuelve una ecuación de segundo grado ax^2 + bx + c = 0.
    Retorna una tupla con las soluciones (x1, x2).
    """
    if a == 0:
        raise ValueError("El coeficiente 'a' no puede ser cero en una ecuación de segundo grado.")
    
    # Calcular el discriminante: b^2 - 4ac
    discriminante = b**2 - 4 * a * c
    
    if discriminante < 0:
        # En el ámbito de los números reales, no hay solución.
        # Podríamos retornar un par de números complejos, pero para esta práctica:
        return None, None # Indica que no hay soluciones reales

    elif discriminante == 0:
        # Una única solución real
        x1 = -b / (2 * a)
        return x1, x1
        
    else:
        # Dos soluciones reales distintas
        sqrt_discriminante = math.sqrt(discriminante)
        x1 = (-b + sqrt_discriminante) / (2 * a)
        x2 = (-b - sqrt_discriminante) / (2 * a)
        return x1, x2