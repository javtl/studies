# Crea una lista y procesa sus elementos uno por uno:

#    Crea una lista llamada nombres_clase con al menos cinco nombres.

#    Utiliza un bucle for con el patrón for nombre in nombres_clase: para recorrer cada elemento de la lista.

#    Dentro del bucle, utiliza una f-string para imprimir un saludo personalizado para cada nombre: 
#    "¡Hola, [Nombre]! Eres un gran programador."

lista = ["nombre 1","nombre 2","nombre 3", "nombre 4", "nombre 5" ]

for i in range(0,len(lista)):
    print(f"El nombre de la lista es: {lista[i]}")

