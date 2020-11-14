package br.com.utfpr.dto;

public class Aluno extends Pessoa{
	private int RA;
	private String turma;
	
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	
}
