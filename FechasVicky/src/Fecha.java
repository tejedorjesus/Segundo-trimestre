

public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}// Constructor

	public boolean esBisiesto() {
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			return true;
		} else {
			return false;
		}
	}// Bisiesto

	public boolean esBisiesto(int anio) {
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			return true;
		} else {
			return false;
		}
	}// Bisiesto

	/**
	 * 
	 * @return true si la fecha es correcta
	 */
	public boolean esCorrecta() {
		int numDiasMes = 0;
		if (anio < 0) {
			return false;
		}
		if (mes < 1 || mes > 12) {
			return false;
		}
		if (dia < 1 || dia > 31) {
			return false;
		} else {
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				numDiasMes = getDiasMes();
				if (dia > numDiasMes) {
					return false;
				}
			} else if (mes == 2) {
				numDiasMes = getDiasMes();
				if (dia > numDiasMes) {
					return false;
				}
			}
			return true;
		}
	} // Fechacorrecta

	/**
	 * 
	 * @return el n�mero de d�as que tiene el mes
	 */
	public int getDiasMes() {
		int numDiasMes = 0;
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			numDiasMes = 31;
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			numDiasMes = 30;
		} else if (mes == 2) {
			if (esBisiesto()) {
				numDiasMes = 29;
			} else {
				numDiasMes = 28;
			}
		}
		return numDiasMes;
	}// getDiasMes

	/**
	 * 
	 * @returnuna cadena que contiene el mes con letras: enero, febrero, marzo,
	 *            etc.
	 */
	public String getCadenaMes() {
		String nombreMes = "";
		if (mes == 1) {
			nombreMes = "Enero";
		} else if (mes == 2) {
			nombreMes = "Febrero";
		} else if (mes == 3) {
			nombreMes = "Marzo";
		} else if (mes == 4) {
			nombreMes = "Abril";
		} else if (mes == 5) {
			nombreMes = "Mayo";
		} else if (mes == 6) {
			nombreMes = "Junio";
		} else if (mes == 7) {
			nombreMes = "Julio";
		} else if (mes == 8) {
			nombreMes = "Agosto";
		} else if (mes == 9) {
			nombreMes = "Septiembre";
		} else if (mes == 10) {
			nombreMes = "Octubre";
		} else if (mes == 11) {
			nombreMes = "Noviembre";
		} else if (mes == 12) {
			nombreMes = "Diciembre";
		}
		return nombreMes;
	} // getCadenaMes

	/**
	 * 
	 * @return cadena con la fecha en formato'dd-mm-yyyy'.
	 */
	public String getCadenaFecha1() {
		String fecha1;
		fecha1 = dia + "/" + mes + "/" + anio;
		return fecha1;
	}// getCadenaFecha1

	/**
	 * 
	 * @return cadena con la fecha en formato �5 de Mayo de 2016�.
	 */
	public String getCadenaFecha2() {
		String fecha2;
		fecha2 = dia + " de " + getCadenaMes() + " de " + anio;
		return fecha2;
	}// getCadenaFecha2

	/**
	 * 
	 * @return dias
	 */
	public String sumaDias(int sumaDias) {
		String fecha1;
		int[] meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (esBisiesto()) {
			meses[1] = 29;
		}
		int diasDelAnio = 0;
		for (int i = 0; i < meses.length; i++) {
			diasDelAnio += meses[i];
		}
		int sumaAnios;
		int diasRestantes;
		sumaAnios = sumaDias / diasDelAnio;
		diasRestantes = sumaDias % diasDelAnio;
		anio += sumaAnios;

		for (int i = 0; i < diasRestantes; i++) {
			if (dia < meses[mes - 1]) {
				dia++;
			} else if ((dia == meses[mes - 1]) && (mes < 12)) {
				dia = 1;
				mes++;
			} else if ((dia == meses[mes - 1]) && (mes == 12)) {
				dia = 1;
				mes = 1;
				anio++;
			}
		}
		fecha1 = dia + "/" + mes + "/" + anio;
		return fecha1;
	}// sumaDias

	public int diferenciaFecha(Fecha fecha2) {
		int diferencia = 0;
		int diasTotalesActual=0;
		int diasTotalesFecha2=0;
		diasTotalesActual= diasDesdeElInicio(this);
		diasTotalesFecha2 = diasDesdeElInicio(fecha2);
		System.out.println("diasTotalesActual" +diasTotalesActual);
		System.out.println("diasTotalesFecha2" +diasTotalesFecha2);
		diferencia = diasTotalesActual - diasTotalesFecha2;
		
		if (diferencia < 0) {
			diferencia = -diferencia;
		}
		return diferencia;
	}// diferenciaFecha

	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	private Integer diasDesdeElInicio(Fecha date) {
		int diferencia = 0;
		int diasTotales=0;

		int[] meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i <= date.anio - 1; i++) {
			if (esBisiesto(i)) {//*************************
				diasTotales = diasTotales + 366;
			} else {
				diasTotales = diasTotales + 365;
			}
		} // Calcular dias hasta el a�o anterior

		for (int miMes = 1; miMes <= date.mes - 1; miMes++) {
			
			if (esBisiesto(miMes)) {//**********************
				meses[1] = 29;
			}
			diasTotales = diasTotales + meses[miMes - 1];
		}// dias  transcurridoshasta el mes anterior
		
		diasTotales = diasTotales + date.dia;
		return diasTotales;
	} // dias totales

}// Class
