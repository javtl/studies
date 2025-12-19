# Crea una tupla llamada `mi_ciudad` que contenga el nombre de una ciudad, su población y su país. 
# Intenta cambiar el valor de la población y escribe en un comentario qué mensaje de error te devuelve Python.

mi_ciudad = ("Madrid",3506730,"España")
print(mi_ciudad)

mi_ciudad[1] = 3506731 #TypeError: 'tuple' object does not support item assignment