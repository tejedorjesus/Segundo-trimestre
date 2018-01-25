import java.util.Scanner;
public class FechaMain {

	public static void main(String[] args) {
		int opcion;
		int dia, mes, anio;
		int diasASumar = 0;
		Fecha fechaActual, fechaNacimiento, fechaNueva;
		System.out.println("Introduce la fecha de hoy");
		do {
			dia = pedirEntero("Dia?");
			mes = pedirEntero("Mes?");
			anio = pedirEntero("A�o?");
			fechaActual = new Fecha(dia, mes, anio);
		} while (!fechaActual.esCorrecta());

		System.out.println("La fecha actual es: " + fechaActual.getCadenaFecha1());
		opcion = pedirEntero(
				"Que quieres hacer?\n1-Sumar dias\n2-Saber la diferencia en dias entre esta fecha y la fecha actual\n3-Calcular una edad");

		while (opcion != 0) {
			switch (opcion) {
			case 1:
				diasASumar = pedirEntero("Introduce d�as a sumar");
				System.out.println("La fecha resultante es " + fechaActual.sumaDias(diasASumar));
				break;
			case 2:
				System.out.println("Introduce una fecha nueva");
				do {
					dia = pedirEntero("Dia?");
					mes = pedirEntero("Mes?");
					anio = pedirEntero("A�o?");
					fechaNueva = new Fecha(dia, mes, anio);
				} while (!fechaNueva.esCorrecta());
				System.out.println("La nueva fecha es " + fechaNueva.getCadenaFecha1());
				System.out.println("La diferencia en dias entre esas fechas es de: "
						+ fechaActual.diferenciaFecha(fechaNueva) + " dias");
				System.out.println(fechaActual.diferenciaFecha(fechaNueva));
				break;
			case 3:
				do {
					System.out.println("Introduce la fecha de nacimiento de una persona");
					dia = pedirEntero("Dia?");
					mes = pedirEntero("Mes?");
					anio = pedirEntero("A�o?");
					fechaNacimiento = new Fecha(dia, mes, anio);
				} while (!fechaNacimiento.esCorrecta());
				mostrarFechaNacimiento(fechaNacimiento);
				mostrarEdad(fechaActual, fechaNacimiento);
				System.out.println("\n---------------------------------------------");
				break;
			default:
				System.out.println("Opcion incorrecta");
				System.out.println(fechaActual.getCadenaFecha1());
				break;
			}// Switch
			opcion = pedirEntero(
					"Que quieres hacer?\n1-Sumar dias\n2-Saber la diferencia en dias entre esta fecha y la fecha actual\n3-Calcular una edad");
		} // while
	}// main

	/**
	 * @param fechaNacimiento
	 */
	public static void mostrarFechaNacimiento(Fecha fechaNacimiento) {
		System.out.print("Fecha de nacimiento: ");
		System.out.print(fechaNacimiento.getCadenaFecha1() + " || ");
		System.out.print(fechaNacimiento.getCadenaFecha2());
		System.out.println();
	}// Mostrar fecha nacimiento

	/**
	 * @param fechaActual
	 * @param fechaNacimiento
	 */
	public static void mostrarEdad(Fecha fechaActual, Fecha fechaNacimiento) {
		int anios = 0, meses = 0, dias = 0;
		String frase = "*************************************\n*************************************\nFelicidades! A celebrarlo al burger king!!\n*************************************\n*************************************";
		dias = fechaActual.getDia() - fechaNacimiento.getDia();
		meses = fechaActual.getMes() - fechaNacimiento.getMes();
		anios = fechaActual.getAnio() - fechaNacimiento.getAnio();

		// A�n no es el mes de su cumplea�os
		// o es el mes pero no ha llegado el d�a.
		if (meses < 0 || (meses == 0 && dias < 0)) {
			anios--;
		}
		if (fechaActual.getDia() == fechaNacimiento.getDia() && fechaActual.getMes() == fechaNacimiento.getMes()) {
			System.out.println(frase);
			System.out.printf("La persona ha cumplido hoy: %d a�os", anios);
		} else {
			System.out.printf("La persona tiene: %d a�os", anios);
		}

		// System.out.printf("La persona tiene: %d a�os, %d meses y %d d�as",
		// anios, meses, dias);
	}// mostrar Edad

	/**
	 * 
	 * @param mensaje
	 *            para pedir numero
	 * @return el numero introducido por teclado
	 */
	public static int pedirEntero(String mensaje) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		num = sc.nextInt();
		return num;
	}// Pedir entero

}// Class