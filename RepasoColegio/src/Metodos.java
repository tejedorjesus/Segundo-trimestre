import java.util.Scanner;

public class Metodos {
	public static String pedirnombre(String mensaje) {
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		s1 = sc.nextLine();
		return s1;



	}
	public static Integer pedirentero(String mensaje){
		String numero = "";
		int num;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(mensaje);
			numero = sc.nextLine();
		} while (!esNumerico(numero));
		num = Integer.parseInt(numero);
		return num;

	}
	public static boolean esNumerico(String cadena) {
		boolean resultado;
		try {
			Integer.parseInt(cadena);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			resultado = false;
		}
		return resultado;
	}//esNumerico
	
	public static String pedirtitulo(String mensaje){
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		s1 = sc.nextLine();
		return s1;



	}
	public static String pedirdep(String mensaje){
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		s1 = sc.nextLine();
		return s1;
	}
	
	
	
	
}