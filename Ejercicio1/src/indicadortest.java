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
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in); 
		
		int nuevovaloractual;
		int litrosgastados;
		
		indicador gasolina;
		gasolina=new indicador();
		
	
		System.out.println( "  tenias 20 litros ¿cuantos litros has hechado? ");
		nuevovaloractual=teclado.nextInt();
		System.out.println(" ahora tienes " +(gasolina.getvaloractual()+nuevovaloractual));
		
		System.out.println("cuantos litros has gastado");
		litrosgastados=teclado.nextInt();
		System.out.println(" ahora tienes " +(gasolina.getvaloractual()+nuevovaloractual-litrosgastados));
		
		
	}

}
