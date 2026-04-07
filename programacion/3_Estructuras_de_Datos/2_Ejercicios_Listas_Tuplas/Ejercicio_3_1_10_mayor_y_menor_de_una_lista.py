# Escribir un programa que almacene en una lista los siguientes precios: 50, 75, 46,
# 22, 80, 65, 8 y muestre por pantalla el menor y el mayor de los precios.

precios = [50, 75, 46, 22, 80, 65, 8]

# --- OPCIÓN A: Usando funciones integradas (La más rápida) ---
menor = min(precios)
mayor = max(precios)

print(f"El precio menor es: {menor}")
print(f"El precio mayor es: {mayor}")

# --- OPCIÓN B: Tu método (Corregido) ---
precios_ordenados = sorted(precios)
# El primero (índice 0) es el MENOR
# El último (índice -1) es el MAYOR
print(f"Ordenados: {precios_ordenados[0]} es el mínimo y {precios_ordenados[-1]} el máximo")