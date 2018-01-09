package tragabolasmio;

import java.*;

public class TragaBolas {

	private String color;
	private int bolasComidas;
	private int maxBolas;

	public TragaBolas(String color, int bolasComidas, int maxBolas) {
		this.color = color;
		this.bolasComidas = bolasComidas;
		this.maxBolas = maxBolas;
	}// constructor

	public String visualizar() {
		String estado = "";
		estado = "El hipopotamo es de color " + color + ", lleva " + bolasComidas
				+ " bolas comidas y su maximo de bolas es " + maxBolas;
		return estado;
	}

	public String comer() {
		String mensaje = "";
		if (bolasComidas < maxBolas) {
			bolasComidas++;
			mensaje = "El hipopotamo de color ha comido 1 bola";
		} else {
			mensaje = "El hipopotamo esta lleno";
		}

		return mensaje;
	}

}