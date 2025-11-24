'''
Ejercicio ID: 016_mayoria_de_edad.py
    Tema Principal: Fundamentos de Python
    Subtema: Input() y Condicional Simple (if/else).
    Referencia: Repaso y consolidación del uso de input, casting y comparación en el contexto de una decisión.
    Indicación: Uso de operadores de comparación (>=).
Enunciado:
Crea un programa que determine si una persona ha alcanzado o superado la mayoría de edad:
    Define una edad límite para la mayoría de edad (generalmente 18).
    Pide al usuario que ingrese su edad actual.
    Utiliza una estructura if/else y el operador de comparación adecuado (>=) para evaluar la edad:
        Si la edad es 18 o más, imprime: "Mayor de edad. Acceso permitido.".
        En cualquier otro caso, imprime: "Menor de edad. Acceso restringido.".
Requisito Clave: Asegúrate de realizar correctamente la conversión del dato de entrada (input()) al tipo numérico (int) antes de realizar la comparación lógica.
'''
edad = int(input("Ingrese su edad: "))

if edad <= 18 :
    print("Usted es menor de edad. ")
else : 
    print("Usted es mayor de edad. ")