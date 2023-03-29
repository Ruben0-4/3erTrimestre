package Recuperación;

import java.util.Scanner;

public class Ejercicio5Recu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número del 1 al 7");
		int número = sc.nextInt();
		if (número == 1) {
			System.out.println("Lunes");
		} if (número == 2) {
			System.out.println("Martes");
		} if (número == 3) {
			System.out.println("Miércoles");
		} if (número == 4) {
			System.out.println("Jueves");
		} if (número == 5) {
			System.out.println("Viernes");
		} if (número == 6) {
			System.out.println("Sábado");
		} if (número == 7) {
			System.out.println("Domingo");
		} if (número<1 || número>7) {
			System.out.println("Error introduce un número del 1 al 7");
		}
}}