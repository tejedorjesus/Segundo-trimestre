import java.util.Random;

public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String nombre[]={"juan","Rafa","Raul","Jesus","Diegotriste","Lucholose","lolo"};
		String estudio[]={"mates","fisica","deportes","lenguaje","biologia","filosofia"};
		int numeroMaq=0;
		int numEmp=0;
		int numAdmin=0;
		int numMaq=0;
		Random aleatorio = new Random();
		Empleado[] empleados =null;
		Maquinista[] maquinistas =null;
		Administrativo[] administrativos = null;

		numEmp=Metodos.pedirentero("cuantos empleados queres introducir");

		empleados = new Empleado[numEmp];
		for (int i = 0; i < empleados.length; i++) {
			empleados[i]=new Empleado(nombre[aleatorio.nextInt(nombre.length)],aleatorio.nextInt(31)+20);

		}

		for (int i = 0; i < empleados.length; i++) {
			System.out.println( "Empleado numero " + (i+1) +empleados[i]);


		}

		numMaq=Metodos.pedirentero("cuantos maquinistas queres introducir");
		maquinistas= new Maquinista[numMaq];
		for (int i = 0; i < maquinistas.length; i++) {
			maquinistas[i]=new Maquinista( nombre[aleatorio.nextInt(nombre.length)], aleatorio.nextInt(31)+20,aleatorio.nextInt(31)+20,aleatorio.nextInt(31)+20);


		}
		for (int i = 0; i < maquinistas.length; i++) {
			System.out.println("maquinista numero " + (i+1) + maquinistas[i]);

		}
		numAdmin=Metodos.pedirentero("cuantos administrativos hay en la empresa");
		administrativos=new Administrativo[numAdmin];

		for (int i = 0; i < administrativos.length; i++) {
			administrativos[i]=new Administrativo(nombre[aleatorio.nextInt(nombre.length)], aleatorio.nextInt(31)+20,estudio[aleatorio.nextInt(nombre.length)],aleatorio.nextInt(31)+20);

		}

		for (int i = 0; i < administrativos.length; i++) {
			System.out.println("administrativo numero " +(i+1)+administrativos[i] );

		}
		System.out.println("\n\n");

		visualizar(empleados, maquinistas, administrativos);

		visualizarMediaEdad(empleados, maquinistas, administrativos);
	
		
		
		

	}

	private static void visualizarMediaEdad(Empleado[] empleados, Maquinista[] maquinistas,
			Administrativo[] administrativos) {
		int sumaE=0;
		for (int i = 0; i < empleados.length; i++) {
			sumaE+= empleados[i].getEdad();
		}
	
		int sumaM=0;
		for (int i = 0; i < maquinistas.length; i++) {
			sumaM+= maquinistas[i].getEdad();
		}
		int sumaA=0;
		for (int i = 0; i < administrativos.length; i++) {
			sumaA+= administrativos[i].getEdad();
		}
		Integer  media=(sumaE + sumaM + sumaA)/Empleado.getContaEmp();
		System.out.println( " media de edad total =" + (float)media);
		
		System.out.println( " media empleados rasos" + ((sumaE)/ (Empleado.getContaEmp()-Maquinista.getContaMaq()-Administrativo.getContaAdmin())));
	
	
		System.out.println( " media Maquinistas" + ((sumaM)/ (Maquinista.getContaMaq())));
		
		System.out.println( " media Maquinistas" + ((sumaA)/ (Administrativo.getContaAdmin())));
		
		
}
	
		



	private static void visualizar(Empleado[] empleados, Maquinista[] maquinistas, Administrativo[] administrativos) {
		System.out.println("****************************RESUMEN EMPLEADOS**************************************************");
		for (int i = 0; i < empleados.length; i++) {
			System.out.println( "Empleado numero " + (i+1) +empleados[i]);


		}
		System.out.println("******************************************************************************");

		for (int i = 0; i < maquinistas.length; i++) {
			System.out.println("maquinista numero " + (i+1) + maquinistas[i]);

		}
		System.out.println("******************************************************************************");
		for (int i = 0; i < administrativos.length; i++) {
			System.out.println("administrativo numero " +(i+1)+administrativos[i]);

		}
		System.out.println("******************************************************************************");
	}


}

