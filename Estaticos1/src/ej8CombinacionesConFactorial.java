
public class ej8CombinacionesConFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Dados m elementos de un conjunto que se desean agrupar de n en n el n�mero combinatorio
		que nos define dicho numero de combinaciones posibles es m!/(n!*(m-n)!), siendo siempre m
		>=n (hay que filtrarlo)
		Escribir un m�todo para que dados como par�metros m y n nos calcule el n�mero de
		combinaciones de m sobre n. Usad el m�todo factorial del ejercicio 3.*/
		
		
		int num=0;
		int num2=0;
		
		num=Metodos.pedirEntero("dame un numero");
		num2=Metodos.pedirEntero("dame otro numero");
		while (num<num2){
			System.out.println("el primer nnumero debe ser mayor que el segundo");
			num=Metodos.pedirEntero("dame un numero");
			num2=Metodos.pedirEntero("dame otro numero");
		}//end while
		System.out.println(Metodos.combinaciones(num, num2));
		
		
		
		
		
	}

}
