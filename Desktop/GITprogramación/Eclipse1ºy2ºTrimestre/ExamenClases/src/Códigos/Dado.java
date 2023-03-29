package Códigos;

public class Dado {

	private int Caras; //Creamos las propiedades
	private int Trucado;
	
public Dado() { //Creamos un constructor vacío
	this.Caras=0;
	this.Trucado=0;
	}

public Dado(int Caras, int Trucado) { //Creamos un constructor con los datos que nos piden
	this.Caras=Caras;
	this.Trucado=Trucado;
	}

public int getCaras() { //Getters y setters de cada propiedad de la clase Dado
	return Caras;
}

public void setCaras(int caras) {
	Caras = caras;
}

public int getTrucado() {
	return Trucado;
}

public void setTrucado(int trucado) {
	Trucado = trucado;
}

public String toString() { //Método toString de la clase Dado
	return "Dado [Caras=" + Caras + ", Trucado=" + Trucado + "]";
	
}

public void lanzardado(int numero) { //Método tirar 
	this.setCaras(this.Caras=numero);
}

public int tirar;
int resultado;
int dadotrucado;
if (!resultado) {
	resultado=(int)(Math.ramdom()*Caras+1;)
	}else {
}
}
