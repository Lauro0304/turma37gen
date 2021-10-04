package exercico2;

import java.util.Scanner;

public class exercicio2quesito1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("escreva o número A: ");
		a=ler.nextInt();
		System.out.println("escreva o número B: ");
		b=ler.nextInt();
		System.out.println("escreva o número C: ");
		c=ler.nextInt();
		
			if(a>b) {
				if (a>c) {
						System.out.println(a+" é o maior número");	
		}
				else if(b>a) {
					if(b>c) {
						System.out.println(b+" é o maior número"); 
			 } 
		 }
				else
						System.out.println(c+" é o maior número");	
		}
	}
}
