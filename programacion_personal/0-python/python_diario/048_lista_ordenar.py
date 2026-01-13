# Crea una lista llamada edades con estos valores desordenados: [25, 18, 40, 12, 33, 20].
# Usa el método .sort() para ordenar la lista de forma ascendente. Imprime la lista para ver que el cambio fue permanente.
# Usa el método .sort(reverse=True) para ordenar la misma lista en orden descendente. Imprime el resultado.
# Crea una lista de ciudades: ["Madrid", "Bogotá", "Asunción", "Lima"].
# Usa la función sorted(ciudades) dentro de un print() para mostrar las ciudades ordenadas alfabéticamente.
# Inmediatamente después, imprime la lista ciudades original para demostrar que no cambió.

edades = [25, 18, 40, 12, 33, 20]

edades.sort()
print(edades)
edades.sort(reverse=True)
print(edades)

ciudades = ["Madrid", "Bogotá", "Asunción", "Lima"]

print(sorted(ciudades))
print(ciudades)