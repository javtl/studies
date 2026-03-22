# Trabaja con una lista de números para practicar el recorte de datos:
# Crea una lista llamada numeros que contenga los números del 0 al 9 (puedes escribirla a mano: [0, 1, 2, ..., 9]).
# Crea una nueva variable llamada primera_mitad y asígnale los primeros 5 elementos de la lista (del 0 al 4) usando slicing.
# Crea una nueva variable llamada segunda_mitad y asígnale los elementos desde la posición 5 hasta el final usando slicing.
# Crea una tercera variable llamada sub_lista_central que contenga los números [4, 5, 6] extrayéndolos de la lista original.
# Imprime las tres nuevas listas para verificar los resultados.

numeros = [0,1,2,3,4,5,6,7,8,9]

primera_mitad = numeros[0:5]
segunda_mitad = numeros[6:]
sub_lista_central = numeros[4:7]

print(primera_mitad)
print(segunda_mitad)
print(sub_lista_central)