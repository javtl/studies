'''
Ejercicio ID: 009_incremento_decremento.py
    Tema Principal: Fundamentos de Python
    Subtema: Operadores de Asignación Aumentada (+=, -=).
    Referencia: Este concepto reduce la verbosidad de código como x = x + 10.
    Indicación: Eficiencia en el código.
Enunciado:
Crea un programa para simular un contador simple usando la sintaxis eficiente de Python:
    Crea una variable llamada contador e inicialízala con el valor entero 0.
    Utiliza el operador de asignación aumentada (+=) para incrementar el valor de contador en 5.
    Imprime el valor actual de contador.
    Luego, utiliza el operador de asignación disminuida (-=) para decrementar el valor de contador en 2.
    Imprime el valor final de contador.
'''

contador = 0

for contador in range(0 , 5) :
    print(contador)

contador -= 2
print (contador)
