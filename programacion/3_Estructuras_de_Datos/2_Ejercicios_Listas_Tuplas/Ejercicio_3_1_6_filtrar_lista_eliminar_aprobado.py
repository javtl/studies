# Escribir un programa que almacene las asignaturas de un curso (por ejemplo
# Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la
# nota que ha sacado en cada asignatura y elimine de la lista las asignaturas aprobadas. Al
# final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que
# repetir. Usa subprogramas cuando consideres de forma justificada. Intenta controlar los
# posibles errores.

def pedir_nota(asignatura):
    """Pide la nota y valida que sea un número entre 0 y 10."""
    while True:
        try:
            nota = float(input(f"¿Qué nota sacaste en {asignatura}?: "))
            if 0 <= nota <= 10:
                return nota
            print("Error: La nota debe estar entre 0 y 10.")
        except ValueError:
            print("Error: Introduce un número válido.")

def limpiar_aprobados(lista_materias):
    """Elimina las materias aprobadas (nota >= 5)."""
    # TRUCO DE EXAMEN: Recorremos la lista AL REVÉS para que al borrar
    # un elemento, los índices de los que quedan por revisar no cambien.
    for i in range(len(lista_materias) - 1, -1, -1):
        nota = pedir_nota(lista_materias[i])
        if nota >= 5:
            lista_materias.pop(i) # Borramos por índice

# --- PROGRAMA PRINCIPAL ---
asignaturas = ["Matemáticas", "Física", "Química", "Historia", "Lengua"]

print("--- Control de Notas ---")
limpiar_aprobados(asignaturas)

if not asignaturas:
    print("\n¡Felicidades! Has aprobado todo.")
else:
    print(f"\nDebes repetir estas asignaturas: {asignaturas}")
