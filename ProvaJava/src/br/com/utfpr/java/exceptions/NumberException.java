/**
 * @author agatha-paiva*
 */

package br.com.utfpr.java.exceptions;

public class NumberException extends Exception {
	private static final long serialVersionUID = 1L;

	public void impMsg(){
		System.out.println("ERRO: Não pode haver Número Negativo para conta!");
	}

}
