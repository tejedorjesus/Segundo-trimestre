
public class GestionPaises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =0;
		int opcion=0;
		String nombre="";
		paises[] lista =null;
		int delete=0;
		
		opcion=Metodos.pedirentero("1-crear lista\n2-a�adir pais\n3-borar pais\n4-vaciar lista\n5-mostrar lista");
		
		while (opcion!=0){

		
		switch (opcion) {
		case 1:
			num=Metodos.pedirentero("vamos a crear una lista de paises\ndime cuantos paises quieres crear? ");
			lista =  new paises[num];
			System.out.println("lista creada");
			
			
			
			break;
		case 2:

				nombre=Metodos.pedirnombre("escriba el nombre del pais");
				lista[paises.getContapais()]= new paises(nombre);
				
			
			break;

		case 3:
			for (int i = 0; i < lista.length; i++) {
				System.out.println( "pais numero #"+ (i+1) +lista[i]);
			}
		     delete=Metodos.pedirentero("que pais quieres eliminar??");
		     System.out.println("calling ENOLA GAY..........................");
		     lista[delete-1]=null;
		     System.out.println("eliminado gracias");
		     
			
			

			
		
		break;
			

		case 4:
			String respuesta;
			respuesta=Metodos.pedirnombre("quiere vaciar la lista (Y,N)...");
			if (respuesta.toUpperCase().equalsIgnoreCase("Y")){
		paises.vaciar();
				
			System.out.println("lista borrada");

			}
		
		break;
			
		default:
			break;
		}
		
		
	
		for (int i = 0; i < lista.length; i++) {
			System.out.println( "pais numero #"+ (i+1) +lista[i]);
		}
		opcion=Metodos.pedirentero("1-crear lista\n2-a�adir pais\n3-borar pais\n4-vaciar lista\n5-mostrar lista");
		}
		
		
		
	}

}
