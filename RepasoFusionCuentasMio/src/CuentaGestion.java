
public class CuentaGestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String numCuenta2="002";
		double saldo=0;
		String cliente="";
		int opcion=0;
		int n=0;
		int a =0;
		int b =0;
		
		Cuenta[] cuentas = new Cuenta[10];
		System.out.println("tenemos una capacidad de 10 cuentas por barba sino tienes barba menos");

		Cuenta cuenta2=null;

		
		while (Cuenta.getContacuentas()<10) {
			
		
			
			
				
					cliente=Metodos.pedirnombre("Vamos a crear las cuentas introduzca el nombre del titular de la cuenta 00" + (Cuenta.contacuentas+1) );
					cuentas[Cuenta.getContacuentas()] = new Cuenta(saldo,cliente);
					
				

		}
		System.out.println("Limite de cuentas alcanzado");
		for (int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
	
		


	opcion=Metodos.pedirentero("1-deposit money \n2-get money 002 \n3-view  satement \n4-close the account ");
		while (opcion !=0){
			switch (opcion) {


			case 1:
				n = Metodos.pedirentero("Introduce la cuenta en la que quieres ingresas dinero");
					
					cuentas[n - 1].Ingresar(saldo);
					System.out.println("Se ha ingresado " + saldo + "� en la cuenta");
					for (int i = 0; i < cuentas.length; i++) {
						System.out.println(cuentas[i]);
					}
				break;

				
			case 2:
			
				n = Metodos.pedirentero(" introduce the accounty num where you want to get the money");
			   cuentas[n-1].Retirar(saldo);
			   System.out.println("you got  " + saldo + "� from the account " + "00"+ n);
			   for (int i = 0; i < cuentas.length; i++) {
					System.out.println(cuentas[i]);
				}
			   

				break;
			
			case 3:
				 for (int i = 0; i < cuentas.length; i++) {
						System.out.println(cuentas[i]);
					}
				 break;
				 
				 
			case 4:
				 System.out.println("ooh man lets try to close your account but i let you know that its a f**** difficult stuff");
				 n=Metodos.pedirentero(" which account do you want to close buddy?");
				 cuentas[n-1].cerrarCuenta();
				 System.out.println("the account numnber " + "00"+ n +" has been closed");
				   for (int i = 0; i < cuentas.length; i++) {
						System.out.println(cuentas[i]);
					}
				   System.out.println(" active accounts #" + Cuenta.contacuentas );
				 
				 
				 break;
				 
				 
			case 5:
				System.out.println("Qu� cuentas quieres fusionar?");
				a = Metodos.pedirentero("Introduce la primera cuenta");
				b = Metodos.pedirentero("Introduce la segunda cuenta");
				try {
					if (cuentas[a - 1].getCliente().indexOf("CERRADA") == -1
							|| cuentas[b - 1].getCliente().indexOf("CERRADA") == -1) {
						cuentas[Cuenta.contacuentas] = Cuenta.fusiona(cuentas[a - 1],
								cuentas[b - 1]);
						System.out.println(" active accounts #" + Cuenta.contacuentas );
					} else {
						System.out.println("Una o varias de las cuentas que intentas fusionar estan cerradas");
					}
				} catch (NullPointerException e) {
					System.out.println("No existen esas cuentas");
					System.out.println(e);
				}

				break;
				
				
				
				
			}
				 
			
				
				
			
			
			
			
			opcion=Metodos.pedirentero("1-deposit money \n2-get money 002 \n3-view  satement \n4-close the account ");
		}
			/*
			case 3:
				System.out.println(cuentas.Retirar(saldo));
				break;

			case 4:
				System.out.println(cuentas.Retirar(saldo));
				break;
				
			case 5:
				String cuentacerrar;
				
				System.out.println(cuentas);
				System.out.println(cuenta2);
				cuentacerrar=Metodos.pedirnombre("que cuenta quieres cerrar?? " );
				if (cuentacerrar==cuenta1.getNumCuenta()){
					cuenta1=null;
					
				}
				System.out.println("cuenta 001 cerrada");
				
				
				break;
				
				
				
				
				
				
				
			case 6:


				System.out.println(cuenta1);
				System.out.println(cuenta2);
				System.out.println("numero de cuentas activas------------"+(cuenta1.contacuentas + cuenta2.contacuentas)+"------------");

				/*Vamos a crear un metodo para saber cuantas cuentas existen*/
		/*		System.out.println(cuenta1.contacuentas + cuenta2.contacuentas);
				
				

				break;



			default:
				break;
			}
			opcion=Metodos.pedirentero( "1-ingresar en 001 \n2-ingresar en 002 \n3-sacar de la 001 \n4-sacar de la 002 \n5-cerrar cuenta \n6 visualizar estado");

		}



		




*/
			
			}

		}
