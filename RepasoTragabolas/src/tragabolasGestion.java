
public class tragabolasGestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String color ="";
		int  bolasComidas=0;
		int maxBolas=0;
		int opcion=0;


		tragabolas hipopotamo=null;
	
		opcion=Metodos.pedirentero("vamos a crear el tragabolas \n1- creacion del animal \n2-comer \n3-trotar \n4-dormir \n5-visualizar \n0-salir");
		while (opcion ==2 || opcion ==3 || opcion ==4 || opcion ==5 || opcion >5){
			System.out.println("primero debes de crear el animal o salir del menu");
			opcion=Metodos.pedirentero("vamos a crear el tragabolas \n1- creacion del animal");
		}
		
		while(opcion!=0){
		switch (opcion) {
		case 1:
			
			
			color=Metodos.pedirnombre("dime el color del hipo");
			maxBolas=Metodos.pedirentero("cuantas bolas le ponemos de maximo");
			hipopotamo =new tragabolas(color,maxBolas);
			
			break;
			
		case 2:
			bolasComidas=Metodos.pedirentero("cuantas bolas de quieres comer");
			System.out.println(hipopotamo.comer(bolasComidas));
			
			
			
			break;
			
		case 3:
			
			System.out.println(hipopotamo.trotar());
			
			break;
		case 4:
			System.out.println(hipopotamo.dormir());
			break;
			
		case 5:
		
			System.out.println(hipopotamo);
			break;


		default:
			break;
		}
		opcion=Metodos.pedirentero("2-comer \n3-trotar \n4-dormir \n5-visualizar");
	
		
		}
		


	}

}
