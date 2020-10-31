/**
 * @author agatha-paiva
 */
package br.com.utfpr.java.dto;

abstract class Pessoa {
	private int RG;
	private String nome;
	
	/**
	 * @return the rG
	 */
	public int getRG() {
		return RG;
	}
	/**
	 * @param rG the rG to set
	 */
	public void setRG(int rG) {
		RG = rG;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	

}
