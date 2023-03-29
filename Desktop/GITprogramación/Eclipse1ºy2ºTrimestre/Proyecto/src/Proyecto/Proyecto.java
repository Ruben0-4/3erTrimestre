package Proyecto;

import java.util.Scanner;

public class Proyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, resultado, sobrante; //Designamos las variables que vamos a necesitar para realizar el programa//
       
        System.out.println("Introduce el tipo de billetes que tienes");
        num1=sc.nextInt();
        System.out.println("Introduce la cantidad a pagar");
        num2=sc.nextInt();
        
        resultado= num2/num1;
        sobrante= num2%num1;  //En la variable sobrante guardamos el resto de la operación que hemos realizado para calculas el número de billetes necesarios para pagar//
        System.out.println("Debes usar " + resultado + " billetes y te faltarían "+ sobrante +" euros" );
        
       } 
}