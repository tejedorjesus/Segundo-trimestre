import java.util.Comparator;


public class OrdenarPorMarca implements Comparator <Automovil> {
	
	public int compare(Automovil p1, Automovil p2) {
		return p1.getMarca().compareTo(p2.getMarca());
	

}


}
