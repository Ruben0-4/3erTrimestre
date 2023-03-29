package Códigos;

import java.util.Arrays;
import java.util.Scanner;

public class EJ1 {


	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        Scanner sc = new Scanner(System.in);

	        int[] objeto= new int[5];
	        int[] resultado=new int[5];

	        for(int i=0;i<objeto.length;i++) {


	            System.out.println("introduce el tiempo numero " +(i+1));
	            objeto[i]= sc.nextInt();

	        }

	        for(int i=0;i<objeto.length;i++) {

	            resultado[i]=objeto[i]-objeto[0];
	        }

	        System.out.println("Esta es la diferencia " + Arrays.toString(resultado));
	  

	    }
}
