/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.utfpr.java.dto.Carga;
import br.com.utfpr.java.dto.Passeio;
import br.com.utfpr.java.exceptions.VeicExistException;
import br.com.utfpr.java.exceptions.VelocException;

public class BDVeiculos {
	
	static Leitura leitura = new Leitura();
	static Scanner entradaDado = new Scanner(System.in);
	
	private static List<Passeio> veiculoDePasseio = new ArrayList<Passeio>();
	private static List<Carga> veiculoDeCarga = new ArrayList<Carga>();
	
	public List<Passeio> getVeiculoDePasseio() {
		return veiculoDePasseio;
	}

	public void setVeiculoDePasseio(List<Passeio> veiculoDePasseio) {
		BDVeiculos.veiculoDePasseio = veiculoDePasseio;
	}

	public List<Carga> getVeiculoDeCarga() {
		return veiculoDeCarga;
	}

	public void setVeiculoDeCarga(List<Carga> veiculoDeCarga) {
		BDVeiculos.veiculoDeCarga = veiculoDeCarga;
	}
	
	public static String  placa = "";
	public static String marca = "";
	public static String  modelo = "";
	public static String cor = "";
	public static float velocMax = 0;
	public static int qtdRodas = 0;
	public static int qtdPist = 0;
	public static int potencia = 0;
	public static int qtdePassageiros = 0;
	public static int tara = 0;
	public static int cargaMax = 0;
	

