#-------------------- Clase de Código: `ComparadorNumeros` --------------------
# Archivo: ejercicios-repaso/comparador_numeros.py

def comparar_numeros():
    """Compara dos números ingresados por el usuario y determina cuál es mayor."""
    num1 = int(input("Introduce el primer número: "))
    num2 = int(input("Introduce el segundo número: "))

    if num1 > num2:
        print(f"{num1} es mayor que {num2}")
    else:
        print(f"{num2} es mayor que {num1}")