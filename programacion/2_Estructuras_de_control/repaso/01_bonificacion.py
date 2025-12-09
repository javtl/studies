# En una empresa, la puntuación de rendimiento de los empleados determina su nivel y la bonificación que recibirán. 
# La bonificación base es de 2.400€, multiplicada por la puntuación del nivel.
# inaceptable 0.0
# aceptable 0.4 
# meritorio 0.6 o más
BASE = 2400

puntuacion = float(input("ingrese la puntuación para calcular la bonificación: "))
def calcular_rendimiento (puntuacion):
    """
    Calcula la bonificación basada en la puntuación ingresada
    Args:
    puntuación empleado (0.0, 0.4 o >= 0.6)
    Returns:
    Devuelve el nivel de rendimiento y la bonificación
    """
    if puntuacion == 0.0:
        nivel = "Inaceptable"
        bonificaion = 0.0
    elif puntuacion == 0.4:
        nivel = "Aceptable"
        bonificacion = 0.4
    elif puntuacion >= 0.6:
        nivel = "Meritorio"
        bonificacion = 0.6
    else:
        return "ERROR, ingrese una puntuación válida."

    bonus = BASE*bonificacion

    return f"Su rendimiento ha sido: {nivel}, recibe una bonificación de: {bonus}€"

