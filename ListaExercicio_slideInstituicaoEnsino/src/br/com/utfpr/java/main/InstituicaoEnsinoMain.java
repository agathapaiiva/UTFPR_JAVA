package br.com.utfpr.java.main;

import br.com.utfpr.java.dto.Aluno;
import br.com.utfpr.java.dto.Pessoa;
import br.com.utfpr.java.dto.Professor;

public class InstituicaoEnsinoMain {
	public static void main(String[] args) {
		
		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		Pessoa pessoa = new Professor();
		
		System.out.println("==== Informações da classe Professor ====\n");
		professor.setNome("Jose");
		professor.setCPF(1236547896);
		professor.setTitulo("Pós JAVA");
		professor.setSalario(10000);
		
		System.out.println("Nome " + professor.getNome()
		+ "\nCPF:" + professor.getCPF()
		+ "\nTitulo: " + professor.getTitulo()
		+ "\nSalario: " + professor.getSalario());
		professor.impLocal();
		
		System.out.println("\n==== Informações da classe Aluno ====\n");
		aluno.setNome("Agatha Paiva");
		aluno.setCPF(410869589);
		aluno.setCurso("Pós de JAVA");
		aluno.setRA(326598);
		
		System.out.println("Nome: " + aluno.getNome()
		+ "\nCPF: " + aluno.getCPF()
		+ "\nCurso: " + aluno.getCurso()
		+ "\nRA: " + aluno.getRA());
		
		System.out.println("\n==== Tipo Pessoa com comportamento de professor ====\n");
		pessoa.impLocal();
				
	}

}


