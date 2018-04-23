import java.util.Random;
public class Comedor {/* bienvenidos a la pizzeria trattoria*/
	

	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]  toppin={"Pepperonni","Rocket","Aubergine","celeric","carrots","Anchovys","garlick",
				"Red Cabbagge","Riccotta","Cherry","Pinneapple","Tuna","Red pepper","Bacon","Extra Mozzarella",
				"Extra Agustin","olives","Mushrooms","Straigons","salami","Sweet ham","Parmaham","Lamb mince","Cappers","Prawns","Mussels",
				  "Oysters","truffle","Calamary","mini octopus","chicken", "Sweet corn","feta Cheese","homeless human flesh","Onions","Wild mushrooms",
				  "fried egg","cooked egg","kebab meat","Carbonara sauce","BBQ sauce","Bolognesa sauce","Fresh pussy sauce","Courgette",
				  "Chorizo","Spiced Chorizo","Tomate sauce","Pumpkin","Cucumber","Parsnips","Pastrami","Butter","Butternut squad","Bassil","Cheff's surprise"}; 

	   String[] plato={"4 staggioni","Calabresa","Margarita","Ramaccan","lamacan","Meat feast","Napoli","cheeseham"};
	   String[] menu={"Menu Bambino","Menu meat","Menu Sicilia","Menu Roma","Menu Trattoria","Menu la mafia"};
	   Random aleatorio = new Random();
	   int num=0;
	   Ingrediente[] ingredientes =null;
	   

	   Plato platos[] = new Plato[6];

		   ingredientes = new Ingrediente[5];
			for (int i = 0; i < ingredientes.length; i++) {
				ingredientes[i]=new Ingrediente(toppin[aleatorio.nextInt(ingredientes.length)]);
System.out.println("......");
			}
			for (int i = 0; i < ingredientes.length; i++) {
				System.out.println(ingredientes[i]);
				
				
				
				for (int j = 0; j < platos.length; j++) {
					
				}
				
				/*for (int i = 0; i < empleados.length; i++) {
					System.out.println( "Empleado numero " + (i+1) +empleados[i]);*/

			}
		
	
	   
	   
	   
}
}