class Empleado:
    def __init__(self,nombre,salario):
        self.nombre = nombre
        self.salario = salario

        def describir(self):
            print(f"Nombre: {self.nombre}, Salario: {self.salario}")

empleado1 = Empleado("Ana", 1500)

print(empleado1.describir())