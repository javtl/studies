import json

# ------------------ CLASES ------------------

class Inversor:
    def __init__(self, nombre, saldo):
        self.nombre = nombre
        self.saldo = saldo
        self.compras = []

    def comprar(self, moneda, precio):
        if self.saldo >= precio:
            self.saldo -= precio
            self.compras.append(moneda)
            print(f"✅ Has comprado {moneda}")
        else:
            print("❌ Saldo insuficiente")

    def exportar(self):
        with open("perfil.json", "w") as f:
            json.dump(self.__dict__, f, indent=4)


class InversorVIP(Inversor):
    def __init__(self, nombre, saldo, descuento):
        super().__init__(nombre, saldo)
        self.descuento = descuento  # Ej: 0.10 = 10%

    def comprar(self, moneda, precio):
        precio_final = precio * (1 - self.descuento)

        if self.saldo >= precio_final:
            self.saldo -= precio_final
            self.compras.append(moneda)
            print(f"⭐ Compra VIP realizada: {moneda}")
            print(f"💸 Precio con descuento: {precio_final}")
        else:
            print("❌ Saldo insuficiente")


# ------------------ CARGA INICIAL ------------------

try:
    with open("perfil.json", "r") as f:
        datos = json.load(f)

        if "descuento" in datos:
            inversor = InversorVIP(
                datos["nombre"],
                datos["saldo"],
                datos["descuento"]
            )
        else:
            inversor = Inversor(
                datos["nombre"],
                datos["saldo"]
            )

        inversor.compras = datos["compras"]

        print("📂 Perfil cargado correctamente")

except FileNotFoundError:
    print("🆕 No existe perfil, creando uno nuevo...")
    inversor = InversorVIP("Carlos", 1000, 0.10)


# ------------------ MENÚ PRINCIPAL ------------------
def menu(inversor):
    print("\n--- MENÚ ---")
    print("1. Ver Perfil")
    print("2. Comprar Cripto")
    print("3. Guardar y Salir")

    opcion = input("Elige una opción: ")

    if opcion == "1":
        print("\n📄 PERFIL")
        print(f"Nombre: {inversor.nombre}")
        print(f"Saldo: {inversor.saldo}")
        print(f"Compras: {inversor.compras}")

        if isinstance(inversor, InversorVIP):
            print(f"Descuento VIP: {inversor.descuento * 100}%")

        menu(inversor)

    elif opcion == "2":
        moneda = input("Nombre de la cripto: ")
        precio = float(input("Precio en USD: "))
        inversor.comprar(moneda, precio)
        menu(inversor)

    elif opcion == "3":
        inversor.exportar()
        print("💾 Datos guardados. ¡Hasta luego!")
        return

    else:
        print("❌ Opción inválida")
        menu(inversor)
