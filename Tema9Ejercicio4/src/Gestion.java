
public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final String nombreEmpresa= "";
		int sueldo = 1000;
		int porcentaje=0;
		String nombre="";
		int edad =0;
		String nombreDep="";
		double plus= 250;
		int numEmp=0;
		int numJef=0;
		Empleado[] empleados = null;
		
		
		
		
		
		
		
		numEmp=Metodos.pedirentero("cuantos empleados queres introducir");
		
		empleados = new Empleado[numEmp]; 
		for (int i = 0; i < empleados.length; i++) {
			 porcentaje=Metodos.pedirentero("introduzca el porcentaje en %");
			 nombre=Metodos.pedirnombre("introduzaca el nombre");
			 edad =Metodos.pedirentero("introduzaca la edad");
			empleados[i] = new Empleado(porcentaje, nombre, edad);
			System.out.println( " Empleado numero " + (i+1) + empleados [i]);

			
		}
		System.out.println("****************************************************************************************************");
		for (int i = 0; i < empleados.length; i++) {
			System.out.println( " Empleado numero " + (i+1) + empleados [i]);
			System.out.println("****************************************************************************************************");
		}
		


			
		Jefe[] jefes = null;
		
		numJef=Metodos.pedirentero("cuantos jefes que tambien son empleados queires crear");
		jefes = new Jefe[numJef];
		int contaJefes=0;
		for (int i = 0; i < jefes.length; i++) {
			contaJefes++;
			porcentaje=Metodos.pedirentero("introduzca el porcentaje en %");
			 nombre=Metodos.pedirnombre("introduzaca el nombre");
			 edad =Metodos.pedirentero("introduzaca la edad");
			 nombreDep=Metodos.pedirdep("introduzca el departamento");
			 jefes[i]= new Jefe(porcentaje, nombre, edad,nombreDep);
			 System.out.println(" jefe numero " + (i+1) + " empleado numero " + Empleado.getcontaEmp() + jefes[i]);
					 
			 
			 
		}
		System.out.println("****************************************************************************************************");
		for (int i = 0; i < jefes.length; i++) {
			System.out.println(" jefe numero " + (i+1) + " empleado numero " + (Empleado.getcontaEmp()-Jefe.getContajef() + (i+1)) + jefes[i]);
			System.out.println("****************************************************************************************************");
			
		}
		
		int opcion=0;
		
		

		opcion=Metodos.pedirentero(" Le gustaria  modificar algunos datos\n 1.modificar el sueldo base de todos los empleados\n "
				+ "2. Modificar el plus de todos los jefes.\n 3. Visualizar los datos de todos los empleados\n 0. Salir.");
		while (opcion!=0){
			
			
		
		switch (opcion) {
		case 1:
			
			
			sueldo=Metodos.pedirentero("�cuanto quieres modificar el sueldo base?");
			Empleado.setSueldo(sueldo);
			System.out.println("el nuevo sueldo base es " + Empleado.getSueldo());
			
			break;
		case 2:
			plus=Metodos.pedirentero("�cuanto quiere modificar el plus se�or ?");
			Jefe.setPlus(plus);
			System.out.println("el nuevo plus es " + Jefe.getPlus());
			
		case 3:
			
			
			visualizar(empleados, jefes);
			

		default:
			break;
		}//
		
		opcion=Metodos.pedirentero(" Le gustaria  modificar algunos datos\n 1.modificar el sueldo base de todos los empleados\n "
				+ "2. Modificar el plus de todos los jefes.\n 3. Visualizar los datos de todos los empleados\n 0. Salir.");
		
		/*Modificar el sueldo base de todos los empleados.
		2. Modificar el plus de todos los jefes.
		3. Visualizar los datos de todos los empleados.
		0. Salir. */

	}
		
	
		
	}

	private static void visualizar(Empleado[] empleados, Jefe[] jefes) {
		System.out.println("****************************************************************************************************");
		for (int i = 0; i < empleados.length; i++) {
			System.out.println( " Empleado numero " + (i+1) + empleados [i]);
			System.out.println("****************************************************************************************************");
		}
		
		System.out.println("****************************************************************************************************");
		for (int i = 0; i < jefes.length; i++) {
			System.out.println(" jefe numero " + (i+1) + " empleado numero " + (Empleado.getcontaEmp()-Jefe.getContajef() + (i+1)) + jefes[i]);
			System.out.println("****************************************************************************************************");
			
		}
	}
	
	
	
}
