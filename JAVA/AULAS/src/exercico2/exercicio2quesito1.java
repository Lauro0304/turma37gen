package exercico2;

import java.util.Scanner;

public class exercicio2quesito1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("escreva o n�mero A: ");
		a=ler.nextInt();
		System.out.println("escreva o n�mero B: ");
		b=ler.nextInt();
		System.out.println("escreva o n�mero C: ");
		c=ler.nextInt();
		
			if(a>b) {
				if (a>c) {
						System.out.println(a+" � o maior n�mero");	
		}
				else if(b>a) {
					if(b>c) {
						System.out.println(b+" � o maior n�mero"); 
			 } 
		 }
				else
						System.out.println(c+" � o maior n�mero");	
		}
	}
}
