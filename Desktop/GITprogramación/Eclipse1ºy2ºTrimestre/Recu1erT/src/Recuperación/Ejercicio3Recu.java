package Recuperación;

import java.util.Scanner;

public class Ejercicio3Recu {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio de un círculo");
		double radio = sc.nextDouble();
		final double calculoarea;
		calculoarea = Math.ceil(Math.PI * (radio * radio));
		System.out.println("El área es " + calculoarea);
		
		System.out.println("Introduce la longitud de un círculo");
		double longitud = sc.nextDouble();
		final double calculolongitud;
		calculolongitud = Math.ceil(2*Math.PI * radio);
		System.out.println("La longitud es " + calculolongitud);
	}

}
