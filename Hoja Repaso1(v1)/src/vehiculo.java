
public class vehiculo {

	private int numeroDeRuedas;
	private int velocidadMax;
	private int velocidadActual;
	private int peso;
	public vehiculo(int numeroDeRuedas, int velocidadMax, int velocidadActual, int peso) {
	
		this.numeroDeRuedas = numeroDeRuedas;
		this.velocidadMax = velocidadMax;
		this.velocidadActual = velocidadActual;
		this.peso = peso;
	}
	public int getNumeroDeRuedas() {
		return numeroDeRuedas;
	}
	public void setNumeroDeRuedas(int numeroDeRuedas) {
		this.numeroDeRuedas = numeroDeRuedas;
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
	
	
	public boolean esIgual(vehiculo vehiculo) {
		if (vehiculo.numeroDeRuedas ==(this.numeroDeRuedas) && vehiculo.velocidadMax==(this.velocidadMax)
				&& vehiculo.velocidadActual==(this.velocidadActual) && vehiculo.peso==(this.peso)) {
			return true;
		} else {
			return false;
		}
		 
		
	
	}
	 }

