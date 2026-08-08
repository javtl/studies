## Los 5 Tipos de Datos Esenciales

En Java, cada variable debe tener un tipo definido (es un lenguaje fuertemente tipado). Estos son los que necesitas para hoy:

| Tipo | Qué almacena | Ejemplo de valor |
| --- | --- | --- |
| **`int`** | Números enteros (sin decimales). | `25`, `-10`, `1000` |
| **`double`** | Números con decimales. | `1.75`, `-3.1416` |
| **`char`** | Un solo carácter (letra, número o símbolo). Se escribe entre comillas simples. | `'A'`, `'9'`, `'@'` |
| **`boolean`** | Valores lógicos (solo puede ser verdadero o falso). | `true`, `false` |
| **`String`** | Cadenas de texto. Se escribe entre comillas dobles. *(Técnicamente es un objeto/clase, pero se usa todo el tiempo)*. | `"Hola Mundo"`, `"Java"` |

---

## Tu Programa del Día 1

Aquí tienes el código simple que declara una variable de cada tipo y luego imprime sus valores en la consola. Puedes copiarlo y pegarlo en tu entorno de desarrollo (como IntelliJ, Eclipse, o un compilador online).

```java
public class Dia1TiposDeDatos {
    public static void main(String[] args) {
        
        // 1. Declaración e inicialización de variables
        String nombre = "Carlos";
        int edad = 28;
        double altura = 1.75;
        char inicial = 'C';
        boolean esEstudiante = true;

        // 2. Impresión de las variables en la consola
        System.out.println("--- Mis Datos Personales ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Inicial de mi nombre: " + inicial);
        System.out.println("¿Soy estudiante? " + esEstudiante);
    }
}

```

> **Nota clave:** Presta atención a cómo usamos el signo `+` dentro de `System.out.println()`. En este contexto, el `+` no suma matemáticamente, sino que **concatena** (une) el texto que está entre comillas con el valor de tu variable.