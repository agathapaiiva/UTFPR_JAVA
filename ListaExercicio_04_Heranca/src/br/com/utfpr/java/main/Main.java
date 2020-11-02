/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.utfpr.java.dto.Carga;
import br.com.utfpr.java.dto.Passeio;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String placa = "";
		String marca = "";
		String modelo = "";
		String input;
		float velocMax = 0;
		int qtdPist = 0;
		int potencia = 0;
		int qtdePassageiros = 0;
		int numeroVeiculos= 5;
		int escolha = 0;
		
		Passeio[] veiculoDePasseio = new Passeio[numeroVeiculos];
		Carga[] veiculoDeCarga = new Carga[numeroVeiculos];
		
		Passeio veiculoPasseio = new Passeio();
		Carga veiculoCarga = new Carga();
		
		Scanner entradaDado = new Scanner(System.in);
		
		input = JOptionPane.showInputDialog("Escolha uma opção\n\n"
				+"1 - Cadastrar 5 veículo do tipo Passeio\n"
				+"2 - Cadastrar 5 veículo do tipo Carga\n" );
		
		try {
			if(input.equals("1")) {
				
				for (int i = 0; i < numeroVeiculos; i++) {
					veiculoDePasseio[i] = new Passeio();

					System.out.println("Digite a placa do veículo de Passeio" + "[cadastro " + (i + 1) + "]");
					placa = entradaDado.next();
					veiculoDePasseio[i].setPlaca(placa);

					System.out.println("Digite a marca do veículo de Passeio" + "[cadastro " + (i + 1) + "]");
					marca = entradaDado.next();
					veiculoDePasseio[i].setMarca(marca);

					System.out.println("Digite a modelo do veículo de Passeio" + "[cadastro " + (i + 1) + "]");
					modelo = entradaDado.next();
					veiculoDePasseio[i].setModelo(modelo);
					
					System.out.println("Digite a quantidade de passageiros de Passeio"  + "[cadastro " + (i + 1) + "]");
					qtdePassageiros = entradaDado.nextInt();
					veiculoDePasseio[i].setQtdePassageiros(qtdePassageiros);

					System.out.println("Digite a velocidade do veículo em Km/h " + "[cadastro " + (i + 1) + "]");
					velocMax = entradaDado.nextFloat();
					System.out.println("Velocidade digita: " + velocMax + " Km/h " + "convertido: " + 
							veiculoPasseio.calcVel(velocMax) + " m/h \n");
					veiculoDePasseio[i].setVelocMax(velocMax);

					System.out.println("Digite a quantidade de pistão do motor de Passeio" + "[cadastro " + (i + 1) + "]");
					qtdPist = entradaDado.nextInt();
					veiculoDePasseio[i].getMotor().setQtdPist(qtdPist);

					System.out.println("Digite a potência do motor de Passeio" + "[cadastro " + (i + 1) + "]");
					potencia = entradaDado.nextInt();
					veiculoDePasseio[i].getMotor().setPotencia(potencia);
					System.out.println("================================================================\n");
				}
			}else if (input.equals("2")) {
				for (int i = 0; i < numeroVeiculos; i++) {
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
				
				}
			}
			entradaDado.close();
			
		} catch (Exception e) {
			System.out.println("Fechando o programa");
		}

	}
}
