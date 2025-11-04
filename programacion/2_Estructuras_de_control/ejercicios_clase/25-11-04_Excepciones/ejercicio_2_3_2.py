
try :
    numero = int(input("Introduce un número entero: "))
except :
    print("Valor no valido")

except TypeError : 
    print("el tipo de dato no es correcto")
else :
    cadena = ""
    for i in range(1,numero+1) :
        if(i%2!=0):
            cadena=cadena+str(i)+", "
    print(cadena)
