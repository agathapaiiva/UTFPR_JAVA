/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.exceptions;

import javax.swing.JOptionPane;

public class VeicExistException  extends Exception{
	
	private static final long serialVersionUID = 1L;

	public void imprimeMensagemVeicExist()  {
		JOptionPane.showMessageDialog(null, "Já existe um veículo com esta placa", "MENSAGEM",
				JOptionPane.WARNING_MESSAGE);
		
	}	
}
	
