class Empleado:
    def __init__(self,nombre,salario):
        self.nombre = nombre
        self.salario = salario

        def describir(self):
            print(f"Nombre: {self.nombre}, Salario: {self.salario}")


class Desarrollador(Empleado):
    def __init__ (self, nombre, salario, lenguajes):
        super().__init__(nombre, salario)
        self.lenguaje = lenguaje

def describir(self):
        print(f"Nombre: {self.nombre}, Salario: {self.salario}, Lenguaje: {self.lenguaje}")

dev1 = Desarrollador("Carlos", 2000, "Python")
dev1.describir()
