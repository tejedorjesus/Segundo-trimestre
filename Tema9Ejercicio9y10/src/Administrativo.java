
public class Administrativo extends Empleado{
	

	private String estudios;
	private int ordenador;
	private static Integer contaAdmin=0;
	public Administrativo(String nombre, int edad, String estudios, int ordenador) {
		super(nombre, edad);
		contaAdmin++;
		this.estudios = estudios;
		this.ordenador = ordenador;
	}
	public static Integer getContaAdmin() {
		return contaAdmin;
	}
	public static void setContaAdmin(Integer contaAdmin) {
		Administrativo.contaAdmin = contaAdmin;
	}
	public String getEstudios() {
		return estudios;
	}
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	public int getOrdenador() {
		return ordenador;
	}
	public void setOrdenador(int ordenador) {
		this.ordenador = ordenador;
	}
	@Override
	public String toString() {
		return  super.toString() + "estudios=" + estudios + ", ordenador=" + ordenador + "]";
	}
	
	

}
