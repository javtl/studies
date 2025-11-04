#Ejercicio 15: Crea un subprograma que reciba una nota decimal y devuelva si está suspenso, 
#aprobado, notable o sobresaliente.

def nota(nota):
    if nota >= 5:
        return "Esta aprobado"
    elif nota >=7 :
        return "Notable"
    elif nota >= 9:
        return "Sobresaliente"
    