package avaliacao;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Arquivo arquivo = new Arquivo("veiculos");
		List<Veiculo> lista;
		int opcao;	
		
		System.out.println("SISTEMA DE CADASTRO DE VEICULOS");
		
		do {
			System.out.println("====== MENU =============");
			System.out.println("1    : CADASTRAR VEICULO");
			System.out.println("2    : ALTERAR QUILOMETRAGEM");
			System.out.println("3    : EXCLUIR VEICULO");
			System.out.println("4    : SAIR");
			System.out.println("=========================");
			System.out.print("OPCAO: ");
			opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch (opcao) {
			case 1: 
				boolean existe = false;
				
				System.out.println("\nPLACA : ");
				String placa = teclado.nextLine();
				
				System.out.print("MODELO:");
				String modelo = teclado.nextLine();
				
				System.out.print("MARCA :");
				String marca = teclado.nextLine();
				
				System.out.print("ANO   :");
				int anoFab = teclado.nextInt();
				teclado.nextLine();
				
				System.out.print("KM's  :");
				Double kms = teclado.nextDouble();
				teclado.nextLine();
				
				Veiculo veiculo = new Veiculo(placa, modelo, marca, anoFab, kms);
				lista = arquivo.leArquivo();
				
				for (Veiculo v : lista) {
				    if (v.getPlaca().equalsIgnoreCase(placa)) {
				        existe = true;
				        break;
				    }
				}
				
				if (existe) {
					System.out.println("\nVeiculo JA EXISTE!\n");
				} else {
					lista.add(veiculo);
					arquivo.gravaArquivo(lista);
					System.out.println("\nVeiculo CADASTRADO!\n");
				}
				
				break;
			
			case 2: 
				existe = false;
				lista = arquivo.leArquivo();

				System.out.print("\nDigite a PLACA do veiculo: ");
				String placaBusca = teclado.nextLine();
				
				System.out.print("Digite a NOVA quilometragem: ");
				double novaKm = teclado.nextDouble();
				teclado.nextLine();
	
				for (Veiculo v : lista) {
					if (v.getPlaca().equalsIgnoreCase(placaBusca)) {
						v.setQuilometragem(novaKm);
						existe = true;
						break;
					}
				}
				
				if (existe) {
					arquivo.gravaArquivo(lista);
					System.out.println("\nQuilometragem ALTERADA!\n");
				} else { 
					System.out.println("\nVeiculo NAO ENCONTRADO!\n");
				}
				
				break;
			
			case 3: 
				existe = false;
				lista = arquivo.leArquivo();
				
				System.out.print("\nDigite a PLACA do veiculo: ");
				placaBusca = teclado.nextLine();

				// pra deletar ou adicionar na lista, tem q percorrer por indice
				for (int i = 0; i < lista.size(); i++) { 
					if (lista.get(i).getPlaca().equalsIgnoreCase(placaBusca)) {
						lista.remove(i);
						existe = true;
						break;
					}
				}
				
				if (existe) {
					arquivo.gravaArquivo(lista);;
					System.out.println("Veiculo EXCLUIDO!\n");
				} else {
					System.out.println("Veiculo NAO ENCONTRADO!\n");
				}
				
				break;
			
			case 4: 
				System.out.println("FINALIZANDO o programa...");
				break;
			
			default:
				System.out.println("Opcao " + opcao + " INVALIDA!\n");
			}
			
		} while (opcao != 4); 
		
		teclado.close();

	}
}
