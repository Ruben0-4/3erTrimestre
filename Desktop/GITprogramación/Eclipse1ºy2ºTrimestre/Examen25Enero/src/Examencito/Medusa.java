package Examencito;

public class Medusa extends Animales{
	
	protected Medusa(String familia, String especie, String reino) {
		super(familia, especie, reino);
	}

	public String sonido() {
		String sonido;
		sonido="glu glu?";
		return sonido;
	}

	public String comer() {
		String comer;
		comer="las medusas comen algo?";
		return comer;
	}

	public boolean reproducción() {
		boolean reproduccion;
		reproduccion=true;
		return reproduccion;
	}

}
