package Examen2;

import java.util.Scanner;

public class Examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int y, z; //Designamos las variables que vamos a necesitar para la variable "y" "z" //
        final double c=356.18; //Designamos las variables fija que nos dan//
        
        System.out.println("Introduce la y");
        y=sc.nextInt();
        System.out.println("Introduce la z");
        z=sc.nextInt();
        
        double resultado=(c * Math.sqrt((z*z)*(y*y)))/(z+c); //Escribimos la ecuación que vamos a realizar//
        
        System.out.println("El valor de x es: "+resultado ); 
        
       } 
}