'''
Ejercicio ID: 022_suma_n_primeros.py
    Tema Principal: Bucle for
    Subtema: Uso de una variable acumuladora
    Indicación: Concepto clave para calcular totales, promedios o contadores complejos.
Enunciado:
Escribe un programa que calcule la suma total de todos los números enteros desde el 1 hasta el 10 (ambos incluidos).
    Inicializa una variable llamada suma_total a cero (0) antes de comenzar el bucle.
    Usa un bucle for con range() para iterar sobre los números del 1 al 10.
    Dentro del bucle, acumula (suma) cada número a la variable suma_total utilizando un operador de asignación aumentada (visto en el ejercicio 009).
    Al finalizar el bucle, imprime el valor final de suma_total.
'''
suma_total = 0
for i in range (1,10) :
    suma_total = suma_total + 1
    print(suma_total)

print(f"La suma total de 1 hasta 10 es: {suma_total}")