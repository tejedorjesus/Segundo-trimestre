import java.util.Scanner;

public class Jefe extends Empleado{


	/*	De los jefes nos interesa: nombre, sueldo, t�tulo y nombre del departamento del que es jefe*/
	private int  Sueldojefe=500;
	private String titulo= "";
	private String nombreDepartamento= "";



	
	public Jefe( String  nombre, int sueldo, String titulo, String nombreDepartamento) {
		super(nombre, sueldo);
		this.titulo = titulo;
		this.nombreDepartamento = nombreDepartamento;
	}




	@Override
	public String toString() {
		return "Estos son los datos de jefe que a la vez es " +super.toString()+"titulo=" + titulo + ", nombreDepartamento=" 
	
				+ nombreDepartamento + ",\nel sueldo final con la bonificacion de 500 euros es :" + (Sueldojefe + super.getSueldo())
				+ "]";
	}
	
	








}
