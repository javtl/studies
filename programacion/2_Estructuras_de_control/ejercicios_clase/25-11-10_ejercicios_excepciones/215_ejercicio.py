# Para tributar un determinado impuesto se debe ser mayor de 16 años 
# y tener unos ingresos iguales o superiores a 1000 € mensuales. 
# Escribir un programa que pregunte al usuario su edad y sus ingresos 
# mensuales y muestre por pantalla si el usuario tiene que tributar o no

def edad_tributar(edad):
    if edad < 16 or edad > 150 :
        raise NameError("Edad no válida")
    elif edad >= 16 :
        return True
    else:
        return False

def ingresos_tributar(ingresos):
    if ingresos < 0 :
        raise NameError("INGRESOS NEGATIVOS")
    elif ingresos >= 1000 :
        return True
    



try :
    edad = int(input("Ingrese su edad: "))
    ingresos = float(input("Ingrese sus ingresos: "))

    if edad_tributar(edad) and ingresos_tributar(ingresos):
        print("Pagar")
    else:
        print("No pagas")
except ValueError:
    print("Valor númerico no valido")