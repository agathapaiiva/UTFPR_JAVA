/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.utfpr.java.dto.Carga;
import br.com.utfpr.java.dto.Passeio;
import br.com.utfpr.java.exceptions.VeicExistException;
import br.com.utfpr.java.exceptions.VelocException;
import br.com.utfpr.java.implement.BDVeiculos;
import br.com.utfpr.java.implement.Leitura;

public class Main {

	public static void main(String[] args) {
		BDVeiculos auxBD = new BDVeiculos();
		Leitura leitura = new Leitura();
		Scanner entradaDado = new Scanner(System.in);

		try {
			int op;
			
			do {
				op = Integer.parseInt(leitura.entDados());

				switch (op) {
				case 1:
					for (int i = auxBD.verificaVetorPasseio(); i < auxBD.numeroVeiculos; i++) {
						if(i == -1) {
							JOptionPane.showMessageDialog(null, "Vetor de Passeio cheio!", "WARNING", JOptionPane.WARNING_MESSAGE);
							leitura.entDados();
							
						}
						auxBD.veiculoDePasseio[i] = new Passeio();
						
						System.out.println("Digite a placa do veículo de Passeio:" + " [cadastro " + (i + 1) + "]");
						
						try {
							String aux;
							aux = entradaDado.next();
							auxBD.verificaPlacaVeiculoPasseio(aux);
							
						} catch (VeicExistException veiculoExistente) {
							veiculoExistente.imprimeMensagemVeicExist();
							break;
						}
						
						auxBD.veiculoDePasseio[i].setPlaca(auxBD.placa);
						
						System.out.println("Digite a marca do veículo de Passeio:" + " [cadastro " + (i + 1) + "]");
						auxBD.marca = entradaDado.next();
						auxBD.veiculoDePasseio[i].setMarca(auxBD.marca);

						System.out.println("Digite a modelo do veículo de Passeio:" + " [cadastro " + (i + 1) + "]");
						auxBD.modelo = entradaDado.next();
						auxBD.veiculoDePasseio[i].setModelo(auxBD.modelo);
						
						System.out.println("Digite a cor do veículo de Passeio:" + " [cadastro " + (i + 1) + "]");
						auxBD.cor = entradaDado.next();
						auxBD.veiculoDePasseio[i].setCor(auxBD.cor);
						
						System.out.println("Digite a quantidade de rodas do veículo de Passeio:" + " [cadastro " + (i + 1) + "]");
						auxBD.qtdRodas = entradaDado.nextInt();
						auxBD.veiculoDePasseio[i].setQtdRodas(auxBD.qtdRodas);
						
						System.out.println("Digite a quantidade de passageiros do veículo de Passeio" + " [cadastro " + (i + 1) + "]");
						auxBD.qtdePassageiros = entradaDado.nextInt();
						auxBD.veiculoDePasseio[i].setQtdePassageiros(auxBD.qtdePassageiros);

						System.out.println("Digite a velocidade do veículo em Km/h " + " [" + (i + 1) + "]");
						
						try {
							auxBD.velocMax = entradaDado.nextFloat();
							auxBD.veiculoDePasseio[i].setVelocMax(auxBD.velocMax);
							
						} catch (VelocException verificaVolocidade) {
							verificaVolocidade.imprimeMensagemVelocidade();
							auxBD.velocMax = 100;
							System.out.println("Assumindo a Velocidade : " + auxBD.velocMax + " Km/h " + "convertido: " + auxBD.veiculoDePasseio[i].calcVel(auxBD.velocMax) + " cm/h \n");
						}
						auxBD.veiculoDePasseio[i].setVelocMax(auxBD.velocMax);

						System.out.println("Digite a quantidade de pistão do motor de Passeio" + " [cadastro " + (i + 1) + "]");
						auxBD.qtdPist = entradaDado.nextInt();
						auxBD.veiculoDePasseio[i].getMotor().setQtdPist(auxBD.qtdPist);

						System.out.println("Digite a potência do motor de Passeio" + " [cadastro " + (i + 1) + "]");
						auxBD.potencia = entradaDado.nextInt();
						auxBD.veiculoDePasseio[i].getMotor().setPotencia(auxBD.potencia);
						System.out.println("================================================================\n");
						
						auxBD.auxPasseio = auxBD.veiculoDePasseio.clone();
						
						if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro veículo? ", "Windows Passeio",
						        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
							auxBD.verificaVetorPasseio();
							
							if(i == -1) {
								JOptionPane.showMessageDialog(null, "Vetor de Passeio cheio!", "WARNING", JOptionPane.WARNING_MESSAGE);
								leitura.entDados();
							}				
							
						} else {
							break;
						}
					}
					break;
				case 2:
					for (int i = auxBD.verificaVetorCarga(); i < auxBD.numeroVeiculos; i++) {
					
						auxBD.veiculoDeCarga[i] = new Carga();

						System.out.println("Digite a placa do veículo de Carga" + " [cadastro " + (i + 1) + "]");
						try {
							String aux;
							aux = entradaDado.next();
							auxBD.verificaPlacaVeiculoCarga(aux);
							
						} catch (VeicExistException veiculoExistente) {
							veiculoExistente.imprimeMensagemVeicExist();
							break;
						}
						auxBD.veiculoDeCarga[i].setPlaca(auxBD.placa);

						System.out.println("Digite a marca do veículo de Carga" + " [cadastro " + (i + 1) + "]");
						auxBD.marca = entradaDado.next();
						auxBD.veiculoDeCarga[i].setMarca(auxBD.marca);

						System.out.println("Digite a modelo do veículo de Carga" + " [cadastro " + (i + 1) + "]");
						auxBD.modelo = entradaDado.next();
						auxBD.veiculoDeCarga[i].setModelo(auxBD.modelo);
						
						System.out.println("Digite a cor do veículo de Carga:" + " [cadastro " + (i + 1) + "]");
						auxBD.cor = entradaDado.next();
						auxBD.veiculoDeCarga[i].setCor(auxBD.cor);
						
						System.out.println("Digite a quantidade de rodas do veículo de Carga:" + " [cadastro " + (i + 1) + "]");
						auxBD.qtdRodas = entradaDado.nextInt();
						auxBD.veiculoDeCarga[i].setQtdRodas(auxBD.qtdRodas);
						
						System.out.println("Digite a velocidade do veículo em Km/h " + " [cadastro " + (i + 1) + "]");
					
						
						try {
							auxBD.velocMax = entradaDado.nextFloat();
							auxBD.veiculoDeCarga[i].setVelocMax(auxBD.velocMax);
							
						} catch (VelocException verificaVolocidade) {
							verificaVolocidade.imprimeMensagemVelocidade();
							auxBD.velocMax = 90;
							System.out.println("Assumindo a Velocidade : " + auxBD.velocMax + " Km/h " + "convertido: " + auxBD.veiculoDeCarga[i].calcVel(auxBD.velocMax) + " m/h \n");
						}
						auxBD.veiculoDeCarga[i].setVelocMax(auxBD.velocMax);
						
						System.out.println("Digite a quantidade de pistão do motor de Carga" + " [cadastro " + (i + 1) + "]");
						auxBD.qtdPist = entradaDado.nextInt();
						auxBD.veiculoDeCarga[i].getMotor().setQtdPist(auxBD.qtdPist);

						System.out.println("Digite a potência do motor de Carga" + " [cadastro " + (i + 1) + "]");
						auxBD.potencia = entradaDado.nextInt();
						auxBD.veiculoDeCarga[i].getMotor().setPotencia(auxBD.potencia);
						
						System.out.println("Digite a Tara do veículo de Carga" + " [cadastro " + (i + 1) + "]");
						auxBD.tara = entradaDado.nextInt();
						auxBD.veiculoDeCarga[i].setTara(auxBD.tara);
						
						System.out.println("Digite a carga máxima do veículo: " + " [cadastro " + (i + 1) + "]");
						auxBD.cargaMax = entradaDado.nextInt();
						auxBD.veiculoDeCarga[i].setCargaMax(auxBD.cargaMax);
						
						System.out.println("================================================================\n");
						
						auxBD.auxCarga = auxBD.veiculoDeCarga.clone();
					
						if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro veículo? ", "Windows Carga",
						        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						} else {
						   break;
						}
					}
					break;
				case 3:
					for (int i = 0; i < auxBD.auxPasseio.length; i++) {
						if(auxBD.auxPasseio[i] != null) {
							System.out.println("================================================================");
							System.out.println("  		      TODOS OS VEÍCULOS DE PASSEIO");
							System.out.println("================================================================\n");
							System.out.println("\nDados do veículo de PASSEIO cadastrados pelo usuário " + (i + 1) + "\n" + auxBD.veiculoDePasseio[i]);
							System.out.println("================================================================");
						}
						
					}
					JOptionPane.showMessageDialog(null, "Todos os veiculos de passeio foram apresentados no console: ", "PASSEIO",
							JOptionPane.WARNING_MESSAGE);
					break;
				case 4:
					for (int i = 0; i < auxBD.auxCarga.length; i++) {
						if(auxBD.auxCarga[i] != null) {
							System.out.println("================================================================");
							System.out.println("  		      TODOS OS VEÍCULOS DE CARGA");
							System.out.println("================================================================\n");
							System.out.println("\nDados do veículo de CARGAS cadastrados pelo usuário " + (i + 1) + "\n" + auxBD.veiculoDeCarga[i]);
							System.out.println("================================================================");
						}
					}
					JOptionPane.showMessageDialog(null, "Todos os veiculos de carga foram apresentados no console: ",
							"CARGA",JOptionPane.WARNING_MESSAGE);
					break;
				case 5:
					System.out.println("================================================================");
					System.out.println("  		         PESQUISA DE VEÍCULO PASSEIO");
					System.out.println("================================================================\n");
					System.out.println("Digite a placa do veículo PASSEIO que deseja pesquisar.");
					auxBD.placa = entradaDado.next();
					auxBD.pesquisaPlacaPasseio(auxBD.placa);
					System.out.println("================================================================");
					break;
				case 6: 
					System.out.println("================================================================");
					System.out.println("  		         PESQUISA DE VEÍCULO CARGA");
					System.out.println("================================================================\n");
					System.out.println("Digite a placa do veículo CARGAS que deseja pesquisar.");
					auxBD.placa = entradaDado.next();
					auxBD.pesquisaPlacaCarga(auxBD.placa);
					System.out.println("================================================================");
					break;
				case 7:
					System.out.println("Sair do Sistema");
				default:
					break;
				}

			} while (op != 7);
			entradaDado.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Sistema Encerrado!", "Cancelar", JOptionPane.CLOSED_OPTION);
		}
		
	}
	
}