package vehiculos;

public class gestionVehiculos {
	public static void main (String args [] ) {
			
		Vehiculo vehiculo1 = new Vehiculo (4,150,20,4000);
		Vehiculo vehiculo2 = new Vehiculo (5,150,21,8000);
		System.out.println(vehiculo1);
		Leer.mostrarEnPantalla("--------------------");
		System.out.println(vehiculo2);
		
		
		if (vehiculo1.soniguales(vehiculo2)){
			Leer.mostrarEnPantalla("son iguales ");
		}else{
			Leer.mostrarEnPantalla("no son iguales para nada");
		}
		Leer.mostrarEnPantalla("Vamos a copiar");
		vehiculo2.copia(vehiculo1);
		System.out.println(vehiculo1);
		System.out.println(vehiculo2);
		Leer.mostrarEnPantalla("Vamos a copiar");
		
		
		
		
		
	
	
		
	}//main

}