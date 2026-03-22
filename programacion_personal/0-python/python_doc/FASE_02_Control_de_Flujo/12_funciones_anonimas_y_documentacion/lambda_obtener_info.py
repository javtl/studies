# Define una función llamada `obtener_info(dato)` que tome cualquier cosa, 
# devuelva una docstring explicando que el dato es de tipo `dato.__class__.__name__`, 
# y luego llama a esa función con un número entero e imprime su docstring.

def obtener_info(dato):
    nombre_tipo = dato.__class__.__name__
    nueva_docstring = f"""
    --- Documentación Dinámica ---
    Esta función ha sido llamada con un dato de tipo: {nombre_tipo}.

    Propósito: La función ha procesado con éxito un argumento de tipo {nombre_tipo}
    y su docstring fue modificada en tiempo de ejecución.

    Argumentos:
        dato ({nombre_tipo}): El valor proporcionado.
    
    Retorna:
        str: El nombre del tipo del dato ({nombre_tipo}).
    -------------------------------
    """
    obtener_info.__doc__ = nueva_docstring

print("1. Llamando a la función obtener_info(42)...")
tipo_resultado = obtener_info(42)
print(f"   -> La función devolvió el tipo: {tipo_resultado}")

print("\n2. Imprimiendo la docstring modificada:")
print(obtener_info.__doc__)