package Examencito;

public class Pato extends Animales{

	protected Pato(String familia, String especie, String reino) {
		super(familia, especie, reino);

	}
	public String sonido() {
		String sonido;
		sonido="Kuak";
		return sonido;
	}

	public String comer() {
		String comer;
		comer="Peces e hierba";
		return comer;
	}

	public boolean reproducción() {
		boolean reproduccion;
		reproduccion=true;
		return reproduccion;
	}
}
