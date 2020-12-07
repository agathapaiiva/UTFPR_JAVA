/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.dto;

public class Motor {
	private int qtdPist;
	private int potencia;
	
	public Motor() {
		this.qtdPist = 0;
		this.potencia = 0;
	}

	public Motor(int qtdPist, int potencia) {
		this.qtdPist = qtdPist;
		this.potencia = potencia;
	}

	public int getQtdPist() {
		return qtdPist;
	}

	public void setQtdPist(int qtdPist) {
		this.qtdPist = qtdPist;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	@Override
	public String toString() {
		return "A quantidade de pistões do motor do veículo é: " + qtdPist + "\n" +
			"A potência do motor do veículo é: " + potencia + "\n";
	}
	
}
