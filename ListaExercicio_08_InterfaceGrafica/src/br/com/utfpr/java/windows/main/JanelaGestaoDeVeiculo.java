/**
 * @author agatha-paiva
 */
package br.com.utfpr.java.windows.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import br.com.utfpr.java.windows.carga.JanelaGestaoCarga;
import br.com.utfpr.java.windows.passeio.JanelaGestaoPasseio;

public class JanelaGestaoDeVeiculo implements ActionListener{
	
	private JFrame janelaGestaoVeiculo = new JFrame();
	private JButton buttonPasseio = new JButton();
	private JButton buttonCarga = new JButton();
	
	public void criarJanelaGestao() {
		
		janelaGestaoVeiculo.setVisible(true);
		janelaGestaoVeiculo.setLayout(null);
		janelaGestaoVeiculo.setTitle("Gestão de Veículos");
		janelaGestaoVeiculo.setLocation(850, 400);
		janelaGestaoVeiculo.setSize(300,200);
		janelaGestaoVeiculo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//elementos que nao podem ser alterados
		buttonPasseio.setBounds(40, 50, 100, 40);
		buttonCarga.setBounds(160, 50, 100, 40);
		
		// criando elementos PASSEIO
		buttonPasseio.setBorder(new LineBorder(Color.BLACK));
		buttonPasseio.setBackground(Color.CYAN);
		buttonPasseio.setText(" PASSEIO ");
		buttonPasseio.addActionListener(this);
		
		// criando elementos CARGA
		buttonCarga.setBorder(new LineBorder(Color.BLACK));
		buttonCarga.setBackground(Color.GREEN);
		buttonCarga.setText("	CARGA ");
		buttonCarga.addActionListener(this);
		
		// add elementos
		janelaGestaoVeiculo.add(buttonCarga);
		janelaGestaoVeiculo.add(buttonPasseio); 
		
	}
	
	public static void main(String[] args) {
		JanelaGestaoDeVeiculo janelaTest = new JanelaGestaoDeVeiculo();
		janelaTest.criarJanelaGestao();
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource().equals(buttonPasseio)) {
			JanelaGestaoPasseio gestaoPasseio = new JanelaGestaoPasseio();
			gestaoPasseio.criarJanelaGestaoPasseio();
		//	janelaGestaoVeiculo.dispose();
		} 
		
		if(evt.getSource().equals(buttonCarga)) {
			JanelaGestaoCarga gestaoCarga = new JanelaGestaoCarga();
			gestaoCarga.criarJanelaGestaoCarga();
		//	janelaGestaoVeiculo.dispose(); 
		}
	}
	
}

