package Codiguitos;

public class Persona {
	private int peso;
	private int altura;
	private String nombre;
	private String sexo;
	private String DNI;
	private int edad;
	private int IMC;
	
public Persona() {
	this.peso=0;
	this.altura=0;
	this.nombre="";
	this.sexo="";
	this.DNI="";
	this.edad=0;
	this.IMC=0;
	
}
public Persona(int peso, int altura, String nombre, String sexo, String DNI, int edad, int IMC) {
	this.peso=peso;
	this.altura=altura;
	this.nombre=nombre;
	this.sexo=sexo;
	this.DNI=DNI;
	this.edad=edad;
	this.IMC=IMC;

}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}
public int getAltura() {
	return altura;
}
public void setAltura(int altura) {
	this.altura = altura;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public String getDNI() {
	return DNI;
}
public void setDNI(String dNI) {
	DNI = dNI;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

public void IMC() {
	this.IMC=this.peso/this.altura;

}

public String OMS() {
	String res="";
	if (this.IMC < 18.5) {
		res="Bajo peso";
	}else {
		if (this.IMC>18.5 && this.IMC<24.9);
	}
}
}
