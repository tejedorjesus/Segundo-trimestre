package personaMio;

import java.util.Random;
import java.util.Arrays;

public class PersonaGestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edades = 0;

		Persona personas[] = new Persona[100];

		generardatos(personas);
		System.out.println("\n******Array sin orden:");

		lista(personas);

	}

	static public void generaDatos(Persona personas[]) {// genera el vector

	}// generaDatos

	private static void generardatos(Persona[] personas) {
		Random azar = new Random();
		int t, z;
		String dni;

		String nombre[] = { "Luis", "Carlos", "Jose", "Eva", "Carmen", "Luisa", "Manuel", "Santos" };
		for (t = 0; t < personas.length; t++) {
			dni = "";

			personas[t] = new Persona(nombre[azar.nextInt(nombre.length)], azar.nextInt(10) + 40,
					azar.nextInt(50) + 150, azar.nextInt(99999999) + 1);
		}
	}

	private static void lista(Persona[] personas) {
		int t;
		/*
		 * for (t=0;t<personas.length;t++){
		 * System.out.printf(personas[t].getNombre() + "\t"
		 * +personas[t].getEdad() + "\t"+personas[t].getAltura()+ "\t"
		 * +("%08d",personas[t].getDni())); System.out.println(); }//for
		 */
		/*
		 * for (int i = 0; i < personas.length; i++) {
		 * System.out.printf("Nombre: %-8s Altura: %-5.2f DNI: %08d Edad: %-5d",
		 * personas[i].getNombre(), personas[i].getAltura(),
		 * personas[i].getDni(), personas[i].getEdad()); System.out.println(); }
		 */
		for (t = 0; t < personas.length; t++) {

			System.out.printf("%08d", personas[t].getDni());
			System.out.printf("\t"+personas[t].getNombre() + "\t" + personas[t].getEdad() + "\t" + personas[t].getAltura() + "\t");

			System.out.println();
		}

	}

}
