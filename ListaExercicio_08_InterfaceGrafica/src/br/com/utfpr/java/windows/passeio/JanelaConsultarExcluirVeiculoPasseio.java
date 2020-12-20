/**
 * @author agatha-paiva
 */
package br.com.utfpr.java.windows.passeio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import br.com.utfpr.java.implement.BDVeiculos;

@SuppressWarnings("static-access")
public class JanelaConsultarExcluirVeiculoPasseio implements ActionListener{
	
	BDVeiculos bdVeiculos = new BDVeiculos();
	JanelaGestaoPasseio janelaGestaoPasseio = new JanelaGestaoPasseio();
	
	private JFrame janelaConsultaExcluirPasseio = new JFrame();
	private JLabel labelQtdePassageiros = new JLabel();
	private JLabel labelPlaca = new JLabel();
	private JLabel labelMarca = new JLabel();
	private JLabel labelModelo = new JLabel();
	private JLabel labelCor = new JLabel();
	private JLabel labelQtdRodas = new JLabel();
	private JLabel labelVelocMax = new JLabel();
	private JLabel labelQtdPist = new JLabel();
	private JLabel labelPotencia = new JLabel();
	private JLabel labelTexto = new JLabel();
	private JTextField fieldQtdePassageiros = new JTextField();
	private JTextField fieldPlaca = new JTextField();
	private JTextField fieldMarca = new JTextField();
	private JTextField fieldModelo = new JTextField();
	private JTextField fieldCor = new JTextField();
	private JTextField fieldQtdRodas = new JTextField();
	private JTextField fieldVelocMax = new JTextField();
	private JTextField fieldQtdPist = new JTextField();
	private JTextField fieldPotencia = new JTextField();
	private JButton buttonConsultar= new JButton();
	private JButton buttonExcluir = new JButton();
	private JButton buttonSair = new JButton();
	
