package pruebalibros;

public class Libro {
	
	
	private int titulo;
	private Autor autor;
	private int precio;
	private int catidad;
	public Libro(int titulo, Autor autor, int precio, int catidad) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.catidad = catidad;
	}
	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCatidad() {
		return catidad;
	}
	public void setCatidad(int catidad) {
		this.catidad = catidad;
	}
	
	

}
