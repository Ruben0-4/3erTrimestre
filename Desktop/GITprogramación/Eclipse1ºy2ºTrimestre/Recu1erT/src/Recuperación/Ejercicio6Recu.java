package Recuperación;

import java.util.Scanner;

public class Ejercicio6Recu {

	public static void main(String[] args) {
		
		double num=0;
		double resultado;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduce el número del que quieres realizar sus potencias ");
		num = sc.nextDouble();
		
		for( int i=0; i<11; i++) {
			resultado= (Math.pow(num, i));
			System.out.println(resultado);
		}
	}

}
