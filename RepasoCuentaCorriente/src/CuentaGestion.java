
public class CuentaGestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numCuenta1="001";
		String numCuenta2="002";
		double saldo=0;
		String cliente="";
		int opcion=0;

		Cuenta cuenta1=null;
		Cuenta cuenta2=null;
		
		cliente=Metodos.pedirnombre("Vamos a crear las cuentas introduzca el nombre del titular de la cuenta 001");
		cuenta1 = new Cuenta(numCuenta1,saldo,cliente);
		System.out.println(cuenta1);
		cliente=Metodos.pedirnombre("Vamos a crear las cuentas introduzca el nombre del titular de la cuenta 002");
		cuenta2 = new Cuenta(numCuenta2,saldo,cliente);
		System.out.println(cuenta2);
		
		
		
		

		opcion=Metodos.pedirentero("1-ingresar en 001 \n2-ingresar en 002 \n3-sacar de la 001 \n4-sacar de la 002 \n5 visualizar estado");
		while (opcion !=0){
		switch (opcion) {
		
		
		case 1:
			
			System.out.println(cuenta1.Ingresar(saldo));
			
			

			break;
		case 2:
			System.out.println(cuenta2.Ingresar(saldo));

			break;
		case 3:
			System.out.println(cuenta1.Retirar(saldo));
			break;

		case 4:
			System.out.println(cuenta2.Retirar(saldo));
			break;
		case 5:


			System.out.println(cuenta1);
			System.out.println(cuenta2);
			
			break;



		default:
			break;
		}
		opcion=Metodos.pedirentero( "1-ingresar en 001 \n2-ingresar en 002 \n3-sacar de la 001 \n4-sacar de la 002 \n5 visualizar estado");
		
		}







	}

}
