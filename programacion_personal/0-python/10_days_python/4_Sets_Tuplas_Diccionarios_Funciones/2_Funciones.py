# Calculadora de Impuestos Cripto (Funciones):
# Crea una función llamada calcular_impuestos que reciba dos parámetros: monto y porcentaje (con un valor por defecto de 21).
# La función debe retornar el monto del impuesto calculado.
#  Llama a la función dos veces: una pasando solo el monto (usará el 21%) y otra pasando el monto y un impuesto del 10%.
# Imprime ambos resultados con 2 decimales.
# Tema principal: Estructuras de Datos Pro y Funciones.
# Subtema: Sets, Dicts, Argumentos por defecto.
# Estado: Nuevo concepto / Integración lógica.

def calcular_impuestos(monto, porcentaje = 21):
    impuestos = monto * (porcentaje / 100)

    return impuestos

ej_1 = calcular_impuestos(2000)
ej_2 = calcular_impuestos(2000,10)

print(ej_1)
print(ej_2)