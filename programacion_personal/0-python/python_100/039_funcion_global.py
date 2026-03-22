'''
Ejercicio ID: 039_funcion_global.py
    Tema Principal: Ámbito
    Subtema: Palabra clave global
    Indicación: Demostrar cómo una función puede alterar el valor de una variable que no le pertenece.
Enunciado:
Crea un programa para rastrear un contador que es modificado por una función:
    Define una variable global llamada conteo_global e inicialízala en 0.
    Define una función llamada incrementar_contador.
    Dentro de la función, usa la palabra clave global conteo_global para indicar que vas a modificar la variable global con ese nombre.
    Incrementa el valor de conteo_global en 3 (usando += 3).
    Fuera de la función:
        Imprime el valor de conteo_global antes de la llamada (debería ser 0).
        Llama a la función incrementar_contador() dos veces.
        Imprime el valor de conteo_global después de las llamadas (debería ser 6).
'''

conteo_global = 0

def incrementar_contador(incremento= 3) :
    global conteo_global 
    conteo_global += incremento

print(conteo_global)

incrementar_contador()
incrementar_contador()

print(conteo_global)
