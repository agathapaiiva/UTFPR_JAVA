package br.com.utfpr.java.windows.carga;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

public class JanelaGestaoCarga implements ActionListener{
	
	private JFrame janelaGestaoCarga = new JFrame();
	private JButton buttonCadastrarCarga = new JButton();
	private JButton buttonConsultarExcluirPlacaCarga = new JButton();
	private JButton buttonImprimirExcluirCarga = new JButton();
	private JButton buttonSair = new JButton();
	private JLabel labelCadastro = new JLabel();
	private JLabel labelConsultarExcluirPlaca = new JLabel();
	private JLabel labelImprimirExcluir = new JLabel();
	private JLabel labelSair = new JLabel();
	
	public void criarJanelaGestaoCarga() {
		
		janelaGestaoCarga.setVisible(true);
		janelaGestaoCarga.setLayout(null);
		janelaGestaoCarga.setTitle("Veiculo de Carga");
		janelaGestaoCarga.setLocation(800, 400);
		janelaGestaoCarga.setSize(400,280);
		janelaGestaoCarga.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		// criando os elementos 
		buttonCadastrarCarga.setBorder(new LineBorder(Color.BLACK));
		buttonCadastrarCarga.setBounds(30, 30, 38, 38);
		buttonCadastrarCarga.setBackground(Color.GREEN);
		labelCadastro.setText("CADASTRAR");
		labelCadastro.setBounds(80, 30, 138, 38);
		buttonCadastrarCarga.addActionListener(this);
		
		buttonConsultarExcluirPlacaCarga.setBorder(new LineBorder(Color.BLACK));
		buttonConsultarExcluirPlacaCarga.setBounds(30, 80, 38, 38);
		buttonConsultarExcluirPlacaCarga.setBackground(Color.GREEN);
		labelConsultarExcluirPlaca.setText("CONSULTAR / EXCLUIR PELA PLACA");
		labelConsultarExcluirPlaca.setBounds(80, 80, 300, 38);
		buttonConsultarExcluirPlacaCarga.addActionListener(this);
		
		buttonImprimirExcluirCarga.setBorder(new LineBorder(Color.BLACK));
		buttonImprimirExcluirCarga.setBounds(30, 130, 38, 38);
		buttonImprimirExcluirCarga.setBackground(Color.GREEN);
		labelImprimirExcluir.setText("IMPRIMIR / EXCLUIR TODOS");
		labelImprimirExcluir.setBounds(80, 130, 300, 38);
		buttonImprimirExcluirCarga.addActionListener(this);
		
		buttonSair.setBorder(new LineBorder(Color.BLACK));
		buttonSair.setBounds(30, 180, 38, 38);
		buttonSair.setBackground(Color.RED);
		labelSair.setText("SAIR");
		labelSair.setBounds(80, 180, 300, 38);
		buttonSair.addActionListener(this);
		
		// add alemento
		janelaGestaoCarga.add(buttonCadastrarCarga);
		janelaGestaoCarga.add(labelCadastro);

		janelaGestaoCarga.add(buttonConsultarExcluirPlacaCarga);
		janelaGestaoCarga.add(labelConsultarExcluirPlaca);

		janelaGestaoCarga.add(buttonImprimirExcluirCarga);
		janelaGestaoCarga.add(labelImprimirExcluir);

		janelaGestaoCarga.add(buttonSair);
		janelaGestaoCarga.add(labelSair);

	}
	
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource().equals(buttonCadastrarCarga)) {
			JanelaCadastroVeiculoDeCarga cadastroCarga = new JanelaCadastroVeiculoDeCarga();
			cadastroCarga.criarJanelaCadastroCarga();
		}
		
		if(evt.getSource().equals(buttonConsultarExcluirPlacaCarga)) {
			JanelaConsultarExcluirVeiculoCarga consultarExcluirCarga = new JanelaConsultarExcluirVeiculoCarga();
			consultarExcluirCarga.criarJanelaConsultaExcluirCarga();
		}
		
		if(evt.getSource().equals(buttonImprimirExcluirCarga)) {
		}
		
		if(evt.getSource().equals(buttonSair)) {
			janelaGestaoCarga.dispose();
		}
		
	}

}
