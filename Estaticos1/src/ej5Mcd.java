
public class ej5Mcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un m�todo que con dos par�metros enteros p y q nos devuelva el m.c.d (m�ximo
				com�n divisor) de ambos*/
		
		int num=0;
		int num2=0;
		
		num = Metodos.pedirEntero("dame un numero");
		num2 = Metodos.pedirEntero("dame un numero");
		
		System.out.println(" El mcd de " + num + " y " + num2 + " es " + Metodos.mcd(num, num2));
	
		

	}

}
