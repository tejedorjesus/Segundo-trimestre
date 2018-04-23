public class Persona {
	
   private final String nombre;
   private final int edad;
   private final int altura;
   private final int dni;
public Persona(String nombre, int edad, int altura, int dni) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.altura = altura;
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public int getEdad() {
	return edad;
}
public int getAltura() {
	return altura;
}
public int getDni() {
	return dni;
}
   

}