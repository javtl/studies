# Los tramos impositivos para la declaración de la renta en un determinado país son los
# siguientes:
# Renta Tipo impositivo
# Menos de 10000€ 5%
# Entre 10000€ y 20000€ 15%
# Entre 20000€ y 35000€ 20%
# Entre 35000€ y 60000€ 30%
# Más de 60000€ 45%
#Escribir un programa que pregunte al usuario su renta anual y muestre por pantalla el
# tipo impositivo que le corresponde.

renta = int(input("Ingrese su renta: "))

if renta <= 10000 :
    renta = renta*0.05
    print(renta)
elif renta > 10000 and renta < 20000 :
    renta = renta*0.15
    print(renta)
elif renta > 20000 and renta < 35000 :
    renta = renta*0.20
    print(renta)
elif renta >35000 and renta < 60000 :
    renta = renta*0.30
    print(renta)
else :
    renta = renta*0.60
    print(renta)
