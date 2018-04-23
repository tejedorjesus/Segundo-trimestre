package pruebalibros;

public class gesttion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro[] libros = null;
		Autor[] autores = null;
		String email="";
		char genero;
		String titulo="";
		Double precio=0d;
		int cantidad=0;
		int opcion=0;
		int cuantoslibros=0;
		
		do{
			if (libros ==null){
				opcion = Leer.pedirEntero("\n1- Crear libros.\n0- Salir.");
				while (opcion < 0 || opcion > 1) {
					Leer.mostrarEnPantalla("\n1- Crear libros.\n0- Salir.");
					opcion = Leer.pedirEntero("\nElija opcion");
				}
			} else {
				Leer.mostrarEnPantalla("\n2- Modificar autor.\n" + "3- Modificar libro.\n" + "4- Listado de libros.\n"
						+ "5- Listado de autores.\n" + "0- Salir.");
				opcion = Leer.pedirEntero("\nElija opcion");
			}
			switch (opcion) {
			case 1: // crear los libros (y los autores)
				int indiceLibro=0;
				cuantoslibros=Leer.pedirEntero("cuantos libros vas a crear");
				libros = new Libro[cuantoslibros];
				for (int i = 0; i < libros.length; i++) {
					titulo=Leer.pedirCadena("dime titulo");
					int j=0;
					while (j < libros.length && libros[j] != null) {
						if (libros[j].getTitulo().equals(titulo)) {
							indiceLibro = j;
						}
						j++;
					}
			
				
					Autor=Leer.pedirCadena("dime autor");
					precio=Leer.pedirDouble("dime precio");
					cantidad=Leer.pedirEntero("dime cantidad");
					
				}
				
				
				
				
				
			
		}
			Leer.mostrarEnPantalla("\n2- Modificar autor.\n" + "3- Modificar libro.\n" + "4- Listado de libros.\n"
					+ "5- Listado de autores.\n" + "0- Salir.");
			
			
			
			
			
			
			

      } while (opcion != 0);

	}// main
	
}
