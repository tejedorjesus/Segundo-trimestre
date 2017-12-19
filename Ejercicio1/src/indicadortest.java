import java.util.*;
/**
 * Esta es la descripcion del primer programa con clases y metodos
 * @author usuario
 * @version 1.0
 * @category de primera
 * @since 2017
 * @see mi repositorio github
 * @serial 1
 *
 */
public class indicadortest {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner teclado = new Scanner(System.in);
	indicador deposito;
	int op=0;
	int datos; //Una variable de tipo int para que envie los datos al constructor
	deposito = new indicador();
	//String cadenaDeIncrementar;

	System.out.println("Indica el tama�o maximo del deposito: ");
	datos = teclado.nextInt();
	deposito.setCapacidadmax(datos);
	op = menu("Elige que desea hacer: :\n 1. A�adir liquido :\n 2. Extraer liquido :\n 0. Salir");

	while(op!=0){
	    switch (op){
	    case 1:
		System.out.println("�Cuanto quieres a�adir?");
		datos = teclado.nextInt();
		System.out.println("La cantidad que se ha a�dido es: " + deposito.incrementarUnValor(datos));
		break;
	    case 2:
		System.out.println("�Cuanto quieres quitar?");
		datos = teclado.nextInt();
		System.out.println("La cantidad que se ha extraido es: " + deposito.reduceUnValor(datos));
		break;
	    default:
		System.out.println("opcion no valida"); 
	    }
	    System.out.println("Lo maximo que puede almacenar: "+deposito.getCapacidadmax());
	    System.out.println("La cantidad que contiene: "+deposito.getValorActual());
	    System.out.println("El porcentaje de ocupaci�n es: "+deposito.getResultado()+"% \n");

	    op = menu("Elige que desea hacer: :\n 1. A�adir liquido :\n 2. Extraer liquido :\n 0. Salir");
	}//while
	System.out.println("Se ha finalizado el programa.");

    }//main

    public static int menu(String mensaje){
	@SuppressWarnings("resource")
	Scanner teclado = new Scanner(System.in);
	int op;
	System.out.println(mensaje);
	op = teclado.nextInt(); 
	return op;
    }


    public static int pedirEntero(String mensaje){
	@SuppressWarnings("resource")
	Scanner teclado = new Scanner(System.in);
	int n;
	System.out.println(mensaje);
	n = teclado.nextInt();
	return n;
    }//pedirEntero
}//class
