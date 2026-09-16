package com.javier.daw.ejercicios.estructurasBasicas;
/*
Crea un programa que defina una variable llamada puntuación con valor inicial 0. Luego, modifica su valor tres veces y muestra el resultado final.

Ejemplo de salida por consola:

        ```
Puntuación inicial: 0
Después de primera modificación: 5
Después de segunda modificación: 10
Puntuación final: 15
        ```
*/
public class Ejercicio02 {
    public static void main(String[] args){

        float puntuacion = 0;
        System.out.println("La nota es: "+ puntuacion);

        puntuacion = 5;
        System.out.println("La nueva nota es: "+puntuacion);

        puntuacion = 10;
        System.out.println("La nueva nota es: "+ puntuacion);

    }
}
