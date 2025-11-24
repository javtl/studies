'''
Ejercicio ID: 013_login_simple.py

    Tema Principal: Fundamentos de Python

    Subtema: Operadores Lógicos (and).

    Indicación: Uso de múltiples condiciones en una sola estructura if.

Enunciado:

Crea un programa para simular un inicio de sesión simple que requiere que ambas credenciales sean correctas:
    Define una variable constante para el usuario válido (ej: "admin") y otra para la contraseña válida (ej: "1234").
    Pide al usuario que ingrese su nombre de usuario.
    Pide al usuario que ingrese su contraseña.
    Utiliza la estructura if/else y el operador lógico and para verificar si ambos valores ingresados coinciden con las credenciales válidas.
    Si el usuario y la contraseña son ambos correctos, imprime: "Acceso concedido. ¡Bienvenido, administrador!".
    En cualquier otro caso (si uno o ambos son incorrectos), imprime: "Acceso denegado. Credenciales incorrectas."
'''

ADMIN = "admin"
PASSWORD = "1234"

usuario = input("Ingrese su nombre de usuario: ")
contrasena = input("Ingrese su contraseña: ")

if usuario == ADMIN and contrasena == PASSWORD :
    print("Acceso concedido. ¡Bienvenido, administrador!")
else :
    print("Acceso denegado. Credenciales incorrectas.")