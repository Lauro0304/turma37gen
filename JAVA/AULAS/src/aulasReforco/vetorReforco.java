package aulasReforco;

import java.util.Scanner;

public class vetorReforco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int tab, x;
		int vetorAula[] = new int[11];

		System.out.printf("Escreva o n�mero da t�buada: ");
		tab = leia.nextInt();
		if (tab > 0) {
			for (x = 1; x <= 10; x++) {
				vetorAula[x] = x * tab;
				System.out.println(tab + "x" + x + "=" + vetorAula[x]);
			}
		} else if (tab <= 0) {
			System.out.println("Escreva um n�mero n�o negativo...");

		}
	}
}
