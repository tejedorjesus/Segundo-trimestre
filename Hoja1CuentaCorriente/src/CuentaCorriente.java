import java.util.Scanner;
public class CuentaCorriente {
	private String numCuenta;
	private Double saldo;
	private String nombreCliente;
	
	public CuentaCorriente(String numCuenta, double saldo, String nombreCliente) {
		
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.nombreCliente = nombreCliente;
	}
	
	public void ingresar(double cantidad){
		saldo=saldo+cantidad;
		
	}
	
	public boolean retirar (double cantidad){
		if (saldo>0  ) {
			
		}
		
		
	}
	
	public double visualizar (){
		
	}


	
	
	

}
