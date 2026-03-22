

def generar_secuencia(longuitud, multiplo) :
    lista_resultado = []
    for numero in range(1, longuitud + 1) : 
        if numero % multiplo == 0 :
            lista_resultado.append(numero)

    return lista_resultado