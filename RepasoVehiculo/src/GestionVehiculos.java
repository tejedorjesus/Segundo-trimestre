
public class GestionVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ruedas=0;
		int vMax=0;
		int vAct=0;
		int peso=0;
		int n=0;

		Vehiculo vehiculo1;
		System.out.println("lets try to create a vehicule my lord....");
		ruedas=Metodos.pedirentero("tell me how maby wheels you wish master");
		vMax=Metodos.pedirentero("do you wish a really fast thing order my a max speed i can do it");
		vAct=Metodos.pedirentero("what is your current speed?");
		peso=Metodos.pedirentero("master tell me the weight of the car of your dreams");
		
		vehiculo1 = new Vehiculo(ruedas,vMax,vAct,peso);
		
		System.out.println(vehiculo1);
		
		
		
		
		
		
		
		Vehiculo vehiculo2;
		
		System.out.println("lets try to create a vehicule my lord....");
		ruedas=Metodos.pedirentero("tell me how maby wheels you wish master");
		vMax=Metodos.pedirentero("do you wish a really fast thing order my a max speed i can do it");
		vAct=Metodos.pedirentero("what is your current speed?");
		peso=Metodos.pedirentero("master tell me the weight of the car of your dreams");
		vehiculo2= new Vehiculo(ruedas,vMax,vAct,peso);

		
		System.out.println(vehiculo1);
		System.out.println(vehiculo2);
		

		System.out.println("vamos a ver si es igual ");
		if(vehiculo1.esIgual(vehiculo2)==true){
			System.out.println("son iguales");
			
		}else{
			System.out.println("no son iguales");
		}
		
		n=Metodos.pedirentero("lets do some magic lets copy shits master which one do you wanna copy #1 or #2?");
		if(vehiculo1.esIgual(vehiculo2)==true){
			System.out.println("para que quieres copiear si son iguales");
			
			
			
			
		}else
		if (n==1){
			vehiculo1.copia(vehiculo2);
		}else{
			vehiculo2.copia(vehiculo1);
		}
		
		System.out.println(vehiculo1);
		System.out.println(vehiculo2);
		
		
		
		
		
	}
	
	
	
	

}
