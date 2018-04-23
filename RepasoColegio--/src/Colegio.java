
public class Colegio {



	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String asignatura="";
		Integer numeroHoras=0 ;
		Integer nivel=0;
		Integer nota=0;
		String nombreAlumno="";
		String fechaNac="";
		Alumno[] alumno=null;
		Asignatura[] materia=null;




		creasignaturas();


		
		for (int i = 0; i < alumno.length; i++) {
			alumno = new Alumno[2];
			for (int j = 0; j < materia.length; j++) {
				
			}
			
		}nota=Metodos.pedirentero("introduzca una nota");
		nombreAlumno=Metodos.pedirnombre("nombre alumno");
		fechaNac=Metodos.pedirnombre("dime fecha nacimento");
		alumno [i]= Alumno(materia[],nota,nombreAlumno,fechaNac);
	}

		/*for (int i = 0; i < 6; i++) {// creamos los 6 platos
			String[] vectorComprobacion = new String[ingredientes.length]; // reseteamos el vector cada vez que creamos unplato
			platos[i] = new Plato();
			int numero = 0;
			for (int j = 0; j < 4; j++) { // añadimos los 4 ingredientes al
											// plato "i"
				Boolean comprobar = false;
				numero = (int) (Math.random() * ingredientes.length);

				do {// para no repetir el ingrediente
					if (vectorComprobacion[numero] == null) {
						vectorComprobacion[numero] = "S";
						comprobar = true;
					} else {
						numero = (int) (Math.random() * ingredientes.length);
						comprobar = false;
					}
				} while (!comprobar);						//metemos la cantidad con random
				platos[i].añadirIng(ingredientes[numero], (float) (Math.random() * (200 - 40) + 40));
			}
			platos[i].calcularPvp();//cuando ya metemos los 4 ingredientes al plato, llamamos al metodo calcularPvp para calcular el precio total.
		}
	}*/





	}





	private static void creasignaturas() {
		String asignatura;
		Integer numeroHoras;
		Integer nivel;
		Asignatura[] materia;
		materia = new Asignatura[2];
		for (int i = 0; i < materia.length; i++) {
			asignatura=Metodos.pedirnombre("introduzca materia");
			numeroHoras=Metodos.pedirentero("Horas");
			nivel=Metodos.pedirentero("nivel");


			while(nivel!=1 && nivel !=2){
				nivel=Metodos.pedirentero("vuelva a imtroducir el nivel");
			}
			materia[i]=new Asignatura(asignatura,numeroHoras,nivel);

		}

		for (int i = 0; i < materia.length; i++) {
			System.out.println(materia[i]);

		}
	}

}
