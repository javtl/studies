# compara_numeros.py

def mayor_de_dos(a, b):
    """
    Recibe dos números (a y b) y retorna el mayor número.
    Retorna 0 si ambos números son iguales.
    """
    if a > b:
        return a
    elif b > a:
        return b
    else:  # a == b
        return 0

