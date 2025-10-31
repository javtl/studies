#Dibuja un ordinograma de un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de edad” o el mensaje
#  de “eres menor de edad”.

edad = int(input("Ingrese su edad: "))

if edad >= 18:
    print("Usted es mayor de edad.")
else:
    print("Usted es menor de edad. ")