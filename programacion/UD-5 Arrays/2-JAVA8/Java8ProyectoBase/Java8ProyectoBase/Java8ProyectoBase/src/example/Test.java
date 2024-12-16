package example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(new Alumno(1, "1717213183", "Javier Ignacio", "Molina Cano", "Java 8", 7, 28));
        listaAlumnos.add(new Alumno(2, "1717456218", "Lillian Eugenia", "Gómez Álvarez", "Java 8", 10, 33));
        listaAlumnos.add(new Alumno(3, "1717328901", "Sixto Naranjo", "Marínn", "Java 8", 8.6, 15));
        listaAlumnos.add(new Alumno(4, "1717567128", "Gerardo Emilio", "Duque Gutiérrez", "Java 8", 10, 13));
        listaAlumnos.add(new Alumno(5, "1717902145", "Jhony Alberto", "Sáenz Hurtado", "Java 8", 9.5, 15));
        listaAlumnos.add(new Alumno(6, "1717678456", "Germán Antonio", "Lotero Upegui", "Java 8", 8, 34));
        listaAlumnos.add(new Alumno(7, "1102156732", "Oscar Darío", "Murillo González", "Java 8", 8, 32));
        listaAlumnos.add(new Alumno(8, "1103421907", "Augusto Osorno", "Palacio Martínez", "PHP", 9.5, 17));
        listaAlumnos.add(new Alumno(9, "1717297015", "César Oswaldo", "Alzate Agudelo", "Java 8", 8, 26));
        listaAlumnos.add(new Alumno(10, "1717912056", "Gloria Amparo", "González Castaño", "PHP", 10, 28));
        listaAlumnos.add(new Alumno(11, "1717912058", "Jorge León", "Ruiz Ruiz", "Python", 8, 22));
        listaAlumnos.add(new Alumno(12, "1717912985", "John Jairo", "Duque García", "Java Script", 9.4, 32));
        listaAlumnos.add(new Alumno(13, "1717913851", "Julio Cesar", "González Castaño", "C Sharp", 10, 22));
        listaAlumnos.add(new Alumno(14, "1717986531", "Gloria Amparo", "Rodas Monsalve", "Ruby", 7, 18));
        listaAlumnos.add(new Alumno(15, "1717975232", "Gabriel Jaime", "Jiménez Gómez", "Java Script", 10, 18));

        /*
         EJERCICIOS
         */
        // 1. Imprimir todos los alumnos de la lista
       
      
        // 2. Imprimir todos aquellos alumnos cuyo nombre empieza con el caracter'L' o 'G'
    
       
        // 3. Imprimir el total de alumnos de la lista
    
        
        
        // 4. Obtener los alumnos con notas mayores a 9 y que el curso sea Ruby:
       
        
        // 5. Imprimir los tres primeros alumnos de la lista
     
        
        // 6. Obtener el alumno que tiene la menor edad
 
        
        // 7. Obtener el alumno que tiene la mayor edad
     
        
        // 8. Obtener los alumnos cuyos nombres de curso termine con el caracter'o'
       
        
        // 9. Obtener los alumnos cuyos nombres de curso contengan el caracter 'a'
     
        
        // 10. Obtener los alumnos cuya longitud de nombres sea mayor a 10
        
        
        // 11. Obtener los alumnos, cuyo nombre empiece con el caracter 'P' y la la longitud de su nombre sea <= a 6
     
        
        // 12. Asignar a una nueva lista de alumnos aquellos cuyo curso contiene la letra 'a'.
    
        
    }
}
