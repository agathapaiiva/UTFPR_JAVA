/**
 * @author agatha-paiva
 */
package br.com.utfpr.java.dto;

public class Aluno extends Pessoa{
	private int RA;
	private String turma;
	
	// Polimorfismo com sobrecarga também na classe Aluno!
	
	public Aluno() {}
	
	public Aluno (int RA, String turma) {
		this.RA = RA;
		this.turma = turma;
	}
	
	/**
	 * @return the rA
	 */
	public int getRA() {
		return RA;
	}
	/**
	 * @param rA the rA to set
	 */
	public void setRA(int rA) {
		RA = rA;
	}
	/**
	 * @return the turma
	 */
	public String getTurma() {
		return turma;
	}
	/**
	 * @param turma the turma to set
	 */
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public void mostraClasse() {
		 System.out.println("Sobrescrevi o método Abstrato de Pessoa. Estou na classe Aluno");
	}

}
