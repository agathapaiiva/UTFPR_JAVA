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
}
