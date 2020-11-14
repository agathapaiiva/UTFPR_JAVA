package br.com.utfpr.main;

import br.com.uftpr.implement.LeituraDados;
import br.com.utfpr.dto.Pessoa;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		boolean testaMain = true;
		
		while(testaMain) {
			try {
				pessoa.setId(Integer.parseInt(LeituraDados.inData("Entre com o ID <deve ser numero>:")));
				testaMain = false;
			} catch (NumberFormatException e) {
				System.out.println("\n O ID deve ser um numero inteiro");
			}
		}
		pessoa.setNome(LeituraDados.inData("\n Entre com o nome: "));
		System.out.println("\n ID....: "+pessoa.getId());
		System.out.println("\n Nome..: "+pessoa.getNome());
	}
}
