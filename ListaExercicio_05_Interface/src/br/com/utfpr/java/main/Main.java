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

	public static void main(String[] args) {
		String placa = "";
		String marca = "";
		String modelo = "";
		float velocMax = 0;
		int qtdPist = 0;
		int potencia = 0;
		int qtdePassageiros = 0;
		int numeroVeiculos= 2;
		
		Passeio[] veiculoDePasseio = new Passeio[numeroVeiculos];
		Carga[] veiculoDeCarga = new Carga[numeroVeiculos];
		
		Passeio veiculoPasseio = new Passeio();
		Carga veiculoCarga = new Carga();
		Leitura leitura = new Leitura();
		
		Scanner entradaDado = new Scanner(System.in);

		try {
			int op;
			
			do {
				op = Integer.parseInt(leitura.entDados());

				switch (op) {
				case 1:
					for (int i = 0; i < numeroVeiculos; ) {
						veiculoDePasseio[i] = new Passeio();

						System.out.println("Digite a placa do veículo de Passeio" + " [" + (i + 1) + "]");
						placa = entradaDado.next();
						veiculoDePasseio[i].setPlaca(placa);

						System.out.println("Digite a marca do veículo de Passeio" + " [" + (i + 1) + "]");
						marca = entradaDado.next();
						veiculoDePasseio[i].setMarca(marca);

						System.out.println("Digite a modelo do veículo de Passeio" + " [" + (i + 1) + "]");
						modelo = entradaDado.next();
						veiculoDePasseio[i].setModelo(modelo);
						
						System.out.println("Digite a quantidade de passageiros do veículo de Passeio" + " [" + (i + 1) + "]");
						qtdePassageiros = entradaDado.nextInt();
						veiculoDePasseio[i].setQtdePassageiros(qtdePassageiros);

						System.out.println("Digite a velocidade do veículo em Km/h " + " [" + (i + 1) + "]");
						velocMax = entradaDado.nextFloat();
						System.out.println("Velocidade digita: " + velocMax + " Km/h " + "convertido: " + 
								veiculoPasseio.calcVel(velocMax) + " m/h \n");
						veiculoDePasseio[i].setVelocMax(velocMax);

						System.out.println("Digite a quantidade de pistão do motor de Passeio" + " [" + (i + 1) + "]");
						qtdPist = entradaDado.nextInt();
						veiculoDePasseio[i].getMotor().setQtdPist(qtdPist);

						System.out.println("Digite a potência do motor de Passeio" + " [" + (i + 1) + "]");
						potencia = entradaDado.nextInt();
						veiculoDePasseio[i].getMotor().setPotencia(potencia);
						System.out.println("================================================================\n");
						
						if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro veículo? ", "WARNING",
						        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
							i++;
						} else {
						    leitura.entDados();
						   
						} break;
					}
				case 2:
					for (int i = 0; i < numeroVeiculos;) {
						veiculoDeCarga[i] = new Carga();

						System.out.println("Digite a placa do veículo de Carga" + "[cadastro " + (i + 1) + "]");
						placa = entradaDado.next();
						veiculoDeCarga[i].setPlaca(placa);

						System.out.println("Digite a marca do veículo de Carga" + "[cadastro " + (i + 1) + "]");
						marca = entradaDado.next();
						veiculoDeCarga[i].setMarca(marca);

						System.out.println("Digite a modelo do veículo de Carga" + "[cadastro " + (i + 1) + "]");
						modelo = entradaDado.next();
						veiculoDeCarga[i].setModelo(modelo);

						System.out.println("Digite a velocidade do veículo em Km/h " + "[cadastro " + (i + 1) + "]");
						velocMax = entradaDado.nextFloat();
						System.out.println("Velocidade digita: " + velocMax + " Km/h " + "convertido: " + 
								veiculoCarga.calcVel(velocMax) + " m/h \n");
						veiculoDeCarga[i].setVelocMax(velocMax);

						System.out.println("Digite a quantidade de pistão do motor de Carga" + "[cadastro " + (i + 1) + "]");
						qtdPist = entradaDado.nextInt();
						veiculoDeCarga[i].getMotor().setQtdPist(qtdPist);

						System.out.println("Digite a potência do motor de Carga" + "[cadastro " + (i + 1) + "]");
						potencia = entradaDado.nextInt();
						veiculoDeCarga[i].getMotor().setPotencia(potencia);
						System.out.println("================================================================\n");
					
						if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro veículo? ", "WARNING",
						        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
							i++;
						} else {
						    leitura.entDados();
						   
						} break;
					}
					break;
				case 3:
					System.out.println("Imprimir Todos os Veículos de Passeio");
					break;
				case 4:
					System.out.println("Imprimir Todos os Veículos de Carga");
					break;
				case 5:
					System.out.println("Imprimir Veículo de Passeio pela Placa");
					break;
				case 6: 
					System.out.println("Imprimir Veículo de Carga pela Placa");
					break;
				case 7:
					System.out.println("Sair do Sistema");
				default:
					break;
				}
			} while (op != 7);
			
			entradaDado.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Encerrando o sistema *-* ", "Cancelar", JOptionPane.CLOSED_OPTION);
		}

	}
}
