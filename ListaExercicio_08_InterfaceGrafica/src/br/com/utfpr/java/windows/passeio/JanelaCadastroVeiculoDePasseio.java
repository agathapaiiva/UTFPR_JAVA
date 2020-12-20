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

import br.com.utfpr.java.exceptions.VeicExistException;
import br.com.utfpr.java.exceptions.VelocException;
import br.com.utfpr.java.implement.BDVeiculos;

@SuppressWarnings("static-access")
public class JanelaCadastroVeiculoDePasseio implements ActionListener{
	
	BDVeiculos bdVeiculos = new BDVeiculos();
	
	private JFrame janelaCadastroPasseio = new JFrame();
	private JLabel labelQtdePassageiros = new JLabel();
	private JLabel labelPlaca = new JLabel();
	private JLabel labelMarca = new JLabel();
	private JLabel labelModelo = new JLabel();
	private JLabel labelCor = new JLabel();
	private JLabel labelQtdRodas = new JLabel();
	private JLabel labelVelocMax = new JLabel();
	private JLabel labelQtdPist = new JLabel();
	private JLabel labelPotencia = new JLabel();
	private JTextField fieldQtdePassageiros = new JTextField();
	private JTextField fieldPlaca = new JTextField();
	private JTextField fieldMarca = new JTextField();
	private JTextField fieldModelo = new JTextField();
	private JTextField fieldCor = new JTextField();
	private JTextField fieldQtdRodas = new JTextField();
	private JTextField fieldVelocMax = new JTextField();
	private JTextField fieldQtdPist = new JTextField();
	private JTextField fieldPotencia = new JTextField();
	private JButton buttonCadastrar = new JButton();
	private JButton buttonLimpar = new JButton();
	private JButton buttonNovo = new JButton();
	private JButton buttonSair = new JButton();
	
