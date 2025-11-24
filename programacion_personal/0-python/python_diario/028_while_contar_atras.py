'''
Ejercicio ID: 028_while_contar_atras.py
    Tema Principal: Bucle while (Básico)
    Subtema: Control de iteración con variable contadora
    Indicación: Uso del while para ejecutar una secuencia finita y decreciente.
Enunciado:
Escribe un programa que use un bucle while para realizar una cuenta regresiva desde 5 hasta 1 (ambos incluidos).
    Inicializa una variable llamada cuenta_regresiva con el valor 5.
    Establece el bucle while para que se repita mientras cuenta_regresiva sea mayor o igual a 1 (cuenta_regresiva >= 1).
    Dentro del bucle:
        Imprime el valor actual de cuenta_regresiva.
        Decrementa la variable cuenta_regresiva en 1 (usa -= 1).
    Fuera del bucle, imprime el mensaje: "¡Despegue!".
'''

cuenta_regresiva = 5

while cuenta_regresiva >= 1 :
    print(f"El valor de la cuenta regresiva es: {cuenta_regresiva}")
    cuenta_regresiva -= 1

print("Despegue!")
