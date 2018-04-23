import java.util.Random;
public class gestionEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String nombre[]={"jean","pedro","marotta","castolo","rufan","rufo","pippo","lolo"};
		 String estudios[]={"mates","peluqueria","lolo","fisica","arquitectura"};
		 Integer numOrdenador[];
		 Integer numAñosmaq[];
		 Integer edad[];
		
		int numE =0;
		int numA =0;
		int numM =0;
		Random aleatorio = new Random();
		empleado[] empleados =null;
		maquinista[] maquinistas =null;
		administrativo[] administrativos = null;
		
		
		
		
		
		
		numE=metodos.pedirentero("Introduce el numero de empleados");
		empleados= new empleado[numE];
		for (int i = 0; i < empleados.length; i++) {
			empleados[i] = new empleado(nombre[aleatorio.nextInt(nombre.length)],aleatorio.nextInt(31)+20);
			
		}
		for (int i = 0; i < empleados.length; i++) {
	
			System.out.println( "Empleado  " + (i+1) + empleados[i] );

		}
		
		
		numA=metodos.pedirentero("cuantos administrativos");
		administrativos=new administrativo[numA];
		for (int i = 0; i < administrativos.length; i++) {
			administrativos[i]=new administrativo(nombre[aleatorio.nextInt(nombre.length)],aleatorio.nextInt(31)+20
					,estudios[aleatorio.nextInt(estudios.length)],aleatorio.nextInt(31)+20);
			
		}
		
		for (int i = 0; i < administrativos.length; i++) {
			System.out.println("Administrativo " +(i+1) +administrativos[i]);
			
		}
		
		
		
		numM=metodos.pedirentero("cuantos maquinistas quieres");
		maquinistas= new maquinista[numM];
		for (int i = 0; i < maquinistas.length; i++) {
			maquinistas[i]=new maquinista(nombre[aleatorio.nextInt(nombre.length)],aleatorio.nextInt(31)+20
					,aleatorio.nextInt(31)+20,aleatorio.nextInt(31)+20);
		}
		
		
		for (int i = 0; i < administrativos.length; i++) {
			System.out.println("Maquinista  " +(i+1) +maquinistas[i]);
		
		}
		
		visualizar(empleados, maquinistas, administrativos);
		
		
		
		int sumaE=0;
		for (int i = 0; i < maquinistas.length; i++) {
			sumaE += maquinistas[i].getEdad();
		}
		System.out.println(sumaE);
		
	}

	private static void visualizar(empleado[] empleados, maquinista[] maquinistas, administrativo[] administrativos) {
		System.out.println("*****************************************RESUMEN*****************************************");
		System.out.println("*****************************************EMPLEADOS***************************************");
		for (int i = 0; i < empleados.length; i++) {
			System.out.println( "Empleado  " + (i+1) + empleados[i] );
		}
		System.out.println("*****************************************ADIMIN******************************************");
		for (int i = 0; i < administrativos.length; i++) {
			System.out.println("Administrativo " +(i+1) +administrativos[i]);
		}
		System.out.println("***************************************MAQUINISTAS****************************************");
		for (int i = 0; i < administrativos.length; i++) {
			System.out.println("Maquinista  " +(i+1) +maquinistas[i]);
		}
		System.out.println("********************************************END*******************************************");
	}

}
