import java.util.Comparator;

public class OrdenPorEdad implements Comparator <Persona> {
	
	public int compare(Persona p2, Persona p1) {
		return p2.getEdad()-p1.getEdad();
	}
	
}
