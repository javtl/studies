'''
Ejercicio 2: Refuerzo/Ampliación
Tema principal: Funciones en Python (Parámetros por Defecto). Tipo: Nuevo concepto/Ampliación.
Modifica el concepto anterior o crea una nueva función. Diseña una función llamada saludar_usuario que acepte dos argumentos: nombre (obligatorio) y idioma (opcional, con un valor por defecto de "ES").
    Si idioma es "ES", debe devolver: "Hola, [nombre]".
    Si idioma es "EN", debe devolver: "Hello, [nombre]".
Pista: Para hacer un parámetro opcional en Python, asígnale un valor directamente en la definición de la función (e.g., parametro=valor_por_defecto).
'''

def saludar_usuario (nombre, idioma): 
    if idioma == "ES" :
        print(f"Hello {nombre}")
    elif idioma == "EN" :
        print(f"Hello {nombre}")
    else :
        return f"saludo no registrado para el idioma: {idioma}"