/**
 * @author: Agatha dos Santos Paiva 
 */

package br.com.utfpr.java.main;

import java.util.Scanner;

import br.com.utfpr.java.dto.Veiculo;

public class Teste {

	public static void main(String[] args) {
		String placa = "";
		String marca = "";
		String modelo = "";
		float velocMax = 0;
		int qtdPist = 0;
		int potencia = 0;
		int numeroCarros = 10;
		Veiculo[] veiculos = new Veiculo[numeroCarros];
		Scanner entradaDado = new Scanner(System.in);
		
		System.out.println("==================================================");
		System.out.println("  		Cadastre 10 veículos");
		System.out.println("==================================================\n");
	
		for (int i = 0; i < numeroCarros; i++) {
			veiculos[i] = new Veiculo();

			System.out.println("Digite a placa do veículo " + (i + 1));
			placa = entradaDado.next();
			veiculos[i].setPlaca(placa);

			System.out.println("Digite a marca do veículo " + (i + 1));
			marca = entradaDado.next();
			veiculos[i].setMarca(marca);

			System.out.println("Digite a modelo do veículo " + (i + 1));
			modelo = entradaDado.next();
			veiculos[i].setModelo(modelo);

			System.out.println("Digite a velocidade máxima do veículo " + (i + 1));
			velocMax = entradaDado.nextFloat();
			veiculos[i].setVelocMax(velocMax);

			System.out.println("Digite a quantidade de pistão do motor " + (i + 1));
			qtdPist = entradaDado.nextInt();
			veiculos[i].getMotor().setQtdPist(qtdPist);

			System.out.println("Digite a potência do motor " + (i + 1));
			potencia = entradaDado.nextInt();
			veiculos[i].getMotor().setPotencia(potencia);
			System.out.println("==================================================\n");
		}

		entradaDado.close();

		for (int i = 0; i < veiculos.length; i++) {
			System.out.println("\nDados do veículo cadastrados pelo usuário " + (i + 1) + "\n" + veiculos[i]);
		}
	}

}
