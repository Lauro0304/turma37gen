package exercicio4;

import java.util.Scanner;

public class exercicio4quesito1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeros[] = new int[5];
		int maiorNum = 0;

		for (int x = 0; x < 5; x++) {
			System.out.println("Digite um valor: ");
			numeros[x] = leia.nextInt();

			if (numeros[x] > maiorNum) {
				maiorNum = numeros[x];
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(numeros[i] + "\t");
		}
		System.out.println("\nA maior pontuacao do vetor é:" + maiorNum);
	}
}
