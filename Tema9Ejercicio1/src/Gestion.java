
public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="";
		int sueldo=0;
		String titulo = "";
		String nombreDepartamento=""; 
		int num=0;
		
		
		Empleado[] empleado=null;
		Jefe[] jefe = null;
		
		

		
		
	
		num = Metodos.pedirsueldo("�cuantos empleados quieres crear?");
		empleado=new Empleado[num];
		for (int i = 0; i < empleado.length; i++) {
			nombre= Metodos.pedirnombre("nombre del empleado");
			sueldo=Metodos.pedirsueldo("sueldo del empleado");
			empleado[i] = new Empleado( nombre,  sueldo);
		}
		
	
		
	
		

		
		
		System.out.println("Vamos a introducir los datos del jefe que a su vez es empleado ");
		num = Metodos.pedirsueldo("�cuantos jefes quieres crear?");
		
		
		
		jefe=new Jefe[num];
		for (int j = 0; j < jefe.length; j++) {
		nombre= Metodos.pedirnombre("nombre del jefe");
		sueldo=Metodos.pedirsueldo("sueldo del jefe");
		titulo=Metodos.pedirtitulo("titulo del jefe");
		nombreDepartamento=Metodos.pedirdep("departamento");
		jefe[j]= new Jefe (nombre, sueldo, titulo, nombreDepartamento);
		}
		
		
		visualizar("EMPLEADOS");
		for (int i = 0; i < empleado.length; i++) {
			System.out.println("Empleado #" + (i + 1) + empleado[i]);
		}
		visualizar("JEFES");
		for (int j = 0; j < jefe.length; j++) {
			System.out.println(" Jefe #" +(j + 1) + jefe[j]);
			
		}
		
		
		
		
				
	}
	public static void visualizar(String nombre) {
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("***********" + nombre + "*******************");
		System.out.println("///////////////////////////////////////");
	}

}