import java.util.Scanner;

public class Jefe extends Empleado{

	
/*	De los jefes nos interesa: nombre, sueldo, t�tulo y nombre del departamento del que es jefe*/
	
	String nombre= "";
	Integer sueldo=0;
	String titulo= "";
	String nombreDepartamento= "";
	public Jefe(String nombre, Integer sueldo, String titulo, String nombreDepartamento) {
		super(nombre, sueldo);
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.titulo = titulo;
		this.nombreDepartamento = nombreDepartamento;
	}
	
	

	public static String pedirnombre(String mensaje) {
		super pedirnombre(); 
		String s1;    
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		s1 = sc.nextLine();
		return s1;



	}


	public static Integer pedirsueldo(String mensaje){
		super.pedirsueldo();
		String numero = "";11
		int num;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(mensaje);
			numero = sc.nextLine();
		} while (!esNumerico(numero));
		num = Integer.parseInt(numero);
		return num;

	}
	public static Integer pedirtitulo(String mensaje){
		String numero = "";
		int num;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(mensaje);
			numero = sc.nextLine();
		} while (!esNumerico(numero));
		num = Integer.parseInt(numero);
		return num;

	}


	public static boolean esNumerico(String cadena) {
		boolean resultado;
		try {
			Integer.parseInt(cadena);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			resultado = false;
		}
		return resultado;
	}//esNumerico





	
	

}
