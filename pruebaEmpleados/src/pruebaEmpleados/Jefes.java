package pruebaEmpleados;

public class Jefes extends Empleados {
	
	private final  Integer plusJefes=250;
	private String depResp="";
	public Jefes(String nombre, Integer edad, Integer porcentaje, String depResp) {
		super(nombre, edad, porcentaje);
		this.depResp = depResp;
	}
	@Override
	public String toString() {
		return "Jefes [plusJefes=" + plusJefes + ", depResp=" + depResp + "]";
	}
	
	


}
