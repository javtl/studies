public class Strings {
    public static void main(String[] args) {

        String name = "nombre";

        var surname = new String("apellido");
        // concatenación
        System.out.println(name + " " + surname);

        //Longitud
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(name.length() - 1));

        //Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,3));

        // minuscula mayuscula
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // comprobar si contiene
        System.out.println("Hola, Java".contains("Hola"));
        System.out.println("Hola, Java".contains("ejemplo"));

        //comparación
        System.out.println(name.equals("nombre"));
        System.out.println(name.equals("apellido"));
        System.out.println(name.equalsIgnoreCase("NOMBRE"));

        // == vs equals
        var a = "a";
        var b = "b";
        var c = "c";

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));

        // trim
        System.out.println("Hola mi nombre es".trim());

        // replace
        System.out.println("Hola mi nombre es".replace("nombre", "apellido"));

        //format
        var age = 1;
        System.out.println(String.format("Hola, %s. Tengo %d.", name, age));


    }
}