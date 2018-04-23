
public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nombre="";
		Integer sueldo=0;
		String titulo="";
		String dep="";
		int num=0;
		
		

		Jefe[] jefe=null;
		Empleado[] empleado=null;
		
		
		num=Metodos.pedirentero("cuantos empleados quieres crear?");
		empleado= new Empleado[num];
		for (int i = 0; i < empleado.length; i++) {
			nombre=Metodos.pedirnombre("introduzca nombre");
			sueldo=Metodos.pedirentero("introduzca sueldo");
	    empleado[i] = new Empleado(nombre,sueldo);
		
		}
		for (int i = 0; i < empleado.length; i++) {
			
		
		System.out.println(empleado[i]);
		}
		
		
		num=Metodos.pedirentero("cuantos jefes quieres crear");
		jefe = new Jefe[num];
		for (int i = 0; i < jefe.length; i++) {
			nombre=Metodos.pedirnombre("introduzca nombre");
			sueldo=Metodos.pedirentero("introduzca sueldo");
			titulo=Metodos.pedirtitulo("que titulo tu¡iene el señor");
			dep=Metodos.pedirnombre("a que departamento pertenece");
			
			jefe[i]= new Jefe(nombre,sueldo,titulo, dep);
		
			
		}
		for (int i = 0; i < empleado.length; i++) {
			System.out.println(empleado[i]);
			
		}
		
		for (int i = 0; i < jefe.length; i++) {
			System.out.println(jefe[i]);
			
		}
		

	}

}
