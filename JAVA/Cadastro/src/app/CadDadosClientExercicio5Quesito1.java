package app;

import java.util.Scanner;

import entities.cliente;

public class CadDadosClientExercicio5Quesito1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		cliente client = new cliente();
		cliente client2 = new cliente();

		
		int cliente;

		client.nome = "Maria Antonia Silva";
		client.cpf = "111.222.333-22";
		client.numCadastro = 222;
		client.endereço = "Rua de Seu nunca, n°47";
		client.telefone = "(81)9.8449-8367";
		
		client2.nome = "Marcos Zureia Santos";
		client2.cpf = "741.555.222-69";
		client2.numCadastro = 122;
		client2.endereço = "Rua de Seu nunca, n°47-A";
		client2.telefone = "(81)9.8866-1241";
		
		
		System.out.println("Qual Cliente quer ver os dados(1|2)? ");
		cliente = leia.nextInt();
		if (cliente == 1) {
			
			System.out.println("Lojão dos Sonhos\nDados do Cliente-->");
			System.out.println("Nome: " + client.nome + "\nCPF: " + client.cpf + "\nNúmero de Cadastro:"
					+ client.numCadastro + "\nEndereço: " + client.endereço + "\nTelefone de Contato: " + client.telefone);
		}
			
		if(cliente ==2) {
				
				System.out.println("Lojão dos Sonhos\nDados do Cliente-->");
				System.out.println("Nome: " + client2.nome + "\nCPF: " + client2.cpf + "\nNúmero de Cadastro:"
						+ client2.numCadastro + "\nEndereço: " + client2.endereço + "\nTelefone de Contato: " + client2.telefone);
				
			}
		 
		
		

		
	
		
	}
	

}
