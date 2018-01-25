
import java.util.Scanner;

public class TragaBolas {
	private String color;
	private int bolasComidas;
	private int maxBolas;
	
	
	public TragaBolas(String color, int maxBolas) {
		
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("¿color hipo?");
			this.color = sc.nextLine();
		}
		while(!this.color.toLowerCase().equals("azul") && !this.color.toLowerCase().equals("amarillo")
				&& !this.color.toLowerCase().equals("verde") && !this.color.toLowerCase().equals("rojo"));
		
		System.out.println("numero maxiomo de bolas");
		this.maxBolas = sc.nextInt();
	}// constructor
	
	public String comer() {
		String mensaje;
		if(bolasComidas<maxBolas){
			bolasComidas ++;
			mensaje = "el hipo ha comido una bola";
		}else{
			mensaje = " el hipo esta lleno";
			
		}
		
		return mensaje;
		
		
	}//comer
	
	public String trotar(){
		String mensaje;
		if (bolasComidas==0){
			mensaje= " no puedo trotar tengo que comer";
		}else{
			bolasComidas --;
			mensaje= "estoy trotando";
		}
		return mensaje;
	}//trotar
	

	public String dormir(){
		String mensaje;
		if (bolasComidas==maxBolas){
			bolasComidas= bolasComidas/2;
			mensaje= " a dormir";
		}else{
			
			mensaje= "no quiero dormir quiero comer";
		}
		return mensaje;
	}//dormir
	
	public String visualizar(){
		String status;
		status= "el hipo es de color" + color +  " ha comido " + bolasComidas+ " bolas y su maximo de de bolas es " + maxBolas ; 
		
			
			
		
		return status;
	}//status
	
	
	
	
	
	
}//tragabolas
	