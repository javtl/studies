def suma(num1, num2):
    return num1 + num2

def main():
    print("La suma de 3 + 2 es {}".format(suma(3, 2)))

    # Otras formas de hacer lo mismo:
    print("La suma de", 3, "+", 2, "es", suma(3, 2))

    print("La suma de " + str(3) + " + " + str(2) + " es " +
          str(suma(3, 2)))

    res = "La suma de "
    res += str(3)
    res += " + " + str(2)
    res += " es " + str(suma(3, 2))
    print(res)

    print(f"La suma de 3 + 2 es {suma(3, 2)}")

if __name__ == "__main__":
    main()
    