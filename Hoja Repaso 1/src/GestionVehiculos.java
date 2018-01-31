import java.util.Scanner;
public class GestionVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer numRuedas = 0;
		Integer velMax = 0;
		Integer velActual = 0;
		Integer carga = 0;
		Scanner sc = new Scanner(System.in);
		vehiculos coche = null;
		vehiculos moto = null;
		int n, modificacion;
		
		System.out.println(" introduzca el numero de ruedas del coche");
		numRuedas = sc.nextInt();
		System.out.println("introduzca velocidad maximia");
		velMax = sc.nextInt();
		System.out.println(" introduzca la velocidad actual");
		velActual = sc.nextInt();
		System.out.println("introduzca el peso del vehiculo");
		carga = sc.nextInt();

		coche = new vehiculos(numRuedas, velMax, velActual, carga);

		System.out.println(" introduzca el numero de ruedas de la moto");
		numRuedas = sc.nextInt();
		System.out.println("introduzca velocidad maximia");
		velMax = sc.nextInt();
		System.out.println(" introduzca la velocidad actual");
		velActual = sc.nextInt();
		System.out.println("introduzca el peso del vehiculo");
		carga = sc.nextInt();
		moto = new vehiculos(numRuedas, velMax, velActual, carga);
		System.out.println(coche);
		System.out.println(moto);

		System.out.println("introduzca una opcion");
		System.out.println("1- copiar \n2- comparar \n3- visualizar \n4 modificar");
		int opcion = sc.nextInt();

		while (opcion != 0) {
			switch (opcion) {
			case 1:
				coche.copia(moto);
				break;
			case 2:

				if (moto.esIgual(coche)) {
					System.out.println(" ha introducido datos del mismo automovil");

				} else {
					System.out.println("son dos autos diferentes");
				}
				break;
			case 3:
				visualizar(coche, moto);
				break;
			case 4:
				System.out.println("Que quieres modificar -1- coche -2- moto");
				n = sc.nextInt();
				if (n==1) {
					System.out.println("introduce numero de ruedas que tiene el coche ahora");
					modificacion = sc.nextInt();
					coche.setNumeroDeRuedas(modificacion);
				} else if (n==2) {
					System.out.println("introduce numero de ruedas que tiene la moto ahora");
					modificacion = sc.nextInt();
					moto.setNumeroDeRuedas(modificacion);
					System.out.println("introduce la velocidad maxima de la moto ahora");
					modificacion = sc.nextInt();
					moto.setVelocidadMax(modificacion);
				} 
				break;

			default:
				break;
			}
			

			System.out.println("1- copiar \n2- comparar \n3- visualizar \n4 modificar");
			opcion = sc.nextInt();
		}

		visualizar(coche, moto);

	}// end main

	private static void visualizar(vehiculos coche, vehiculos moto) {
		System.out.println(coche);
		if (coche.getNumeroDeRuedas() > 4) {
			System.out.println("Es un camion");
		} else if (coche.getNumeroDeRuedas() < 2) {
			System.out.println("Es una pelota");
		}
		System.out.println(moto);
		if (moto.getNumeroDeRuedas() > 4) {
			System.out.println("Es un camion");
		} else if (moto.getNumeroDeRuedas() < 2) {
			System.out.println("Es una pelota");
		}
	}

}



