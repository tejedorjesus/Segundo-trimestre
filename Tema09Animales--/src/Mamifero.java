

public class Mamifero extends Animal {
	private int numhuesos;
	private int numextremidades;

	public Mamifero() {
		System.out.print(", mam�fero");
	}

	public void insertarDatosMamif() {
		insertarDatos();
		numhuesos = Leer.pedirEntero("\t\tN�mero de huesos (como mam�fero que es)");
		numextremidades = Leer.pedirEntero("\t\tN�mero de extremidades (como mam�fero que es): ");
	}

	public void visDatosMamif() {
		vis_datosanim();
		Leer.mostrarEnPantalla("\n\t Huesos: " + numhuesos);
		Leer.mostrarEnPantalla("\n\t Extremidades: " + numextremidades);
	}
}

	


