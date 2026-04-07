# Solicitar al usuario que introduzca los nombres de pila de los alumnos de primaria de 
# una escuela, finalizando cuando se introduzca “x”. A continuación, solicitar que 
# introduzca los nombres de los alumnos de secundaria, finalizando al introducir “x”.

# Mostrar los nombres de todos los alumnos de primaria y los de secundaria, sin 
# repeticiones.
# Mostrar qué nombres se repiten entre los alumnos de primaria y secundaria.
# Mostrar qué nombres de primaria no se repiten en los de nivel secundaria.
# Mostrar si todos los nombres de primaria están incluidos en secundaria.

def gestionar_alumnos():
    
    primaria = set()
    print("Introduce los nombres de Primaria (escribe 'x' para terminar):")
    while True:
        nombre = input("> ").strip().lower()
        if nombre == 'x':
            break
        primaria.add(nombre)

    
    secundaria = set()
    print("\nIntroduce los nombres de Secundaria (escribe 'x' para terminar):")
    while True:
        nombre = input("> ").strip().lower()
        if nombre == 'x':
            break
        secundaria.add(nombre)

    print("\n" + "="*30)

    

    
    todos_los_nombres = primaria.union(secundaria)
    print(f"1. Todos los nombres (sin repetir): {todos_los_nombres}")

    
    nombres_comunes = primaria.intersection(secundaria)
    print(f"2. Nombres que se repiten en ambos niveles: {nombres_comunes}")

    
    solo_primaria = primaria.difference(secundaria)
    print(f"3. Nombres de primaria que NO están en secundaria: {solo_primaria}")

    
    están_todos = primaria.issubset(secundaria)
    if están_todos:
        print("4. ¿Todos los nombres de primaria están en secundaria? Sí.")
    else:
        print("4. ¿Todos los nombres de primaria están en secundaria? No.")


gestionar_alumnos()