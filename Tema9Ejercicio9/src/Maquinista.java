
public class Maquinista extends Empleado{
	
	
	
	private int numeroMaq;
	private int anios;
	public Maquinista(String nombre, int edad, int numeroMaq, int anios) {
		super(nombre, edad);
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
	
	@Override
	public String toString() {
		return super.toString() +  "numeroMaq=" + numeroMaq + ", anios=" + anios + "]";
	}
	
	
	
	}

	
	

