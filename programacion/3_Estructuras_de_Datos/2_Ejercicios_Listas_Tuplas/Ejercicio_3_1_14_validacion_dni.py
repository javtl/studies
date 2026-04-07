# Realiza un programa que compruebe la letra del DNI y detecte si el
# usuario se ha equivocado con los números

def validar_dni():
    # Cadena de control oficial (el orden es sagrado)
    LETRAS_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE"
    
    dni_completo = input("Introduce tu DNI (8 números y la letra): ").upper().strip()

    # 1. Separar número y letra
    numero_str = dni_completo[:-1] # Todos menos el último
    letra_usuario = dni_completo[-1] # El último carácter

    # 2. Comprobar que el número son realmente dígitos
    if not numero_str.isdigit() or len(numero_str) != 8:
        print("Error: Los primeros 8 caracteres deben ser números.")
        return

    # 3. Calcular la letra que debería tener
    numero_int = int(numero_str)
    indice_letra = numero_int % 23
    letra_correcta = LETRAS_CONTROL[indice_letra]

    # 4. Comparar
    if letra_usuario == letra_correcta:
        print(f"El DNI {dni_completo} es VÁLIDO.")
    else:
        print(f"¡Error detectado! Para el número {numero_str}, la letra debería ser {letra_correcta}.")

validar_dni()