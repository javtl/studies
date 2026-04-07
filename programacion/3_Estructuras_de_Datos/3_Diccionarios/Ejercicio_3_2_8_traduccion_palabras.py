# Escribir un programa que cree un diccionario de traducción español-inglés. El usuario 
# introducirá las palabras en español e inglés separadas por dos puntos, y cada par 
# <palabra>:<traducción> separados por comas. El programa debe crear un 
# diccionario con las palabras y sus traducciones. Después pedirá una frase en español y 
# utilizará el diccionario para traducirla palabra a palabra. Si una palabra no está en el 
# diccionario debe dejarla sin traducir

diccionario = {}

# 1. Entrada de datos (Ejemplo: hola:hello,casa:house)
entrada = input("Introduce las palabras (español:inglés) separadas por comas: ")

# 2. Creamos la lista de parejas separando por la coma
# ['hola:hello', 'casa:house']
parejas = entrada.split(',')

# 3. Recorremos cada pareja para llenar el diccionario
for item in parejas:
    # Separamos la palabra de su traducción por los dos puntos
    # Usamos strip() para limpiar posibles espacios accidentales
    esp, eng = item.split(':')
    diccionario[esp.strip()] = eng.strip()

# 4. Pedimos la frase a traducir
frase = input("\nIntroduce una frase en español: ")

# 5. Dividimos la frase en palabras para procesarla
palabras_frase = frase.split()
frase_traducida = []

# 6. Traducimos palabra por palabra
for palabra in palabras_frase:
    # .get(llave, valor_por_defecto)
    # Si 'palabra' no existe en el dict, devuelve la propia 'palabra' original
    traduccion = diccionario.get(palabra, palabra)
    frase_traducida.append(traduccion)

# 7. Unimos la lista de nuevo en una sola cadena de texto
resultado = " ".join(frase_traducida)

print("\nFrase traducida:")
print(resultado)