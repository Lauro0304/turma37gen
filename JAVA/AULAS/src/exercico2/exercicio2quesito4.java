package exercico2;

import java.math.*;
import java.util.Scanner;

public class exercicio2quesito4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Entre com um número: ");
		numero = ler.nextInt();
		
		if(numero<0) {
			System.out.println("Digite um número NÃO negativo ");
		}
		else if(numero==0) {
			System.out.println("Esse número é nulo ");
		}
		
		else if((numero%2)!=0) {
			System.out.println("Esse número é Ímpar, e o resultado dele elevado ao Quadrado é de: "+ Math.pow(numero, 2));
			
		}
		else {
			System.out.println("esse número é Par, e a raiz quadrada dele é: "+ Math.sqrt(numero));
		}
		
		
		
		
		
		
		}
	

}
