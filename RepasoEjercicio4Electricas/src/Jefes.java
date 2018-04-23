
public class Jefes extends Empleados{
	
	private String depJef;
	private static Integer plus=250;
	public Jefes(String dep, String depJef) {
		super(dep);
		this.depJef = depJef;
	}
	public String getDepJef() {
		return depJef;
	}
	public void setDepJef(String depJef) {
		this.depJef = depJef;
	}
	
	
	public static Integer getPlus() {
		return plus;
	}
	public static void setPlus(Integer plus) {
		Jefes.plus = plus;
	}
	@Override
	public String toString() {
		return "Jefes "+ super.toString()+"[depJef=" + depJef + plus+ "]";
	}
	
	
	
	
}
