package Códigos;

public class Jugador {
	
	private String Nombre; //Creamos las propiedades
	private int Dado;
	private int Puntuacion;
	
public Jugador() { //Creamos un constructor vacío
	this.Nombre="";
	this.Dado=0;
	this.Puntuacion=0;
	}

public Jugador(String Nombre, int Dado, int Puntuacion) { //Creamos un constructor con los datos que nos piden
	this.Nombre=Nombre; 
	this.Dado=Dado;
	this.Puntuacion=0;
	}

public String getNombre() { //Getters y setters de cada propiedad de la clase Jugador
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public int getDado() {
	return Dado;
}

public void setDado(int dado) {
	Dado = dado;
}

public int getPuntuacion() {
	return Puntuacion;
}

public void setPuntuacion(int puntuacion) {
	Puntuacion = puntuacion;
}

public void tirar() {
	Puntuacion= Dado.tirar();
}

public String toString() { //Método toString de la clase Jugador
	return "Jugador [Nombre=" + Nombre + ", Dado=" + Dado + ", Puntuacion=" + Puntuacion + ", getNombre()="
			+ getNombre() + "]";
}

}
