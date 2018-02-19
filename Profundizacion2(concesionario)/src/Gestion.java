
import java.util.Arrays;
import java.util.Random;

public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer n=0;
		Integer opcion=0;
		Integer numLineas=0;
		Random azar=new Random();
		
		
	
		

		do { n=Metodos.pedirentero("¿cuantos coches quieres crear?");
		
		
		}while(n > 5000 || n<0);
		Automovil coche[] = new Automovil[n];
		crearCoche(azar, coche);
		
		
		numLineas=Metodos.pedirentero("¿cuantas lineas quiere paginar?");
		opcion=Metodos.pedirentero("Ordenar por:\n1-Marca\n2-Modelo\n3-Cilindrada\n4-Precio\n0-Salir");
		switch (opcion) {
		case 1:
			Arrays.sort(coche, new OrdenarPorMarca());
			
			listar(numLineas, coche);
			
			
			break;

		default:
			break;
		}
			
		
		
		
		
		
		
		

	}

	private static void listar(Integer numLineas, Automovil[] coche) {
		for (int i = 0; i < coche.length; i++) {
			if(i>0 && i% numLineas==0){
				Metodos.pedirnombre("pulsa intro");
				
			}
			
		
			System.out.println(coche[i]);
			
			
		}
	}

	private static void crearCoche(Random azar, Automovil[] coche) {
		String[]marca={"Audi", "BMW", "Seat", "Volvo", "Tata", "Lolo" };
		String[]modelo={ "M1", "M2", "Toledo", "M4", "M5", "A1" };
		for (int i = 0; i < coche.length; i++) {
			coche[i]=new Automovil(marca[azar.nextInt(marca.length)],modelo
					[azar.nextInt(modelo.length)], azar.nextInt(2001)+1000,azar.nextInt(20001)+10000);
			
			
			}
	
		
	
		
	}

}
