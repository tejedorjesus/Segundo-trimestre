package tragabolasmio;

import java.*;
import java.util.Scanner;

public class TragaBolas {

	private String color;
	private int bolasComidas;
	private int maxBolas;

	public TragaBolas(String color, int maxBolas) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("color del hipo?");
			this.color = sc.nextLine();
		} while (!this.color.toLowerCase().equals("azul") && !this.color.toLowerCase().equals("amarillo")
				&& !this.color.toLowerCase().equals("verde") && !this.color.toLowerCase().equals("rojo"));
		
		System.out.println("maximo de bolas");
		this.maxBolas = sc.nextInt();
		
	}// constructor

	public String visualizar() {
		String estado;
		estado = "El hipopotamo es de color " + color + ", lleva " + bolasComidas
				+ " bolas comidas y su maximo de bolas es " + maxBolas;
		return estado;
	}

	public String comer() {
		String mensaje;
		if (bolasComidas < maxBolas) {
			bolasComidas++;
			mensaje = "El hipopotamo de color " + color + " ha comido 1 bola";
		} else {
			mensaje = "El hipopotamo esta lleno";
		}
		return mensaje;
	}// main

	public String trotar() {
		String mensaje;
		if (bolasComidas == 0) {
			mensaje = "El hipopotamo no puede trotar porque no ha comido";
		} else {
			bolasComidas--;
			mensaje = "Estoy trotando y rebajando una bolita. Run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run run ";
		}
		return mensaje;
	}// trotar

	public String dormir() {
		String mensaje;
		if (bolasComidas == maxBolas) {
			bolasComidas = bolasComidas / 2;
			mensaje = "Tripa llena me quedo con la mitad de bolas . \nzZz ";
		} else {
			mensaje = "No quiero dormir ";
		}
		return mensaje;
	}// dormir

}// Class
