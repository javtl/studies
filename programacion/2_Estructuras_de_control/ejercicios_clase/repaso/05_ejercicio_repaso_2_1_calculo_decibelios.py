import math 

def calculo_decibelios(int_senal,int_ruido) :
    relacion = int_senal / int_ruido
    decibelios = 10 * math.log10(relacion)
    return decibelios