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

print("Tipos de pizza disponibles: vegetarianas / no vegetarianas")
pizza = input("ingrese que tipo de pizza quiere: ")

if pizza == "vegetariana" :
    print("Ingredientes vegetarianos: ")
    print("Pimiento")
    print("Tofu")
else :
    print("Ingredientes No Vegetarianos: ")
    print("Pepperoni")
    print("Jamón")
    print("Salmón")