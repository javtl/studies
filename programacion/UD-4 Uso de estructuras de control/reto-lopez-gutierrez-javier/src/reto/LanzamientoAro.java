package reto;

import java.util.Random;
import java.util.Scanner;

public class LanzamientoAro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca el número de tiros que desee hacer: ");
		int num=Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<=num;i++) {
			int numAleatorio = r.nextInt(100);
			if(numAleatorio<=60) {
				
				System.out.println("-El lanzamiento ["+i+"] fue exitoso");
				if(numAleatorio%2==0) {
					System.out.println("El Tiro es de 2 puntos");
					System.out.println(" ");
				}else {
					System.out.println("El tiro es de 3 puntos");
					System.out.println(" ");
				}
			}else {
				System.out.println("El tiro ["+i+"] fue fallado");
			}
		}
		
		
		
		
		
	}

}
