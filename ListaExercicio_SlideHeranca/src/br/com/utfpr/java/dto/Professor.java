/**
 * @author agatha-paiva
 */
package br.com.utfpr.java.dto;

public class Professor extends Pessoa{
	private int SIAPE;
	private String titulo;
	
	// Polimorfismo com sobrecarga também na classe Professor!
	
	public Professor() {}

	public Professor(int SIAPE, String titulo) {
		this.SIAPE = SIAPE;
		this.titulo = titulo;
	}

	/**
	 * @return the sIAPE
	 */
	public int getSIAPE() {
		return SIAPE;
	}
	/**
	 * @param sIAPE the sIAPE to set
	 */
	public void setSIAPE(int sIAPE) {
		SIAPE = sIAPE;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	

}
