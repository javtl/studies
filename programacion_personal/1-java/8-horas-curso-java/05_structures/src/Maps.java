public class Maps {
    public static void main(String[] args) {
        // Declaración y creación
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.put("nombre", "nombre@gmail.com");
        names.put("nombre", "nombre@gmail.com");
        names.put("nombre", "nombre@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceso

        System.out.println(names.get("nombre"));
        System.out.println(names.get("nombre"));

        // Verificación

        System.out.println(names.containsKey("nombre"));
        System.out.println(names.containsKey("nombre"));

        System.out.println(names.containsValue("nombre@gmail.com"));

        // Eliminación

        System.out.println(names.remove("nombre"));
        System.out.println(names.remove("nombre"));
        System.out.println(names);

        // Limpieza

        names.clear();
        System.out.println(names);

        // Modificación

        names.put("nombre", "nombre@gmail.com");
        System.out.println(names);

        names.put("nombre", "nombre@gmail.com");
        System.out.println(names);

        names.replace("nombre", "nombre@gmail.com"); // Reemplaza el valor si existe
        System.out.println(names);

        names.putIfAbsent("nombre", "nombre@gmail.com"); // Solo lo añade si no existe
        System.out.println(names);

        // Otras operaciones

        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);
    }
    }

