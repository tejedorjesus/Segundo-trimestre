
public class Maquinista extends Empleado{
	
	
	
	private int numeroMaq;
	private int anios;
	private static Integer contaMaq=0;
	public Maquinista(String nombre, int edad, int numeroMaq, int anios) {
		super(nombre, edad);
		contaMaq++;
		this.numeroMaq = numeroMaq;
		this.anios = anios;
	}
	public int getNumeroMaq() {
		return numeroMaq;
	}
	public void setNumeroMaq(int numeroMaq) {
		this.numeroMaq = numeroMaq;
	}
	public int getAnios() {
		return anios;
	}
	public void setAnios(int anios) {
		this.anios = anios;
	}
	
	
	public static Integer getContaMaq() {
		return contaMaq;
	}
	public static void setContaMaq(Integer contaMaq) {
		Maquinista.contaMaq = contaMaq;
	}
	@Override
	public String toString() {
		return super.toString() +  "numeroMaq=" + numeroMaq + ", anios=" + anios + "]";
	}
	
	
	
	}

	
	

