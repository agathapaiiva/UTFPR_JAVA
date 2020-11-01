/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.dto;

/**
 * classe FILHA - Uma classe especializada 
 */

public class Professor extends Pessoa{
	private String titulo;
	private float salario;
	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the salario
	 */
	public float getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
}
