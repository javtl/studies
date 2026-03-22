# Crea una lista llamada mascotas con los siguientes elementos: "perro", "gato", "loro", "pez", "gato". (Fíjate que "gato" está repetido).
# Usa el método .remove("gato") para eliminar un gato de la lista.
#    Nota: Imprime la lista después de esto para observar cuál de los dos "gatos" desapareció.
# Usa la palabra clave del para eliminar el elemento que esté en el índice 1 de la lista resultante.
# Usa el método .clear() para vaciar completamente la lista.
# Imprime la lista al final para confirmar que está vacía ([]).

mascotas = ["perro", "gato", "loro", "pez", "gato"]

mascotas.remove("gato")
print(mascotas)

mascotas.remove(mascotas[1])
print(mascotas)

mascotas.clear()
print(mascotas)