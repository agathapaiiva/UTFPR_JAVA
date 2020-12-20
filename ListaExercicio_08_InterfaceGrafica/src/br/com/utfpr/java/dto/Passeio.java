/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.dto;

import br.com.utfpr.java.implement.Calc;

public final class Passeio extends Veiculo implements Calc{
	
	private int qtdePassageiros;
	
	public Passeio() {
		this.qtdePassageiros = 0;
	}
	
	public Passeio(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;		
	}
	
	/**
	 * @return the qtdePassageiros
	 */
	public int getQtdePassageiros() {
		return qtdePassageiros;
	}

	/**
	 * @param qtdePassageiros the qtdePassageiros to set
	 */
	public void setQtdePassageiros(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}

	@Override
	public float calcVel(float velocMax) {
		float result = (float) (velocMax * 1000);
		return result;
	}

	@Override
	public int calcular() {
		int somaLetra = 0;
		somaLetra += getPlaca().length();
		somaLetra += getMarca().length();
		somaLetra += getModelo().length();
		somaLetra += getCor().length();
		return somaLetra;
	}
	
	@Override
	public String toString() {
		return "A placa do veículo é: " + super.getPlaca() + "\n" +
				"A marca do veículo é: " + super.getMarca() + "\n" +
				"O modelo do veículo é: " + super.getModelo() + "\n" +
				"A cor do veículo é: " + super.getCor() + "\n" +
				"A quantidade de rodas do veículo são: " + super.getQtdRodas() + "\n" +
				super.getMotor() + 
				"A quantidade de passageiros do veículo é: " + qtdePassageiros + "\n" +
				"A velocMax do veículo é: " + calcVel(super.getVelocMax()) + " m/h" + "\n" + 
				"Método Calcular: " +calcular();
		
	}
}
