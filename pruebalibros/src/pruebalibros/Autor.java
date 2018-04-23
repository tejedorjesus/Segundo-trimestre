package pruebalibros;

public class Autor {

	private String nombre;
	private String email;
	private char genero;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public Autor(String nombre, String email, char genero) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.genero = genero;
	}
}
