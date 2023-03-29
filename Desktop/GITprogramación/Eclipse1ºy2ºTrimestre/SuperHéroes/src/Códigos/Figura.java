package Códigos;

public class Figura {

	private String Código;
	private double Precio;
	private Dimensión Dimension=new Dimensión();
	private Superheroes Superheroes=new Superheroes();
	
	public Figura(String código, double precio, Dimensión dimension, Superheroes superheroes) {
		if (precio>0) {
		this.Código = código;
		this.Precio = precio;
		this.Dimension = dimension;
		this.Superheroes = superheroes;
		}
	}

	public String getCódigo() {
		return Código;
	}

	public void setCódigo(String código) {
		Código = código;
	}

	public double getPrecio() {
		return Precio;
	}

	public boolean setPrecio(double precio) {
		boolean correcto=false;
		if (precio>0) {
		Precio = precio;
		correcto=true;
		}
		return correcto;
	}

	public Dimensión getDimension() {
		return Dimension;
	}

	public void setDimension(Dimensión dimension) {
		Dimension = dimension;
	}

	public Superheroes getSuperheroes() {
		return Superheroes;
	}

	public void setSuperheroes(Superheroes superheroes) {
		Superheroes = superheroes;
	}

	public String toString() {
		return "Figura [Código=" + Código + ", Precio=" + Precio + ", Dimension=" + Dimension + ", Superheroes="
				+ Superheroes + "]";
	}

	public void subirprecio(double cantidad) {
		this.setPrecio(this.Precio+=cantidad);
	}
}
