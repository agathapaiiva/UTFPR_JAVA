package br.com.utfpr.java.exceptions;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class VeicExistException  extends Exception{

	public void imprimeMensagemVeicExist()  {
		JOptionPane.showMessageDialog(null, "Já existe um veículo com esta placa", "PASSEIO",
				JOptionPane.WARNING_MESSAGE);
	}
}
	
