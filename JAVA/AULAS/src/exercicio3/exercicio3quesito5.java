package exercicio3;

import java.util.Scanner;

public class exercicio3quesito5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a=0,soma=0;
		
		do {
			System.out.print("Digite um n�mero: ");
			a=leia.nextInt();
			soma=soma+a;
			
		
		

		}while(a!=0);
		
		System.out.print("A soma dos valores � igual a: "+soma);
			
		
	
	}

}
