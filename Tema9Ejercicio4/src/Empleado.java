
public class Empleado {
	
	
	
	/*De cada empleado nos interesa: nombre de la empresa, nombre del
	empleado, edad, porcentaje de incremento de sueldo y sueldo base. */
	
	private final static String nombreEmpresa= "Electricas";
	private static int sueldo;
	private double porcentaje;
	private String nombre="";
	private int edad;
	

	    private static int contaemp;
	  
	    
	    

	
	public Empleado(int porcentaje, String nombre, int edad) {
	    contaemp++;
		
		
		
		this.porcentaje = porcentaje;
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	 public static int getcontaEmp() {
	        return contaemp;
	    }
	 
	



	
	public static int getSueldo() {
		return sueldo;
	}
	public static void setSueldo(int sueldo) {
		Empleado.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "\n NombreEmpresa=" + nombreEmpresa + "\n sueldobase=" + sueldo + "\n porcentaje=" + porcentaje
				+ "\n nombre=" + nombre + "\n edad=" + edad +"\n ";
	}
	
	
	
	
	
	
	


}
