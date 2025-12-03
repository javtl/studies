#  Escribe un programa que dada una hora determinada (horas y minutos),
# calcule los segundos que faltan para llegar a la medianoche. 

def calcular_segundos():
    """
    Docstring for calcular_segundos_para_medianoche
    Calcula los segundos que faltan para la próxima medianoche, 
    con horas y minutos) ingresados
    """
    try:
        # 1. Petición y conversión de datos
        horas_str = input("Introduce la hora (0 a 23): ")
        minutos_str = input("Introduce los minutos (0 a 59): ")
        
        horas = int(horas_str)
        minutos = int(minutos_str)
        
        # 2. Validación de rangos 
        if horas < 0 or horas > 23 or minutos < 0 or minutos > 59:
            print("Error: La hora debe estar entre 0 y 23, y los minutos entre 0 y 59.")
            return

        # 3. Cálculo: Segundos transcurridos desde la medianoche (00:00:00)
        segundos_horas = horas * 3600  # 1 hora = 3600 segundos
        segundos_minutos = minutos * 60   # 1 minuto = 60 segundos
        segundos_transcurridos = segundos_horas + segundos_minutos
        
        # 4. Total de segundos en un día
        
        TOTAL_SEGUNDOS_DIA = 24 * 3600 
        
        # 5.Cálculo Segundos
        segundos_restantes = TOTAL_SEGUNDOS_DIA - segundos_transcurridos
        
        # 6. resultados
        print(f"La hora introducida es: {horas}:{minutos}")
        print(f"Faltan **{segundos_restantes}** segundos para la medianoche.")

    # 7. Manejo de Excepciones (Try/Except)
    except ValueError:
        
        print("Error: Debes introducir números enteros válidos para horas y minutos.")
    except Exception as e:
        
        print(f"Ocurrió un error inesperado: {e}")


calcular_segundos()