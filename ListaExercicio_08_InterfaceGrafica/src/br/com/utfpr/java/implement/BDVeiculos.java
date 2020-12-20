/**
 ''* @author agatha-paiva
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
		return BDVeiculos.veiculoDePasseio;
	}

	public void setVeiculoDePasseio(List<Passeio> veiculoDePasseio) {
		BDVeiculos.veiculoDePasseio = veiculoDePasseio;
	}

	public List<Carga> getVeiculoDeCarga() {
		return BDVeiculos.veiculoDeCarga;
	}

	public void setVeiculoDeCarga(List<Carga> veiculoDeCarga) {
		BDVeiculos.veiculoDeCarga = veiculoDeCarga;
	}
	
	private static String  placa = "";
	private static String marca = "";
	private static String  modelo = "";
	private static String cor = "";
	private static float velocMax = 0;
	private static int qtdRodas = 0;
	private static int qtdPist = 0;
	private static int potencia = 0;
	private static int qtdePassageiros = 0;
	private static int tara = 0;
	private static int cargaMax = 0;
	

	public static String getPlaca() {
		return placa;
	}

	public static void setPlaca(String placa) {
		BDVeiculos.placa = placa;
	}
	
	public static Leitura getLeitura() {
		return leitura;
	}

	public static void setLeitura(Leitura leitura) {
		BDVeiculos.leitura = leitura;
	}

	public static Scanner getEntradaDado() {
		return entradaDado;
	}

	public static void setEntradaDado(Scanner entradaDado) {
		BDVeiculos.entradaDado = entradaDado;
	}

	public static String getMarca() {
		return marca;
	}

	public static void setMarca(String marca) {
		BDVeiculos.marca = marca;
	}

	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		BDVeiculos.modelo = modelo;
	}

	public static String getCor() {
		return cor;
	}

	public static void setCor(String cor) {
		BDVeiculos.cor = cor;
	}

	public static float getVelocMax() {
		return velocMax;
	}

	public static void setVelocMax(float velocMax) {
		BDVeiculos.velocMax = velocMax;
	}

	public static int getQtdRodas() {
		return qtdRodas;
	}

	public static void setQtdRodas(int qtdRodas) {
		BDVeiculos.qtdRodas = qtdRodas;
	}

	public static int getQtdPist() {
		return qtdPist;
	}

	public static void setQtdPist(int qtdPist) {
		BDVeiculos.qtdPist = qtdPist;
	}

	public static int getPotencia() {
		return potencia;
	}

	public static void setPotencia(int potencia) {
		BDVeiculos.potencia = potencia;
	}

	public static int getQtdePassageiros() {
		return qtdePassageiros;
	}

	public static void setQtdePassageiros(int qtdePassageiros) {
		BDVeiculos.qtdePassageiros = qtdePassageiros;
	}

	public static int getTara() {
		return tara;
	}

	public static void setTara(int tara) {
		BDVeiculos.tara = tara;
	}

	public static int getCargaMax() {
		return cargaMax;
	}

	public static void setCargaMax(int cargaMax) {
		BDVeiculos.cargaMax = cargaMax;
	}

	// métodos do veiculo de Passeio
	public static boolean cadastrarVeiculoPasseio() throws VelocException, VeicExistException {
		
		Passeio veiculoPasseio= new Passeio();
		
		try {
			verificaPlacaVeiculoPasseio(getPlaca());
			veiculoPasseio.setPlaca(getPlaca());	
			veiculoPasseio.setMarca(getMarca());
			veiculoPasseio.setModelo(getModelo());
			veiculoPasseio.setCor(getCor());
			veiculoPasseio.setQtdRodas(getQtdRodas());
			veiculoPasseio.setQtdePassageiros(getQtdePassageiros());
			veiculoPasseio.setVelocMax(getVelocMax());
			veiculoPasseio.getMotor().setQtdPist(getQtdPist());
			veiculoPasseio.getMotor().setPotencia(getPotencia());
			veiculoPasseio.setVelocMax(getVelocMax());
			
			veiculoDePasseio.add(veiculoPasseio);
			
		} catch (VeicExistException veiculoExistente) {
			veiculoExistente.imprimeMensagemVeicExist();
			return false;
		
		} catch (VelocException velocidadeException) {
			velocidadeException.imprimeMensagemVelocidade();
			veiculoPasseio.setVelocMax(100);
			veiculoDePasseio.add(veiculoPasseio);
		}
		return true;
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
					JOptionPane.showMessageDialog(null, "Veículo encontrado!",
							"PASSEIO",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}	
	
	public static String verificaPlacaVeiculoPasseio(String placa) throws VeicExistException {
		for (int i = 0; i < veiculoDePasseio.size(); i++) {
			if(veiculoDePasseio.get(i) != null) {
				if(placa.equalsIgnoreCase(veiculoDePasseio.get(i).getPlaca())) {
						throw new VeicExistException();
						
				}
			}
		}
		setPlaca(placa);
		return placa;

	}
	
	public static void excluirVeiculosPasseioPelaPlaca(String placa) {
		int i = verificaVeiculosPasseioPelaPlaca(getPlaca());
		if (i >= 0 && placa.equals(veiculoDePasseio.get(i).getPlaca())) {
			veiculoDePasseio.remove(i);
			JOptionPane.showMessageDialog(null, "Veículo excluído com sucesso!","PASSEIO",JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Placa não existe!","PASSEIO",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static int verificaVeiculosPasseioPelaPlaca(String placa) {
		int retorno = -1;
		for (int i = 0; (i < veiculoDePasseio.size()) && (veiculoDePasseio.get(i) != null); i++) {
			if (placa.equalsIgnoreCase(veiculoDePasseio.get(i).getPlaca())) {
				retorno = i;
			}
		}
		return retorno;
	}
	
	// métodos do veiculo de Carga
	
	public static boolean cadastrarVeiculoCarga() throws VelocException, VeicExistException{
		Carga veiculoCarga = new Carga();
		
		try {
			verificaPlacaVeiculoCarga(getPlaca());
			veiculoCarga.setPlaca(getPlaca());
			veiculoCarga.setMarca(getMarca());
			veiculoCarga.setModelo(getModelo());
			veiculoCarga.setCor(getCor());
			veiculoCarga.setQtdRodas(getQtdRodas());
			veiculoCarga.getMotor().setQtdPist(getQtdPist());
			veiculoCarga.getMotor().setPotencia(getPotencia());
			veiculoCarga.setTara(getTara());
			veiculoCarga.setCargaMax(getCargaMax());
			veiculoCarga.setVelocMax(getVelocMax());
			
			veiculoDeCarga.add(veiculoCarga);
			
		} catch (VeicExistException veiculoExistente) {
			veiculoExistente.imprimeMensagemVeicExist();
			return false;
		}catch (VelocException verificaVolocidade) {
			verificaVolocidade.imprimeMensagemVelocidade();
			veiculoCarga.setVelocMax(90);
			veiculoDeCarga.add(veiculoCarga);
		}
		return true;
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
					JOptionPane.showMessageDialog(null, "Veículo encontrado com sucesso!","CARGA",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}	
	
	public static String verificaPlacaVeiculoCarga(String placa) throws VeicExistException {
		for (int i = 0; i < veiculoDeCarga.size(); i++) {
			if(veiculoDeCarga.get(i) != null) {
				if(placa.equalsIgnoreCase(veiculoDeCarga.get(i).getPlaca())) {
						throw new VeicExistException();
			}
		}

	}
		setPlaca(placa);
		return placa;
	}
	
	public static void excluirVeiculosCargaPelaPlaca(String placa) {
		int i = verificaVeiculosCargaPelaPlaca(placa);
		if (i >= 0) {
			veiculoDeCarga.remove(i);
			JOptionPane.showMessageDialog(null, "Veículo excluído com sucesso!","CARGA",JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Placa não existe!","CARGA",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static int verificaVeiculosCargaPelaPlaca(String placa) {
		int retorno = -1;
		for (int i = 0; (i < veiculoDeCarga.size()) && (veiculoDeCarga.get(i) != null); i++) {
			if (placa.equals(veiculoDeCarga.get(i).getPlaca())) {
				retorno = i;
			}
		}
		return retorno;
	}
}
