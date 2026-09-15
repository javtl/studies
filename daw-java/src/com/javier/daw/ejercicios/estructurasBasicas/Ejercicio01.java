package com.javier.daw.ejercicios.estructurasBasicas;

/*
## Ejercicio 1: Definir y mostrar variables

Crea un programa que defina tres variables: nombre, edad y ciudad. Asigna valores a cada una y muestra su contenido en la consola.

Ejemplo de salida por consola:

```
Ana
25
Madrid
```
*/

import java.util.Scanner;

public class Ejercicio01 {

    public static void main (String[] args){
        String nombre;
        int edad;
        String ciudad;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Introduzca su ciudad: ");
        ciudad = scanner.nextLine();

        System.out.println("Introduzca su edad: ");
        edad = scanner.nextInt();

        System.out.println("su nombre es: "+nombre+", tiene: "+edad+" años y usted es de: "+ciudad);

        scanner.close();



    }
}
