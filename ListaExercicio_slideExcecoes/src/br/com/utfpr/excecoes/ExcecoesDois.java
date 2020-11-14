package br.com.utfpr.excecoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcecoesDois {
	public static void main(String[] args) {
		BufferedReader memoria = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("#######Entrada de dados#######\n");
		String s ="";
	
		
		boolean continua = true;
		
		while (continua) {
			System.out.println("Entre com um valor:");
			try {
				s = memoria.readLine();
				int numero = Integer.parseInt(s);
				System.out.println("O quadrado do valor de entrada é: " + numero * numero);
				continua = false;
			} catch (IOException erroUm) {
				System.out.println("Erro na entrada de dados " + erroUm);
			} catch (NumberFormatException erroDois) {
				System.out.println("Digite apenas números inteiros:" + erroDois);
			} finally {
				System.out.println("Entrou no Finally");
			}
		}
		System.out.println("Valor digitado foi: " + s);
	}
}
