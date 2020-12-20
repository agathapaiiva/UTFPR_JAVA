/**
 * @author agatha-paiva
 */

package br.com.utfpr.java.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.utfpr.java.implement.BDVeiculos;
import br.com.utfpr.java.implement.Leitura;

public class Main {
	static BDVeiculos bdveiculos = new BDVeiculos();
	static Leitura leitura = new Leitura();
	static Scanner entradaDado = new Scanner(System.in);

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		try {
			int op;
			
			do {
				op = Integer.parseInt(leitura.entDados());

				switch (op) {
				case 1:
					System.out.println("================================================================");
					System.out.println("  		      CADASTRANDO UM VEÍCULO DE PASSEIO");
					System.out.println("================================================================\n");
					bdveiculos.cadastrarVeiculoPasseio();
					break;
				case 2:
					System.out.println("================================================================");
					System.out.println("  		      CADASTRANDO UM VEÍCULO DE CARGA");
					System.out.println("================================================================\n");
					bdveiculos.cadastrarVeiculoCarga();
					break;
				case 3:
					System.out.println("================================================================");
					System.out.println("  		      TODOS OS VEÍCULOS DE PASSEIO");
					System.out.println("================================================================\n");
					for (int i = 0; i < bdveiculos.getVeiculoDePasseio().size(); i++) {
						if(bdveiculos.getVeiculoDePasseio().get(i) != null) {
							System.out.println("\nDados do veículo de PASSEIO cadastrados pelo usuário " + "\n" + bdveiculos.getVeiculoDePasseio().get(i));
							System.out.println("================================================================");
						}
						
					}
					JOptionPane.showMessageDialog(null, "Todos os veiculos de passeio foram apresentados no console: ", "PASSEIO",
							JOptionPane.WARNING_MESSAGE);
					break;
				case 4:
					System.out.println("================================================================");
					System.out.println("  		      TODOS OS VEÍCULOS DE CARGA");
					System.out.println("================================================================\n");
					for (int i = 0; i < bdveiculos.getVeiculoDeCarga().size(); i++) {
						if(bdveiculos.getVeiculoDeCarga().get(i) != null) {
							System.out.println("\nDados do veículo de CARGAS cadastrados pelo usuário " + "\n" + bdveiculos.getVeiculoDeCarga().get(i));
							System.out.println("================================================================");
						}
					}
					JOptionPane.showMessageDialog(null, "Todos os veiculos de carga foram apresentados no console: ",
							"CARGA",JOptionPane.WARNING_MESSAGE);
					break;
				case 5:
					System.out.println("================================================================");
					System.out.println("  		         PESQUISA DE VEÍCULO PASSEIO");
					System.out.println("================================================================\n");
					System.out.println("Digite a placa do veículo PASSEIO que deseja pesquisar.");
					bdveiculos.setPlaca(entradaDado.next());  
					bdveiculos.pesquisaPlacaPasseio(bdveiculos.getPlaca());
					System.out.println("================================================================");
					break;
				case 6: 
					System.out.println("================================================================");
					System.out.println("  		         PESQUISA DE VEÍCULO CARGA");
					System.out.println("================================================================\n");
					System.out.println("Digite a placa do veículo CARGAS que deseja pesquisar.");
					bdveiculos.setPlaca(entradaDado.next());
					bdveiculos.pesquisaPlacaCarga(bdveiculos.getPlaca());
					System.out.println("================================================================");
					break;
				case 7: 
					System.out.println("================================================================");
					System.out.println("  		       EXCLUIR VEÍCULO DE PASSEIO PELA PLACA");
					System.out.println("================================================================\n");
					System.out.println("Digite a placa do veículo: ");
					bdveiculos.setPlaca(entradaDado.next());
					bdveiculos.excluirVeiculosPasseioPelaPlaca(bdveiculos.getPlaca());
					System.out.println("================================================================");
					break;
				case 8:
					System.out.println("================================================================");
					System.out.println("  		       EXCLUIR VEÍCULO DE CARGA PELA PLACA");
					System.out.println("================================================================\n");
					System.out.println("Digite a placa do veículo: ");
					bdveiculos.setPlaca(entradaDado.next());
					bdveiculos.excluirVeiculosCargaPelaPlaca(bdveiculos.getPlaca());
					System.out.println("================================================================");
					break;
					
				case 9:
					System.out.println("Sair do Sistema");
				default:
					break;
				}

			} while (op != 9);
			entradaDado.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Sistema Encerrado!", "Cancelar", JOptionPane.CLOSED_OPTION);
		}
		
	}
	
}