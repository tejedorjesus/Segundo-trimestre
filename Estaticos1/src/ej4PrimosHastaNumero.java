import java.util.Iterator;

public class ej4PrimosHastaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dado un n�mero N que se pedir� por teclado y debe ser positivo, imprimir la lista de todos los
		numero primos hasta dicho n�mero incluido.
		Hacer este programa usando el m�todo primo que ya ten�is construido*/
		
		
		int num=0;
		int contador=0;
		
		num=Metodos.pedirEntero("intorduzca un nuemro please");

			
		for (int i = 0; i < num; i++) {
		 if (Metodos.esPrimo(i)==true)
			 System.out.printf("%3d ", + i);
			
		}
		}
			
		
		

	}



