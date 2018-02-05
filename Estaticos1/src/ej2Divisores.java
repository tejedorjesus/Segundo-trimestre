
public class ej2Divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Dados dos números P y Q que leeremos por teclado y que deben ser positivos, hacer un
		programa que nos diga cual de los dos tiene más divisores, con un mensaje que diga “P tiene
		mas divisores que Q” ó viceversa.
		Este programa debe llamar a un método que calcule los divisores de un numero, y lo aplique
		para P y para Q y luego compare y decida*/
		
		
		
		int numero=0;
		int numero2=0;
		numero=Metodos.pedirEntero("introduce un nuimero entero");

		numero2=Metodos.pedirEntero("introduce un nuimero entero");

		
		if(Metodos.cuentaDivisores(numero)>Metodos.cuentaDivisores(numero2)){
			System.out.println(numero + " tiene mas divisores que " + numero2);
			
		}else{System.out.println(numero2 + " tiene mas divisores que " + numero);
		
		
		}
		System.out.println(Metodos.cuentaDivisores(numero) +" Son los divisores de "+ numero);
		System.out.println(Metodos.cuentaDivisores(numero2) +" Son los divisores de" +numero2);
		
	}

}
