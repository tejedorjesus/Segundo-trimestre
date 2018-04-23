package vehiculos;

public class Vehiculo {
	private Integer numeroRuedas;
	private Integer velocidadMax;
	private Integer velocidadActual;
	private Integer peso;


	public Vehiculo(Integer numeroRuedas, Integer velocidadMax, Integer velocidadActual, Integer peso) {
		super();
		this.numeroRuedas = numeroRuedas;
		this.velocidadMax = velocidadMax;
		this.velocidadActual = velocidadActual;
		this.peso = peso;
	}
	public Integer getNumeroRuedas() {
		return numeroRuedas;
	}
	public void setNumeroRuedas(Integer numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	public Integer getVelocidadMax() {
		return velocidadMax;
	}
	public void setVelocidadMax(Integer velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	public Integer getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(Integer velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Vehiculo [numeroRuedas=" + numeroRuedas + ", velocidadMax=" + velocidadMax + ", velocidadActual="
				+ velocidadActual + ", peso=" + peso + "]";
	}
	
	public boolean soniguales(Vehiculo vehiculoparametro){
		boolean soniguales = true ; 
		
		if (!this.numeroRuedas.equals(vehiculoparametro.numeroRuedas)){
			soniguales=false;
		
		}else if (!this.velocidadMax.equals(vehiculoparametro.velocidadMax)){
			soniguales=false;
		
		}else if (!this.velocidadActual.equals(vehiculoparametro.velocidadActual)){
				soniguales=false;
			
		}else if (!this.peso.equals(vehiculoparametro.peso)){
					soniguales=false;
				}
		
		return soniguales;
		
				}
	
	public void copia(Vehiculo parametro){
		parametro.numeroRuedas=this.numeroRuedas.intValue();
		parametro.peso=this.peso.intValue();
		parametro.velocidadMax=this.velocidadMax.intValue();
		parametro.velocidadActual=this.velocidadActual.intValue();
	
		
	}
				
				
				
	}
	
	
