# El Validador de Usuarios (Sets + Diccionarios): Imagina que tienes una lista de registros con correos duplicados: 
# ["a@test.com", "b@test.com", "a@test.com", "c@test.com"].
#  Crea una función llamada limpiar_registros que reciba esa lista.
#   Dentro de la función, convierte la lista en un Set para eliminar duplicados.
#   Devuelve el número de usuarios únicos.
# Fuera de la función, crea un Diccionario llamado estadisticas que guarde una clave "total_unicos" con el resultado obtenido e imprímelo.



def limpiar_registros(lista):
    set_lista = set(lista)
    cont = len(set_lista)

    return cont 

lista_correos = [
    "juan.perez@example.com",
    "maria.garcia@gmail.com",
    "carlos.ruiz@hotmail.com",
    "juan.perez@example.com",  # Repetido
    "ana.lopez@outlook.com",
    "maria.garcia@gmail.com",  # Repetido
    "pedro.picapiedra@empresa.es",
    "lucia.fernandez@yahoo.com",
    "juan.perez@example.com",  # Repetido (tercera vez)
    "roberto.smith@academia.edu",
    "ana.lopez@outlook.com",   # Repetido
    "elena.sanz@webmail.com"]

resultado_unicos = limpiar_registros(lista_correos)
estadisticas = ["total_unicos"] = resultado_unicos

print(f"Estadísticas finales: {estadisticas}")
