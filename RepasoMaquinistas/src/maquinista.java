
public class maquinista extends empleado{
private Integer numMaq;
private Integer numAñosmaq;
private static Integer contamaq=0;
public maquinista(String nombre, Integer edad, Integer numMaq, Integer numAñosmaq) {
	super(nombre, edad);
	contamaq++;
	this.numMaq = numMaq;
	this.numAñosmaq = numAñosmaq;
}

public static Integer getContamaq() {
	return contamaq;
}

public static void setContamaq(Integer contamaq) {
	maquinista.contamaq = contamaq;
}

public Integer getNumMaq() {
	return numMaq;
}
public void setNumMaq(Integer numMaq) {
	this.numMaq = numMaq;
}
public Integer getNumAñosmaq() {
	return numAñosmaq;
}
public void setNumAñosmaq(Integer numAñosmaq) {
	this.numAñosmaq = numAñosmaq;
}
@Override
public String toString() {
	return "[numMaq=" + numMaq + ", numAñosmaq=" + numAñosmaq + super.toString()+"]";
}

	

}

