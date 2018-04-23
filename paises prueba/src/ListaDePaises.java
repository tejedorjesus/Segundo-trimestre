import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class ListaDePaises {
	
	

	private String nombrePais;
	private static int contapaises=1;

	public ListaDePaises(String nombrePais) {
		super();
		this.nombrePais = nombrePais;
		contapaises++;
	}

	public static int getContapaises() {
		return contapaises;
	}

	public static void setContapaises(int contapaises) {
		ListaDePaises.contapaises = contapaises;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	@Override
	public String toString() {
		return "ListaDePaises [nombrePais=" + nombrePais + "]";
	}
	
	
	

}
