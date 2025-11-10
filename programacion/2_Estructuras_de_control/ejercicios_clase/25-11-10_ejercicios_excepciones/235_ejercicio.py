# escribir que solicite una contraseña
# si no coincide lance excepción NameError con el mensaje
# Incorrect Password
def comprobar_password(pasword1, password2):
    if pasword1.lower() == password2.lower() :
        return True
    else :
        return False

password_ok = "alberti"
password = input("Introduce una contraseña: ")

if comprobar_password(password_ok,password) :
    print("Acceso permitido")
else :
    print("Acceso denegado")


