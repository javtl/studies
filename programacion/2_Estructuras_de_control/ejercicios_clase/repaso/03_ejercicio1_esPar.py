'''
Ejercicio 1: Nueva Función
Tema principal: Funciones en Python (Argumentos y Retorno). Tipo: Nuevo concepto.
Crea una función en Python llamada es_par que acepte un único argumento entero (numero). La función debe devolver True si el número es par y False si es impar.
Pista: Recuerda cómo verificar si un número es divisible por 2 sin dejar resto. El operador módulo (%) será tu amigo aquí.
'''

def es_par(numero) :
  return numero % 2 == 0