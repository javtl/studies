#-------------------- Clase de Código: `BuscadorPersonas` --------------------
# Archivo: ejercicios-repaso/buscador_personas.py

def buscar_persona():
    """Busca una persona en una lista de diccionarios y muestra sus datos."""
    personas = [
        {"nombre": "Ana", "edad": 25, "ciudad": "Madrid"},
        {"nombre": "Luis", "edad": 30, "ciudad": "Barcelona"},
        {"nombre": "María", "edad": 22, "ciudad": "Sevilla"}
    ]

    nombre_buscado = input("Ingresa el nombre de la persona que quieres buscar: ")
    encontrado = False

    for persona in personas:
        if persona["nombre"].lower() == nombre_buscado.lower():
            print("\nPersona encontrada:")
            print(f"Nombre: {persona['nombre']}, Edad: {persona['edad']}, Ciudad: {persona['ciudad']}")
            encontrado = True
            break

    if not encontrado:
        print("\nNo se ha encontrado ninguna persona con ese nombre.")
