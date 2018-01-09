package tragabolasmio;
import java.util.*;
public class Tragabolastest {

	public static void main(String[] args) {
		String colorHipo="";
		int maximoDeBolas=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("color del hipo?");
		colorHipo = sc.nextLine();
		System.out.println("maximo de bolas");
		maximoDeBolas = sc.nextInt();
		
		TragaBolas hipopotamo = new TragaBolas(colorHipo, 0, maximoDeBolas);
		System.out.println(hipopotamo.visualizar());
		

	}

}
