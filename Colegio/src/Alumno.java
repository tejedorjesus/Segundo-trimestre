
public class Alumno {
	
	
	private String nombre;
	private Integer edad;
	private Asignatura [] matricula;
	private float[] notas;
	private Integer numAsignaturas;
	public Alumno(String nombre, Integer edad, float[] notas, Integer numAsignaturas) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		matricula = new Asignatura[10];
		this.notas = notas;
		this.numAsignaturas = numAsignaturas;
	}
	
	

}
