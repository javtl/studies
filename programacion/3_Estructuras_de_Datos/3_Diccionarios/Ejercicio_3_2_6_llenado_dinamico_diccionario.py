# Escribir un programa que cree un diccionario vacío y lo vaya llenado con información 
# sobre una persona (por ejemplo, nombre, edad, sexo, teléfono, correo electrónico, etc.) 
# que se le pida al usuario. Cada vez que se añada un nuevo dato debe imprimirse el 
# contenido del diccionario

# 1. Lista con las llaves que queremos pedir
claves_a_pedir = ["nombre", "edad", "sexo", "teléfono", "correo electrónico"]

# 2. Creamos el diccionario VACÍO donde guardaremos todo
persona = {}

# 3. Recorremos la lista de preguntas
for clave in claves_a_pedir:
    valor = input(f"Introduzca su {clave}: ")
    
    # GUARDAR: nombre_diccionario[llave] = valor
    persona[clave] = valor

    # Imprimimos cómo va quedando el diccionario en cada paso
    print(f"Estado actual: {persona}")

print("\n--- Registro Completado ---")
print(persona)