package tragabolasmio;

import java.util.*;

public class Tragabolastest {

	public static void main(String[] args) {
		String colorHipo = "";
		int maximoDeBolas = 0;
		int empezar;
		Scanner sc = new Scanner(System.in);
		System.out.println("1-Crear tragabolas\n2-Comer\n3-Trotar\n4-Dormir\n5-Ver estado");
		empezar = sc.nextInt();
		TragaBolas hipopotamo = null;
		while (empezar != 0) {
			switch (empezar) {
			case 1:
				hipopotamo = new TragaBolas(colorHipo, maximoDeBolas);
				System.out.println("Jesus esta contento porque has creado un hipopotamo");
				break;
			case 2:
				System.out.println(hipopotamo.comer());
				System.out.println(" ♥ Jesus te ama ♥");
				break;
			case 3:
				System.out.println(hipopotamo.trotar());
				System.out.println("Jesus esta contento porque has cansado al hipopotamo");
				break;
			case 4:
				System.out.println(hipopotamo.dormir());
				System.out.println("Jesus no puede dormir porque tiene pesadillas con orillena");
				break;
			case 5:
				System.out.println(hipopotamo.visualizar());
				System.out.println("Jesus esta contento. Gracias");
				break;
			default:
				System.out.println("****************\nOpcion no valida\n****************");
				System.out.println("╔═.♥.══════════════╗ ");
				System.out.println(" JESUS ESTA TRISTE");
				System.out.println("╚══════════════.♥.═╝ ");
				System.out.println("Elige una opcion valida para que Jesus se ponga contento\n\n5");
				
			break;
			}// switch
			System.out.println("1-Crear tragabolas\n2-Comer\n3-Trotar\n4-Dormir\n5-Ver estado");
			empezar = sc.nextInt();
		} // while

	}// main

}// Class