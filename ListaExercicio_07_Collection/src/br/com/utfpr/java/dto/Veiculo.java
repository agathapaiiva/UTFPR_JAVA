/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.dto;

import br.com.utfpr.java.exceptions.VelocException;

public abstract class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int qtdRodas;
	private float velocMax;
	private Motor motor;
	
	public Veiculo() {
		this.placa = " ";
		this.marca = " ";
		this.modelo = " ";
		this.cor = " ";
		this.qtdRodas = 0;
		this.velocMax = 0;
		this.motor = new Motor();
	}
	
	public String getCor() {
		return cor;
	}

	final public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	final public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public String getPlaca() {
		return placa;
	}

	final public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	final public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	final public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(float velocMax) throws VelocException {

		float velocMinima = 80;
		float velocMaxima = 110;
		
		if(velocMax >= velocMinima && velocMax <= velocMaxima) {
			this.velocMax = velocMax;
		} else {
			throw new VelocException();
		}
	}

	public Motor getMotor() {
		return motor;
	}

	final public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	@Override
	public String toString() {
		return 	"Placa do veículo é: " + placa + "\n" +
				"Marca do veículo é: " + marca + "\n" +
				"Modelo do veículo é: " + modelo + "\n" +
				"Cor do veículo é: " + cor + "\n"+
				"Quantidade de Rodas: " + qtdRodas + "\n" +
				"VelocMax do veículo é: " + velocMax + "\n" +
				"Velocidade convertida é: " + calcVel(velocMax) + "\n";
	}
	
	public abstract float calcVel(float velocMax);

}