	public void criarJanelaCadastroPasseio() {
		
		janelaCadastroPasseio.setVisible(true);
		janelaCadastroPasseio.setLayout(null);
		janelaCadastroPasseio.setTitle("Cadastro de Passeio");
		janelaCadastroPasseio.setLocation(290, 400);
		janelaCadastroPasseio.setSize(500,480);
		janelaCadastroPasseio.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		//criando os elementos
		labelQtdePassageiros.setText("Qtd.Passageiros..:");
		labelQtdePassageiros.setBounds(20, 30, 138, 38);
		fieldQtdePassageiros.setBounds(160, 38, 298, 25);
		
		labelPlaca.setText("Placa..:");
		labelPlaca.setBounds(20, 35, 138, 100);
		fieldPlaca.setBounds(80, 72, 378, 25);
		
		labelMarca.setText("Marca..:");
		labelMarca.setBounds(20, 40, 138, 160);
		fieldMarca.setBounds(83,  110, 375, 25);
		
		labelModelo.setText("Modelo..:");
		labelModelo.setBounds(20, 48, 138, 220);
		fieldModelo.setBounds(91, 148, 368, 25);
		
		labelCor.setText("Cor..:");
		labelCor.setBounds(20, 58, 138, 280);
		fieldCor.setBounds(63, 186, 397, 25);
		
		labelQtdRodas.setText("Qtd.Rodas..:");
		labelQtdRodas.setBounds(20, 68, 138, 340);
		fieldQtdRodas.setBounds(115, 224, 345, 25);

		labelVelocMax.setText("Velocidade Máx..:");
		labelVelocMax.setBounds(20, 75, 138, 400);
		fieldVelocMax.setBounds(148, 265, 312, 25);
		
		labelQtdPist.setText("Qtd.Pistoes..:");
		labelQtdPist.setBounds(20, 85, 138, 460);
		fieldQtdPist.setBounds(125, 305, 335, 25);
		
		labelPotencia.setText("Potência..:");
		labelPotencia.setBounds(20, 90, 138, 520);
		fieldPotencia.setBounds(105, 338, 355, 25);
	
		buttonCadastrar.setBorder(new LineBorder(Color.BLACK));
		buttonCadastrar.setBackground(Color.ORANGE);
		buttonCadastrar.setText(" CADASTRAR ");
		buttonCadastrar.setBounds(20, 380, 100, 35);
		buttonCadastrar.addActionListener(this);
		
		buttonLimpar.setBorder(new LineBorder(Color.BLACK));
		buttonLimpar.setBackground(Color.ORANGE);
		buttonLimpar.setText(" LIMPAR ");
		buttonLimpar.setBounds(130, 380, 100, 35);
		buttonLimpar.addActionListener(this);
		
		buttonNovo.setBorder(new LineBorder(Color.BLACK));
		buttonNovo.setBackground(Color.ORANGE);
		buttonNovo.setText(" NOVO ");
		buttonNovo.setBounds(240, 380, 100, 35);
		buttonNovo.addActionListener(this);
		
		buttonSair.setBorder(new LineBorder(Color.BLACK));
		buttonSair.setBackground(Color.ORANGE);
		buttonSair.setText(" SAIR ");
		buttonSair.setBounds(350, 380, 100, 35);
		buttonSair.addActionListener(this);
		
		//add elementos
		janelaCadastroPasseio.add(labelQtdePassageiros);
		janelaCadastroPasseio.add(fieldQtdePassageiros);

		janelaCadastroPasseio.add(labelPlaca);
		janelaCadastroPasseio.add(fieldPlaca);
		
		janelaCadastroPasseio.add(labelMarca);
		janelaCadastroPasseio.add(fieldMarca);
		
		janelaCadastroPasseio.add(labelModelo);
		janelaCadastroPasseio.add(fieldModelo);
		
		janelaCadastroPasseio.add(labelCor);
		janelaCadastroPasseio.add(fieldCor);
		
		janelaCadastroPasseio.add(labelQtdRodas);
		janelaCadastroPasseio.add(fieldQtdRodas);
		
		janelaCadastroPasseio.add(labelVelocMax);
		janelaCadastroPasseio.add(fieldVelocMax);
		
		janelaCadastroPasseio.add(labelQtdPist);
		janelaCadastroPasseio.add(fieldQtdPist);
		
		janelaCadastroPasseio.add(labelPotencia);
		janelaCadastroPasseio.add(fieldPotencia);
		
		janelaCadastroPasseio.add(buttonCadastrar);
		janelaCadastroPasseio.add(buttonLimpar);
		janelaCadastroPasseio.add(buttonNovo);
		janelaCadastroPasseio.add(buttonSair);
		
	}

	
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource().equals(buttonCadastrar)) {
			
			bdVeiculos.setQtdePassageiros(Integer.parseInt(fieldQtdePassageiros.getText()));
			bdVeiculos.setPlaca(fieldPlaca.getText());
			bdVeiculos.setMarca(fieldMarca.getText());
			bdVeiculos.setModelo(fieldModelo.getText());
			bdVeiculos.setCor(fieldCor.getText());
			bdVeiculos.setQtdRodas(Integer.parseInt(fieldQtdRodas.getText()));
			bdVeiculos.setVelocMax(Integer.parseInt(fieldVelocMax.getText()));
			bdVeiculos.setQtdPist(Integer.parseInt(fieldQtdPist.getText()));
			bdVeiculos.setPotencia(Integer.parseInt(fieldPotencia.getText()));
			
			
			try {
				
				if(bdVeiculos.cadastrarVeiculoPasseio() == true) {
					JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!", "PASSEIO",JOptionPane.INFORMATION_MESSAGE);
					
					if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro veículo? ", "Windows Passeio",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						fieldQtdePassageiros.setText("");
						fieldPlaca.setText("");
						fieldMarca.setText("");
						fieldModelo.setText("");
						fieldCor.setText("");
						fieldQtdRodas.setText("");
						fieldVelocMax.setText("");
						fieldQtdPist.setText("");
						fieldPotencia.setText("");
						fieldQtdePassageiros.requestFocus();
						}else {
							janelaCadastroPasseio.dispose();
						}
					
				}else {
					janelaCadastroPasseio.dispose();
					
				}
			} catch (VeicExistException veiculoExistente) {
				
			} catch (VelocException velocidadeException) {

			}
		}
			
		if(evt.getSource().equals(buttonLimpar)) {
			fieldQtdePassageiros.setText("");
			fieldPlaca.setText("");
			fieldMarca.setText("");
			fieldModelo.setText("");
			fieldCor.setText("");
			fieldQtdRodas.setText("");
			fieldVelocMax.setText("");
			fieldQtdPist.setText("");
			fieldPotencia.setText("");
			fieldQtdePassageiros.requestFocus();
		}
		if(evt.getSource().equals(buttonNovo)) {
			JanelaCadastroVeiculoDePasseio novoCadastro = new JanelaCadastroVeiculoDePasseio();
			janelaCadastroPasseio.dispose();
			novoCadastro.criarJanelaCadastroPasseio();
		}
		if(evt.getSource().equals(buttonSair)) {
			janelaCadastroPasseio.dispose();
		}
	}
	
}
