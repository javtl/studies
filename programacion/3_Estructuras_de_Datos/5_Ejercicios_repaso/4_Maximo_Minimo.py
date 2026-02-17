def obtener_extremos(tupla_numeros):

    mayor = max(tupla_numeros)
    menor = min(tupla_numeros)
    
    return (menor, mayor)

valores = (45, 12, 89, 3, 27)
resultado = obtener_extremos(valores)
print(f"Mínimo y Máximo: {resultado}")

