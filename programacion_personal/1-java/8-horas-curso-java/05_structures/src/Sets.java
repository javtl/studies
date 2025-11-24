public class Sets {
    public static void main(String[] args) {

        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.add("nombre");
        names.add("nombre2");
        names.add("nombre3");
        names.add("nombre@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Eliminación

        names.remove("nombre");
        System.out.println(names.size());

        // Búsqueda

        System.out.println(names.contains("nombre"));
        System.out.println(names.contains("nombre@gmail.com"));

        System.out.println(names);
        names.add("nombre");
        names.add("nombre");
        names.add("nombre");
        System.out.println(names);

        // Conjuntos

        // names.addAll(numbers); Error

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("México");
        countries.add("Argentina");
        countries.add("otro");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);
    }
}
