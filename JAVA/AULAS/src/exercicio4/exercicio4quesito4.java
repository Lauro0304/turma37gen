package exercicio4;

import java.util.Scanner;

public class exercicio4quesito4 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int soma = 0;
		int somaDiagonal = 0;

		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.printf("Insira os valores da Matriz [%d] [%d]: ", linha + 1, coluna + 1);
				matriz[linha][coluna] = leia.nextInt();

			}
		}
		System.out.println("\n A matrix foi: \n ");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.printf("\t %d \t", matriz[linha][coluna]);

				soma = soma + matriz[linha][coluna];

				if (linha == coluna) {
					somaDiagonal += matriz[linha][coluna];

				}

			}
			System.out.println();
			System.out.println();

		}
		System.out.println("Soma de toda a matriz: " + soma);
		
		System.out.println("Soma do números da diagonal: "+somaDiagonal);

	}
}