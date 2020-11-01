/**
 * @author agatha-paiva
 */
package br.com.utfpr.java.dto;

/**
 * Classe MÃE - Classe Generalizada 
 */

public abstract class Pessoa {
	private String nome;
	private int CPF;
	
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
	/**
	 * @return the cPF
	 */
	public int getCPF() {
		return CPF;
	}
	/**
	 * @param cPF the cPF to set
	 */
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	
	public void impLocal() {
		System.out.println("Método da classe MÃE - Pessoa");
	}
	

}
