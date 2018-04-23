
public class Alumno {
	
	private Asignatura asignatura;
	private Integer nota;
	private String nombreAlumno;
	private Integer fechaNac;
	public Alumno(Asignatura asignatura, Integer nota, String nombreAlumno, Integer fechaNac) {
		super();
		this.asignatura = asignatura;
		this.nota = nota;
		this.nombreAlumno = nombreAlumno;
		this.fechaNac = fechaNac;
	}
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public Integer getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Integer fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
	
	
	
	
	
	

}
