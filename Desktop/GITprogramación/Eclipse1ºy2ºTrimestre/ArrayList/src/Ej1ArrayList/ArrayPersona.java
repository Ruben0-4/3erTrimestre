package Ej1ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayPersona {

	private ArrayList<Persona> ArrayPersona = new ArrayList<>();

    public ArrayPersona() {
    }

    public ArrayPersona(ArrayList<Persona> arrayPersona) {
        ArrayPersona = arrayPersona;
    }

    public ArrayList<Persona> getArrayPersona() {
        return ArrayPersona;
    }

    public void setArrayPersona(ArrayList<Persona> arrayPersona) {
        ArrayPersona = arrayPersona;
    }

    @Override
    public String toString() {
        return "arrayPersona [ArrayPersona=" + ArrayPersona + "]";
    }

    public void ArrayReverse() {
        Collections.reverse(ArrayPersona);
    }
}
