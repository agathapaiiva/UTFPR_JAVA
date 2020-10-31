/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.main;

import java.util.Scanner;

import br.com.utfpr.java.dto.Carga;
import br.com.utfpr.java.dto.Passeio;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Passeio veiculoDePasseio = new Passeio();
		Carga veiculoDeCarga = new Carga();

		Scanner entradaDado = new Scanner(System.in);
		
		System.out.println("==================================================");
		System.out.println("  		Informe o tipo de veículo");
		System.out.println("  		1 - PASSEIO  |  2 - CARGA");
		System.out.println("==================================================\n");
		
		int escolha  = entradaDado.nextInt();
		float velocMax;
		String veiculoDePasseios, veiculoDeCargas;
		
		switch (escolha) {
		case 1:
			veiculoDePasseios = entradaDado.nextLine(); 
			System.out.println("Informar dados do veículo PASSEIO\n");
		
			System.out.println("Digite a placa do veículo ");
			veiculoDePasseio.setPlaca(entradaDado.nextLine());
			
			System.out.println("Digite a marca do veículo ");
			veiculoDePasseio.setMarca(entradaDado.nextLine());
			
			System.out.println("Digite a modelo do veículo ");
			veiculoDePasseio.setModelo(entradaDado.nextLine());
			
			System.out.println("Digite a velocidade do veículo em Km/h ");
			velocMax = entradaDado.nextFloat();
			System.out.println(velocMax + " Km/h " + "convertido é : " + 
					veiculoDePasseio.calcVel(velocMax) + " m/h ");
			
			System.out.println("Digite a quantidade de passageiros ");
			veiculoDePasseio.setQtdePassageiros(entradaDado.nextInt());
			break;
		case 2:
			veiculoDeCargas = entradaDado.nextLine(); 
			System.out.println("Informar dados do veículo CARGA\n");
			
			System.out.println("Digite a placa do veículo ");
			veiculoDePasseio.setPlaca(entradaDado.nextLine());
			
			System.out.println("Digite a marca do veículo ");
			veiculoDePasseio.setMarca(entradaDado.nextLine());
			
			System.out.println("Digite a modelo do veículo ");
			veiculoDePasseio.setModelo(entradaDado.nextLine());
			
			System.out.println("Digite a velocidade do veículo em Km/h ");
			velocMax = entradaDado.nextFloat();
			System.out.println(velocMax + " Km/h " + "convertido é : " + 
					veiculoDeCarga.calcVel(velocMax) + " cm/h ");
			break;
		default:
			System.out.println("Número inválido");
			break;
		}
		
		entradaDado.close();
			
	}

}