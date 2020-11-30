/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.exceptions;

import javax.swing.JOptionPane;

public class VelocException extends Exception{
	private static final long serialVersionUID = 1L;

	public void imprimeMensagemVelocidade() {
		JOptionPane.showMessageDialog(null, "A velocidade máxima está fora dos limites brasileiros", "MENSAGEM",
				JOptionPane.WARNING_MESSAGE);
	}
}
