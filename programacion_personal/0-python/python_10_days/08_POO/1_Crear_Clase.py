# Ejercicio 1: Crear la Clase `Usuario`
# Crea una clase llamada `Usuario` que tenga:
# 1. **Atributos:** `nombre`, `email` y `puntos` (que empiece siempre en 0).
# 2. **Método `presentarse()`:** Debe imprimir: "Hola, soy [nombre] y mi correo es [email]".
# 3. **Método `ganar_puntos(cantidad)`:** Debe sumar esa cantidad al atributo `puntos`.

class Usuario:

    def __init__(self, nombre, email):
        self.nombre = nombre
        self.email = email
        self.puntos = 0

    def presentarse(self):
        print(f"Hola, soy {self.nombre} y mi correo es {self.email}")

    def ganar_puntos(self, cantidad):
        self.puntos += cantidad


usuario1 = Usuario("Ana", "ana@email.com")

usuario1.presentarse()
usuario1.ganar_puntos(10)

print(usuario1.puntos)
