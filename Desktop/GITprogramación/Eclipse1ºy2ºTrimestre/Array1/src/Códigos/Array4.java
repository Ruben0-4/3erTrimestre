package Códigos;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        double ratas[] = new double[6];

	        double sumatoria = 0;
	        double peso = 0;

	        for (int i = 0; i < ratas.length; i++) {

	            System.out.println("peso de las ratas");
	            peso = sc.nextDouble();
	            ratas[i] = peso;

	            sumatoria += peso;
	        }
	        double pesoMedio = sumatoria / ratas.length;

	        for (int i = 0; i < ratas.length; i++) {
	            for (int j = 0; j < ratas.length; j++) {
	                if (ratas[i] < ratas[j]) {

	                    double aux = ratas[i];
	                    ratas[i] = ratas[j];
	                    ratas[j] = aux;
	                } // cambian ratas[i] y ratas [j] se ordenan de menor a mayor.

	            }
	        }
	        System.out.println(Arrays.toString(ratas));

	        int numratas = 1;
	        for (int i = 1; i < ratas.length; i++) {

	            if (ratas[i] == ratas[i - 1]) {
	                numratas++;
	                if (i == ratas.length - 1) {
	                    System.out.println("hay " + numratas + " de peso " + ratas[i - 1]);
	                }

	            } else {
	                System.out.println("hay " + numratas + " de peso " + ratas[i - 1]);
	                numratas = 1;
	            }

	        }
	        System.out.println("hay " + numratas + " de peso " + ratas[ratas.length - 1]);

	        System.out.println("el peso medio es: " + pesoMedio);
	        sc.close();
	    }

	}
