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
		client.endere�o = "Rua de Seu nunca, n�47";
		client.telefone = "(81)9.8449-8367";
		
		client2.nome = "Marcos Zureia Santos";
		client2.cpf = "741.555.222-69";
		client2.numCadastro = 122;
		client2.endere�o = "Rua de Seu nunca, n�47-A";
		client2.telefone = "(81)9.8866-1241";
		
		
		System.out.println("Qual Cliente quer ver os dados(1|2)? ");
		cliente = leia.nextInt();
		if (cliente == 1) {
			
			System.out.println("Loj�o dos Sonhos\nDados do Cliente-->");
			System.out.println("Nome: " + client.nome + "\nCPF: " + client.cpf + "\nN�mero de Cadastro:"
					+ client.numCadastro + "\nEndere�o: " + client.endere�o + "\nTelefone de Contato: " + client.telefone);
		}
			
		if(cliente ==2) {
				
				System.out.println("Loj�o dos Sonhos\nDados do Cliente-->");
				System.out.println("Nome: " + client2.nome + "\nCPF: " + client2.cpf + "\nN�mero de Cadastro:"
						+ client2.numCadastro + "\nEndere�o: " + client2.endere�o + "\nTelefone de Contato: " + client2.telefone);
				
			}
		 
		
		

		
	
		
	}
	

}
