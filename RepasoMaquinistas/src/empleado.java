
public class empleado {
	private String nombre;
	private static Integer sueldoBase=1000;
	private Integer edad;
	private static Integer contaemp=0;
	public empleado(String nombre, Integer edad) {
		super();
		contaemp ++;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public static Integer getContaemp() {
		return contaemp;
	}


	public static void setContaemp(Integer contaemp) {
		empleado.contaemp = contaemp;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static Integer getSueldoBase() {
		return sueldoBase;
	}
	public static void setSueldoBase(Integer sueldoBase) {
		empleado.sueldoBase = sueldoBase;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", edad=" + edad + "sueldo base "+ sueldoBase +"]";
	}

	
	
}
	

