import java.util.*;

public class GestionIndicador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Integer datos=0;
		Integer opcion=0;
		Indicador deposito;
		
	
		 
		 deposito = new Indicador();
		 
		 
		 
		
		
		do {opcion=Metodos.pedirentero("� de que sustancia quieres crear el indicador\n1-Iniciar deposito\n2-Llenar deposito"
				+ "\n3-Vaciar deposito \n4-Visualizar");
 
		
		
		
		switch (opcion) {
		case 1:
			datos=Metodos.pedirentero("cuantos litros quieres de inicio");
			deposito.setValorinicial(datos);
			datos=Metodos.pedirentero("cuantos litros quieres que tenga de capacidad ");
			deposito.setValorMaximo(datos);
			System.out.println(deposito.toString());
					
			break;
		case 2:
			
			
					datos=Metodos.pedirentero("cuantos litros quieres llenar el deposito");
					deposito.sumalitros(datos);
				
					System.out.println(deposito.toString());
			break;
		case 3:
			datos=Metodos.pedirentero("cuantos litros quieres de inicio");
			deposito.setValorinicial(datos);
			datos=Metodos.pedirentero("cuantos litros quieres que tenga de capacidad ");
			deposito.setValorMaximo(datos);
			break;

		case 4:
			datos=Metodos.pedirentero("cuantos litros quieres de inicio");
			deposito.setValorinicial(datos);
			datos=Metodos.pedirentero("cuantos litros quieres que tenga de capacidad ");
			deposito.setValorMaximo(datos);
			break;
		case 5:
			datos=Metodos.pedirentero("cuantos litros quieres de inicio");
			deposito.setValorinicial(datos);
			datos=Metodos.pedirentero("cuantos litros quieres que tenga de capacidad ");
			deposito.setValorMaximo(datos);
			break;

		default:
			break;
			
		
			
			
		}
		}while (opcion !=0);
	}
	
	

}
