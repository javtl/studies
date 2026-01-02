# crear un método llamado guardar_en_json() 
# dentro de la clase que guarde los datos del usuario en un archivo
# (Pista: Usa self.__dict__ para convertir el objeto en un diccionario fácilmente).

import json

class Usuario:
    def __init__(self, nombre, email):
        self.nombre = nombre
        self.email = email
        self.puntos = 0

    def presentarse(self):
        print(f"Hola, soy {self.nombre} y mi correo es {self.email}")

    def ganar_puntos(self, cantidad):
        self.puntos += cantidad

    def guardar_en_json(self):
        nombre_archivo = f"{self.nombre}.json"
        with open(nombre_archivo, "w", encoding="utf-8") as archivo:
            json.dump(self.__dict__, archivo, indent=4)


usuario1 = Usuario("Ana", "ana@email.com")
usuario1.ganar_puntos(50)
usuario1.guardar_en_json()
