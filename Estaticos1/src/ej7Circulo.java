
public class ej7Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un método al que se le dé como parámetro un valor r que representa el radio de una,
		figura una opción y un dato entero que será 1/2/3. El método debe devolver:
		 En el caso opcion1 la longitud del circulo de radio r dada por la expresión 2*pi*r
		 En el caso opción 2 la superficie del circulo dada por la expresión pi*r2
		 En el caso opción 3 el volumen de una esfera de radio r dada por la expresión 4/3*pi*r3*/



		int radio=0;
		int opcion=0;

		
			radio=Metodos.pedirEntero("introduzca un radio por teclado");
			opcion=Metodos.pedirEntero("introduzca\n-1-(Longitud)\n-2- (Superficie)\n-3- (Volumen)\n-0- para salir");
			while (opcion!=0){
				
				switch (opcion) {
				case 1:
					System.out.println(Metodos.Longitud(radio));

					break;
				case 2:
					System.out.println(Metodos.Superficie(radio));

					break;
				case 3:
					System.out.println(Metodos.Volumen(radio));
					
			
				default:
					break;
				
					
				}//end switch
				opcion=Metodos.pedirEntero("introduzca\n-1-(Longitud)\n-2- (Superficie)\n-3- (Volumen)\n-0- para salir");
			}//end while
		
			
	}//end main

}//end class
