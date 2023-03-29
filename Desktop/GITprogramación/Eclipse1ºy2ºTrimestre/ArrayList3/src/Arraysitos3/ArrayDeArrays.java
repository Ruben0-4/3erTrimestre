package Arraysitos3;

import java.util.ArrayList;

public class ArrayDeArrays {

	private ArrayList<Arrayx3> arraydearray=new ArrayList<>();

	public ArrayDeArrays(Arrayx3 array1,Arrayx3 array2, Arrayx3 array3) {
		super();
		this.arraydearray.add(array1);
		this.arraydearray.add(array2);
		this.arraydearray.add(array3);
	}

	public ArrayList<Arrayx3> getArraydearray() {
		return arraydearray;
	}

	public void setArraydearray(ArrayList<Arrayx3> arraydearray) {
		this.arraydearray = arraydearray;
	}
	
	public String CoordenadaNumeromenor() {
		String resultado="";
		int filadelmenor=0;
		int columnadelmenor=0;
		int numeromenor=9;	
		for(int f=0;f<arraydearray.size();f++) {
			for(int c=0;c<arraydearray.size();c++) {				
				if(arraydearray.get(f).getArrayenteros1().get(c)<numeromenor) {		
					numeromenor=arraydearray.get(f).getArrayenteros1().get(c);
					filadelmenor=f;
					columnadelmenor=c;
				}
			}
		}
		System.out.println("el numero menor esta en la fila= "+(filadelmenor+1)+", columna= "+(columnadelmenor+1));
		return resultado;
	}
	
	public String CoordenadaNumermayor() {
		String resultado="";
		int filadelmayor=0;
		int columnadelmayor=0;
		int numeromayor=-9;	
		for(int f=0;f<arraydearray.size();f++) {
			for(int c=0;c<arraydearray.size();c++) {				
				if(arraydearray.get(f).getArrayenteros1().get(c)>numeromayor) {					
					numeromayor=arraydearray.get(f).getArrayenteros1().get(c);
					filadelmayor=f;
					columnadelmayor=c;	
				}  
			}
		}
		System.out.println("el numero mayor esta en la fila= "+(filadelmayor+1)+", columna= "+(columnadelmayor+1));
		return resultado;
	}
	
	public String coordenadas() {
		String resultado="";
		CoordenadaNumermayor();
		CoordenadaNumeromenor();
		return resultado;
	}

	public String toString() {
		String resultado="";
		System.out.println(arraydearray.get(0));
		System.out.println(arraydearray.get(1));
		System.out.println(arraydearray.get(2));
		return resultado;
	}
}
