# Lists

my_list = list()
other_list = []

print(len(my_list))

my_list = [35, 24, 62, 52, 30, 30, 17]

print(type(my_list))
print(type(other_list))

other_list = [13,14,15,"nombre", "apellido"]

print(other_list[0])
print(other_list[4])
print(other_list[7]) # print(other_list[7]) IndexError

# Concatenación
list_1 = [1,2,3,4,5,6]
list_2 = [7,8,9,10]

print(f"{list_1} {list_2}")

# Creación inserción actualización eliminación
color = ["negro", "azul", "amarillo"]

color.append("verde")
print(color)

color.insert("rojo")
print(color)

color[1] = "nuevo azul"
print(color)

color.remove("rojo")
print(color)

# Operaciones

color_2 = color.copy()

color.clear()
print(color)

color_2.reverse()
print(color_2)

color_2.sort()
print(color_2)
