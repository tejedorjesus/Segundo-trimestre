import java.util.Scanner;
public class GestionVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ruedas=0;
		int velMax=0;
		int velAct=0;
		int carga=0;
		Scanner sc = new Scanner(System.in);
		vehiculo coche = null;
		coche = null;
		vehiculo moto = null;
		moto = null;


		
		System.out.println("introduce el numero de ruedas del coche");
		ruedas= sc.nextInt();
		System.out.println("introduce la velocidad maxima");
		velMax= sc.nextInt();
		System.out.println("introduce la velocidad actual");
		velAct= sc.nextInt();
		System.out.println("introduce el  peso del coche");
		carga= sc.nextInt();
		coche= new vehiculo(ruedas, velMax,velAct, carga);
		
		
		
		
		
		System.out.println("introduce el numero de ruedas del coche");
		ruedas= sc.nextInt();
		System.out.println("introduce la velocidad maxima");
		velMax= sc.nextInt();
		System.out.println("introduce la velocidad actual");
		velAct= sc.nextInt();
		System.out.println("introduce el  peso del coche");
		carga= sc.nextInt();
		moto= new vehiculo(ruedas, velMax,velAct, carga);
		
		
		if (coche.esIgual(moto)) {
			System.out.println("Los vehiculos son iguales");
		} else {
			
		
		
		
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("El vehiculo 1 tiene" +coche.getNumeroDeRuedas() + "ruedas ");
		
		if (coche.getNumeroDeRuedas()==0){
			System.out.println("back to the future");	
		}else if
			(coche.getNumeroDeRuedas()==2){
			System.out.println("motico");
		}
		System.out.println("Su velocidad maxima es " + coche.getVelocidadMax());
		System.out.println("Su velocidad actual es " + coche.getVelocidadActual());
		System.out.println("Su peso es " + coche.getPeso());
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("El vehiculo numero 2 tiene" +moto.getNumeroDeRuedas() + "ruedas ");
		System.out.println("Su velocidad maxima es " + moto.getVelocidadMax());
		System.out.println("Su velocidad actual es " + moto.getVelocidadActual());
		System.out.println("Su peso es " + moto.getPeso());
		
		System.out.println("----------------------------------------------------------------");
		
		}
	




	}

}
