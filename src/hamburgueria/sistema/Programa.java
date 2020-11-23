package hamburgueria.sistema;

import hamburgueria.DAO.SobremesaDAO;
import hamburgueria.model.Sobremesa;

import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws Exception {
		
		//listar, listarPorId
	
		SobremesaDAO sobremesaDAO = new SobremesaDAO();
		Scanner leitor = new Scanner(System.in);
		
		int op;
		int id;
		double valor;
		String nome;
		
		do {
			//menu para selecionar realizar crud sobremesa
			System.out.println("Informe a ação para sobremesa:");
			System.out.println("1- Salvar nova sobremesa");
			System.out.println("2- Apagar soremesa");
			System.out.println("3- Listar sobremesa");
			System.out.println("4- Buscar por Id");
			System.out.println("5- Finalizar operações");
			op = leitor.nextInt();
			
			switch(op) {
				//Exemplo de salvar os itens da tabela sobremesas
				case 1: {				
					System.out.println("insira o nome da nova sobremesa");
					nome = leitor.next();
					System.out.println("insira o valor da nova sobremesa");
					valor = leitor.nextDouble();
					Sobremesa sobremesa = new Sobremesa(nome,valor);
					sobremesaDAO.salvar(sobremesa);
					break;
				}
				case 2: {
					//Exemplo apagar ...
					System.out.println("insira o id da sobremesa que deseja apagar");
					id = leitor.nextInt();
					sobremesaDAO.apagar(id);
					break;
				}
				case 3: {					
					//Exemplo de listar ...
					List<Sobremesa> listaS = sobremesaDAO.listar();
					
					System.out.println("\n\n");
					for (Sobremesa s : listaS) {
						System.out.println("\t" + s);								
					}
					System.out.println("\n\n");
					break;
				}
				case 4: {
					//Exemplo burcarPorId ...	
					System.out.println("insira um id para ver a sobremesa");
					id = leitor.nextInt();
					System.out.println("\n\n");
					System.out.println("\t" + sobremesaDAO.buscarPorId(id));
					System.out.println("\n\n");

					break;
				}
				case 5: {
					System.out.println("operações em sobremesa concluídas");
					break;
				}
				default : {
					System.out.println("valor inserido para opção inválido");
					break;
				}
			}
		}while(op != 5);
		leitor.close();
	}
}
