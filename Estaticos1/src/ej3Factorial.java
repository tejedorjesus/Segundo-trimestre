
public class ej3Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Se define el factorial de un n�mero N como N*(N-1)*(N-2)*.......*3*2*1 . Hacer un programa
		que lea un n�mero N filtrando a que sea mayor que cero y calcule su factorial
		La funci�n a construir aqu� se llamara factorial. El m�todo main solo debe leer un valor y
		devolver su factorial (versi�n iterativa).*/
		
		int num=0;
		
		num=Metodos.pedirEntero("escriba un numero");
		System.out.println("el factorial del numero "+ num +" es " + Metodos.factorial(num));

	}

}
