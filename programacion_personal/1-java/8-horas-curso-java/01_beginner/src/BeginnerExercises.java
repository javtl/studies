public class BeginnerExercises {
    
    public static <Bool> void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre:
        String nombre = "nombre";
        
        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 1;
        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.7;
        
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        Boolean teGustaProgramar = false;
        // 5. Declara una constante con tu email.
        const String email = "email@gmail.com";
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'i';
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Localidad";
        System.out.println(localidad);
        String localidad = "localidad2";

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 1;
        int b = 1;
        int ab = a + b;
        System.out.println(a+" + "+b+" = "+ab);
        // 9. Imprime el tipo de dos variables creadas anteriormente.

        System.out.println("el tipo de variable de a es: "+ ((Object)a).getClass().getSimpleName());
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla
        int var;
        var = 1;
        System.out.println(var);
    }
}
