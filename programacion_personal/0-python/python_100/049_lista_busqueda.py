
# Crea una lista de lenguajes y realiza búsquedas:
# Crea una lista llamada lenguajes que contenga: "Python", "Java", "JavaScript", "Python", "C++".
# Usa el operador in dentro de un if para verificar si "Python" está en la lista. Si está, imprime: "Sí, Python es parte de la lista".
# Usa el método .count() para contar cuántas veces aparece "Python" e imprime el resultado.
# Usa el método .index() para encontrar la posición (índice) de "JavaScript" e imprímelo.

lenguajes = ["Python", "Java", "JavaScript", "Python", "C++"]

if "Python" in lenguajes:
    print("Sí, Python es parte de la lista")
else:
    print("Python no esta en la lista")

print(lenguajes.count("Python"))
print(lenguajes.index("JavaScript"))

