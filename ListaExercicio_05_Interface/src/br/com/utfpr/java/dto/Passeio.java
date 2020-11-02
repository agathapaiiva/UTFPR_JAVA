/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.dto;

import java.util.Formatter;

final public class Passeio extends Veiculo{
	
	private int qtdePassageiros;
	
	public Passeio() {
		this.qtdePassageiros = 0;
	}
	
	public Passeio(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;		
	}
	
	Formatter formatter = new Formatter();
	
	/**
	 * @return the qtdePassageiros
	 */
	public int getQtdePassageiros() {
		return qtdePassageiros;
	}

	/**
	 * @param qtdePassageiros the qtdePassageiros to set
	 */
	final public void setQtdePassageiros(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}

	@Override
	public float calcVel(float velocMax) {
		float result = (float) (velocMax * 1000);
		return result;
	}

}
