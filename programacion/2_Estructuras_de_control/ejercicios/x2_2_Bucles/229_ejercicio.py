# Escribir un programa que almacene la cadena de caracteres contraseña en una variable, 
# pregunte al usuario por la contraseña hasta que introduzca la contraseña correcta.

def pedir_password():
    
    true_password = "password"
    
    
    password_in = "" 
    
    print("--- INGRESO SEGURO ---")
    
    
    while password_in != true_password:
        try:
            contrasena_in = input("Ingrese la contraseña: ")
            
            if password_in == true_password:
            
                print(" ¡Acceso concedido! Contraseña correcta.")
            else:
                
                print(" Contraseña incorrecta. Intente de nuevo.")
                
        except Exception:
           
            print(" Error de lectura. Intente de nuevo.")
            
    
    return "Proceso de autenticación finalizado."


print(pedir_password())