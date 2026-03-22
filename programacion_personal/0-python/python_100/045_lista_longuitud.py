'''
Ejercicio ID: 045_lista_longitud.py
    Tema Principal: Listas
    Subtema: Función len()
    Indicación: Conocer el tamaño de una colección es fundamental para controlar bucles o evitar errores de índice.
Enunciado:
Crea una lista y determina su longitud:
    Crea una lista llamada peliculas con al menos seis títulos de películas.
    Utiliza la función len() para obtener el número total de elementos (películas) que contiene la lista.
    Imprime el resultado en una f-string que diga: "Hay [longitud] películas en la lista.".
    Luego, usa la longitud obtenida en el punto 2 para imprimir el penúltimo elemento de la lista usando indexación positiva (ej: peliculas[longitud - 2]).
'''
lista = ["Pelicula 1","Pelicula 2","Pelicula 3","Pelicula 4","Pelicula 5"]

print( f"la lista de películas tiene una longuitud de :{len(lista)}")

print(f"el penúltimo elemento de la lista {lista[-2]}")