'''
Ejercicio ID: 038_funcion_ambito.py
    Tema Principal: Ámbito (Global/Local)
    Subtema: Diferencia entre variables locales y globales
    Indicación: Demostrar cómo una variable definida dentro de una función es diferente de una variable definida fuera.
Enunciado:
Crea un programa para ilustrar los ámbitos global y local:
    Define una variable global llamada mensaje e inicialízala con el valor "Soy Global".
    Define una función llamada mostrar_ambitos.
    Dentro de esta función:
        Define una nueva variable local (con el mismo nombre) llamada mensaje e inicialízala con el valor "Soy Local".
        Imprime el valor de mensaje (este será el valor local).
    Fuera de la función:
        Llama a la función mostrar_ambitos().
        Después de la llamada, imprime el valor de la variable mensaje global (el valor original).
'''

mensaje = "soy global"
def mostrar_ambitos():
    mensaje = "Soy local"

    print(f"Dentro de la funcion: {mensaje}")

mostrar_ambitos()
print(f"Fuera de la funcion: {mensaje}")