
public class autor {





	private String nombre;
	private String email;
	private String genero; 




	public autor(String nombre, String email, String genero) {

		this.nombre = nombre;
		this.email = email;
		this.genero = genero;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNombre() {
		return nombre;
	}







	public String getGenero() {
		return genero;
	}



	
	public String cadenaAutor() {
		return  " Autor [nombre=" + nombre + ", email=" + email + ", genero=" + genero + "]";
	}
	/*System.out.println(Libros[i].cadenaLibro());*/







}
