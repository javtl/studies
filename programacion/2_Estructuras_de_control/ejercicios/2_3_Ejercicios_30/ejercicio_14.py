# Ejercicio 14: Utilizando el ejercicio anterior, indica los divisores del número.

'''
# jercicio 13: Crea un subprogama que indique si un número es primo  o no lo es

def es_primo(numero) :

    if numero < 2 :
        return False
    for n in range (2,numero) :
        if numero % n == 0 :
            return False
        
    return True
'''

def es_divisor(numero) :

    divisores = [1,numero]
    for n in range (2,numero) :
        if numero % n == 0 :
            divisores.append(n)
    return divisores