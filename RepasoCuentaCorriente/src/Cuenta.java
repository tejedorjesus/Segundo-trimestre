
public class Cuenta {

	
	
	 private String numCuenta="";
	 private double saldo;
	 private String cliente="";
	public Cuenta(String numCuenta, double saldo, String cliente) {
		
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String Ingresar(double saldo){
		String mensaje;
		
		saldo=Metodos.pedirentero("Cuanto dinero quieres ingresar");
		
		this.saldo=this.saldo+saldo;
		mensaje=" ha introducido usted "+ saldo + "euros y  su saldo actual es " +this.saldo + "�";
		
		
		return mensaje;
	}
	public String Retirar(double saldo){
		String mensaje;
		
		saldo=Metodos.pedirentero("Cuanto dinero quieres retirar");
		if(saldo>this.saldo){
			mensaje="you dont have enough cash";
		}else{
		
		this.saldo=this.saldo-saldo;
		mensaje=" ha retirado usted "+ saldo + "euros y su saldo actual es " +this.saldo + "�";
		 
		
		}
		return mensaje;
	}
	
	@Override
	public String toString() {
		return "Cuenta"+ numCuenta+" [numCuenta=" + numCuenta + ", saldo=" + saldo + "�, cliente=" + cliente + "]";
	}
	
	
	
		
	}
	
	 
	 
	
	
	

