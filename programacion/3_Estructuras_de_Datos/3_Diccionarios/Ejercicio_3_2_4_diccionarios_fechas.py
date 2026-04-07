# Escribir un programa que pregunte una fecha en formato dd/mm/aaaa y muestre por
# pantalla la misma fecha en formato dd de <mes> de aaaa donde <mes> es el nombre
# del mes.

meses = {
    '01': 'enero', '02': 'febrero', '03': 'marzo', '04': 'abril',
    '05': 'mayo', '06': 'junio', '07': 'julio', '08': 'agosto',
    '09': 'septiembre', '10': 'octubre', '11': 'noviembre', '12': 'diciembre'
}

fecha = input("Introduce una fecha (dd/mm/aaaa): ").strip()

# Usamos split para crear una lista: ['25', '03', '2026']
partes = fecha.split('/')

# Verificamos que la fecha tenga el formato correcto antes de seguir
if len(partes) == 3:
    dia = partes[0]
    mes_num = partes[1]
    anio = partes[2]

    # Accedemos al diccionario usando el número del mes
    if mes_num in meses:
        mes_nombre = meses[mes_num]
        print(f"La fecha es: {dia} de {mes_nombre} de {anio}")
    else:
        print("El mes introducido no es válido.")
else:
    print("Formato de fecha incorrecto. Recuerda usar '/'")