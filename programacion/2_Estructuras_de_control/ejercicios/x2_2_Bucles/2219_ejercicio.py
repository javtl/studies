#Mostrar un menú con tres opciones: 1- comenzar programa, 2- imprimir listado, 3-
# finalizar programa. A continuación, el usuario debe poder seleccionar una opción (1, 2 ó 3).
#  Si elige una opción incorrecta, informarle del error. El menú se debe volver a 
# mostrar luego de ejecutada cada opción, permitiendo volver a elegir. Si elige las 
# opciones 1 ó 2 se imprimirá un texto. Si elige la opción 3, se interrumpirá la impresión 
# del menú y el programa finalizará.

def mostrar_menu():
    
    print("\n--- MENÚ PRINCIPAL ---")
    print("1 - Comenzar programa")
    print("2 - Imprimir listado")
    print("3 - Finalizar programa")
    print("----------------------")

def ejecutar_menu():
    
    opcion = 0 

    while opcion != 3:
        mostrar_menu()
        
        try:
            opcion_str = input("Seleccione una opción (1, 2 ó 3): ")
            opcion = int(opcion_str)
           
            if opcion == 1:
                print("[Opción 1]: El programa ha comenzado su ejecución.")
            elif opcion == 2:
                print("[Opción 2]: Imprimiendo listado de elementos...")
            elif opcion == 3:
                print("[Opción 3]: Programa finalizado. ¡Hasta luego!")
            else:
                
                print("Error: Opción incorrecta. Por favor, elija 1, 2 ó 3.")

        except ValueError:
            
            print("Error: Por favor, ingrese un número entero (1, 2 ó 3).")


ejecutar_menu()