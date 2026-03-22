'''
006_division_y_modulo.py

    Tema Principal: Fundamentos de Python
    Subtema: Operadores Aritméticos: División Entera (//) y Módulo (%).
    Indicación: Concepto Clave. Nuevo paso en la dificultad.
    Enunciado:

    Escribe un programa que pida al usuario dos números enteros positivos (dividendo y divisor) y muestre los dos resultados clave de la división entera:
    Calcula e imprime el cociente entero (la cantidad de veces que el divisor cabe en el dividendo, sin decimales) utilizando el operador de División Entera (//).
    Calcula e imprime el resto de la división (lo que "sobra" de la operación) utilizando el operador de Módulo (%).
        Ejemplo de Salida Esperada:
        Si el usuario ingresa 17 (dividendo) y 5 (divisor), la salida debería ser:
        El cociente entero de la división es: 3
        El resto de la división (Módulo) es: 2
'''

dividendo = int(input("Ingresa el dividendo: "))
divisor = int(input("Ingresa el divisor: "))

division_entera = dividendo // divisor 
division_modulo = dividendo % divisor 

print(f"El Resultado de la división es: {division_entera}")
print(f"El módulo de la división ó resto es: {division_modulo}")