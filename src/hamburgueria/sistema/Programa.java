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

public class Programa {

	public static void main(String[] args) throws Exception {
		
		//Observação, caso você escreva "HamburguerDAO.metodo();" um erro vai ocorrer porque é o nome do método estático, com letra maíscula
		//A primeria letra deve ser minúscula para fazer o método de instância corretamente: nomeDoMetodoDAO.listar();
	
		SobremesaDAO sobremesaDAO = new SobremesaDAO();
		
		//Exemplo de salvar os itens da tabela Hamburgueres
		
			//Sobremesa sobremesa = new Sobremesa("asdasd", 123);
			//sobremesaDAO.atualizar(sobremesa);
		//Exemplo apagar ...
		
			//sobremesaDAO.apagar(2);
		
		//Exemplo de listar ...
			
				List<Sobremesa> listaS = sobremesaDAO.listar();
				
				/*	int id =4;
					for (Sobremesa s : listaS) {
						
							
							System.out.println(s.getId());								
						
					}
					String[] sobremesasLista = new String[20];
					
					for (int i=0; i<=0; i++) {
						
						
						sobremesasLista[i] = (s);								
					
					}
				 */
				
			
		//Exemplo burcarPorId (NF)...
		
			SobremesaDAO sobremesaDAO = new SobremesaDAO();
			sobremesaDAO.buscarPorId(getId(4));
					
		//Exemplo atualizar(NF) ...
		
			//sobremesaDAO.atualizar();
		
		
	}
}
