package br.com.utfpr.java.windows.passeio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import br.com.utfpr.java.windows.main.JanelaGestaoDeVeiculo;

public class JanelaGestaoPasseio implements ActionListener{
	private JFrame janelaGestaoPasseio = new JFrame();
	private JButton buttonCadastrarPasseio = new JButton();
	private JButton buttonConsultarExcluirPlacaPasseio = new JButton();
	private JButton buttonImprimirExcluirPasseio = new JButton();
	private JButton buttonSair = new JButton();
	private JLabel labelCadastro = new JLabel();
	private JLabel labelConsultarExcluirPlaca = new JLabel();
	private JLabel labelImprimirExcluir = new JLabel();
	private JLabel labelSair = new JLabel();

JanelaGestaoDeVeiculo gestaoVeiculo = new JanelaGestaoDeVeiculo();
	
	public void criarJanelaGestaoPasseio() {
		
		janelaGestaoPasseio.setVisible(true);
		janelaGestaoPasseio.setLayout(null);
		janelaGestaoPasseio.setTitle("Veiculo de Passeio");
		janelaGestaoPasseio.setLocation(800, 400);
		janelaGestaoPasseio.setSize(400,280);
		janelaGestaoPasseio.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		// criando os elementos 
		buttonCadastrarPasseio.setBorder(new LineBorder(Color.BLACK));
		buttonCadastrarPasseio.setBounds(30, 30, 38, 38);
		buttonCadastrarPasseio.setBackground(Color.CYAN);
		labelCadastro.setText("CADASTRAR");
		labelCadastro.setBounds(80, 30, 138, 38);
		buttonCadastrarPasseio.addActionListener(this);
		
		buttonConsultarExcluirPlacaPasseio.setBorder(new LineBorder(Color.BLACK));
		buttonConsultarExcluirPlacaPasseio.setBounds(30, 80, 38, 38);
		buttonConsultarExcluirPlacaPasseio.setBackground(Color.CYAN);
		labelConsultarExcluirPlaca.setText("CONSULTAR / EXCLUIR PELA PLACA");
		labelConsultarExcluirPlaca.setBounds(80, 80, 300, 38);
		buttonConsultarExcluirPlacaPasseio.addActionListener(this);
		
		buttonImprimirExcluirPasseio.setBorder(new LineBorder(Color.BLACK));
		buttonImprimirExcluirPasseio.setBounds(30, 130, 38, 38);
		buttonImprimirExcluirPasseio.setBackground(Color.CYAN);
		labelImprimirExcluir.setText("IMPRIMIR / EXCLUIR TODOS");
		labelImprimirExcluir.setBounds(80, 130, 300, 38);
		buttonImprimirExcluirPasseio.addActionListener(this);
		
		buttonSair.setBorder(new LineBorder(Color.BLACK));
		buttonSair.setBounds(30, 180, 38, 38);
		buttonSair.setBackground(Color.RED);
		labelSair.setText("SAIR");
		labelSair.setBounds(80, 180, 300, 38);
		buttonSair.addActionListener(this);
		
		// add alemento
		janelaGestaoPasseio.add(buttonCadastrarPasseio);
		janelaGestaoPasseio.add(labelCadastro);
		
		janelaGestaoPasseio.add(buttonConsultarExcluirPlacaPasseio);
		janelaGestaoPasseio.add(labelConsultarExcluirPlaca);
		
		janelaGestaoPasseio.add(buttonImprimirExcluirPasseio);
		janelaGestaoPasseio.add(labelImprimirExcluir);
		
		janelaGestaoPasseio.add(buttonSair);
		janelaGestaoPasseio.add(labelSair);
		
	}

	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource().equals(buttonCadastrarPasseio)) {
			JanelaCadastroVeiculoDePasseio cadastroVeiculoDePasseio = new JanelaCadastroVeiculoDePasseio();
			cadastroVeiculoDePasseio.criarJanelaCadastroPasseio();
			
		}
		
		if(evt.getSource().equals(buttonConsultarExcluirPlacaPasseio)) {
			JanelaConsultarExcluirVeiculoPasseio excluirVeiculoPasseio = new JanelaConsultarExcluirVeiculoPasseio();
			excluirVeiculoPasseio.criarJanelaConsultaExcluirPasseio();
			
		}
		
		if(evt.getSource().equals(buttonImprimirExcluirPasseio)) {
			JanelaImprimirTodosVeiculoDePasseio imprimirExcluirTodos = new JanelaImprimirTodosVeiculoDePasseio();
			imprimirExcluirTodos.criarJanelaImprimirExcluirPasseio();
		}
		
		if(evt.getSource().equals(buttonSair)) {
			janelaGestaoPasseio.dispose();
		}
		
	}

}
