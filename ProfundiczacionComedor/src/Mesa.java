
public class Mesa extends Menu{
	
	private Integer comensales;

	public Mesa(String ingredientes, Integer precio, String bebida, String postre, Integer comensales) {
		super(ingredientes, precio, bebida, postre);
		this.comensales = comensales;
	}

	public Integer getComensales() {
		return comensales;
	}

	public void setComensales(Integer comensales) {
		this.comensales = comensales;
	}

	
	

}
