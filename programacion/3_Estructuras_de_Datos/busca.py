nombre=input("Dime tu nombre: ")
handler = open('mailbox.txt')
for linea in handler:
    palabras = linea.split()
    if len(palabras)>0 and palabras[0] == 'From':
        email= extraerEmail(linea)
        if(nombre in linea):
            print(f"El dia de la semana es:"{palabras[2]})
            print("Email encontrado: ",email)