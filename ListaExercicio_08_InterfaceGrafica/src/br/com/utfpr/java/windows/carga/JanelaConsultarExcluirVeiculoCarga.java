/**
 * @author agatha-paiva
 */
package br.com.utfpr.java.windows.carga;

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
public class JanelaConsultarExcluirVeiculoCarga implements ActionListener{
	
	JanelaGestaoCarga janelaGestaoCarga = new JanelaGestaoCarga();
	BDVeiculos bdVeiculos = new BDVeiculos();
	
	private JFrame janelaConsultaExcluirCarga = new JFrame();
	private JLabel labelTara = new JLabel();
	private JLabel labelCargaMax = new JLabel();
	private JLabel labelPlaca = new JLabel();
	private JLabel labelMarca = new JLabel();
	private JLabel labelModelo = new JLabel();
	private JLabel labelCor = new JLabel();
	private JLabel labelQtdRodas = new JLabel();
	private JLabel labelVelocMax = new JLabel();
	private JLabel labelQtdPist = new JLabel();
	private JLabel labelPotencia = new JLabel();
	private JLabel labelTexto = new JLabel();
	private JTextField fieldTara = new JTextField();
	private JTextField fieldCargaMax = new JTextField();
	private JTextField fieldPlaca = new JTextField();
	private JTextField fieldMarca = new JTextField();
	private JTextField fieldModelo = new JTextField();
	private JTextField fieldCor = new JTextField();
	private JTextField fieldQtdRodas = new JTextField();
	private JTextField fieldVelocMax = new JTextField();
	private JTextField fieldQtdPist = new JTextField();
	private JTextField fieldPotencia = new JTextField();
	private JButton buttonConsultar = new JButton();
	private JButton buttonExcluir = new JButton();
	private JButton buttonSair = new JButton();
	
