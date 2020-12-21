/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.windows.passeio;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import br.com.utfpr.java.implement.BDVeiculos;

@SuppressWarnings("static-access")
public class PasseioTableModel extends AbstractTableModel{

	private static final long serialVersionUID = 1L;
	
	BDVeiculos bdVeiculos = new BDVeiculos();
	
	private String[] colunas = {"Plca", "Marca", "Modelo", "Cor", "Qtd.Rodas", "Veloc Máx", "Qtd.Pist", "Potência", "Qtd.Passageiros"};

	public void setColunas(String[] colunas) {
		this.colunas = colunas;
	}
	
	public String[] getColunas(String[] colunas) {
		return colunas;
	}

	@Override 
	public String getColumnName(int column) { 
		return colunas[column]; 
	}

	@Override
	public int getRowCount() { //qtd linhas
		return bdVeiculos.getVeiculoDePasseio().size();
	}
	
	@Override
	public int getColumnCount() { //qtd colunas
		return colunas.length;
	}

	
	@Override
	public Object getValueAt(int linha, int coluna) { //valores
		switch (coluna) {
		case 0: 
			return bdVeiculos.getVeiculoDePasseio().get(linha).getPlaca();
		case 1:
			return bdVeiculos.getVeiculoDePasseio().get(linha).getMarca();
		case 2:
			return bdVeiculos.getVeiculoDePasseio().get(linha).getModelo();
		case 3:
			return bdVeiculos.getVeiculoDePasseio().get(linha).getCor();
		case 4:
			return bdVeiculos.getVeiculoDePasseio().get(linha).getQtdRodas();
		case 5:
			return bdVeiculos.getVeiculoDePasseio().get(linha).getVelocMax();
		case 6:
			return bdVeiculos.getVeiculoDePasseio().get(linha).getMotor().getQtdPist();
		case 7:
			return bdVeiculos.getVeiculoDePasseio().get(linha).getMotor().getPotencia();
		case 8:
			return bdVeiculos.getVeiculoDePasseio().get(linha).getQtdePassageiros();
		
		default:
			JOptionPane.showMessageDialog(null, "ERROR");
			
		}
		return null;
	}
}
