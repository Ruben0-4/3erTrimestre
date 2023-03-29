package Códigos;

public class Partida {

	private String Jugadores; //Creamos las propiedades
	private int NdeRondas;
	private String Ganador;
	
public Partida(String Jugadores, int NdeRondas, String Ganador) { //Creamos un constructor con los datos que nos piden
	this.Jugadores="Jugador1, Jugador2"; //Creamos 2 jugadores como nos pide el ejercicio
	this.NdeRondas=0; //Constructor. La partida empieza en 0 rondas
	this.Ganador=""; // Constructor. Todavía no esta defnido el ganador de la partida
	}

public String getJugadores() { //Getters y setters de cada propiedad de la clase Partida
	return Jugadores;
}

public void setJugadores(String jugadores) {
	Jugadores = jugadores;
}

public int getNdeRondas() {
	return NdeRondas;
}

public void setNdeRondas(int ndeRondas) {
	NdeRondas = ndeRondas;
}

public String getGanador() {
	return Ganador;
}

public void setGanador(String ganador) {
	Ganador = ganador;
}

public String toString() { //Método toString de las característicasa del juego
	return "Partida [Jugadores=" + Jugadores + ", NdeRondas=" + NdeRondas + ", Ganador=" + Ganador + ", getJugadores()="
			+ getJugadores() + ", getNdeRondas()=" + getNdeRondas() + ", getGanador()=" + getGanador() + "]";
}


}
