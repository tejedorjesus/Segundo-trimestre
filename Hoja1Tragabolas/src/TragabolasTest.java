import java.util.*;


public class TragabolasTest {

	public static void main(String[] args) {
		String colorHipo = "";
		int maximoDeBolas = 0;
		int empezar;
		Scanner sc = new Scanner(System.in);



		System.out.println(" 1-crear \n 2-comer \n 3-trotar \n 4-dormir \n 2-ver estado \n 0-salir");
		empezar=sc.nextInt();
		TragaBolas hipopotamo = null;
		while(empezar !=0){
			switch (empezar) {
			case 1:

				hipopotamo = new TragaBolas(colorHipo, maximoDeBolas);
				System.out.println("Jesus esta contento porque has creado un hipopotamo");
			case 2:
			System.out.println(hipopotamo.comer());

				break;
			case 3:
				System.out.println(hipopotamo.trotar());

				break;
			case 4:
				System.out.println(hipopotamo.dormir());

				break;
			case 5:
				System.out.println(hipopotamo.visualizar());

				break;
				
				
			default:
				break;
			}//end switch
			System.out.println(" 1-crear \n 2-comer \n 3-trotar \n 4-dormir \n 5-ver estado \n 0-salir");
			empezar=sc.nextInt();
		}//end while
		
	}// main

}// Class
