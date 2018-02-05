
public class ej6Mcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escribir un método que reciba dos parámetros enteros p y q y devuelva el mínimo común
		múltiplo de ambos.*/



		int num =0;
		int num2=0;

		num = Metodos.pedirEntero("dame un numero");
		num2 = Metodos.pedirEntero("dame un numero");	
		System.out.println("el mcm de " + num + " y " + num2 + " es " + Metodos.mcm(num, num2));
		
		
		
	}

}
