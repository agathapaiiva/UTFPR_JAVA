/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.utfpr.java.dto.Carga;
import br.com.utfpr.java.dto.Passeio;
import br.com.utfpr.java.implement.Leitura;

public class Main {
	
	public static Passeio[] veiculoDePasseio;
	public static Passeio[] auxPasseio;
	public static Carga[] veiculoDeCarga;
	public static Carga[] auxCarga;
	public static Leitura leitura;
	public static Passeio veiculoPasseio;
	public static Carga veiculoCarga;
	public static String pesquisaPlacaPasseio = "";
	public static String pesquisaPlacaCarga = "";

	public static void main(String[] args) {
		String placa = "";
		String marca = "";
		String modelo = "";
		String cor = "";
		float velocMax = 0;
		int qtdRodas = 0;
		int qtdPist = 0;
		int potencia = 0;
		int qtdePassageiros = 0;
		int tara = 0;
		int cargaMax = 0;
		int numeroVeiculos= 5;
		
		veiculoDePasseio = new Passeio[numeroVeiculos];
		veiculoDeCarga = new Carga[numeroVeiculos];
		
		auxPasseio = null;
		auxCarga = null;
		
		veiculoPasseio = new Passeio();
		veiculoCarga = new Carga();
		leitura = new Leitura();
		
		Scanner entradaDado = new Scanner(System.in);

		try {
			int op;
			
			do {
				op = Integer.parseInt(leitura.entDados());

				switch (op) {
				case 1:
					for (int i = verificaVetorPasseio(); i < numeroVeiculos; i++) {
						if(i == -1) {
							JOptionPane.showMessageDialog(null, "Vetor de Passeio cheio!", "WARNING", JOptionPane.WARNING_MESSAGE);
							leitura.entDados();
							
						}
						veiculoDePasseio[i] = new Passeio();
						
						System.out.println("Digite a placa do veículo de Passeio:" + " [cadastro " + (i + 1) + "]");
						placa = entradaDado.next();
						veiculoDePasseio[i].setPlaca(placa);
						
						System.out.println("Digite a marca do veículo de Passeio:" + " [cadastro " + (i + 1) + "]");
						marca = entradaDado.next();
						veiculoDePasseio[i].setMarca(marca);

						System.out.println("Digite a modelo do veículo de Passeio:" + " [cadastro " + (i + 1) + "]");
						modelo = entradaDado.next();
						veiculoDePasseio[i].setModelo(modelo);
						
						System.out.println("Digite a cor do veículo de Passeio:" + " [cadastro " + (i + 1) + "]");
						cor = entradaDado.next();
						veiculoDePasseio[i].setCor(cor);
						
						System.out.println("Digite a quantidade de rodas do veículo de Passeio:" + " [cadastro " + (i + 1) + "]");
						qtdRodas = entradaDado.nextInt();
						veiculoDePasseio[i].setQtdRodas(qtdRodas);
						
						System.out.println("Digite a quantidade de passageiros do veículo de Passeio" + " [cadastro " + (i + 1) + "]");
						qtdePassageiros = entradaDado.nextInt();
						veiculoDePasseio[i].setQtdePassageiros(qtdePassageiros);

						System.out.println("Digite a velocidade do veículo em Km/h " + " [" + (i + 1) + "]");
						velocMax = entradaDado.nextFloat();
						System.out.println("Velocidade digita: " + velocMax + " Km/h " + "convertido: " + 
								veiculoPasseio.calcVel(velocMax) + " m/h \n");
						veiculoDePasseio[i].setVelocMax(velocMax);

						System.out.println("Digite a quantidade de pistão do motor de Passeio" + " [cadastro " + (i + 1) + "]");
						qtdPist = entradaDado.nextInt();
						veiculoDePasseio[i].getMotor().setQtdPist(qtdPist);

						System.out.println("Digite a potência do motor de Passeio" + " [cadastro " + (i + 1) + "]");
						potencia = entradaDado.nextInt();
						veiculoDePasseio[i].getMotor().setPotencia(potencia);
						System.out.println("================================================================\n");
						
						auxPasseio = veiculoDePasseio.clone();
						
						if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro veículo? ", "Windows Passeio",
						        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
							verificaVetorPasseio();
							
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
					for (int i = verificaVetorCarga(); i < numeroVeiculos; i++) {
					
						veiculoDeCarga[i] = new Carga();

						System.out.println("Digite a placa do veículo de Carga" + " [cadastro " + (i + 1) + "]");
						placa = entradaDado.next();
						veiculoDeCarga[i].setPlaca(placa);

						System.out.println("Digite a marca do veículo de Carga" + " [cadastro " + (i + 1) + "]");
						marca = entradaDado.next();
						veiculoDeCarga[i].setMarca(marca);

						System.out.println("Digite a modelo do veículo de Carga" + " [cadastro " + (i + 1) + "]");
						modelo = entradaDado.next();
						veiculoDeCarga[i].setModelo(modelo);
						
						System.out.println("Digite a cor do veículo de Carga:" + " [cadastro " + (i + 1) + "]");
						cor = entradaDado.next();
						veiculoDeCarga[i].setCor(cor);
						
						System.out.println("Digite a quantidade de rodas do veículo de Carga:" + " [cadastro " + (i + 1) + "]");
						qtdRodas = entradaDado.nextInt();
						veiculoDeCarga[i].setQtdRodas(qtdRodas);
						
						System.out.println("Digite a velocidade do veículo em Km/h " + " [cadastro " + (i + 1) + "]");
						velocMax = entradaDado.nextFloat();
						System.out.println("Velocidade digita: " + velocMax + " Km/h " + "convertido: " + 
								veiculoCarga.calcVel(velocMax) + " m/h \n");
						veiculoDeCarga[i].setVelocMax(velocMax);

						System.out.println("Digite a quantidade de pistão do motor de Carga" + " [cadastro " + (i + 1) + "]");
						qtdPist = entradaDado.nextInt();
						veiculoDeCarga[i].getMotor().setQtdPist(qtdPist);

						System.out.println("Digite a potência do motor de Carga" + " [cadastro " + (i + 1) + "]");
						potencia = entradaDado.nextInt();
						veiculoDeCarga[i].getMotor().setPotencia(potencia);
						
						System.out.println("Digite a Tara do veículo de Carga" + " [cadastro " + (i + 1) + "]");
						tara = entradaDado.nextInt();
						veiculoDeCarga[i].setTara(tara);
						
						System.out.println("Digite a carga máxima do veículo: " + " [cadastro " + (i + 1) + "]");
						cargaMax = entradaDado.nextInt();
						veiculoDeCarga[i].setCargaMax(cargaMax);
						
						System.out.println("================================================================\n");
						
						auxCarga = veiculoDeCarga.clone();
					
						if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro veículo? ", "Windows Carga",
						        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						} else {
						   break;
						}
					}
					break;
				case 3:
					for (int i = 0; i < auxPasseio.length; i++) {
						System.out.println("================================================================");
						System.out.println("  		      TODOS OS VEÍCULOS DE PASSEIO");
						System.out.println("================================================================\n");
						System.out.println("\nDados do veículo de PASSEIO cadastrados pelo usuário " + (i + 1) + "\n" + veiculoDePasseio[i]);
						System.out.println("================================================================");
					}
					JOptionPane.showMessageDialog(null, "Todos os veiculos de passeio foram apresentados no console: ", "PASSEIO",
							JOptionPane.WARNING_MESSAGE);
					break;
				case 4:
					for (int i = 0; i < auxCarga.length; i++) {
						System.out.println("================================================================");
						System.out.println("  		      TODOS OS VEÍCULOS DE CARGA");
						System.out.println("================================================================\n");
						System.out.println("\nDados do veículo de CARGAS cadastrados pelo usuário " + (i + 1) + "\n" + veiculoDeCarga[i]);
						System.out.println("================================================================");
					}
					JOptionPane.showMessageDialog(null, "Todos os veiculos de carga foram apresentados no console: ", "CARGA",
							JOptionPane.WARNING_MESSAGE);
					break;
				case 5:
					System.out.println("================================================================");
					System.out.println("  		         PESQUISA DE VEÍCULO PASSEIO");
					System.out.println("================================================================\n");
					System.out.println("Digite a placa do veículo PASSEIO que deseja pesquisar.");
					pesquisaPlacaPasseio = entradaDado.next();
					pesquisaPlacaPasseio(pesquisaPlacaPasseio);
					System.out.println("================================================================");
					break;
				case 6: 
					System.out.println("================================================================");
					System.out.println("  		         PESQUISA DE VEÍCULO CARGA");
					System.out.println("================================================================\n");
					System.out.println("Digite a placa do veículo CARGAS que deseja pesquisar.");
					pesquisaPlacaCarga = entradaDado.next();
					pesquisaPlacaCarga(pesquisaPlacaCarga);
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
	
	public static int verificaVetorPasseio() {
		for (int i = 0; i < veiculoDePasseio.length; i++) {
			if(veiculoDePasseio[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	public static int verificaVetorCarga() {
		for (int i = 0; i < veiculoDeCarga.length; i++) {
			if(veiculoDeCarga[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	public static void pesquisaPlacaPasseio(String pesquisaPlacaPasseio) {
		int i = 0;
		for (; i < veiculoDePasseio.length;) {
			if (veiculoDePasseio[i] == null) {
				System.out.println("Pesquisa encerrada!");
				break;
			}
			if (veiculoDePasseio[i].getPlaca().equalsIgnoreCase(pesquisaPlacaPasseio)) {
				System.out.println("Veículo encontrado pela placa digitada: \n" + veiculoDePasseio[i]);
				System.out.println("MÉTODO CALCULAR: " + auxPasseio[i].calcular());
			} else {
				System.out.println("Não foi encontrado nenhum veículo relacionado a placa informada!");
			}
			i++;
		}
	}
	
	public static void pesquisaPlacaCarga(String pesquisaPlacaCarga) {
		int i = 0;
		for (; i < veiculoDeCarga.length;) {
			if (veiculoDeCarga[i] == null) {
				System.out.println("Pesquisa encerrada!");
				break;
			}
			if (veiculoDeCarga[i].getPlaca().equalsIgnoreCase(pesquisaPlacaCarga)) {
				System.out.println("Veículo encontrado pela placa digitada: \n" + veiculoDeCarga[i]);
				System.out.println("MÉTODO CALCULAR: " + auxCarga[i].calcular());
			}

			if (!veiculoDeCarga[i].getPlaca().equals(pesquisaPlacaCarga)) {
				System.out.println("Não foi encontrado nenhum veículo relacionado a placa informada!");
			}
			i++;
		}
	}

}
