import java.util.Scanner;



public class CuentaCorrienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numeroCuenta = " ";
		String estado = "";
		int saldoactual;
		String cliente;
		int empezar=0;
		int cantidad=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1-crear cuaenta 001 \n2- crear cuenta 002\n3- ingresar en 001 \n4-ingresar en 002\n5-retirar en 001\n6-retirar en 002\n7-ver estado 001 y 002\n0-salir");
		empezar = sc.nextInt();
	
		CuentaCorriente crearcuenta1, crearcuenta2=null;
		 crearcuenta1=null;
		
		while (empezar != 0) {
			switch (empezar) {
			case 1:

				
				
				
				System.out.println("introduce tu saldo");
				saldoactual= sc.nextInt();
				sc.nextLine();
				System.out.println("introduce tu nombre");
				cliente= sc.nextLine();

				crearcuenta1= new CuentaCorriente(numeroCuenta ="001",  cliente, saldoactual );
				System.out.println("su saldo es "+ saldoactual + " euros, su cuenta es la " +numeroCuenta+ " y el nombre del titular es " + cliente );
				System.out.println(crearcuenta1.visualizar());


				break;
			case 2:
				System.out.println("introduce tu saldo");
				saldoactual= sc.nextInt();
				sc.nextLine();
				System.out.println("introduce tu nombre");
				cliente= sc.nextLine();
				crearcuenta2= new CuentaCorriente(numeroCuenta ="002", cliente, saldoactual );
				System.out.println("su saldo es "+ saldoactual + " euros, su cuenta es la " +numeroCuenta+ " y el nombre del titular es " + cliente );
				System.out.println(crearcuenta2.visualizar());
				
				break;
			case 3:
				System.out.println("intoduce dinero a ingresar");
				cantidad= sc.nextInt();
			System.out.println("el saldo de la cuenta 001 es"+crearcuenta1.ingresar(cantidad));				
			
				
				break;
			case 4:
				System.out.println("intoduce dinero a ingresar");
				cantidad= sc.nextInt();
				crearcuenta2.ingresar(cantidad);
				System.out.println("el saldo de la cuenta 002 es"+crearcuenta2 .ingresar(cantidad));				
				
				break;
				
			case 5:
		         crearcuenta1.retirar(cantidad);
		        
				break;
			case 6:
		         crearcuenta2.retirar(cantidad);
		        
				break;
			case 7:
				try {
					System.out.println(crearcuenta1.visualizar());
					System.out.println(crearcuenta2.visualizar());
					
				} catch (Exception e) {
					System.out.println("La cuenta 2 no esta creada");
				}

				break;
			
			default:
				System.out.println("****************\nOpcion no valida\n2****************");
				
			break;
			}// switch
			System.out.println("1-crear cuaenta 001 \n2- crear cuenta 002\n3- ingresar en 001 \n4-ingresar en 002\n5-retirar en 001\n6-retirar en 002\n7-ver estado 001 y 002\n0-salir");
			empezar = sc.nextInt();
		} // while 
		
		

	}

}
