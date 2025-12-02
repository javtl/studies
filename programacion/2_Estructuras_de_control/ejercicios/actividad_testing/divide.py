# divide.py

def division(a, b):
    """
    Recibe dos números (a y b) y retorna el resultado de a / b.
    Lanza un error si el divisor (b) es 0.
    """
    if b == 0:
        raise ValueError("El divisor no puede ser cero.")
    return a / b
