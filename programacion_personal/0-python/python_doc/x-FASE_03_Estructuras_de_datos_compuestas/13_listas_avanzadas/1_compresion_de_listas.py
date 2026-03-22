# Partiendo de una lista inicial de nombres,
# usa la comprensión de listas para crear una nueva lista donde solo se incluyan los nombres que tienen más de 5 letras.

lista = ["a","ab","abc","abcd","abcde","abcdef","abcdefg","abcdefgh","abcdefghi"]

for i in range (0,len(lista)) :
    if len(lista[i]) > 5:
        print (lista[i])
    