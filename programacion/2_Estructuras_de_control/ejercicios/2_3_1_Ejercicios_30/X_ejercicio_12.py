# Ejercicio 12: Calcula la solución de una ecuación de segundo grado contemplando las 
# diferentes condiciones de entrada que se puedan dar.

# ecuación de segundo grado es una ecuación polinómica de la forma : a*(x^2) + b*x + c = 0
import math

def ecuacion_segundo_grado(a,b,c) :

    a = 0
    while a == 0 :
        a = float(input("Ingrese otro numer0 (NO PUEDE SER 0):"))
    