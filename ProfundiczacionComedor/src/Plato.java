
public class Plato extends Ingrediente {
	
	private Integer precio;

	public Plato(String ingredientes, Integer precio) {
		super(ingredientes);
		this.precio = precio;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	

}
