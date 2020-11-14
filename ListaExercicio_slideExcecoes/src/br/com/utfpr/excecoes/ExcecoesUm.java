package br.com.utfpr.excecoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ExcecoesUm {
	public static void main(String[] args) {
		BufferedReader memoria = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("#######Entrada de dados#######\n");
		String s ="";
		System.out.println("Entre com um valor:");
		
		try {
			s = memoria.readLine();
		}catch (IOException erroUM) {
			System.out.println("Erro na entrada de dados " + erroUM);
		}finally {
			System.out.println("Entrou no Finally");
		}
		System.out.println("O valor de entrada foi: " + s);
	}

}
