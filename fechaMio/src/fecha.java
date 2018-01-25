
public class fecha {//class
	
	
	private int dia;
	private int mes;
	private int anio;
	public fecha(int dia, int mes, int anio) {//construc
		
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}// constructorcito
	
	public boolean esBisiesto(int anio){//es bisiesto
		if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
		return true;
				
		}else{//end if
		
		
		
		
		return false;
	}//end else
	}//end es bisiesto
	
	
	public int getDiasMes(){// esCorrecta
		int numDiasMes=0;
		if( mes == 1 || mes == 3 || mes==5|| mes==7 || mes==8 || mes==10 || mes==12){
			numDiasMes=31;
		}else if (mes == 4 || mes== 6 || mes==9 || mes == 11 ){
			numDiasMes=30;
		}else if (mes==2){
			numDiasMes=28;
		}
			return numDiasMes;
		
		
		
	}//end esCorrecta
	
	
}//class
