package Códigos;

public class Dimensión {

	private double Alto;
	private double Ancho;
	private double Profundidad;
	
public Dimensión() {
	this.Alto=0;
	this.Ancho=0;
	this.Profundidad=0;
}

public Dimensión(double Alto, double Ancho, double Profundidad) {
	if (Alto>0 || Ancho>0 || Profundidad>0)
	this.Alto=Alto;
	this.Ancho=Ancho;
	this.Profundidad=Profundidad;

}

public double getAlto() {
	return Alto;
}

public boolean setAlto(double alto) {
	boolean correcto=true;
	if(alto>0) {
		this.Alto=alto;
	}else {
		correcto=false;
	}
	return correcto;
}

public double getAncho() {
	return Ancho;
}

public boolean setAncho(double ancho) {
	boolean correcto=true;
	if(ancho>0) {
		this.Ancho=ancho;
	}else {
		correcto=false;
	}
	return correcto;
}

public double getProfundidad() {
	return Profundidad;
}

public boolean setProfundidad(double profundidad) {
	boolean correcto=true;
	if(profundidad>0) {
		this.Profundidad=profundidad;
	}else {
		correcto=false;
	}
	return correcto;
}

public double getVolumen() {
	
	return this.Alto*this.Ancho*this.Profundidad; 
}

public String toString() {
	return "Dimensión [Alto=" + Alto + ", Ancho=" + Ancho + ", Profundidad=" + Profundidad + ", getVolumen()="
			+ getVolumen() + "]";
}


}