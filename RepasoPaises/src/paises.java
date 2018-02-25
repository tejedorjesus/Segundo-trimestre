
public class paises {
	
	

	private int numeropaises;
	private String[] Paises;
	private static int contapais;




	public paises(int numeropaises) {
		
		this.numeropaises = numeropaises;
		Paises = new String [numeropaises];
		contapais=0;

	}






	public static int getContapais() {
		return contapais;
	}






	public static void setContapais(int contapais) {
		paises.contapais = contapais;
	}






	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void vaciar (int lista){
		for (int i = 0; i < Paises.length; i++) {
			Paises[i] = null;
		}
	}
		
		
	

	/*public void eliminar(delete){
		
		
	}*/
	
	
	@Override
	public String toString() {
		return " [ " + nombre + "]";
	} 

}
