'''
Ejercicio ID: 036_funcion_es_primo.py
    Tema Principal: Funciones (Lógica compleja)
    Subtema: Integración de bucles y condicionales para retornar un booleano.
    Indicación: Uso de la definición matemática de un número primo dentro de una función.
Enunciado:
Define una función booleana que verifique si un número es primo.
    Define una función llamada es_primo que acepte un número entero positivo num.
    La función debe retornar True si el número es primo, y False en caso contrario.
    Lógica de Primo: Un número es primo si es mayor que 1 y solo es divisible por 1 y por sí mismo.
    Implementa la lógica usando un bucle for que verifique la divisibilidad de num por todos los números desde 2 hasta n−1. Si encuentras un divisor, el número no es primo.
    Asegúrate de manejar el caso especial de los números menores o iguales a 1 (que no son primos).
Ejemplo:
    es_primo(7) debe retornar True.
    es_primo(9) debe retornar False (porque 9÷3=3).
'''

def es_primo(numero) :
    # 1. Manejar casos especiales (0, 1, negativos)
    if numero <= 1 :
        return False

    # 2. Iterar desde 2 hasta numero - 1
    for n in range(2,numero) :
        if numero % n == 0:
            return False
        
    # 3. Si el bucle terminó SIN encontrar NINGÚN divisor, entonces SÍ es primo
    return True
        
