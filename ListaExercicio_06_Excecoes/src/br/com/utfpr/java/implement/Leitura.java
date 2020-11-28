/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.implement;

import javax.swing.JOptionPane;

public class Leitura {
	
	public String entDados(){
		String opcao = "";
		
		try {
			opcao = JOptionPane.showInputDialog("Sistema de Gestão de Veículos - Menu Inicial\n\n"
					+"1 - Cadastrar Veículo de Passeio\n"
					+"2 - Cadastrar Veículo de Carga\n" 
					+"3 - Imprimir Todos os Veículos de Passeio\n"
					+"4 - Imprimir Todos os Veículos de Carga\n"
					+"5 - Imprimir Veículo de Passeio pela Placa\n"
					+"6 - Imprimir Veículo de Carga pela Placa\n"
					+"7 - Sair do Sistema");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR DE SISTEMA", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		
		return opcao;
	}
	
}
