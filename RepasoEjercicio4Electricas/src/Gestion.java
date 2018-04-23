
public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dep="";
		String depJef="";
		int n =0;
		int opcion=0;
		int nsueldoBase=0;
		int nPlus=0;



		Empleados[] empleados=null;
		Jefes[] jefes = null;




		n =Metodos.pedirentero("Cuantos empleados quieres crear??");
		empleados = new Empleados[n];
		for (int i = 0; i < empleados.length; i++) {
			dep=Metodos.pedirdep("dime el departamento al que pertenece");
			empleados[i]=new Empleados (dep);


		}
		for (int i = 0; i < empleados.length; i++) {

			System.out.println(empleados[i]);

		}

		n =Metodos.pedirentero("Cuantos jefes quieres crear??");
		jefes = new Jefes[n];
		for (int i = 0; i < jefes.length; i++) {
			depJef=Metodos.pedirdep("dime el departamento del  que es jefe");
			jefes[i]=new Jefes(dep, depJef);


		}
		for (int i = 0; i < empleados.length; i++) {

			System.out.println(empleados[i]);

		}
		for (int i = 0; i < jefes.length; i++) {

			System.out.println(jefes[i]);

		}




		System.out.println("es hora de hacer modificaciones");


		/*	.

		.
		. */

		opcion=Metodos.pedirentero("1-Modificar el sueldo base de todos los empleados\n2-Modificar el plus de todos los jefes\n"
				+ "3. Visualizar los datos de todos los empleados\n0. Salir");
		while (opcion!=0){
		switch (opcion) {
		case 1:


			nsueldoBase=Metodos.pedirentero("nuevo sueldo base");
			Empleados.setSueldoBase(nsueldoBase);

			for (int i = 0; i < empleados.length; i++) {

				System.out.println(empleados[i]);

			}
			for (int i = 0; i < jefes.length; i++) {

				System.out.println(jefes[i]);

			}


			break;

		case 2:
			nPlus=Metodos.pedirentero("dime el nuevo plus paara los empleados");
			Jefes.setPlus(nPlus);

			for (int i = 0; i < empleados.length; i++) {

				System.out.println(empleados[i]);

			}
			for (int i = 0; i < jefes.length; i++) {

				System.out.println(jefes[i]);

			}
			break;

		case 3:

			for (int i = 0; i < empleados.length; i++) {
				System.out.println(empleados[i]);
			}
			for (int i = 0; i < jefes.length; i++) {
				System.out.println(jefes[i]);
			}
		default:
			break;
		}



		opcion=Metodos.pedirentero("1-Modificar el sueldo base de todos los empleados\n2-Modificar el plus de todos los jefes\n"
				+ "3. Visualizar los datos de todos los empleados\n0. Salir");
		}









	}

}
