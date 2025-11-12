# La pizzería *Bella Napoli* ofrece pizzas **vegetarianas** y **no vegetarianas** a sus clientes. 
# **Ingredientes vegetarianos:**  
# - Pimiento  
# - Tofu  
# **Ingredientes no vegetarianos:**  
# - Pepperoni  
# - Jamón  
# - Salmón  
# Escribir un programa que: 
# 1. Pregunte al usuario si quiere una pizza **vegetariana o no**.   
# 2. En función de su respuesta, muestre un menú con los **ingredientes disponibles**.  
# 3. Permita elegir **un ingrediente** además de la **mozzarella y el tomate** (presentes en todas las pizzas).  
# 4. Al final, muestre por pantalla si la pizza elegida es **vegetariana o no**, junto con **todos los ingredientes que lleva**.

ingredientes_base = ["mozzarella", "tomate"]

def obtener_tipo_pizza():
    print("Elige el tipo de pizza:")
    print("1. Vegetariana")
    print("2. Carne y/o Pescado (No Vegetariana)")
    
    try:
        opcion = int(input("Opción (1 o 2): "))
        if opcion == 1:
            return "Vegetariana"
        elif opcion == 2:
            return "No Vegetariana"
        else:
            print("Error: Opción no válida")
            
    except ValueError:
        print("Error: Debes ingresar un número")
    except Exception:
        print("Error")


def eleccion_vegetariano():
    pinta_menu_vegetariana()
    
    try:
        opcion = int(input("Opción: "))

        match opcion:
            case 1:
                ingrediente_especial = "Pimiento"
            case 2:
                ingrediente_especial= "Tofu"
            case _:
                print("Opción no válida.")
                
        return ingrediente_especial
                
    except ValueError:
        print("Debes ingresar un número 1 o 2")


def eleccion_carne_pescado():
    pinta_menu_carne_pescado()

    try:
        opcion = int(input("Opción: "))
        
        match opcion:
            case 1:
                ingrediente_especial = "Pepperoni"
            case 2:
                ingrediente_especial = "Jamón"
            case 3:
                ingrediente_especial = "Salmón"
            case _:
                print("Opción no válida.")

        return ingrediente_especial
        
    except ValueError:
        print("Debes ingresar un número (1, 2 o 3)")


def pinta_menu_vegetariana():
   
    print("1- Pimiento")
    print("2- Tofu")

def pinta_menu_carne_pescado():
    
    print("1- Pepperoni")
    print("2- Jamón")
    print("3- Salmón")

tipo_pizza = obtener_tipo_pizza()
ingrediente_especial = ""

if tipo_pizza == "Vegetariana":
    ingrediente_especial = eleccion_vegetariano()
else:
    ingrediente_especial = eleccion_carne_pescado()

print(f"Tu Pizza es {tipo_pizza} y lleva:")
print(f"Ingredientes Base: {ingredientes_base} y {ingrediente_especial}")
