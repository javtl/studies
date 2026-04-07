# Escribir un programa que pregunte al usuario los números ganadores de la lotería
# primitiva, los almacene en una lista y los muestre por pantalla ordenados de menor a
# mayor.

primitiva = []

# 1. Pedimos los 6 números
while len(primitiva) < 6:
    try:
        numero = int(input(f"Introduce el número {len(primitiva) + 1} (1-49): "))
        
        # Validación de rango y que no esté repetido (punto extra)
        if 1 <= numero <= 49:
            if numero not in primitiva:
                primitiva.append(numero)
            else:
                print("Ese número ya lo has puesto, ¡elige otro!")
        else:
            print("Número fuera de rango (debe ser entre 1 y 49).")
            
    except ValueError:
        print("Error: Por favor, introduce un número entero válido.")

# 2. ORDENAR la lista de menor a mayor
# El método .sort() modifica la lista ORIGINAL
primitiva.sort()

# 3. Mostrar el resultado
print(f"Los números ganadores ordenados son: {primitiva}")