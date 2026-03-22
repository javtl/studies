# Simula la operación de una **Pila (Stack)** utilizando una lista, donde se añaden tres elementos (`push`) 
# y luego se extraen dos elementos (`pop`) para demostrar el comportamiento LIFO (último en entrar, primero en salir).

pila = []

pila.append("Libro 1")
pila.append("Libro 2")
pila.append("Libro 3")

print(f"La pila actual es: {pila}")

elemento_1 = pila.pop()
elemento_3 = pila.pop()

print(f"El elemento número 1 es: {elemento_1}")
print(f"Elemento número 3 es: {elemento_3}")
