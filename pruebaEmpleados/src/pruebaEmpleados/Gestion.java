package pruebaEmpleados;

public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String nombre="";
		Integer edad;
		Integer porcentaje;
		String depResp="";
		int numemp=0;
		int numJef=0;


		Empleados empleados[]=null;
		Jefes jefes[]=null;

		empleados = crearEmpleados();
		viualizarEmpleados(empleados);
		jefes = crearJefes(empleados);
		visualizarJefes(jefes);


		
		
		
		

	}

	private static Jefes[] crearJefes(Empleados[] empleados) {
		String nombre;
		Integer edad;
		Integer porcentaje;
		String depResp;
		int numJef;
		Jefes[] jefes;
		numJef=Leer.pedirEntero("cuantos jefes quieres introducir");
		jefes = new Jefes[numJef];
		for (int i = 0; i <jefes.length; i++) {
			nombre=Leer.pedirCadena("dime el nombre");
			edad=Leer.pedirEntero("dime la edad");
			porcentaje=Leer.pedirEntero("dime el porcentaje");
			depResp=Leer.pedirCadena("departamento al que pertenece");
			jefes[i]= new Jefes(nombre,edad,porcentaje,depResp);


		}
		return jefes;
	}

	private static Empleados[] crearEmpleados() {
		String nombre;
		Integer edad;
		Integer porcentaje;
		int numemp;
		Empleados[] empleados;
		numemp=Leer.pedirEntero("cuantos empleados quieres introducir");
		empleados = new Empleados[numemp];
		for (int i = 0; i < empleados.length; i++) {
			nombre=Leer.pedirCadena("dime el nombre");
			edad=Leer.pedirEntero("dime la edad");
			porcentaje=Leer.pedirEntero("dime el porcentaje");
			empleados[i]= new Empleados(nombre,edad,porcentaje);

		}
		return empleados;
	}

	private static void viualizarEmpleados(Empleados[] empleados) {
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i]);

		}
	}

	private static void visualizarJefes(Jefes[] jefes) {
		for (int i = 0; i < jefes.length; i++) {

			System.out.println(jefes[i]);

		}
	}

}
