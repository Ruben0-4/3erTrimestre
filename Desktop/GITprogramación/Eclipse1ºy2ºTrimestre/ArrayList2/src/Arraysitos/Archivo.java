package Arraysitos;

public class Archivo {

	private String nombre;
	private String contenido;
	private int tamaño;
	
	public Archivo(String nombre, String contenido) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
		this.tamaño= contenido.length();
	}

	public Archivo() {
		super();
		this.nombre = "archivo1";
		this.contenido = "contenido1";
		this.tamaño= contenido.length();
			
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
		this.tamaño=contenido.length();
		
	}

	public double getTamaño() {
		return tamaño;
	}

	public String toString() {
		return "Archivo [nombre=" + nombre + ", contenido=" + contenido + ", tamaño=" + tamaño ;
	}
}
