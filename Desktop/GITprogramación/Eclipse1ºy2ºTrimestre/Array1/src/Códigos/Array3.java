package Códigos;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		boolean resultado= true;
		System.out.println("Introduce el tamaño del palíndromo");
		int tam= sc.nextInt();
		char[] palindromo = new char[tam];
		for (int i=0; i<palindromo.length; i++) {
		System.out.println("Introduce una letra");
		palindromo[i]= sc.next().charAt(0);
		}	
		for (int i=0; i<palindromo.length; i++) {
			if (palindromo[i]!=palindromo[(palindromo.length-1)-i]) {
				resultado= false;
			}
		}
		if(resultado) {
			System.out.println("Es palíndromo");
		}else {
			System.out.println("No es palíndromo");
		}
	}
}
