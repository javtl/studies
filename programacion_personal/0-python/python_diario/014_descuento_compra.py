'''
014_descuento_compra.py
    Tema Principal: Fundamentos de Python
    Subtema: Estructura de Control Condicional (if/elif/else).
    Indicación: Manejo de rangos y lógica de decisión en cascada.
Enunciado:
Crea un programa que calcule el precio final de una compra aplicando descuentos basados en el total, utilizando la estructura if, elif y else:
    Pide al usuario el total de una compra (un valor numérico, puede ser flotante).
    Implementa la siguiente lógica de descuento:
        Si el total es mayor a 100, aplica un 10% de descuento.
        Si el total es mayor a 50 (pero menor o igual a 100, gracias al orden del elif), aplica un 5% de descuento.
        En cualquier otro caso (else), no aplica descuento (0%).
    Imprime tanto el monto del descuento como el total final de la compra.
Ejemplo de Lógica (75 de compra):
    ¿Es mayor a 100? No.
    ¿Es mayor a 50? Sí. → Aplica 5% de descuento.
    Total final: $75.00 − $3.75=$71.25
'''

total_compra = float(input("Ingrese el valor total de la compra: "))


if total_compra > 100 :
    print(total_compra -(total_compra*0,10))

elif total_compra > 50 and total_compra <= 100 :
    print(total_compra -(total_compra*0,05))
else :
    print(total_compra)