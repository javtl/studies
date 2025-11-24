'''
Ejercicio ID: 027_break_contrasena.py
    Tema Principal: Bucle while y break
    Subtema: Salida anticipada de un bucle
    Indicación: Uso de un bucle infinito que solo se detiene con una condición interna.
Enunciado:
Crea un programa que pida repetidamente una contraseña al usuario hasta que ingrese la correcta.
    Define una variable constante para la contraseña correcta (ej: "secreto123").
    Usa un bucle while True (bucle infinito controlado internamente).
    Dentro del bucle:
        Pide al usuario que ingrese la contraseña.
        Usa una estructura if para comprobar si la entrada coincide con la contraseña correcta.
        Si coinciden, usa la palabra clave break para salir inmediatamente del bucle.
    Fuera del bucle, imprime un mensaje de éxito: "¡Bienvenido al sistema!".
'''
PASSWORD = "secreto123"

password_check = input("Ingrese una contraseña: ")

while password_check != PASSWORD :
    print("Contraseña incorrecta. Inténtalo de nuevo.")
    password_check = input("Ingrese otra contraseña: ")

print("¡Bienvenido al sistema!")