'''
Calculadora de Índice de Masa Corporal (IMC) con Validación

Objetivo: Crear una función robusta que calcule el IMC, maneje la lógica condicional y capture errores básicos de entrada.

    Define una función llamada calcular_imc(peso, altura) que reciba el peso (en kg) y la altura (en metros).

    Implementa la fórmula del IMC: IMC=altura2peso​.

    Dentro de la función, utiliza una estructura try/except para manejar dos posibles errores:

        TypeError o ValueError: Si el usuario intenta pasar valores que no son numéricos (e.g., cadenas de texto). En este caso, la función debe devolver un mensaje claro indicando que se requieren valores numéricos.

        ZeroDivisionError: Si la altura es 0. La función debe devolver un mensaje apropiado.

    Si el cálculo es exitoso, usa estructuras if/elif/else para clasificar el IMC y devolver una tupla con el valor del IMC y su clasificación.

        Ejemplo de Clasificación: <18.5 (Bajo peso), 18.5−24.9 (Normal), ≥25 (Sobrepeso).
'''
def calcular_imc(peso,altura) :

    

    
    if peso <= 0 or altura <= 0 :
        return "Error: Los valores deben ser positivos."
    else: 
        imc = peso / (altura ** 2)
    
    if imc < 18.5:
        tipo = "Bajo peso"
    elif imc < 24.9 :
        tipo = " 24.9 Normal"
    else :
        tipo = "Sobrepeso"

    return imc, tipo
