import java.util.Arrays;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   final  String nombre[]={"pedro","lolo","manu","antomio"};
		   final int edad;
		   final int altura;
		  final int dni;
		    Random azar = new Random();
		    
		  

		
		 Persona persona[] = new Persona[100];
		 generarDatos(nombre, azar, persona);
		 listar(persona);
		 System.out.println("------------------------------------------------------------");
		 Arrays.sort(persona , new OrdenPorEdad());
		 listar(persona);
		 System.out.println("------------------------------------------------------------");
		 Arrays.sort(persona , new OrdenPorDni());
		 listar(persona);
		 System.out.println("------------------------------------------------------------");
		 Arrays.sort(persona , new OrdenPorDni());
		 Arrays.sort(persona , new OrdenPorEdad());
		 listar(persona);
		}

	private static void listar(Persona[] persona) {
		for (int t = 0; t < persona.length; t++) {
			 System.out.println(persona[t].getNombre()+"\t "+ persona[t].getEdad()+"\t " + persona[t].getAltura()+"\t " + persona[t].getDni());
			
		}
	}

	private static void generarDatos(final String[] nombre, Random azar, Persona[] persona) {
		for (int t = 0; t < persona.length; t++) {
			 persona[t]= new Persona(nombre[azar.nextInt(nombre.length)],
					 azar.nextInt(10)+40,azar.nextInt(10)+150,azar.nextInt(99999999)+99999999);
		
				
			}
	}
		 
		 
	}


