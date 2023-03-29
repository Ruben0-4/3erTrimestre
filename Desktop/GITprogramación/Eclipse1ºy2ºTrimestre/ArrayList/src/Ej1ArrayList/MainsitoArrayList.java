package Ej1ArrayList;

import java.util.ArrayList;

public class MainsitoArrayList {

	public static void main(String[] args) {
		
		Persona Caba = new Persona();
        Persona Tonete = new Persona();
        Persona Cifu = new Persona();

        ArrayList<Persona> personas = new ArrayList<>();

        ArrayPersona arraypersona = new ArrayPersona(personas);

        personas.add(Caba);
        personas.add(Tonete);
        personas.add(Cifu);

        arraypersona.ArrayReverse();

        System.out.println(arraypersona);

	}

}
