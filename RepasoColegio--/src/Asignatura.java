
public class Asignatura {
	
 private String nombreAsignatura;
 private Integer numeroHoras;
 private Integer nivel;
public Asignatura(String nombreAsignatura, Integer numeroHoras, Integer nivel) {
	super();
	this.nombreAsignatura = nombreAsignatura;
	this.numeroHoras = numeroHoras;
	this.nivel = nivel;
}
public String getNombreAsignatura() {
	return nombreAsignatura;
}
public void setNombreAsignatura(String nombreAsignatura) {
	this.nombreAsignatura = nombreAsignatura;
	
}
public Integer getNumeroHoras() {
	return numeroHoras;
}
public void setNumeroHoras(Integer numeroHoras) {
	this.numeroHoras = numeroHoras;
}
public Integer getNivel() {
	
	return nivel;


	}
	
	

public void setNivel(Integer nivel) {

	this.nivel = nivel;
	
}
@Override
public String toString() {
	return "Asignatura [nombreAsignatura=" + nombreAsignatura + ", numeroHoras=" + numeroHoras + ", nivel=" + nivel
			+ "]";
}
 

	
	
	
	
	
}
