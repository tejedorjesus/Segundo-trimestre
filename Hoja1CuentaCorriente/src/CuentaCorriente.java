import java.util.Scanner;
public class CuentaCorriente {
	private String numCuenta;
	private int saldo;
	private String nombreCliente;
	Scanner sc = new Scanner(System.in);
	
	
	public CuentaCorriente(String numCuenta,String nombreCliente, int saldo) {
		Scanner sc = new Scanner(System.in);
		
		this.numCuenta = numCuenta;
		
		this.saldo = saldo;
		 

		this.nombreCliente = nombreCliente;
		
	
	}
	
	public int ingresar(int cantidad) {
		saldo =saldo+cantidad;
		return this.saldo;
	}
	

	
	public boolean retirar (int cantidad){
		System.out.println("tecle el importe del reintegro");
	 cantidad= sc.nextInt();
		if (saldo>=cantidad) {
			saldo = saldo-cantidad;
			System.out.println(" su saldo actual es: " + saldo + "euros");
			return true;
			
			
		}else{
			 System.out.println("no puede retirar esa cantidad saldo insuficiente");
			return false;
		}
		
		
	}
	public String visualizar() {
		String estado;
	
		estado= "Cuentacorriente [numero=" + numCuenta + ", saldo=" + saldo + ", cliente=" + nombreCliente + "]";
	return estado;
	}
	


	
	
	

}
