
public class ej3Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Se define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1 . Hacer un programa
		que lea un número N filtrando a que sea mayor que cero y calcule su factorial
		La función a construir aquí se llamara factorial. El método main solo debe leer un valor y
		devolver su factorial (versión iterativa).*/
		
		int num=0;
		
		num=Metodos.pedirEntero("escriba un numero");
		System.out.println("el factorial del numero "+ num +" es " + Metodos.factorial(num));

	}

}
