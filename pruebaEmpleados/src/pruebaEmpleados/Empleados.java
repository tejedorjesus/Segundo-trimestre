package pruebaEmpleados;

public class Empleados {
	
	
	
	private static String nombreEmpresa="La gran estafa";
	private final Integer SueldoBase=1000;
	private String nombre="";
	private Integer edad;
	private Integer porcentaje;
	public Empleados(String nombre, Integer edad, Integer porcentaje) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.porcentaje = porcentaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}
	@Override
	public String toString() {
		return "Empleados [SueldoBase=" + SueldoBase + ", nombre=" + nombre + ", edad=" + edad + ", porcentaje="
				+ porcentaje + "]";
	}
	
	
	
}
