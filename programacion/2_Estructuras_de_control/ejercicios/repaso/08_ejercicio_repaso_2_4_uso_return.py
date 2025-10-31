import math

def calcular_db(senal,ruido) :
    relacion = senal / ruido
    db = 10 * math.log10(relacion)
    return db

valor_db = calcular_db(9,10)
print(f"El valor calculado es: {valor_db}")