	public void criarJanelaConsultaExcluirPasseio() {
		
		janelaConsultaExcluirPasseio.setVisible(true);
		janelaConsultaExcluirPasseio.setLayout(null);
		janelaConsultaExcluirPasseio.setTitle("Consulta / Excluir pela placa");
		janelaConsultaExcluirPasseio.setLocation(290, 400);
		janelaConsultaExcluirPasseio.setSize(490,480);
		janelaConsultaExcluirPasseio.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		//criando os elementos
		labelTexto.setText("Informe a placa que deseja pesquisar");
		labelTexto.setBounds(130, -30, 500, 100);
		
		labelPlaca.setText("Informe a Placa..:");
		labelPlaca.setBounds(20, 5, 138, 100);
		fieldPlaca.setBounds(150, 45, 298, 25);
		
		labelQtdePassageiros.setText("Qtd.Passageiros.:");
		labelQtdePassageiros.setBounds(20, 70, 138, 38);
		fieldQtdePassageiros.setBounds(150, 75, 298, 25);
		fieldQtdePassageiros.setEditable(false);

		labelMarca.setText("Marca..:");
		labelMarca.setBounds(20, 40, 138, 160);
		fieldMarca.setBounds(150, 110, 298, 25);
		fieldMarca.setEditable(false);

		labelModelo.setText("Modelo..:");
		labelModelo.setBounds(20, 48, 138, 220);
		fieldModelo.setBounds(150, 148, 298, 25);
		fieldModelo.setEditable(false);

		labelCor.setText("Cor..:");
		labelCor.setBounds(20, 58, 138, 280);
		fieldCor.setBounds(150, 186, 298, 25);
		fieldCor.setEditable(false);

		labelQtdRodas.setText("Qtd.Rodas..:");
		labelQtdRodas.setBounds(20, 68, 138, 340);
		fieldQtdRodas.setBounds(150, 224, 298, 25);
		fieldQtdRodas.setEditable(false);

		labelVelocMax.setText("Velocidade Máx..:");
		labelVelocMax.setBounds(20, 75, 138, 400);
		fieldVelocMax.setBounds(150, 265, 298, 25);
		fieldVelocMax.setEditable(false);

		labelQtdPist.setText("Qtd.Pistoes..:");
		labelQtdPist.setBounds(20, 85, 138, 460);
		fieldQtdPist.setBounds(150, 305, 298, 25);
		fieldQtdPist.setEditable(false);

		labelPotencia.setText("Potência..:");
		labelPotencia.setBounds(20, 90, 138, 520);
		fieldPotencia.setBounds(150, 338, 298, 25);
		fieldPotencia.setEditable(false);

		buttonConsultar.setBorder(new LineBorder(Color.BLACK));
		buttonConsultar.setBackground(Color.ORANGE);
		buttonConsultar.setText(" CONSULTAR ");
		buttonConsultar.setBounds(133, 380, 100, 35);
		buttonConsultar.addActionListener(this);

		buttonExcluir.setBorder(new LineBorder(Color.BLACK));
		buttonExcluir.setBackground(Color.ORANGE);
		buttonExcluir.setText(" EXCLUIR ");
		buttonExcluir.setBounds(240, 380, 100, 35);
		buttonExcluir.addActionListener(this);

		buttonSair.setBorder(new LineBorder(Color.BLACK));
		buttonSair.setBackground(Color.ORANGE);
		buttonSair.setText(" SAIR ");
		buttonSair.setBounds(348, 380, 100, 35);
		buttonSair.addActionListener(this);

		// add elementos
		janelaConsultaExcluirPasseio.add(labelTexto);
		janelaConsultaExcluirPasseio.add(labelPlaca);
		janelaConsultaExcluirPasseio.add(fieldPlaca);
		
		janelaConsultaExcluirPasseio.add(labelQtdePassageiros);
		janelaConsultaExcluirPasseio.add(fieldQtdePassageiros);

		janelaConsultaExcluirPasseio.add(labelMarca);
		janelaConsultaExcluirPasseio.add(fieldMarca);
		
		janelaConsultaExcluirPasseio.add(labelModelo);
		janelaConsultaExcluirPasseio.add(fieldModelo);

		janelaConsultaExcluirPasseio.add(labelCor);
		janelaConsultaExcluirPasseio.add(fieldCor);

		janelaConsultaExcluirPasseio.add(labelQtdRodas);
		janelaConsultaExcluirPasseio.add(fieldQtdRodas);

		janelaConsultaExcluirPasseio.add(labelVelocMax);
		janelaConsultaExcluirPasseio.add(fieldVelocMax);

		janelaConsultaExcluirPasseio.add(labelQtdPist);
		janelaConsultaExcluirPasseio.add(fieldQtdPist);

		janelaConsultaExcluirPasseio.add(labelPotencia);
		janelaConsultaExcluirPasseio.add(fieldPotencia);
		
		janelaConsultaExcluirPasseio.add(buttonConsultar);
		janelaConsultaExcluirPasseio.add(buttonExcluir);
		janelaConsultaExcluirPasseio.add(buttonSair);

	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource().equals(buttonConsultar)) {
			
			if(bdVeiculos.getVeiculoDePasseio().size() == 0) {
				JOptionPane.showMessageDialog(null, "Não foi encontrado veículo com essa placa!", "PASSEIO",JOptionPane.INFORMATION_MESSAGE);
				fieldPlaca.setText("");
				fieldPlaca.requestFocus();
			}
			
			for (int i = 0; i < bdVeiculos.getVeiculoDePasseio().size(); i++) {
					if(bdVeiculos.getVeiculoDePasseio().get(i).getPlaca().equals(fieldPlaca.getText())) {
						
						bdVeiculos.verificaVeiculosPasseioPelaPlaca(fieldPlaca.getText());

						fieldQtdePassageiros.setText(String.valueOf(bdVeiculos.getQtdePassageiros()));
						fieldMarca.setText(bdVeiculos.getMarca());
						fieldModelo.setText(bdVeiculos.getModelo());
						fieldCor.setText(bdVeiculos.getCor());
						fieldQtdRodas.setText(String.valueOf(bdVeiculos.getQtdRodas()));
						fieldVelocMax.setText(String.valueOf(bdVeiculos.getVelocMax()));
						fieldQtdPist.setText(String.valueOf(bdVeiculos.getQtdPist()));
						fieldPotencia.setText(String.valueOf(bdVeiculos.getPotencia()));

					}else {
						JOptionPane.showMessageDialog(null, "Veículo não encontrado!", "PASSEIO",JOptionPane.INFORMATION_MESSAGE);
						fieldPlaca.setText("");
						fieldPlaca.requestFocus();
						
					}
				}
			}
			
			
		if (evt.getSource().equals(buttonExcluir)) {
			bdVeiculos.excluirVeiculosPasseioPelaPlaca(fieldPlaca.getText());
			fieldPlaca.setText("");
			fieldQtdePassageiros.setText("");
			fieldMarca.setText("");
			fieldModelo.setText("");
			fieldCor.setText("");
			fieldQtdRodas.setText("");
			fieldVelocMax.setText("");
			fieldQtdPist.setText("");
			fieldPotencia.setText("");
			fieldPlaca.requestFocus();
		}
		
		if (evt.getSource().equals(buttonSair)) {
			janelaConsultaExcluirPasseio.dispose();
		}
	}
}
