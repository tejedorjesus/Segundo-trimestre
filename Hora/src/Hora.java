import java.util.Scanner;
public class Hora {

	private int hora;
	private int minuto;
	private int segundo;
	public Hora(int hora, int minuto, int segundo) {

		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}//end constructor



	public  void PonerHora (int horas,int minutos, int segundos){
		Scanner sc = new Scanner(System.in);
		System.out.println("intro hora");
		hora = sc.nextInt(); 
		while (hora<0 || hora >24){
			System.out.println(" hora incorrecta intro hora");
			hora = sc.nextInt(); 

		}//end while

		System.out.println("intro minutos");
		minuto = sc.nextInt(); 
		while (minuto<0 || minuto >60){
			System.out.println(" minutos incorrectos intro minutos");
			minuto = sc.nextInt(); 

		}//end while
		System.out.println("intro segundos");
		segundo = sc.nextInt(); 
		while (segundo<0 || segundo >60){
			System.out.println(" segundos incorrectos intro segundos");
			segundo = sc.nextInt(); 


		}//end while

	}//end PonerHora




	public int SumarHora(int horas){
		hora= hora + horas;
		if (hora > 24 ){


			return this.hora%24;
		}else{
			return this.hora;
		}


	}//end sumar hora
	public int SumarMinuto(int minutos){
		minuto= minuto + minutos;
		return this.minuto;


	}//end sumar minuto
	public int SumarSegundo(int segundos){
		segundo= segundo + segundos;
		return this.segundo;


	}//end sumar segundo
	public int RestarHora(int horas){
		hora= hora - horas;
		return this.hora;


	}//end restar hora
	public int RestarMinuto(int minutos){
		minuto= minuto - minutos;
		return this.minuto;


	}//end restar minuto
	public int RestarSegundo(int segundos){
		segundo= segundo - segundos;
		return this.segundo;


	}//end restar segundos

	public int visualizarHora(int horas) {
		if (hora > 24 ){


			return this.hora%24;
		}else{
			return this.hora;
		}//end else
		
	}//vhora
	public int visualizarMinuto(int minutos){
		if (minuto > 60 ){


			return this.minuto%60;
		}else{
			return this.minuto;
		}
	}
		public int visualizarSegundo(int segundos){
			if (segundo > 60 ){


				return this.segundo%60;
			}else{
				return this.segundo;
			}





	}//end visualizar



}//en class
