# Ejercicio 2: Interacción entre Objetos
# 1. Crea dos objetos: `usuario1` (con tu nombre) y `usuario2` (con el nombre "Satoshi").
# 2. Haz que ambos se presenten.
# 3. Dale 50 puntos a `usuario1`.
# 4. Imprime cuántos puntos tiene cada uno para verificar que son independientes.

class Usuario:
    def __init__(self, nombre, email):
        self.nombre = nombre
        self.email = email
        self.puntos = 0

    def presentarse(self):
        print(f"Hola, soy {self.nombre} y mi correo es {self.email}")

    def ganar_puntos(self, cantidad):
        self.puntos += cantidad


usuario1 = Usuario("TuNombre", "tunombre@email.com")
usuario2 = Usuario("Satoshi", "satoshi@email.com")

usuario1.presentarse()
usuario2.presentarse()

usuario1.ganar_puntos(50)

print("Puntos de usuario1:", usuario1.puntos)
print("Puntos de usuario2:", usuario2.puntos)
