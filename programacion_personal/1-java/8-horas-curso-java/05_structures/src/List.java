public class List {
    public static void main(String[] args) {

        // Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.add("nombre");
        names.add("nombre2");
        names.add("nombre3");
        System.out.println(names.size());

        // Acceso

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificación

        names.set(2, "nombre@gmail.com");
        System.out.println(names.getLast());

        // Eliminación

        names.remove(2);
        // System.out.println(names.get(2)); // Error
        System.out.println(names.size());

        // Búsqueda

        System.out.println(names.contains("nombre"));
        System.out.println(names.contains("nombre@gmail.com"));

        // Limpieza

        names.add("nombre");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());
    }
}
