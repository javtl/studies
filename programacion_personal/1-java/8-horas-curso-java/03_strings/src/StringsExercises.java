

public class StringsExercises {

    public static void main(String[] args) {

        String cadena1 = "Cadena 1";
        String cadena2 = "Cadena 2";


        // 1. Concatena dos cadenas de texto.
        System.out.println(cadena1 +" "+ cadena2);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(cadena1.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(cadena1.charAt(0));


        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(cadena1.toLowerCase());
        System.out.println(cadena2.toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(cadena1.contains("texto"));
        // 6. Formatea un string con un entero.
        int numero = 789;
        System.out.printf("El ID del producto es: %d%n", numero);
        // 7. Elimina los espacios en blanco al principio y final de un string.
        String textoConEspacios = "   Hola Mundo   ";
        System.out.println(textoConEspacios.trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).

        System.out.println(textoConEspacios.replace(" ","-"));
        // 9. Comprueba si dos strings son iguales.

        System.out.println(cadena1.equals(cadena2));
        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(cadena1.length() == cadena2.length());
    }
}
