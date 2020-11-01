/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.dto;

/**
 * classe FILHA - Uma classe especializada
 */

public class Aluno extends Pessoa{
	private int RA;
	private String curso;
	
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
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
