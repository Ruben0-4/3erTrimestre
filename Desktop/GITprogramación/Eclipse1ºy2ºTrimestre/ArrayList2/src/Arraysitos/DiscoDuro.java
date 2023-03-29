package Arraysitos;

import java.util.ArrayList;

public class DiscoDuro {

	private int capacidadMaxima;
	private  ArrayList<Archivo> arrayarchivos= new ArrayList<>();

	public DiscoDuro(int capacidadMaxima) {
		super();
		this.capacidadMaxima = capacidadMaxima;
	}
	
	
	public boolean GuardarArchivo(Archivo archivos) {
		boolean resultado=true;
		if(arrayarchivos.size()<capacidadMaxima) {
			arrayarchivos.add(archivos);
			
		}
		else {
			resultado=false;
		}
		return resultado;
	}
	
	public boolean EliminarArchivo(String nombrearchivos) {
		boolean resultado=true;
	
		for(int i=0;i<arrayarchivos.size();i++) {
			
			if(arrayarchivos.get(i).getNombre()== nombrearchivos) {
				arrayarchivos.remove(i);
				resultado=true;
				i=0;
			}else {
				resultado=false;
			}
		}
		
		return resultado;
	}
	
	public String ListarUnArchivo(int elemento) { 
		String resultado="ese elemento no existe, elige un elemento de el 0 al "+ arrayarchivos.size();
		
		if(elemento<arrayarchivos.size() && elemento>=0) {
			resultado= arrayarchivos.get(elemento).toString()+ ", la posicion de disco ocupado es "+elemento+" ]    ";
		}

		return resultado;
	}
	
	public String ListarContenido() { 
		String resultado="";
		
		for(int i=0;i<arrayarchivos.size();i++) {
			
			resultado+=ListarUnArchivo(i);
			
		}
		
		return resultado;
	}

	public void formatear() {	
			arrayarchivos.removeAll(arrayarchivos);
	}
}
