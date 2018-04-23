
public class Jefe extends Empleado{
	
	private String titulo;
	private String dep;
	public Jefe(String nombre, Integer sueldo, String titulo, String dep) {
		super(nombre, sueldo);
		this.titulo = titulo;
		this.dep = dep;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Jefe "+ super.toString() + "[titulo=" + titulo + ", dep=" + dep + "]";
	}
	
	

}
