
public class GestionClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro[] libros=null;
		Autor[] autores=null;
		String nombre = "", titulo="";

		Integer opcion, cuantosLibros, cuantosAutores;


		if (libros == null) {
			// si los libros no se han creado, el menu solo muestra la
			// opcion de crearlos
			opcion = Clases.pedirEntero("\n1- Crear libros.\n0- Salir.");
			while (opcion < 0 || opcion > 1) {
				Clases.mostrarEnPantalla("\n1- Crear libros.\n0- Salir.");
				opcion = Clases.pedirEntero("\nElija opcion");
			}//end if 
		} //end while

		else{
			opcion = Clases.pedirEntero("\n2- Modificar autor.\n" + "3- Modificar libro.\n"
					+ "4- Listado de libros.\n" + "5- Listado de autores.\n" + "0- Salir.");

			while (opcion <0 || opcion >6)
				opcion = Clases.pedirEntero("\n2- Modificar autor.\n" + "3- Modificar libro.\n"
						+ "4- Listado de libros.\n" + "5- Listado de autores.\n" + "0- Salir.");
		}

		switch (opcion) {
		case 1:	
			cuantosLibros = Clases.pedirEntero("¿Cuantos libros vamos a crear?");
			while (cuantosLibros <= 0);
			cuantosLibros = Clases.pedirEntero("¿Cuantos libros vamos a crear?");
			cuantosAutores = Clases.pedirEntero("¿Cuantos autores vamos a crear?");
			while (cuantosAutores <= 0);
			cuantosAutores = Clases.pedirEntero("¿Cuantos autores vamos a crear?");

			libros = crearVectorLibros(cuantosLibros);
			autores = crearVectorAutores(cuantosAutores);
			crearLibros(libros, autores);
			

			break;

		default:
			break;
		}


	}// main
	public static Libro[] crearVectorLibros(Integer cuantosLibros) {
		Libro[] libros = null;
		// libros = new Libro[cuantosLibros.intValue()];
		libros = new Libro[cuantosLibros];
		return libros;
	}// crearVectorLibros
	public static Autor[] crearVectorAutores(Integer cuantosLibros) {
		Autor[] autores = null;
		autores = new Autor[cuantosLibros.intValue()];
		return autores;
	}// crearVectorAutores
	public static void crearLibros(Libro[] libros, Autor[] autores) {
		int indLibro, indiceAutor, indiceTitulo, numeroAutoresLibro, cuantosAutores;
		String titulo, nombreAutor, email, genero;
		char letraGenero;
		Autor autor, autoresDeUnLibro[];
		Double precio;
		Integer cantidad;
		for (indLibro = 0; indLibro < libros.length; indLibro++) {
			titulo = Clases.pedirCadena("Titulo del libro?");
			precio = Clases.pedirDouble("Precio del libro?");
			cantidad = Clases.pedirEntero("Cantidad de libros?");
			cuantosAutores = Clases.pedirEntero("¿Cuantos autores tiene el libro?");
			nombreAutor = Clases.pedirCadena("Nombre del autor?");
			libros[indLibro] = new Libro(titulo, autoresDeUnLibro, precio, cantidad);
			
		}
		
		
		
	}
}// class





















