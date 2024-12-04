package ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Desarollar un programa que nos diga de n situaciones pedidas por teclado
		//Quien tarda menos en llenar la piscina:
		Scanner sc = new Scanner (System.in);
		Random r = new Random();
		int num=r.nextInt();
		
		//Numero de situaciones
		System.out.println("Ingrese el número de situaciones(n): ");
		int n=Integer.parseInt(sc.nextLine());
		//Litros de agua de la piscina de Epi
		System.out.println("Ingrese de cuantos litros es la piscina de Epi: ");
		int piscinaEpi=Integer.parseInt(sc.nextLine());
		
		//Litro de agua de la piscina de Blas
		System.out.println("Ingrese de cuantos litros es la piscina de Blas: ");
		int piscinaBlas=Integer.parseInt(sc.nextLine());
		
		//Litros Agua  Cubo Epi
		System.out.println("Ingrese cuantos litros tiene el Cubo de Epi:");
		int cuboEpi=Integer.parseInt(sc.nextLine());
		
		//Litros de Agua Cubo Blas
		System.out.println("Ingrese cuantos litros tiene el Cubo de Blas:");
		int cuboBlas=Integer.parseInt(sc.nextLine());
		
		//Litros de agua Perdida Piscina Epi
		System.out.println("Ingrese cuantos litros Pierde la piscina de Epi: ");
		int perdidaEpi=Integer.parseInt(sc.nextLine());
		
		//Litros de agua Perdida Piscina Blas
		System.out.println("Ingrese cuantos litros Pierde la piscina de Blas: ");
		int perdidaBlas=Integer.parseInt(sc.nextLine());
		
		int cantidadAguaEpi=piscinaEpi;
		int cantidadAguaBlas=piscinaBlas;
		int situacionEpi=0;
		int situacionBlas=0;
		
		
		//Piscina Epi
		for(int i=0;i<=n;i++) {
			
			piscinaEpi =- perdidaEpi;
			piscinaEpi=+cuboEpi;
			
			if(cantidadAguaEpi==piscinaEpi) 
				situacionEpi++; // El numero de veces que llena la piscina aumenta
			
		}
		
		//Piscina Blas
				for(int j=0;j<=n;j++) {
					
					piscinaBlas =- perdidaBlas;
					piscinaBlas=+cuboBlas;
					
					if(cantidadAguaBlas==piscinaBlas) 
						situacionBlas++; // El numero de veces que llena la piscina aumenta
					
				}
				
				System.out.println("Epi ha llenado "+situacionEpi+" veces antes");
				System.out.println("Blas ha llenado "+situacionBlas+" veces antes");
				
				if(situacionEpi>situacionBlas) {
					System.out.println("Ha ganado Epi");
				}else {
					System.out.println("Ha ganado Blas");
				}
				
				if(situacionEpi==situacionBlas) {
					System.out.println("Han llenado la piscina a la vez en: "+situacionEpi+" ocasión. ");
				}else {
					System.out.println("No Han llenado a la vez la piscina en niguna vuelta");
				}
		
		
		
		
	}

}
