/**
 * @author agatha-paiva*
 */

package br.com.utfpr.java;

import br.com.utfpr.java.exceptions.NumberException;

public abstract class ClienteBanco implements Verifica{
	
	private int numeroConta = 0;
	private String nome = "";
	Endereco ender = new Endereco();
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) throws NumberException{
		if(numeroConta > 0) {
			this.numeroConta = numeroConta;
		}else {
			throw new NumberException();
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEnder() {
		return ender;
	}
	public void setEnder(Endereco ender) {
		this.ender = ender;
	}
	
	public abstract void verifDoc();
	
	public void validar(){
		if((numeroConta % 2) == 0) {
			System.out.println("par");
		}else {
			 System.out.println("impar");
		}
	} 
}