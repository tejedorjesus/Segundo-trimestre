
public class Automovil {
	private String marca= "";
	private String modelo="";
	private Integer cilindrada;
	private Integer precio ;
	public Automovil(String marca, String modelo, Integer cilindrada, Integer precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", precio=" + precio
				+ "]";
	}
	
	

}
