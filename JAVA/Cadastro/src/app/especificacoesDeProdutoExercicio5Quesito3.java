package app;

import java.util.Locale;
import java.util.Scanner;

import entities.produtoEletronico;

public class especificacoesDeProdutoExercicio5Quesito3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		produtoEletronico produto = new produtoEletronico();
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite o nome do Produto: ");
		produto.nomeProduto=leia.next();
		System.out.println("Digite o Preço do Produto: ");
		produto.preco=leia.nextDouble();
		System.out.println("Digite o Codigo do Produto: ");
		produto.codBarra=leia.nextInt();
		
		System.out.println(produto.toString());
		
		
		
		
		
		
		
		
		
		

	}

}
