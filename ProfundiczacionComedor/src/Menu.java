
public class Menu extends Plato{
	
	
	private String bebida="";
	private String postre="";
	public Menu(String ingredientes, Integer precio, String bebida, String postre) {
		super(ingredientes, precio);
		this.bebida = bebida;
		this.postre = postre;
	}
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public String getPostre() {
		return postre;
	}
	public void setPostre(String postre) {
		this.postre = postre;
	}
	
	
}
