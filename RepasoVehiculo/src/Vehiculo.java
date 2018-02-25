
public class Vehiculo {
	
	private Integer numeroRuedas;
	private Integer velocidadMax;
	private Integer velocidadActual;
	private Integer peso;
	public Vehiculo(int numeroRuedas, int velocidadMax, int velocidadActual, int peso) {
		super();
		this.numeroRuedas = numeroRuedas;
		this.velocidadMax = velocidadMax;
		this.velocidadActual = velocidadActual;
		this.peso = peso;
	}
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	public int getVelocidadMax() {
		return velocidadMax;
	}
	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	public void copia(Vehiculo vehiculo) {
		vehiculo.numeroRuedas = this.numeroRuedas;
		vehiculo.velocidadMax = this.velocidadMax;
		vehiculo.velocidadActual = this.velocidadActual;
		vehiculo.peso = this.peso;
		
		
		
	}
	
	public boolean esIgual(Vehiculo vehiculo){
		if (vehiculo.numeroRuedas.equals(this.numeroRuedas)&&vehiculo.velocidadMax.equals
				(this.velocidadMax)&&vehiculo.velocidadActual.equals(this.velocidadActual)&&vehiculo.peso.equals(this.peso)){
			return true;
		}else{
			return false;
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Vehiculo [numeroRuedas=" + numeroRuedas + ", velocidadMax=" + velocidadMax + ", velocidadActual="
				+ velocidadActual + ", peso=" + peso + "]";
	}
	

}
