# Define una función llamada imprimir_pedido que acepte dos parámetros: producto (obligatorio) y cantidad (opcional, con valor predeterminado de 1).
# Llama a la función de dos maneras: una vez especificando la cantidad, y otra sin especificarla.

def imprimir_pedido(producto, cantidad=1) : 
    print(f"Pedido: {cantidad} unidades de {producto}")

# 1- Especificando la cantidad:
imprimir_pedido("Leche", 6)
# 2- Valor predeterminado:
imprimir_pedido("Pan")