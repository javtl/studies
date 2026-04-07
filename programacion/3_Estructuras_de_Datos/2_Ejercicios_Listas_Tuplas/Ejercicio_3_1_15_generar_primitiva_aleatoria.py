# Genera una combinación válida para una apuesta de la lotería primitiva.

import random

def generar_apuesta_primitiva():
    # 1. Elegimos 6 números únicos entre 1 y 49
    # random.sample(rango, cantidad) -> NO repite elementos
    numeros = random.sample(range(1, 50), 6)

    # 2. Ordenamos para que parezca un boleto real
    numeros.sort()

    # 3. El reintegro es un solo número del 0 al 9
    reintegro = random.randint(0, 9)
    
    # 4. Formateo pro: Usamos .join() para quitar los corchetes [ ]
    numeros_bonitos = ", ".join(map(str, numeros))

    print("--- TU COMBINACIÓN GANADORA ---")
    print(f"Números: {numeros_bonitos}")
    print(f"Reintegro: {reintegro}")
    print("-------------------------------")

generar_apuesta_primitiva()