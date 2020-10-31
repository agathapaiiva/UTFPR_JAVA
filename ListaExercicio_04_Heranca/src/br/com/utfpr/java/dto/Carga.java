/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.dto;

final public class Carga extends Veiculo{
	private int tara;
	private int cargaMax;
	
	public Carga() {}
	
	public Carga(int tara, int cargaMax ) {
		this.tara = tara;
		this.cargaMax = cargaMax;
	}
	
	/**
	 * @return the tara
	 */
	public int getTara() {
		return tara;
	}

	/**
	 * @param tara the tara to set
	 */
	final public void setTara(int tara) {
		this.tara = tara;
	}

	/**
	 * @return the cargaMax
	 */
	public int getCargaMax() {
		return cargaMax;
	}

	/**
	 * @param cargaMax the cargaMax to set
	 */
	final public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	int calcVel(int velocMax) {
		return 0;
	}

	@Override
	public float calcVel(float velocMax) {
		float result = (float) (velocMax * 100000);
		return result;
	}

}