	public void criarJanelaConsultaExcluirCarga(){
		janelaConsultaExcluirCarga.setVisible(true);
		janelaConsultaExcluirCarga.setLayout(null);
		janelaConsultaExcluirCarga.setTitle("Consulta / Excluir pela placa");
		janelaConsultaExcluirCarga.setLocation(290, 400);
		janelaConsultaExcluirCarga.setSize(490,500);
		janelaConsultaExcluirCarga.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//criando os elementos
		labelTexto.setText("Informe a placa que deseja pesquisar");
		labelTexto.setBounds(130, -30, 500, 100);

		labelPlaca.setText("Informe a Placa..:");
		labelPlaca.setBounds(20, 5, 138, 100);
		fieldPlaca.setBounds(150, 45, 300, 25);

		labelTara.setText("Tara..:");
		labelTara.setBounds(20, 70, 138, 38);
		fieldTara.setBounds(150, 75, 298, 25);
		fieldTara.setEditable(false);
		
		labelCargaMax.setText("Carga Máx..:");
		labelCargaMax.setBounds(20, 100, 138, 38);
		fieldCargaMax.setBounds(150, 110, 298, 25);
		fieldCargaMax.setEditable(false);
		
		labelMarca.setText("Marca..:");
		labelMarca.setBounds(20, 75, 138, 160);
		fieldMarca.setBounds(150, 145, 298, 25);
		fieldMarca.setEditable(false);

		labelModelo.setText("Modelo..:");
		labelModelo.setBounds(20, 85, 138, 220);
		fieldModelo.setBounds(150, 180, 298, 25);
		fieldModelo.setEditable(false);

		labelCor.setText("Cor..:");
		labelCor.setBounds(20, 92, 138, 280);
		fieldCor.setBounds(150, 220, 298, 25);
		fieldCor.setEditable(false);

		labelQtdRodas.setText("Qtd.Rodas..:");
		labelQtdRodas.setBounds(20, 98, 138, 340);
		fieldQtdRodas.setBounds(150, 255, 298, 25);
		fieldQtdRodas.setEditable(false);

		labelVelocMax.setText("Velocidade Máx..:");
		labelVelocMax.setBounds(20, 107, 138, 400);
		fieldVelocMax.setBounds(150, 293, 298, 25);
		fieldVelocMax.setEditable(false);

		labelQtdPist.setText("Qtd.Pistoes..:");
		labelQtdPist.setBounds(20, 115, 138, 460);
		fieldQtdPist.setBounds(150, 330, 298, 25);
		fieldQtdPist.setEditable(false);

		labelPotencia.setText("Potência..:");
		labelPotencia.setBounds(20, 122, 138, 520);
		fieldPotencia.setBounds(150, 365, 298, 25);
		fieldPotencia.setEditable(false);

		buttonConsultar.setBorder(new LineBorder(Color.BLACK));
		buttonConsultar.setBackground(Color.ORANGE);
		buttonConsultar.setText(" CONSULTAR ");
		buttonConsultar.setBounds(133, 400, 100, 35);
		buttonConsultar.addActionListener(this);

		buttonExcluir.setBorder(new LineBorder(Color.BLACK));
		buttonExcluir.setBackground(Color.ORANGE);
		buttonExcluir.setText(" EXCLUIR ");
		buttonExcluir.setBounds(240, 400, 100, 35);
		buttonExcluir.addActionListener(this);

		buttonSair.setBorder(new LineBorder(Color.BLACK));
		buttonSair.setBackground(Color.ORANGE);
		buttonSair.setText(" SAIR ");
		buttonSair.setBounds(348, 400, 100, 35);
		buttonSair.addActionListener(this);

		// add elementos
		janelaConsultaExcluirCarga.add(labelTexto);
		janelaConsultaExcluirCarga.add(labelPlaca);
		janelaConsultaExcluirCarga.add(fieldPlaca);

		janelaConsultaExcluirCarga.add(labelTara);
		janelaConsultaExcluirCarga.add(fieldTara);
		
		janelaConsultaExcluirCarga.add(labelCargaMax);
		janelaConsultaExcluirCarga.add(fieldCargaMax);

		janelaConsultaExcluirCarga.add(labelMarca);
		janelaConsultaExcluirCarga.add(fieldMarca);

		janelaConsultaExcluirCarga.add(labelModelo);
		janelaConsultaExcluirCarga.add(fieldModelo);

		janelaConsultaExcluirCarga.add(labelCor);
		janelaConsultaExcluirCarga.add(fieldCor);

		janelaConsultaExcluirCarga.add(labelQtdRodas);
		janelaConsultaExcluirCarga.add(fieldQtdRodas);

		janelaConsultaExcluirCarga.add(labelVelocMax);
		janelaConsultaExcluirCarga.add(fieldVelocMax);

		janelaConsultaExcluirCarga.add(labelQtdPist);
		janelaConsultaExcluirCarga.add(fieldQtdPist);

		janelaConsultaExcluirCarga.add(labelPotencia);
		janelaConsultaExcluirCarga.add(fieldPotencia);

		janelaConsultaExcluirCarga.add(buttonConsultar);
		janelaConsultaExcluirCarga.add(buttonExcluir);
		janelaConsultaExcluirCarga.add(buttonSair);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource().equals(buttonConsultar)) {
			
			if(bdVeiculos.getVeiculoDeCarga().size() == 0) {
				JOptionPane.showMessageDialog(null, "Não foi encontrado veículo com essa placa!", "CARGA",JOptionPane.INFORMATION_MESSAGE);
				fieldPlaca.setText("");
				fieldPlaca.requestFocus();
			}
			
			for (int i = 0; i < bdVeiculos.getVeiculoDeCarga().size(); i++) {
				if(bdVeiculos.getVeiculoDeCarga().get(i).getPlaca().equals(fieldPlaca.getText())) {
					
					bdVeiculos.verificaVeiculosCargaPelaPlaca(fieldPlaca.getText());
				}else {
					JOptionPane.showMessageDialog(null, "Veículo não encontrado!", "CARGA",	JOptionPane.INFORMATION_MESSAGE);
					fieldPlaca.setText("");
					fieldPlaca.requestFocus();
				}
			
					if (bdVeiculos.getPlaca().equalsIgnoreCase(fieldPlaca.getText())) {
						
						JOptionPane.showMessageDialog(null, "Veículo encontrado!", "PASSEIO",JOptionPane.INFORMATION_MESSAGE);
						
						fieldTara.setText(String.valueOf(bdVeiculos.getTara()));
						fieldCargaMax.setText(String.valueOf(bdVeiculos.getCargaMax()));
						fieldMarca.setText(bdVeiculos.getMarca());
						fieldModelo.setText(bdVeiculos.getModelo());
						fieldCor.setText(bdVeiculos.getCor());
						fieldQtdRodas.setText(String.valueOf(bdVeiculos.getQtdRodas()));
						fieldVelocMax.setText(String.valueOf(bdVeiculos.getVelocMax()));
						fieldQtdPist.setText(String.valueOf(bdVeiculos.getQtdPist()));
						fieldPotencia.setText(String.valueOf(bdVeiculos.getPotencia()));
					}else {
							JOptionPane.showMessageDialog(null, "Veículo não encontrado!", "CARGA",	JOptionPane.INFORMATION_MESSAGE);
							fieldPlaca.setText("");
							fieldPlaca.requestFocus();
					}
				}
			}
			
		if (evt.getSource().equals(buttonExcluir)) {
			bdVeiculos.excluirVeiculosCargaPelaPlaca(fieldPlaca.getText());
			fieldPlaca.setText("");
			fieldTara.setText("");
			fieldCargaMax.setText("");
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
			janelaConsultaExcluirCarga.dispose();
		}
		
		}
	}
