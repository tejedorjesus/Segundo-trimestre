
public class maquinista extends empleado{
private Integer numMaq;
private Integer numA�osmaq;
private static Integer contamaq=0;
public maquinista(String nombre, Integer edad, Integer numMaq, Integer numA�osmaq) {
	super(nombre, edad);
	contamaq++;
	this.numMaq = numMaq;
	this.numA�osmaq = numA�osmaq;
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
public Integer getNumA�osmaq() {
	return numA�osmaq;
}
public void setNumA�osmaq(Integer numA�osmaq) {
	this.numA�osmaq = numA�osmaq;
}
@Override
public String toString() {
	return "[numMaq=" + numMaq + ", numA�osmaq=" + numA�osmaq + super.toString()+"]";
}

	

}

