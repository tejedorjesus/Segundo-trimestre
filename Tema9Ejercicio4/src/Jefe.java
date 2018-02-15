
public class Jefe extends  Empleado{

	
	
	
	private String nombreDep="";
	private static double plus= 250;
	private static int contajef;
	public Jefe(int porcentaje, String nombre, int edad, String nombreDep) {
	
		super(porcentaje, nombre, edad);
		contajef++;
		this.nombreDep = nombreDep;
	}
	public String getNombreDep() {
		return nombreDep;
	}
	public void setNombreDep(String nombreDep) {
		this.nombreDep = nombreDep;
	}
	
	public static int getContajef() {
		return contajef;
	}

	public static double getPlus() {
		return plus;
	}
	public static void setPlus(double plus) {
		Jefe.plus = plus;
	}
	@Override
	public String toString() {
		return  super.toString() + "nombreDep=" + nombreDep + "\n plus=" + plus;
	}
	
	
	
	
}
