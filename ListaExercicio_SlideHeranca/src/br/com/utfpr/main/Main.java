package br.com.utfpr.main;

import br.com.utfpr.java.dto.Aluno;
import br.com.utfpr.java.dto.Professor;

public class Main {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		Professor p = new Professor();
		
		a.setRG(1);
		a.setNome("Aluna Agatha");
		a.setRA(10);
		a.setNome("Aluno Danilo");
		a.setTurma("Java");
		
		System.out.println("RG: " + a.getRG());
		System.out.println("Nome: " + a.getNome());
		System.out.println("RA: " + a.getRA());
		System.out.println("Turma: " + a.getTurma());
		
		p.setNome("Jose");
		p.setRG(2);
		p.setSIAPE(23);
		p.setTitulo("Java");
		
		System.out.println("================================");
		
		System.out.println("Nome do professor: " + p.getNome());
		System.out.println("RG: " + p.getRG());
		System.out.println("SIAPE: " + p.getSIAPE());
		System.out.println("Tituulo: " + p.getTitulo());
	}

}
