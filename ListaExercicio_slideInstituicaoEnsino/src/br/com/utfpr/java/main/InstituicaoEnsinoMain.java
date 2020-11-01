package br.com.utfpr.java.main;

import br.com.utfpr.java.dto.Professor;

public class InstituicaoEnsinoMain {
	public static void main(String[] args) {
		
		Professor professor = new Professor();
		
		System.out.println("==== Informações da classe Professor ====\n");
		professor.setNome("Jose");
		professor.setCPF(1236547896);
		professor.setTitulo("Pós JAVA");
		professor.setSalario(10000);
		
		System.out.println("Nome " + professor.getNome()
		+ "\nCPF:" + professor.getCPF()
		+ "\nTitulo: " + professor.getTitulo()
		+ "\nSalario: " + professor.getSalario());
		
	}

}


