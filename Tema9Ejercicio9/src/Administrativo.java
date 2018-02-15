
public class Administrativo extends Empleado{
	

	private String estudios;
	private int ordenador;
	public Administrativo(String nombre, int edad, String estudios, int ordenador) {
		super(nombre, edad);
		this.estudios = estudios;
		this.ordenador = ordenador;
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
