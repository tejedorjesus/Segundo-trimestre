
public class Cuenta {



	private String numCuenta;
	private double saldo;
	private String cliente="";
	static int contacuentas=0;
	private static int totalCuentasAbiertas = 1;
	private static int totalCuentasCreadas = 0;
	public Cuenta( double saldo, String cliente) {

		
		this.numCuenta = "00"+(contacuentas+1);
		this.saldo = saldo;
		this.cliente = cliente;
		contacuentas++;
		totalCuentasAbiertas++;
		totalCuentasCreadas ++;
		
	}
	
	
	public static int getContacuentas() {
		return contacuentas;
	}

	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta+contacuentas;
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
	
	public void cerrarCuenta() {
		int contacerradas=0;
		cliente += "*[CERRADA]*";
		saldo = 0.0;
		contacuentas --;
		contacerradas++;
	}
	public static Cuenta fusiona(Cuenta unaCuenta, Cuenta otraCuenta) {
		Double saldoDeFusion;

				saldoDeFusion = (unaCuenta.saldo + otraCuenta.saldo);
				Cuenta cuentaFusionada = new Cuenta(saldoDeFusion, unaCuenta.cliente);
				// Numero de cuenta correspondiente a las cuentas creadas
				// y no a las activas para que coincidan los indices
				// y los numeros de cuenta
				cuentaFusionada.numCuenta = "0" + (contacuentas);
				unaCuenta.cerrarCuenta();
				otraCuenta.cerrarCuenta();
				return cuentaFusionada;
		
		
		
		
	}
	
	@Override
	public String toString() {
		return "Cuenta"+ numCuenta+" [numCuenta=" + numCuenta + ", saldo=" + saldo + "�, cliente=" + cliente + "]";
	}




}







