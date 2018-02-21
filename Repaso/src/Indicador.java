import java.util.Scanner;

public class Indicador {
	
	private Integer Valorinicial;
	
	private static Integer ValorMinimo=0;
	private Integer ValorMaximo=0;
	private Integer ValorActual=0;
	private String Unidades;
	public Integer getValorinicial() {
		return Valorinicial;
	}
	public void setValorinicial(Integer valorinicial) {
		Valorinicial = valorinicial;
	}
	public static Integer getValorMinimo() {
		return ValorMinimo;
	}
	public static void setValorMinimo(Integer valorMinimo) {
		ValorMinimo = valorMinimo;
	}
	public Integer getValorMaximo() {
		return ValorMaximo;
	}
	public void setValorMaximo(Integer valorMaximo) {
		ValorMaximo = valorMaximo;
	}
	public Integer getValorActual() {
		return ValorActual;
	}
	
	
	public void  sumalitros(Integer sumalitros){
		sumalitros=sumalitros;
		
	}
	public Integer getsumalitros() {
		return sumalitros;
	}
	public void setValorActual(Integer valorActual) {
		
		ValorActual = Valorinicial + sumalitros();
	}
	
	public String getUnidades() {
		return Unidades;
	}
	public void setUnidades(String unidades) {
		Unidades = unidades;
	}
	
	
	
	
	
	
	
}
	
