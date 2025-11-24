
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArraysExercises {
    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int [] valores = {1,2,3,4,5,6};
        System.out.println(valores.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.

        valores[0] = 1;
        valores[1] = 11;
        System.out.println(valores[0]);
        System.out.println(valores[1]);
        // 3. Crea un ArrayList vacío.
        ArrayList<String> lista = new ArrayList<>();


        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");

        lista.remove(3);

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> ejemplo = new HashSet<String>();
        ejemplo.add("valor1");
        ejemplo.add("valor2");

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        ejemplo.add("valor1");
        ejemplo.add("valor3");


        // 7. Elimina uno de los elementos del HashSet.
        ejemplo.remove("valor3");
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, String> contacto= new HashMap<>();
        contacto.put("nombre","123456");
        contacto.put("nombre2","12234556");
        contacto.put("nombre3","12345566787");


        // 9. Modifica uno de los contactos y elimina otro.
        contacto.remove("nombre2");
        contacto.put("nombre3","nombre32");

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        // Array inicial
        String[] nombresArrays = {"Ana", "Luis", "Carlos", "Sofia"};

        // 1. Array a ArrayList
        ArrayList<String> nombresArrayList = new ArrayList<>(Arrays.asList(nombresArrays));
        System.out.println("ArrayList: " + nombresArrayList);

        // 2. ArrayList a HashSet
        // El constructor de HashSet puede recibir cualquier Collection
        HashSet<String> nombresHashSet = new HashSet<>(nombresArrayList);
        System.out.println("HashSet: " + nombresHashSet);

        // 3. HashSet a HashMap con clave y valor iguales
        HashMap<String, String> nombresHashMap = new HashMap<>();
        // Recorremos el HashSet y llenamos el HashMap
        for (String nombre : nombresHashSet) {
            nombresHashMap.put(nombre, nombre); // La clave y el valor son iguales
        }
        System.out.println("HashMap: " + nombresHashMap);





    }
}
}