	// métodos do veiculo de Passeio
	public static void cadastrarVeiculoPasseio() throws VelocException, VeicExistException {
		
			Passeio veiculoPasseio= new Passeio();
			
			System.out.println("Digite a placa do veículo de Passeio:");
			
			try {
				String aux;
				aux = entradaDado.next();
				verificaPlacaVeiculoPasseio(aux);
				
				veiculoPasseio.setPlaca(aux);	
				
			} catch (VeicExistException veiculoExistente) {
				veiculoExistente.imprimeMensagemVeicExist();
				return;
			}
			
			System.out.println("Digite a marca do veículo de Passeio:");
			marca = entradaDado.next();
			veiculoPasseio.setMarca(marca);
			
			System.out.println("Digite a modelo do veículo de Passeio:");
			modelo = entradaDado.next();
			veiculoPasseio.setModelo(modelo);
			
			System.out.println("Digite a cor do veículo de Passeio:");
			cor = entradaDado.next();
			veiculoPasseio.setCor(cor);
			
			System.out.println("Digite a quantidade de rodas do veículo de Passeio:");
			qtdRodas = entradaDado.nextInt();
			veiculoPasseio.setQtdRodas(qtdRodas);
			
			System.out.println("Digite a quantidade de passageiros do veículo de Passeio");
			qtdePassageiros = entradaDado.nextInt();
			veiculoPasseio.setQtdePassageiros(qtdePassageiros);

			System.out.println("Digite a velocidade do veículo em Km/h ");
			
			try {
				velocMax = entradaDado.nextFloat();
				veiculoPasseio.setVelocMax(velocMax);
				
			} catch (VelocException verificaVolocidade) {
				verificaVolocidade.imprimeMensagemVelocidade();
				velocMax = 100;
				System.out.println("Assumindo a Velocidade : " + velocMax + " Km/h " + "convertido: " + veiculoPasseio.calcVel(velocMax) + " cm/h \n");
			}
			veiculoPasseio.setVelocMax(velocMax);

			System.out.println("Digite a quantidade de pistão do motor de Passeio");
			qtdPist = entradaDado.nextInt();
			veiculoPasseio.getMotor().setQtdPist(qtdPist);

			System.out.println("Digite a potência do motor de Passeio");
			potencia = entradaDado.nextInt();
			veiculoPasseio.getMotor().setPotencia(potencia);
			System.out.println("================================================================\n");
			
			veiculoDePasseio.add(veiculoPasseio);
			
			if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro veículo? ", "Windows Passeio",
			        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				verificaVetorPasseio();
				cadastrarVeiculoPasseio();
			}
		}
	

	public static int verificaVetorPasseio() {
		for (int i = 0; i < veiculoDePasseio.size(); i++) {
			if(veiculoDePasseio.get(i) == null) {
				return i;
			}
		}
		return -1;
	}

	public static void pesquisaPlacaPasseio(String placa) {
		for (int i = 0; i < veiculoDePasseio.size(); i++) {
			if(veiculoDePasseio.get(i) != null) {
				if(veiculoDePasseio.get(i).getPlaca().equalsIgnoreCase(placa)){
					System.out.println("Veículo encontrado pela placa digitada: \n" + veiculoDePasseio.get(i));
				}else {
					System.out.println("Não foi encontrado nenhum veículo relacionado a placa informada!");
				}
			}
		}
	}	
	
	public static void verificaPlacaVeiculoPasseio(String aux) throws VeicExistException {
		for (int i = 0; i < veiculoDePasseio.size(); i++) {
			if(veiculoDePasseio.get(i) != null) {
				if(aux.equalsIgnoreCase(veiculoDePasseio.get(i).getPlaca())) {
						throw new VeicExistException();
				}
			}else{
				placa = aux;

			}
		}

	}
	
	public static void excluirVeiculosPasseioPelaPlaca(String placa) {
		int i = verificaVeiculosPasseioPelaPlaca(placa);
		if (i >= 0) {
			veiculoDePasseio.remove(i);
			System.out.println("\nVeículo " + (i + 1) + " do tipo Passeio excluído com sucesso!");
		} else {
			System.out.println("Placa não existe!");
		}
	}
	
	private static int verificaVeiculosPasseioPelaPlaca(String placa) {
		int retorno = -1;
		for (int i = 0; (i < veiculoDePasseio.size()) && (veiculoDePasseio.get(i) != null); i++) {
			if (placa.equals(veiculoDePasseio.get(i).getPlaca())) {
				retorno = i;
			}
		}
		return retorno;
	}
	
	// métodos do veiculo de Carga
	
	public static void cadastrarVeiculoCarga() throws VelocException, VeicExistException{
		Carga veiculoCarga = new Carga();
		
		System.out.println("Digite a placa do veículo de Carga:");
		try {
			String aux;
			aux = entradaDado.next();
			verificaPlacaVeiculoCarga(aux);
			
			veiculoCarga.setPlaca(aux);
			
		} catch (VeicExistException veiculoExistente) {
			veiculoExistente.imprimeMensagemVeicExist();
			return;
		}

		System.out.println("Digite a marca do veículo de Carga:");
		marca = entradaDado.next();
		veiculoCarga.setMarca(marca);

		System.out.println("Digite a modelo do veículo de Carga:");
		modelo = entradaDado.next();
		veiculoCarga.setModelo(modelo);
		
		System.out.println("Digite a cor do veículo de Carga:");
		cor = entradaDado.next();
		veiculoCarga.setCor(cor);
		
		System.out.println("Digite a quantidade de rodas do veículo de Carga:");
		qtdRodas = entradaDado.nextInt();
		veiculoCarga.setQtdRodas(qtdRodas);
		
		System.out.println("Digite a velocidade do veículo em Km/h ");
	
		
		try {
			velocMax = entradaDado.nextFloat();
			veiculoCarga.setVelocMax(velocMax);
			
		} catch (VelocException verificaVolocidade) {
			verificaVolocidade.imprimeMensagemVelocidade();
			velocMax = 90;
			System.out.println("Assumindo a Velocidade : " + velocMax + " Km/h " + "convertido: " + veiculoCarga.calcVel(velocMax) + " m/h \n");
		}
		
		veiculoCarga.setVelocMax(velocMax);
		
		System.out.println("Digite a quantidade de pistão do motor de Carga:");
		qtdPist = entradaDado.nextInt();
		veiculoCarga.getMotor().setQtdPist(qtdPist);

		System.out.println("Digite a potência do motor de Carga:");
		potencia = entradaDado.nextInt();
		veiculoCarga.getMotor().setPotencia(potencia);
		
		System.out.println("Digite a Tara do veículo de Carga:");
		tara = entradaDado.nextInt();
		veiculoCarga.setTara(tara);
		
		System.out.println("Digite a carga máxima do veículo: ");
		cargaMax = entradaDado.nextInt();
		veiculoCarga.setCargaMax(cargaMax);
		
		System.out.println("================================================================\n");
		
		veiculoDeCarga.add(veiculoCarga);
		
		
		if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro veículo? ", "Windows Passeio",
		        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			verificaVetorCarga();
			cadastrarVeiculoCarga();
		}
	}

	public static int verificaVetorCarga() {
		for (int i = 0; i < veiculoDeCarga.size(); i++) {
			if(veiculoDeCarga.get(i) == null) {
				return i;
			}
		}
		return -1;
	}
	
	public static void pesquisaPlacaCarga(String placa) {
		for (int i = 0; i < veiculoDeCarga.size(); i++) {
			if(veiculoDeCarga.get(i)!= null) {
				if(veiculoDeCarga.get(i).getPlaca().equalsIgnoreCase(placa)){
					System.out.println("Veículo encontrado pela placa digitada: \n" + veiculoDeCarga.get(i));
				}else {
					System.out.println("Não foi encontrado nenhum veículo relacionado a placa informada!");
				}
			}
		}
	}	
	
	public static void verificaPlacaVeiculoCarga(String aux) throws VeicExistException {
		for (int i = 0; i < veiculoDeCarga.size(); i++) {
			if(veiculoDeCarga.get(i) != null) {
				if(aux.equalsIgnoreCase(veiculoDeCarga.get(i).getPlaca())) {
						throw new VeicExistException();
				}
			}else{
				placa = aux;

			}
		}

	}
	
	public static void excluirVeiculosCargaPelaPlaca(String placa) {
		int i = verificaVeiculosCargaPelaPlaca(placa);
		if (i >= 0) {
			veiculoDeCarga.remove(i);
			System.out.println("\nVeículo " + (i + 1) + " do tipo Carga excluído com sucesso!");
		} else {
			System.out.println("Placa não existe!");
		}
	}
	
	private static int verificaVeiculosCargaPelaPlaca(String placa) {
		int retorno = -1;
		for (int i = 0; (i < veiculoDeCarga.size()) && (veiculoDeCarga.get(i) != null); i++) {
			if (placa.equals(veiculoDeCarga.get(i).getPlaca())) {
				retorno = i;
			}
		}
		return retorno;
	}

}
