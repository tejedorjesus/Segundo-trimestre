
public class ej9Raices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Escribir un programa que llame a un m�todo con los coeficientes de una ecuaci�n de segundo
		grado a, b, c y devuelva sus ra�ces en el caso de ser reales.
		Nota : las ra�ces de una ecuaci�n son
		R1=(-b+ra�z(b2
		-4*a_c))/(2*a)
		R2=(-b-ra�z(b2
		-4*a_c))/(2*a)
		Para la ra�z llamar a la clase Math y el m�todo ra�z que es sqrt.
		Esta funci�n solo se puede aplica en el caso de que valor sea positivo es decir b2
		-*a*c > 0.*/
		
		int a, b, c;
		a = Metodos.pedirEntero("Introduce a");
		b = Metodos.pedirEntero("Introduce b");
		c = Metodos.pedirEntero("Introduce c");
		
		double raices []= Metodos.Ecuacion2G(a, b, c);
		if (((Math.pow(b, 2)) - (4 * a * c)) > 0) {
		System.out.println( raices[0]+ "  "+ raices[1] );

		}else{System.out.println("algo va mal");
		
		
		}
	
		}
}