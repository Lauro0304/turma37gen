package app;

import java.util.Scanner;

import entities.aviao;

public class ModAviaoExercicio5Quesito2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String modelo, fabricante, companhia;
		int numPassageiros, preco;
		
		System.out.println("digite o modelo do avião: ");
		modelo = sc.next();
		System.out.println("digite o fabricante do avião: ");
		fabricante = sc.next();
		System.out.println("digite a companhia do avião: ");
		companhia = sc.next();
		System.out.println("digite a quantidade de passageiros do avião: ");
		numPassageiros = sc.nextInt();
		System.out.println("digite o preço do avião: ");
		preco = sc.nextInt();
		
		aviao aviao = new aviao(modelo, fabricante, companhia, numPassageiros, preco);
		System.out.println(aviao.toString());
		
		sc.close();

	}

}
