#-------------------- Clase de Código: `RelacionNumeros` --------------------
# Archivo: ejercicios-repaso/relacion_numeros.py

def determinar_relacion():
    """Determina si dos números son iguales, o si uno es mayor que el otro."""
    num1 = int(input("Introduce el primer número: "))
    num2 = int(input("Introduce el segundo número: "))

    if num1 == num2:
        print(f"El número {num1} es igual al número {num2}")
    elif num1 > num2:
        print(f"{num1} es mayor que {num2}")
    else:
        print(f"{num2} es mayor que {num1}")
