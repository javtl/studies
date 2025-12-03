# Realiza un programa que pida una hora por teclado y que muestre luego buenos días,
# buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de
# 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por
# teclado.

def saludar_hora():
    """
    Docstring for saludar_hota
    Pide una hora y devuelve un saludo según el tramo horario
    """
    try:
        # 1. Entrada de datos
        hora_str = input("Introduce la hora (número entero, de 0 a 23): ")
        
        # Convertimos la entrada a un número entero. Aquí puede saltar un ValueError
        hora = int(hora_str) 

        # 2. Validación de la hora 
        if hora < 0 or hora > 23:
            # Condición para horas fuera del rango de 24 horas
            saludo = " Error: La hora debe ser un número entre 0 y 23."
            
        # 3. Lógica de los Tramos (Condicionales if/elif/else)
        # Tramos: 6 a 12 -> 
        elif hora >= 6 and hora <= 12:
            saludo = "¡Buenos días!"
            
        # Tramos: 13 a 20 
        elif hora >= 13 and hora <= 20:
            saludo = "¡Buenas tardes!"
            
        # Tramos: 21 a 5 
        elif (hora >= 21 and hora <= 23) or (hora >= 0 and hora <= 5):
            saludo = "¡Buenas noches!"
            
        else:
            # Condición de seguridad, aunque la validación anterior debería cubrir todo
            saludo = "Error: Hora no válida."

        # 4. Impresión del resultado
        print(saludo)

    # 5. Manejo de Excepciones (Try/Except)
    except ValueError:
        
        print("Error: Debes introducir un número entero válido para la hora.")
    except Exception as e:
        
        print(f"Ocurrió un error inesperado: {e}")


saludar_hora()
