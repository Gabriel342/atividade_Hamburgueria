package hamburgueria.sistema;

import hamburgueria.DAO.AcompanhamentoDAO;
import hamburgueria.DAO.BebidaDAO;
import hamburgueria.DAO.ComboDAO;
import hamburgueria.DAO.DAO;
import hamburgueria.DAO.HamburguerDAO;
import hamburgueria.DAO.SobremesaDAO;
import hamburgueria.model.Acompanhamento;
import hamburgueria.model.Bebida;
import hamburgueria.model.Combo;
import hamburgueria.model.Hamburguer;
import hamburgueria.model.Sobremesa;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Id;

public class Programa {

	public static void main(String[] args) throws Exception {
		
		//listar, listarPorId
		//Observa��o, caso voc� escreva "HamburguerDAO.metodo();" um erro vai ocorrer porque � o nome do m�todo est�tico, com letra ma�scula
		//A primeria letra deve ser min�scula para fazer o m�todo de inst�ncia corretamente: nomeDoMetodoDAO.listar();
	
		//SobremesaDAO sobremesaDAO = new SobremesaDAO();
		//Scanner leitor = new Scanner(System.in);
		
		//Exemplo de salvar os itens da tabela sobremesas
		/*
			String nome;
			int valor;
			System.out.println("insira uma nova sobremesa");
			nome = leitor.next();
			System.out.println("insira o valor da nova sobremesa");
			id = leitor.nextDouble();
			Sobremesa sobremesa = new Sobremesa(nome,valor);
			sobremesaDAO.salvar(sobremesa);
		*/
		
		//Exemplo apagar ...
		/*
			int id;
			id = leitor.nextInt();
			sobremesaDAO.apagar(id);
		*/
		//Exemplo de listar ...
		/*
				List<Sobremesa> listaS = sobremesaDAO.listar();
				
					for (Sobremesa id : listaS) {
					
						System.out.println(id.getValor());								
					}
		*/	
		//Exemplo burcarPorId ...
		
		Integer id = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("insira um id para ver a sobremesa");
		id = leitor.nextInt();
		
			SobremesaDAO sobremesaDAO = new SobremesaDAO();
			System.out.println(sobremesaDAO.buscarPorId(id));
		

	}
}
