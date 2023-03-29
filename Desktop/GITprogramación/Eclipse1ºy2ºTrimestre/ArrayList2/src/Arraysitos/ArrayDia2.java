package Arraysitos;

public class ArrayDia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Archivo a1= new Archivo();
		
		System.out.println(a1);
		
		DiscoDuro d1= new DiscoDuro(4);
		
		System.out.println(d1.GuardarArchivo(a1)); 
		System.out.println(d1.GuardarArchivo(a1)); 
		System.out.println(d1.GuardarArchivo(a1)); 
		System.out.println(d1.GuardarArchivo(a1)); 
		System.out.println(d1.GuardarArchivo(a1)); 
		
		
		
		System.out.println(d1.ListarContenido());
		System.out.println(d1.EliminarArchivo("archivo1"));
		System.out.println(d1.ListarContenido());
		
	}
	}
