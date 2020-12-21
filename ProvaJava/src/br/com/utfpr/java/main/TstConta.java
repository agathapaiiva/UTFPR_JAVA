/**
 * @author agatha-paiva*
 */

package br.com.utfpr.java.main;

import br.com.utfpr.java.PessoaJuridica;
import br.com.utfpr.java.exceptions.NumberException;

public class TstConta{
	
	public static void main(String[] args) {
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		
		try {
			pessoaJuridica.setNumeroConta(2);
			
		} catch (NumberException numException) {
			numException.impMsg();
			return;
		}
		
		pessoaJuridica.setCnpj(0);
		pessoaJuridica.getEnder().setRua("Paulista");
		pessoaJuridica.getResponsavel().setCpf(12);
		pessoaJuridica.getResponsavel().setNome("Agatha");
		
		System.out.println("Número da conta: " + pessoaJuridica.getNumeroConta());
		pessoaJuridica.validar();
		System.out.println("CNJP: " + pessoaJuridica.getCnpj());
		System.out.println("Rua: " + pessoaJuridica.getEnder().getRua());
		System.out.println("Número CPF: " +pessoaJuridica.getResponsavel().getCpf());
		pessoaJuridica.getResponsavel().verifDoc();
		
		System.out.println("Nome:" + pessoaJuridica.getResponsavel().getNome());
		pessoaJuridica.verifDoc();
	}

}
