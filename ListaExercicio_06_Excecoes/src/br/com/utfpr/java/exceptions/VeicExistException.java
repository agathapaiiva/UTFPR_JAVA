package br.com.utfpr.java.exceptions;

import javax.swing.JOptionPane;

import br.com.utfpr.java.implement.Leitura;

public class VeicExistException  extends Exception{
	
	Leitura leitura = new Leitura();

	public void imprimeMensagemVeicExist()  {
		JOptionPane.showMessageDialog(null, "Já existe um veículo com esta placa", "PASSEIO",
				JOptionPane.WARNING_MESSAGE);
		
		leitura.entDados();
		
	}

}
