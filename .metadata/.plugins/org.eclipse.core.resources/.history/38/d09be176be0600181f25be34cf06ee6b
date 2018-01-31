import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
public class ListaDePaises {

	
	private Integer numeroPaises;
	private String [] paises;
	public int contadorPaises = 0;
	public ListaDePaises(Integer numeroPaises) {
		
		this.numeroPaises = numeroPaises;
		paises = new String[numeroPaises];
	}

	public String[] getPaises() {
		return paises;
	}
	public void setPaises(String[] paises) {
		this.paises = paises;
	}
	public int getContadorPaises() {
		return contadorPaises;
	}

	@Override
	public String toString() {
		return "ListaDePaises [numeroPaises=" + numeroPaises + ", paises=" + Arrays.toString(paises)
				+ ", contadorPaises=" + contadorPaises + "]";
	}

	public boolean anadir(String nombre) {
		boolean anadido = false;
		// para añadir a la lista un nombre. Devuelve true si lo ha podido
		// añadir y false en caso contrario.
		if (!existeNombre(nombre) && !estaLlena()) {
			anadido = true;
			paises[contadorPaises] = nombre;
			contadorPaises++;
		}
		return anadido;
	}
	
	public boolean existeNombre(String nombre) {
		// para saber si el nombre existe en el array
		boolean existencia = false;
		for (int i = 0; i < paises.length; i++) {
			// Si uno coincide devuelve true
			if (paises[i] != null && paises[i].equals(nombre)) {
				existencia = true;
			}
		}
		return existencia;
	}
	public boolean estaLlena() {
		int contador = 0;
		boolean listaLLena = false;
		for (int i = 0; i < paises.length; i++) {
			if (paises[i] != null) {
				// Cuenta los elementos no null
				contador++;
			}
		}
		if (contador == paises.length) {
			listaLLena = true;
		}
		return listaLLena;
	}
	


	
	
	
}
