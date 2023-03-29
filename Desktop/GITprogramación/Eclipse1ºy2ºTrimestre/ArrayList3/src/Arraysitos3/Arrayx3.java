package Arraysitos3;

import java.util.ArrayList;

public class Arrayx3 {

	private ArrayList<Integer> arrayenteros= new ArrayList<>();

	public void Arraydetres(int num1, int num2, int num3) {
		if(num1>-10&&num1<10||num2>-10&&num2<10||num3>-10&&num3<10) {
		this.arrayenteros.add(num1);
		this.arrayenteros.add(num2);
		this.arrayenteros.add(num3);
		}
	}

	public ArrayList<Integer> getArrayenteros1() {
		return arrayenteros;
	}

	public void setArrayenteros1(int num1, int num2, int num3) {
		this.arrayenteros.add(num1);
		this.arrayenteros.add(num2);
		this.arrayenteros.add(num3);
	}

	public String toString() {
		return "" + arrayenteros + "";
	}
}
