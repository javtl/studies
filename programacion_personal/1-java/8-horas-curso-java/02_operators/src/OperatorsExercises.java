public class OperatorsExercises {
    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.

        int a = 1;
        int b = 2;

        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a*b;
        double division = a / b;
        int modulo = a%b;

        // 2. Crea una variable para cada tipo de operación de asignación.

        a += 1;
        a -= 1;
        a *= 1;
        a /= 1;
        a %= 1;
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a+1!=b);
        // 5. Utiliza el operador lógico and.

        System.out.println(a && b);
        // 6. Utiliza el operador lógico or.

        System.out.println(a || b);
        // 7. Combina ambos operadores lógicos.

        System.out.println(3 > 2 && 5 == 2);
        // 8. Añade alguna negación.
        System.out.println(a!=b);
        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++a);
        // 10. Combina operadores aritméticos, de comparación y lógicos.
    }
}
