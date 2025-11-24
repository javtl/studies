import java.util.Scanner;

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).


        int edad = 23;
        if (edad >= 18){
            System.out.println("Eres mayor de edad, puedes votar");
        }else{
            System.out.println("Eres menor de edad, no puedes votar");
        }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        int numero1 = 10;
        int numero2 = 12;

        if(numero1 > numero2 ){
            System.out.println("El numero mayor es: "+numero1);
        }else if(numero1 < numero2 ){
            System.out.println("el numero mayor es: "+numero2);
        }else if(numero1 == numero2){
            System.out.println("ambos numeros son iguales");
        }
        // 3. Dado un número, verifica si es positivo, negativo o cero.

        int numerodado;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero");
        numerodado = Integer.parseInt(sc.nextLine());

        if(numerodado > 0){
            System.out.println("el numero es positivo");
        }else if(numerodado < 0){
            System.out.println("el numero es negativo");
        }else if (numerodado == 0){
            System.out.println("el numero es igual a cero");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        double numeroparimpar;
        System.out.println("ingrese un numero para saber si es par o impar");
        numeroparimpar = sc.nextDouble();
        if (numeroparimpar % 2 == 0){
            System.out.println("el numero es par");
        }else {
            System.out.println("El numero es impar");
        }
        // 5. Verifica si un número está en el rango de 1 a 100.

        int numerorango;
        System.out.println("introduce un mumero: ");
        numerorango = Integer.parseInt(sc.nextLine());
        if (numerorango > 1 && numerorango < 100){
            System.out.println("el numero esta entre 1 y 100");
        }else{
            System.out.println("el numero no esta e el rango 1-100");
        }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        int dia;
        System.out.println("ingrese un dia de la semana(del 1 al 7): ");
        dia = Integer.parseInt(sc.nextLine());

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El numero no es correcto");
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        int nota;
        System.out.println("Ingrese su nota (0-100):");
        nota = Integer.parseInt(sc.nextLine());

        if (nota >= 90) {
            System.out.println("Sobresaliente");
        } else if (nota >= 50) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        int edad8;
        int vaSolo;

        System.out.println("Ingrese su edad:");
        edad8 = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese 0 si va solo o 1 si va acompañado:");
        vaSolo = Integer.parseInt(sc.nextLine());

        if (edad8 >= 15 || vaSolo == 1) { // Uso del operador de comparación ==
            System.out.println("Puede entrar al cine.");
        } else {
            System.out.println("No puede entrar al cine.");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        String vocalConsonante;
        System.out.println("Ingrese una vocal o una consonante: ");
        vocalConsonante = sc.nextLine();
        switch (vocalConsonante){
            case "a":
                System.out.println("vocal");
            case "e":
                System.out.println("vocal");
            case "i":
                System.out.println("vocal");
            case "o":
                System.out.println("vocal");
            case "u":
                System.out.println("vocal");
            default:
                System.out.println("consonante");
        };
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        int a, b, c;

        System.out.println("Introduce el primer número:");
        a = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        b = sc.nextInt();

        System.out.println("Introduce el tercer número:");
        c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("El número mayor es: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El número mayor es: " + b);
        } else {
            System.out.println("El número mayor es: " + c);
        }
    }
}
