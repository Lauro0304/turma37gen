package exercicio3;

import java.util.Scanner;

public class exercicio3quesito3 {

	public static void main(String[] args) {

		Scanner idade = new Scanner(System.in);

		int id = 0, menor = 0, maior = 0;

		while (id < 99) {

			System.out.println("Escreva sua idade: ");
			id = idade.nextInt();

			if (id < 21 && id > 0) {
				System.out.println("");
				menor++;

			} else if ((id == 0 || id < 0) && id != -99) {
				System.out.println("Você digitou um número inválido!");
			} else {
				maior++;
			}
		}
		System.out.println("Total de pessoas menores de idade " + menor);
		System.out.println("Total de pessoas maiores de idade " + maior);

	}

}
