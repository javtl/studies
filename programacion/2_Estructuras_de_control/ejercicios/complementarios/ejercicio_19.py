# Escribe un programa que pida por teclado un día de la semana 
# y que diga qué asignatura toca a
# primera hora ese día

def mostrar_asignatura_primera_hora():
    """
    Pide un día de la semana al usuario y muestra la asignatura que toca
    a primera hora ese día, manejando posibles errores de entrada.
    """
    
    # Definimos el horario de ejemplo (puedes cambiarlo)
    HORARIO = {
        "lunes": "PROGRAMACIÓN",
        "martes": "LIBRE",
        "miércoles": "BASE DE DATOS",
        "jueves": "LIBRE",
        "viernes": "LIBRE"
    }

    try:
        # 1. Petición de entrada al usuario
        dia_ingresado = input("Introduce un día de la semana (Lunes a Viernes): ")
        
        # Convertimos la entrada a minúsculas y eliminamos espacios extra (para robustez)
        dia = dia_ingresado.lower()

        # 2. Uso de condicionales
        if dia == "lunes":
            asignatura = HORARIO["lunes"]
        elif dia == "martes":
            asignatura = HORARIO["martes"]
        elif dia == "miércoles" or dia == "miercoles":
            # Incluimos la opción con y sin tilde 
            asignatura = HORARIO["miércoles"]
        elif dia == "jueves":
            asignatura = HORARIO["jueves"]
        elif dia == "viernes":
            asignatura = HORARIO["viernes"]
        elif dia == "sábado" or dia == "domingo":
            # Condición especial para el fin de semana
            asignatura = "¡Fin de semana! Hoy no hay clases a primera hora."
        else:
            # Condición por defecto para entradas no válidas
            asignatura = "Día no reconocido. Por favor, introduce un día válido (Lunes a Viernes)."
        
        # 3. Impresión del resultado
        print(f"La asignatura de primera hora del {dia_ingresado} es: **{asignatura}**")
        
    except Exception as e:
        # Manejo de Excepciones (try/except) simple para cualquier error inesperado
        print(f"Ocurrió un ERROR: {e}")

# Llamada a la función para ejecutar el programa
mostrar_asignatura_primera_hora()

