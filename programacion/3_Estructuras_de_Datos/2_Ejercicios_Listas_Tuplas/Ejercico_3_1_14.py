import random

def generar_apuesta_primitiva():
    
    numeros = random.sample(range(1, 50), 6)

    numeros.sort()

    reintegro = random.randint(0, 9)
    
    print("--- TU COMBINACIÓN DE LA PRIMITIVA ---")
    print(f"Números: {numeros}")
    print(f"Reintegro: {reintegro}")
    print("--------------------------------------")


generar_apuesta_primitiva()