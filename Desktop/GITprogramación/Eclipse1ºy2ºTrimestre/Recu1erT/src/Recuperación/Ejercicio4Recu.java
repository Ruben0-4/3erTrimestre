package Recuperación;

import java.util.Scanner;

public class Ejercicio4Recu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la edad que tienes");
		int edad = sc.nextInt();
		
		if (edad<18) {
			System.out.println("Sos Menor");
		} else {
			System.out.println("Podes beber");
		}
	}

}
