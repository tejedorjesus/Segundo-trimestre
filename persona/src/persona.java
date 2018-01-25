import java.util.Scanner;

public class persona {

	
	
    private String nombre;
    private int edad;
	
		
	
	








	
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public void iniciar(){
		System.out.println(" introduce nombre");
		nombre= sc.nextLine();
		
		
		
		
	}
	
	public void edad(){
		System.out.println("introduce la edad");
		edad=sc.nextInt();
	}
	
	public void mayor(){
		
		if(edad >=18){
			System.out.println("vete a comprar una birra mayorcico");
		}else{
			System.out.println("a casa a dormir niño rata");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
