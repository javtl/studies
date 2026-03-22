# El Bucle del Minero (Loops + Range): Simula un proceso de minería. 
# Usa un bucle for con range para contar del 1 al 10.
# En cada iteración, imprime: Minando bloque número X....
# Si el número es par, imprime: [BLOQUE PAR DETECTADO].
# Al finalizar el bucle, muestra un mensaje de: Minería completada: 10 bloques añadidos a la cadena.

for i in range(1,11):
    print(f"Minando Bloque Número [{i}]")
    if i % 2 == 0:
        print("[BLOQUE PAR DETECTADO]")