package app;

import java.util.Scanner;

import entities.pessoa;
import entities.produtos;

public class Cadloja {

	public static void main(String[] args) {

		produtos pro1 = new produtos();
		pessoa cad1 = new pessoa();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Cadastro de Produtos");
		System.out.print("Digite seu nome: ");
		cad1.nome = leia.next();
		System.out.print("Digite 1-masculino, 2- feminino, 3 neutre: ");
		char op = leia.next().charAt(0);
		if (op == '1') {
			cad1.pronome = 'o';
		} else if (op == '2') {
			cad1.pronome = 'a';
		} else {
			cad1.pronome = 'e';
		}
		System.out.print("Digite a quantidade de produtos\nque deseja comprar(1-10): ");
		pro1.estoque = leia.nextInt();
			if(pro1.estoque>10){ 
			System.out.println("Quantidade Indisponivel ");
		}
			if(pro1.estoque<0) {
				System.out.println("Quantidade Invalida.. ");
			}
			

	}

}
