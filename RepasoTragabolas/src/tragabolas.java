
public class tragabolas {


	private String color ="";
	private int  bolasComidas;
	private int maxBolas;
	public tragabolas(String color, int maxBolas) {

		this.color = color;

		this.maxBolas = maxBolas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBolasComidas() {
		return bolasComidas;
	}
	public String comer(int bolasComidas) {
		String mensaje;
		
		if(bolasComidas >=maxBolas){
			bolasComidas =maxBolas;
			mensaje="im fucking full man";
		}
		bolasComidas = this.bolasComidas+ bolasComidas;
		
		mensaje= "estoy comiendo";

		if(this.bolasComidas>=maxBolas){
			mensaje= "I cant eat buddy thats my maximun";

		}
		return mensaje;
	}
	public void setBolasComidas(int bolasComidas) {
		this.bolasComidas = bolasComidas;
	}
	public int getMaxBolas() {
		return maxBolas;
	}
	public void setMaxBolas(int maxBolas) {
		this.maxBolas = maxBolas;
	}


	public String trotar(){
		String mensaje;
		if(bolasComidas>=1){
			mensaje="Im running";
			bolasComidas--;
		}else{
			mensaje="I cant I have to eat more man";
		}
		return mensaje;



	}
	public String dormir(){
		String mensaje;
		if(bolasComidas==maxBolas){
			mensaje="Im sleepping man";
			bolasComidas=(bolasComidas/2);
		}else{
			mensaje="i cant get sleep man";
		}

		return mensaje;
	}





	@Override
	public String toString() {
		return "tragabolas [color=" + color + ", bolasComidas=" + bolasComidas + ", maxBolas=" + maxBolas + "]";
	}




}
