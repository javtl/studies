# Realiza la documentación del proyecto calculadora, donde se indicaba con un 
# menú la opción de sumar, restar, multiplicar, dividir... a través de funciones. 

# Definición de Funciones Básicas 

def sumar(n1, n2):
    """Suma dos números."""
    return n1 + n2

def restar(n1, n2):
    """Resta dos números."""
    return n1 - n2

def multiplicar(n1, n2):
    """Multiplica dos números."""
    return n1 * n2

def dividir(n1, n2):
    """Divide dos números, verificando que el divisor no sea cero."""
    if n2 == 0:
        return "¡Error! No se puede dividir por cero."
    else:
        
        return n1 / n2

# Función del Menú Principal 

def calculadora():
    """Función principal que ejecuta el menú de la calculadora"""
    
    print("Selecciona una operación:")
    print("1. Sumar (+)")
    print("2. Restar (-)")
    print("3. Multiplicar (*)")
    print("4. Dividir (/)")
    print("5. Salir")
    print("---------------------------------------------")
    
    opcion = input("Introduce tu opción: ")

    # Si el usuario elige salir
    if opcion == '5':
        print("¡Adiós!")
        
    # Verificamos si la opción es válida para una operación
    elif opcion in ('1', '2', '3', '4'):
        try:
            # Pedimos los dos números al usuario
            num1 = float(input("Introduce el primer número: "))
            num2 = float(input("Introduce el segundo número: "))
        except ValueError:
            # Si el usuario no introduce un número
            print("Entrada inválida. Por favor, introduce solo números.")
            return # Terminamos la función y el programa
        
        # Realizamos la operación según la opción elegida
        
        if opcion == '1':
            # Llamamos a la función 'sumar'
            resultado = sumar(num1, num2)
            operacion = "+"
            
        elif opcion == '2':
            # Llamamos a la función 'restar'
            resultado = restar(num1, num2)
            operacion = "-"
            
        elif opcion == '3':
            # Llamamos a la función 'multiplicar'
            resultado = multiplicar(num1, num2)
            operacion = "x"
            
        elif opcion == '4':
            # Llamamos a la función 'dividir'
            resultado = dividir(num1, num2)
            operacion = "/"
        
        # Imprimimos el resultado 
        print(f"Operación: {num1} {operacion} {num2}")
        print(f"El resultado es: {resultado}")
            
    else:
        # Si el usuario introduce algo que no está en el menú
        print("Opción no válida. Debes elegir un número del 1 al 5.")

# Llamada a la Función Principal para que el programa inicie 

calculadora()