package br.com.utfpr.java.exceptions;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class VelocException extends Exception{
	public void imprimeMensagemVelocidade() {
		JOptionPane.showMessageDialog(null, "A velocidade máxima está fora dos limites brasileiros", "MENSAGEM",
				JOptionPane.WARNING_MESSAGE);
	}
}
