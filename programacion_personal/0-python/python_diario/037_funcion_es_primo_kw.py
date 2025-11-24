'''
Ejercicio ID: 037_funcion_saludo_kw.py
    Tema Principal: Funciones (Argumentos clave)
    Subtema: Llamada a función especificando nombre=valor
    Indicación: Diferenciar entre argumentos posicionales y argumentos por palabra clave (Keyword Arguments).
Enunciado:
Vamos a refinar el ejercicio 034 usando argumentos por palabra clave.
    Define una función llamada configurar_perfil que acepte tres parámetros con valores por defecto:
        usuario="Invitado"
        tema="Claro"
        notificaciones=True
    La función debe retornar un string que resuma las configuraciones.
    Fuera de la función, llama a configurar_perfil especificando solo el usuario y el tema por palabra clave (ej: usuario="Admin_2024", tema="Oscuro"), dejando notificaciones por defecto.
    Imprime el resultado.
'''


def configurar_perfil(usuario="Invitado",tema="Claro",notificaciones=True) :
    estado_notificaciones = "activadas" if notificaciones else "desactivadas"

    return f"Usuario: {usuario} - Tema: {tema} - notificaciones: {estado_notificaciones}"

usuario1 = configurar_perfil(usuario="usuario 1", tema="Oscuro")

print (usuario1)