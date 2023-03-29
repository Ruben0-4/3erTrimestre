package Examencito;

public class Perro extends Animales{

	protected Perro(String familia, String especie, String reino) {
		super(familia, especie, reino);
	}

	public String sonido() {
		String sonido;
		sonido="ladrido";
		return sonido;
	}

	public String comer() {
		String comer;
		comer="to lo que le heches";
		return comer;
	}

	public boolean reproducción() {
		boolean reproduccion;
		reproduccion=true;
		return reproduccion;
	}
}
