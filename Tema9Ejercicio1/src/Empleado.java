import java.util.Scanner;

public class Empleado {

	String nombre="";
	Integer sueldo=0;
	public Empleado(String nombre, Integer sueldo) {

		this.nombre = nombre;
		this.sueldo = sueldo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getSueldo() {
		return sueldo;
	}


	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}


	public static String pedirnombre(String mensaje) {
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		s1 = sc.nextLine();
		return s1;



	}


	public static Integer pedirsueldo(String mensaje){
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


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	

	




	

}
