import java.util.Scanner;
public class HoraMain {

	public static void main(String[] args) {

		int horas=0;
		int minutos = 0;
		int segundos=0;
		int opcion=0;
		Scanner sc = new Scanner(System.in);


		Hora reloj =null;
		reloj=null;

		System.out.println( " menu: �que desea hacer?");
		System.out.println("1-Poner en hora \n2-Sumar horas\n3-Sumar minutos \n4-Sumar segundos\n5-Restar horas\n6-Restar minutos\n7-Restar segundos\n8-Ver hora\n0-salir");
		opcion = sc.nextInt();

		while(opcion!=0){
			switch (opcion) {
			case 1:
				System.out.println("vamos a poner el reloj en hora");
				reloj=new Hora (horas, minutos, segundos);
				reloj.PonerHora(horas, minutos, segundos);
				System.out.println(reloj.visualizarHora(horas));
				System.out.println(reloj.visualizarMinuto(minutos));
				System.out.println(reloj.visualizarSegundo(segundos));
				break;




			case 2:
				System.out.println("vamos a sumar horitas");
				System.out.println("introduce las horas que quieres sumar");
				horas = sc.nextInt();
				System.out.println(reloj.SumarHora(horas)+"horas");
				System.out.println(reloj.visualizarHora(horas));
				System.out.println(reloj.visualizarMinuto(minutos));
				System.out.println(reloj.visualizarSegundo(segundos));
				break;
			case 3:
				System.out.println("vamos a sumar minutitos");
				System.out.println("introduce los minutos que quieres sumar");
				minutos = sc.nextInt();
				System.out.println(reloj.SumarMinuto(minutos)+"minutos");
				System.out.println(reloj.visualizarHora(horas));
				System.out.println(reloj.visualizarMinuto(minutos));
				System.out.println(reloj.visualizarSegundo(segundos));
				break;
			case 4:
				System.out.println("vamos a sumar segunditos");
				System.out.println("introduce los segundos que quieres sumar");
				segundos = sc.nextInt();
				System.out.println(+reloj.SumarSegundo(segundos)+"segundos");
				System.out.println(reloj.visualizarHora(horas));
				System.out.println(reloj.visualizarMinuto(minutos));
				System.out.println(reloj.visualizarSegundo(segundos));
				break;
			case 5:
				System.out.println("vamos a restar horitas");
				System.out.println("introduce las horitas que quieres restar");
				segundos = sc.nextInt();
				System.out.println(+reloj.RestarHora(horas)+"horas");
				System.out.println(reloj.visualizarHora(horas));
				System.out.println(reloj.visualizarMinuto(minutos));
				System.out.println(reloj.visualizarSegundo(segundos));
				break;
			case 6:
				System.out.println("vamos a restar minutitos");
				System.out.println("introduce los minutitos que quieres restar");
				segundos = sc.nextInt();
				System.out.println(+reloj.RestarMinuto(minutos)+"minutos");
				System.out.println(reloj.visualizarHora(horas));
				System.out.println(reloj.visualizarMinuto(minutos));
				System.out.println(reloj.visualizarSegundo(segundos));
				break;
			case 7:
				System.out.println("vamos a restar segunditos");
				System.out.println("introduce los segunditos que quieres restar");
				segundos = sc.nextInt();
				System.out.println(+reloj.RestarSegundo(segundos)+"segundos");
				System.out.println(reloj.visualizarHora(horas));
				System.out.println(reloj.visualizarMinuto(minutos));
				System.out.println(reloj.visualizarSegundo(segundos));
				break;
			case 8:
				System.out.print(reloj.visualizarHora(horas));
				System.out.print(reloj.visualizarMinuto(minutos));
				System.out.print(reloj.visualizarSegundo(segundos));
				break;


			default:
				System.out.println("ERROR asegurese de teclear una de las 8 opciones o el '0' para salir");


				break;






			}//end switch case

			System.out.println( " menu: �que desea hacer?");
			System.out.println("1-Poner en hora \n2-Sumar horas\n3-Sumar minutos \n4-Sumar segundos\n5-Restar horas\n6-Restar minutos\n7-Restar segundos\n8-Ver hora\n0-salir");
			opcion = sc.nextInt();
				
			}//end while

	}//end class
}//end main