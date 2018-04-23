
import java.util.Comparator;

public class OrdenPorDni implements Comparator <Persona> {
	
	public int compare(Persona p1, Persona p2) {
		return p1.getDni()-p2.getDni();
	}
	
}
