package br.com.uftpr.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeituraDados {
	public static String inData(String label) {
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		System.out.print(label);
		
		String s= "";
		try {
			s = cd.readLine();
		} catch (IOException e) {
			System.out.println("Erro na entrada de dados");
		}
		return s;
	}

}
