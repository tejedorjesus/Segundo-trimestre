

public class Persona extends Mamifero {

	private String profesion;

	public Persona() {

		System.out.print(" y persona");
	}

	void insertarDatosPers() {
		insertarDatosMamif();
		profesion = Leer.pedirCadena("\t\tProfesi�n de esta persona: ");
	}

	public void visualizarDatos() {
		visDatosMamif();
		Leer.mostrarEnPantalla("\n\t profesi�n: " + profesion);
	}
}
