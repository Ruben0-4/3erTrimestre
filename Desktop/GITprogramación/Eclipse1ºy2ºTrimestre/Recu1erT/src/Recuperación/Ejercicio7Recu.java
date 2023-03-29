package Recuperación;

import java.util.Scanner;

public class Ejercicio7Recu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int i, sumatorio=0;
		
		System.out.println("Dame la longitud de la media: ");
		double[] array= new double[sc.nextInt()];
		
		for(i=0; i<array.length; i++) {
			System.out.printf("Dame numeros para la media: ");
			array[i]=sc.nextInt();
			sumatorio+= array[i];
		}
		double media = sumatorio/array.length;
		System.out.println(media);
	}

}
