/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.implement;

import br.com.utfpr.java.dto.Carga;
import br.com.utfpr.java.dto.Passeio;
import br.com.utfpr.java.exceptions.VeicExistException;

public class BDVeiculos {
	
	
	public Passeio[] auxPasseio;
	public Carga[] auxCarga;
	public Leitura leitura;
	public Passeio veiculoPasseio;
	public Carga veiculoCarga;
	
	public String  placa = "";
	public String marca = "";
	public String  modelo = "";
	public String cor = "";
	public float velocMax = 0;
	public int qtdRodas = 0;
	public int qtdPist = 0;
	public int potencia = 0;
	public int qtdePassageiros = 0;
	public int tara = 0;
	public int cargaMax = 0;
	public int numeroVeiculos= 5;
	

	
	public Passeio[] veiculoDePasseio = new Passeio[5];
	public Carga[] veiculoDeCarga = new Carga[5];

	
	public int verificaVetorPasseio() {
		for (int i = 0; i < veiculoDePasseio.length; i++) {
			if(veiculoDePasseio[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	public int verificaVetorCarga() {
		for (int i = 0; i < veiculoDeCarga.length; i++) {
			if(veiculoDeCarga[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	public String pesquisaPlacaPasseio(String placa) {
		for (int i = 0; i < veiculoDePasseio.length; i++) {
			if(veiculoDePasseio[i] != null) {
				if(veiculoDePasseio[i].getPlaca().equalsIgnoreCase(placa)){
					System.out.println("Veículo encontrado pela placa digitada: \n" + veiculoDePasseio[i]);
					System.out.println("MÉTODO CALCULAR: " + auxPasseio[i].calcular());
				}else {
					System.out.println("Não foi encontrado nenhum veículo relacionado a placa informada!");
				}
			}
		}
		return placa;
		
	}	

	
	public String pesquisaPlacaCarga(String placa) {
		for (int i = 0; i < veiculoDeCarga.length; i++) {
			if(veiculoDeCarga[i] != null) {
				if(veiculoDeCarga[i].getPlaca().equalsIgnoreCase(placa)){
					System.out.println("Veículo encontrado pela placa digitada: \n" + veiculoDeCarga[i]);
					System.out.println("MÉTODO CALCULAR: " + auxCarga[i].calcular());
				}else {
					System.out.println("Não foi encontrado nenhum veículo relacionado a placa informada!");
				}
			}
		}
		return placa;
		
	}	

	public void verificaPlacaVeiculoPasseio(String aux) throws VeicExistException {
		for (int i = 0; i < veiculoDePasseio.length; i++) {
			if(veiculoDePasseio[i] != null) {
				if(aux.equalsIgnoreCase(veiculoDePasseio[i].getPlaca())) {
						throw new VeicExistException();
				}
			}else{
				placa = aux;

			}
		}

	}
	
	public void verificaPlacaVeiculoCarga(String aux) throws VeicExistException {
		for (int i = 0; i < veiculoDeCarga.length; i++) {
			if(veiculoDeCarga[i] != null) {
				if(aux.equalsIgnoreCase(veiculoDeCarga[i].getPlaca())) {
						throw new VeicExistException();
				}
			}else{
				placa = aux;

			}
		}

	}

}
