	import java.util.Scanner;
public class vehiculos {


		
		
		
		private Integer numeroDeRuedas;
		private Integer velocidadMax;
		private Integer velocidadActual;
		private Integer peso;
		public vehiculos(Integer numeroDeRuedas, Integer velocidadMax, Integer velocidadActual, Integer peso) {
		
			this.numeroDeRuedas = numeroDeRuedas;
			this.velocidadMax = velocidadMax;
			this.velocidadActual = velocidadActual;
			this.peso = peso;
		}// end vehiculos
		public Integer getNumeroDeRuedas() {
			return numeroDeRuedas;
		}
		public void setNumeroDeRuedas(Integer numeroDeRuedas) {
			this.numeroDeRuedas = numeroDeRuedas;
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
		
		 public boolean esIgual(vehiculos vehiculo){
			 if (vehiculo.numeroDeRuedas==(this.numeroDeRuedas)&& vehiculo.velocidadMax==(this.velocidadMax)&&vehiculo.velocidadActual==(this.velocidadActual)
					 && vehiculo.peso==(this.peso)){	 
			 return true;
			 }else{
				 return false;
			 }
		 }
		
		 public void copia(vehiculos vehiculo){
			 vehiculo.numeroDeRuedas=this.numeroDeRuedas;
			 vehiculo.peso = this.peso;
			 vehiculo.velocidadActual = this.velocidadActual;
			 vehiculo.velocidadMax = this.velocidadMax;
		 }
		@Override
		public String toString() {
			return "vehiculos [numeroDeRuedas=" + numeroDeRuedas + ", velocidadMax=" + velocidadMax
					+ ", velocidadActual=" + velocidadActual + ", peso=" + peso + "]";
		}
		
		
	}



