
public class GestionPaises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeropaises=0;
		String nombrePais="";
		
		ListaDePaises paises[]=null;
		
		
		
		int opcion=0;
		int contador=0;
		
		while (opcion==0){
		
			paises =new ListaDePaises[ListaDePaises.getContapaises()];
		for (int i = 0; i < paises.length; i++) {
			nombrePais=Leer.pedirString("dime el pais");
			paises[i]=new ListaDePaises(nombrePais);
			paises =new ListaDePaises[ListaDePaises.getContapaises()];
		
			
			opcion=Leer.pedirentero("quiere añadir mas paises pul 1 si no pulse 0");
		}
		}
		
		
		
		
		visualizar(paises);
		
		

	}

	private static void visualizar(ListaDePaises[] paises) {
		for (int i = 0; i < paises.length; i++) {
			System.out.println(paises[i]);
			
		}
	}

}
