package Recuperación;

import java.util.Scanner;

public class Ejercicio2Recu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double iva;
		double resultado;
		
		System.out.println("Dime el precio de un producto");
		double precio = sc.nextDouble();
		
		iva=precio*0.21;
		resultado=iva+precio;
	    System.out.println("El precio sin Iva es:"+ precio);
	    System.out.println("El precio con Iva es:"+ resultado);
		}

}
