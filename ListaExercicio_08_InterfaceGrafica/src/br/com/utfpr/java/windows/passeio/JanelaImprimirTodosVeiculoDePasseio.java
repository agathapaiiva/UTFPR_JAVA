/**
 * @author agatha-paiva
 */
package br.com.utfpr.java.windows.passeio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import br.com.utfpr.java.implement.BDVeiculos;

@SuppressWarnings("unused")
public class JanelaImprimirTodosVeiculoDePasseio extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private JButton buttonImprimirTudo = new JButton();
	private JButton buttonExcluirTudo = new JButton();
	private JButton buttonSair = new JButton();
	private JFrame janelaImprimirTodosVeiculoDePasseio = new JFrame();
	
	PasseioTableModel passeioTableModel = new PasseioTableModel();
	JTable table;
	JScrollPane scrollPane = new JScrollPane(table);
	
	String[] colunas = {"Plca", "Marca", "Modelo", "Cor", "Qtd.Rodas", "Veloc Máx", "Qtd.Pist", "Potência", "Qtd.Passageiros"};
	
	public JanelaImprimirTodosVeiculoDePasseio() {
		configurarJanela();	
	}
	
	public void configurarJanela() {
		setVisible(true);
		setLayout(null);
		setTitle("Imprimir / Excluir todos");
		setLocation(100, 400);
		setSize(690,480);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		// criando os elementos
		buttonImprimirTudo.setBorder(new LineBorder(Color.BLACK));
		buttonImprimirTudo.setBackground(Color.ORANGE);
		buttonImprimirTudo.setText(" IMPRIMIR TODOS ");
		buttonImprimirTudo.setBounds(220, 380, 150, 35);
		buttonImprimirTudo.addActionListener(this);

		buttonExcluirTudo.setBorder(new LineBorder(Color.BLACK));
		buttonExcluirTudo.setBackground(Color.ORANGE);
		buttonExcluirTudo.setText(" EXCLUIR TODOS");
		buttonExcluirTudo.setBounds(380, 380, 160, 35);
		buttonExcluirTudo.addActionListener(this);

		buttonSair.setBorder(new LineBorder(Color.BLACK));
		buttonSair.setBackground(Color.ORANGE);
		buttonSair.setText(" SAIR ");
		buttonSair.setBounds(550, 380, 100, 35);
		buttonSair.addActionListener(this);
				
		//add elementos
		add(buttonImprimirTudo);
		add(buttonExcluirTudo);
		add(buttonSair);
		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource().equals(buttonImprimirTudo)) {
			
			table = new JTable();
			table.setModel(passeioTableModel);
			table.setBounds(0,0,690,380);
			table.setBackground(null);
	        table.setPreferredScrollableViewportSize(new Dimension(500,100));//barra de rolagem
	        add(table);
	        setVisible(true);
	        setLayout(new BorderLayout());
	        add(table.getTableHeader(), BorderLayout.PAGE_START);
	        add(table, BorderLayout.BEFORE_LINE_BEGINS);
	        
		}
		if(evt.getSource().equals(buttonImprimirTudo)) {
			
		}
		if(evt.getSource().equals(buttonSair)) {
			dispose();
		}
	}
}

