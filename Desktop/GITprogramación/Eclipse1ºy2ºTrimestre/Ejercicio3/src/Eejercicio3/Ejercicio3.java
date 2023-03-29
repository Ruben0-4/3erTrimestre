package Eejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	private static Object sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2; //Designamos las variables que vamos a necesitar para el ejercicio//
		int resultado; //Designamos las variables que vamos a necesitar para el ejercicio//
		
		System.out.println("Introduce un número entero");
		numero1=sc.nextInt();
		
		System.out.println("Introduce otro número entero");
		numero2=sc.nextInt();
		
        resultado= numero1/numero2; //Escribimos la operación que necesitamos para sacar el ejercicio//
        
        System.out.println("El valor de la división en formato byte es:" + (byte)resultado); //Lo pasamos a formato byte//
        
	}

}
