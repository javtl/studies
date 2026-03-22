'''
044_lista_agregar_pop.py
    Tema Principal: Listas (Métodos básicos de modificación)
    Subtema: Métodos .append() y .pop()
    Indicación: Uso de métodos para añadir y extraer elementos del final de la lista.
Enunciado:
Crea una lista y utiliza los métodos más comunes para modificar su tamaño:
    Crea una lista vacía llamada tareas.
    Usa el método .append() para añadir las siguientes tres tareas, una a una: "Comprar leche", "Hacer ejercicio", "Estudiar Python".
    Imprime la lista completa después de añadir las tareas.
    Usa el método .pop() para eliminar y capturar la última tarea de la lista. Guarda el valor de la tarea eliminada en una variable.
    Imprime la tarea que fue eliminada.
    Imprime la lista tareas final para mostrar que el elemento ha desaparecido.
'''

tareas = []

print(tareas, len(tareas))
tareas.append("Comprar Leche")
tareas.append("Hacer ejercicio")
tareas.append("Estudiar")
print(tareas, len(tareas))

tarea_eliminada = tareas.pop()

print(tareas, len(tareas), tarea_eliminada)