# Anexo 4 :: Ejemplo de documentación de código:
def suma(a: int, b: int) -> int:
    """
    Calcula la suma de dos números enteros.
    Parámetros
    ----------
    a : int
    Primer número entero.
    b : int
    Segundo número entero.
    Retorna
    -------
    int
    La suma de `a` y `b`.
    Ejemplos
    --------
    >>> suma(2, 3)
    5
    >>> suma(-1, 4)
    3
    """
    return a + b

# 1. Utiliza pydoc para generar la documentación descrita anteriormente:
# python -m pydoc suma
# 2. Se puede modificar el comando anterior para generar comentarios en formato web, a
# través de un servidor local sencillo:
# python -m pydoc -p 8080
# (Se quedará corriendo en consola, será necesario Ctrl + C para detenerlo)
# Y así poder consultar la documentación que esté disponible en http://localhost:8080
# (localiza la función suma y haz clic encima)