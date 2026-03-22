class Empleado:
    def __init__(self,nombre,salario):
        self.nombre = nombre
        self.salario = salario

        def describir(self):
            print(f"Nombre: {self.nombre}, Salario: {self.salario}")

class Gerente(Empleado):
    def __init__(self, nombre, salario, equipo):
        super().__init__(nombre, salario)
        self.equipo = equipo

    def mostrar_equipo(self):
        print("Equipo:")
        for persona in self.equipo:
            print(persona)

gerente1 = Gerente("Laura", 3000, ["Ana", "Carlos", "Pedro"])
gerente1.describir()
gerente1.mostrar_equipo()
