package Códigos;

public class Superheroes {

	private String Nombre;
	private String Descripción;
	private boolean Capa;
	
public Superheroes() {
	this.Nombre="";
	this.Descripción="";
	this.Capa=false;
}

public Superheroes(String Nombre) {
	this.Nombre=Nombre;
	this.Descripción="";
	this.Capa=false;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public String getDescripción() {
	return Descripción;
}

public void setDescripción(String descripción) {
	Descripción = descripción;
}

public boolean isCapa() {
	return Capa;
}

public void setCapa(boolean capa) {
	Capa = capa;
}

public String toString() {
	String Capa="";
	if(this.Capa) {
		Capa="Tiene capa";
	}else {
		Capa="No tiene capa";
	}
	return "Superheroes [Nombre=" + Nombre + ", Descripción=" + Descripción + ", Capa=" + Capa + "]";
}
}
