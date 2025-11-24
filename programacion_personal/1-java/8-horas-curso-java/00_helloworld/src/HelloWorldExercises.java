import java.util.Scanner;
import java.io.PrintStream;


public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Hola, tu nombre");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola, \nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
            // ESTO ES UN COMENTARIO DE LINEA

        // 4. Crea un comentario en varias líneas.
        /**
         * ESTO ES UN COMENTARIO
         * DE
         * VARIAS
         * LINEAS
         * **/

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("tu edad");
        System.out.println("color favorito");
        System.out.println("tu ciudad");
        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
            //System.out.println()
                System.out.println("mensaje normal");
            //System.err.println()
                System.err.println("Mensaje de Error");
            //System.in
                Scanner sc = new Scanner(System.in);
                System.out.println("introduce tu nombre: ");
                String nombre = sc.nextLine();
           //PrintStream
        Object salida;
       // PrintStream archivo = new PrintStream(salida.txt);
               //  archivo.println("Hola archivo");
               // archivo.close();
        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("esto es ");
        System.out.println("una frase");
        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

        System.out.println("" +
                "─────────▀▀▀▀▀▀──────────▀▀▀▀▀▀▀\n" +
                "──────▀▀▀▀▀▀▀▀▀▀▀▀▀───▀▀▀▀▀▀▀▀▀▀▀▀▀\n" +
                "────▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀──────────▀▀▀\n" +
                "───▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀──────────────▀▀\n" +
                "──▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀──────────────▀▀\n" +
                "─▀▀▀▀▀▀▀▀▀▀▀▀───▀▀▀▀▀▀▀───────────────▀▀\n" +
                "─▀▀▀▀▀▀▀▀▀▀▀─────▀▀▀▀▀▀▀──────────────▀▀\n" +
                "─▀▀▀▀▀▀▀▀▀▀▀▀───▀▀▀▀▀▀▀▀──────────────▀▀\n" +
                "─▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀───────────────▀▀\n" +
                "─▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀───────────────▀▀\n" +
                "─▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀───────────────▀▀\n" +
                "──▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀───────────────▀▀\n" +
                "───▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀───────────────▀▀▀\n" +
                "─────▀▀▀▀▀▀▀▀▀▀▀▀▀───────────────▀▀▀\n" +
                "──────▀▀▀▀▀▀▀▀▀▀▀───▀▀▀────────▀▀▀\n" +
                "────────▀▀▀▀▀▀▀▀▀──▀▀▀▀▀────▀▀▀▀\n" +
                "───────────▀▀▀▀▀▀───▀▀▀───▀▀▀▀\n" +
                "─────────────▀▀▀▀▀─────▀▀▀▀\n" +
                "────────────────▀▀▀──▀▀▀▀\n" +
                "──────────────────▀▀▀▀\n" +
                "───────────────────▀▀\n");
        // 9. Intenta ejecutar el programa sin el metodo main y observa el error.
            // Cuando le das a "Run" en IntelliJ, el JVM busca este metodo exacto
            // Si no lo encuentra, lanza un error en tiempo de ejecución

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
            //el compilador no te deja compilar
    }

}
