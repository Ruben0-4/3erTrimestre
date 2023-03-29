package Códigos;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		int[] BG=new int[6];//Boleto Ganador
		int[] BP=new int[6];//Boleto Persona
		int aciertos=0;

		for(int i=0;i<BG.length;i++) {
		System.out.println("Introduzca los numeros del boleto ganador:");
		BG[i]=sc.nextInt();
		}
		for(int i =0;i<BP.length;i++) {
		System.out.println("Introduzca los números del boleto de una persona");
		BP[i]=sc.nextInt();
		}
		for(int i=0;i<BP.length;i++) {
		for(int h=0;h<BP.length;h++) {
		if(BP[h]==BG[i]) {
		aciertos+=1;
		}

		}
		}
		System.out.println("Los aciertos que ha tenidos son:" +aciertos);
		}

	}

