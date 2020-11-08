/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.dto;

import br.com.utfpr.java.interfacee.VerifTurma;

/**
 * classe FILHA - Uma classe especializada
 */

public class Aluno extends Pessoa implements VerifTurma{
	private int RA;
	private String turma;
	
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
	 * @return the Turma
	 */
	public String getTurma() {
		return turma;
	}
	/**
	 * @param curso the Turma to set
	 */
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public void mostraClasse() {
		System.out.println("Estou na classe Aluno");
	}
	
	public void mostraMae() {
		super.impLocal();
	}
	
	@Override
	public void contLetra() {
		
		if(turma.equalsIgnoreCase("a")) {
			System.out.println("Turma é A --> " + mensagem1);
		}else {
			System.out.println("Turma é B --> " + mensagem2);
		}
	}
	
}
