# Diseña un algoritmo en el que, dadas tres
# personas, por ejemplo Pedro, Alicia y Carla,
# indique quiénes son de la misma quinta.

def verificar_quinta():
    """
    Docstring for verificar_quinta
    Pide el año de nacimiento de 3 personas 
    y verifica si han nacido en el mismo año
    """
    NOMBRES = ["Pedro", "Alicia", "Carla"]
    
    
    a_nacimiento = {}

    try:
        # 1. Petición de datos y manejo de excepciones
        print("Por favor, introduce el año de nacimiento (ej. 1990):")
        
        # Recopilamos los años para cada persona
        for nombre in NOMBRES:
            a_str = input(f"Año de nacimiento de {nombre}: ")
            
            # Intentamos convertir a entero y almacenar. Si falla, el 'except' lo captura
            a_nacimiento[nombre] = int(a_str)
            
    except ValueError:
        print("ERROR: Debes introducir un año válido (número entero).")
        return 
    except Exception as e:
        print(f"ERROR inesperado: {e}")
        return

    # Extraemos los años para hacer las comparaciones más limpias
    a_pedro = a_nacimiento["Pedro"]
    a_alicia = a_nacimiento["Alicia"]
    a_carla = a_nacimiento["Carla"]

    
    
    
    
    
    if a_pedro == a_alicia and a_alicia == a_carla:
        print("¡**Pedro, Alicia y Carla** son de la misma quinta!")
    
    
    elif a_pedro == a_alicia:
        print(f"**Pedro y Alicia** son de la misma quinta (nacidos en {a_pedro}).")
        print(f"Carla (nacida en {a_carla}) es de una quinta diferente.")
        
    elif a_pedro == a_carla:
        print(f"Pedro y Carla son de la misma quinta (nacidos en {a_pedro}).")
        print(f"Alicia (nacida en {a_alicia}) es de una quinta diferente.")
        
    elif a_alicia == a_carla:
        print(f"**Alicia y Carla** son de la misma quinta (nacidas en {a_alicia}).")
        print(f"Pedro (nacido en {a_pedro}) es de una quinta diferente.")
        
    
    else:
        print("Ninguna de las personas es de la misma quinta.")
        print(f"Años: Pedro ({a_pedro}), Alicia ({a_alicia}), Carla ({a_carla}).")


verificar_quinta()