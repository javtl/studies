public class VariablesAndConstant {

    public static void main(String[] args) {

        // Variables

        String name = "name";
        System.out.println(name);

        name = "nombre";
        System.out.println(name);

        // name = 1; Error (no podemos cambiar el tipo de dato)

        int age =1;
        System.out.println(age);

        var email = "nombre@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        // Constantes

        final String EMAIL = "email@gmail.com";
        // EMAIL = "name@gmail.com"; Es constante
        System.out.println(EMAIL);
    }}