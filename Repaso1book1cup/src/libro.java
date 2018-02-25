
public class libro {
	
	
	private  String titulo;
	private autor Autor;
	private  double precio;
	private  int cantidad  = 0;


	public libro(String titulo, autor Autor, double precio, int cantidad) {
		super();
		this.titulo = titulo;
		this.Autor=Autor;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public  String cadenaLibro() {
		return  "libro [titulo=" + titulo + ", " + Autor.cadenaAutor()  + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	

}
