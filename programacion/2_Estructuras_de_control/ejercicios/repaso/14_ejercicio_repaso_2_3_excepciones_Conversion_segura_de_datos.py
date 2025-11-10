'''
Este es el uso más común: asegurar que el input del usuario es del tipo que esperas. Si el usuario ingresa texto cuando esperas un número, 
la función int() o float() lanzará un ValueError.
'''
# Intenta pedir un número y convertirlo
try :
    edad = int(input("Ingrese su edad(número entero): "))
    print(f"Su edad es: {edad}")

# Si la conversión falla
except ValueError :
    print("❌ Error: El valor ingresado no es un número entero válido.")

