
public class Empleados {
	
	private static String nombreEmpresa="Electricas";
	private static Integer sueldoBase=1000;
	private String dep;
	public Empleados(String dep) {
		super();
		this.dep = dep;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
	
	
	public static Integer getSueldoBase() {
		return sueldoBase;
	}
	public static void setSueldoBase(Integer sueldoBase) {
		Empleados.sueldoBase = sueldoBase;
	}
	public void modificar(){
		int nsueldoBase=0;
		sueldoBase=sueldoBase+ nsueldoBase;
		
		
		
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Empleados [dep=" + dep +nombreEmpresa+ sueldoBase+"]";
	}
	
	
	

}
