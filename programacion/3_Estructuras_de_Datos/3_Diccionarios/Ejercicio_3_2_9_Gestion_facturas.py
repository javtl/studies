# Escribir un programa que gestione las facturas pendientes de cobro de una empresa. Las 
# facturas se almacenarán en un diccionario donde la clave de cada factura será el número 
#  factura y el valor el coste de la factura. El programa debe preguntar al usuario si 
# quiere añadir una nueva factura, pagar una existente o terminar. Si desea añadir una 
# nueva factura se preguntará por el número de factura y su coste y se añadirá al 
# diccionario. Si se desea pagar una factura se preguntará por el número de factura y se 
# eliminará del diccionario. Después de cada operación el programa debe mostrar por 
# pantalla la cantidad cobrada hasta el momento y la cantidad pendiente de cobro.
facturas = {}
cobrado = 0
# Una alternativa a llevar la cuenta 'pendiente' a mano es sumarla del dict:
# pendiente = sum(facturas.values())

opcion = ""

while opcion != "terminar":
    print("\n--- GESTIÓN DE FACTURAS ---")
    opcion = input("¿Qué desea hacer? (añadir / pagar / terminar): ").strip().lower()

    if opcion == "añadir":
        num_factura = input("Número de factura: ")
        coste = float(input(f"Coste de la factura {num_factura}: "))
        facturas[num_factura] = coste

    elif opcion == "pagar":
        num_factura = input("Número de factura a pagar: ")
        if num_factura in facturas:
            # .pop() saca el valor y lo borra del diccionario en un solo paso
            coste_pagado = facturas.pop(num_factura)
            cobrado += coste_pagado
            print(f"Factura {num_factura} pagada con éxito.")
        else:
            print("¡Error! Esa factura no existe.")

    # Calculamos lo pendiente sumando los valores que quedan en el diccionario
    pendiente = sum(facturas.values())

    print("-" * 30)
    print(f"Cobrado hasta el momento: {cobrado:.2f}€")
    print(f"Pendiente de cobro: {pendiente:.2f}€")
    print("-" * 30)

print("Programa finalizado. ¡Buen trabajo!")