
public class administrativo extends empleado {
	private String estudios;
	private Integer numOrdenador;
	public static Integer contaAdmin=0;
	public administrativo(String nombre, Integer edad, String estudios, Integer numOrdenador) {
		super(nombre, edad);
		contaAdmin++;
		this.estudios = estudios;
		this.numOrdenador = numOrdenador;
	}
	
	
	public static Integer getContaAdmin() {
		return contaAdmin;
	}


	public static void setContaAdmin(Integer contaAdmin) {
		administrativo.contaAdmin = contaAdmin;
	}


	public String getEstudios() {
		return estudios;
	}
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	public Integer getNumOrdenador() {
		return numOrdenador;
	}
	public void setNumOrdenador(Integer numOrdenador) {
		this.numOrdenador = numOrdenador;
	}
	@Override
	public String toString() {
		return " [estudios=" + estudios + ", numOrdenador=" + numOrdenador + super.toString()+"]";
	}
	

}
