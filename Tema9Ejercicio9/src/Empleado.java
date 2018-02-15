

/*nombre, sueldo base (el mismo para todos) y
edad*/
public class Empleado {
	
	
	private String nombre;
	private static int Sueldobase=1000;
	private   Integer edad;
	private static Integer contaEmp=0;
	private static Integer contaEdad=0;
	
	
	public Empleado(String nombre, int edad) {
		
		super();
		contaEmp ++;
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public  Integer getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static Integer getContaEmp() {
		return contaEmp;
	}
	public static void setContaEmp(Integer contaEmp) {
		Empleado.contaEmp = contaEmp;
	}
	@Override
	public String toString() {
		return " nombre=" + nombre + ", edad=" + edad + "]";
	}
	
		
	

}
