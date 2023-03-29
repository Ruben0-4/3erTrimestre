package Examencito;

public abstract class Animales {
	//Creamos la clase abstracta Animales y su familia, reino y especie
	protected String familia;
	protected String especie;
	protected String reino;
	//Creamos los consultores y modificadores de las clases
	protected Animales(String familia, String especie, String reino) {
		this.familia=familia;
		this.especie=especie;
		this.reino=reino;
	}
	
	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	//Creamos los métodos sonido, comer y reproducción para las 3 clases que crearemos
	public abstract String sonido();
	public abstract String comer();
	public abstract boolean reproducción();
	
}

