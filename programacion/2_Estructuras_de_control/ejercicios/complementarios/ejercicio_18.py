# Escribe un programa que calcule el salario neto semanal de un trabajador en función del
# número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
# • Las primeras 35 horas se pagan a tarifa normal.
# • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
# • Las tasas de impuestos son:
# • Los primeros 500 euros son libres de impuestos.
# • Los siguientes 400 tienen un 25% de impuestos.
# • Los restantes un 45% de impuestos.
# Escribir nombre, salario bruto, tasas y salario neto.


def calcular_salario_semanal(horas: int, tarifa:float) :
    """
    

    Docstring for calcular_salario_semanal
    calcula el salario bruto semanal basado en las horas trabajadas y su tarifa
    - primeras 35 horas (tarifa normal)
    - a partir de 35 horas 1.5 tarifa normal

    :param horas: Description
    :type horas: int
    :param tarifa: Description
    :type tarifa: float
    """
    HORAS_TARIFA_NORMAL = 35
    TARIFA_EXTRA = 1.5

    if horas <= HORAS_TARIFA_NORMAL:
        salario_bruto = horas * tarifa
    else:
        horas_normales = HORAS_TARIFA_NORMAL
        horas_extra = horas - HORAS_TARIFA_NORMAL
        salario_normal = horas_normales * tarifa
        salario_extra = horas_extra * (tarifa * TARIFA_EXTRA)

        salario_bruto = salario_normal + salario_extra
    return salario_bruto

def calcular_impuesto(salario_bruto: float) -> float :
    """
    Docstring for calcular_impuestos
    Calcula el total de impuestos
    :param salario_bruto: Description
    :type salario_bruto: float
    :return: Description
    :rtype: float
    """
    impuesto_total = 0
    LIMITE_1 = 500
    LIMITE_2 = 900
    TASA_LIMITE_2 = 0.25
    if salario_bruto > LIMITE_1:
        base_limite_2 = salario_bruto - LIMITE_1
        impuesto_total  += base_limite_2 * TASA_LIMITE_2
        salario_bruto -= base_limite_2
    
    TASA_LIMITE_3 = 0.45

    if salario_bruto > LIMITE_2:
        salario_restante = salario_bruto -LIMITE_2
        impuesto_total += salario_restante * TASA_LIMITE_3
    return impuesto_total

def salario_semanal (nombre: str, horas: str, tarifa: str):
    """
    
    Docstring for salario_semanal
    Calcula el salario bruto, impuestos y el salario neto
    :param nombre: Description
    :type nombre: str
    :param horas: Description
    :type horas: str
    :param tarifa: Description
    :type tarifa: str
    """
    try:
        # Convertimos las entradas de texto (str) a números (float)
        horas_trabajadas = float(horas)
        tarifa_hora = float(tarifa)
    except ValueError:
        print("Error: Las horas y la tarifa deben ser valores numéricos válidos.")
        # Se detiene la función si hay error
        return 
    
    # Validaciones Condicionales
    if horas_trabajadas < 0 or tarifa_hora < 0:
        print("Error: Las horas y la tarifa no pueden ser números negativos.")
        return

    # 1. SALARIO BRUTO
    salario_bruto = calcular_salario_semanal(horas_trabajadas, tarifa_hora)
    
    # 2. IMPUESTOS
    impuesto_total = calcular_impuesto(salario_bruto)
    
    # 3. SALARIO NETO
    salario_neto = salario_bruto - impuesto_total