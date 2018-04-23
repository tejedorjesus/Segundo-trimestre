
public class Ingrediente {
	
	private String ingredientes;

	public Ingrediente(String ingredientes) {
		super();
		this.ingredientes = ingredientes;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Ingrediente [ingredientes=" + ingredientes + "]";
	}
	

}
