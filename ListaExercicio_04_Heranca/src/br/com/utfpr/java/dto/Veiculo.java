/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.dto;

public abstract class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private float velocMax;
	private Motor motor;
	
	public Veiculo() {
		this.placa = " ";
		this.marca = " ";
		this.modelo = " ";
		this.velocMax = 0;
		this.motor = new Motor();
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

	final public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
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
				"VelocMax do veículo é: " + velocMax + "\n" +
				"Motor do veículo é: \n" + motor + "\n";
	}
	
	protected abstract float calcVel(float velocMax);

}
