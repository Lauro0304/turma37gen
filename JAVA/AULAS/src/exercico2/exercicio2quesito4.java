package exercico2;

import java.math.*;
import java.util.Scanner;

public class exercicio2quesito4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Entre com um n�mero: ");
		numero = ler.nextInt();
		
		if(numero<0) {
			System.out.println("Digite um n�mero N�O negativo ");
		}
		else if(numero==0) {
			System.out.println("Esse n�mero � nulo ");
		}
		
		else if((numero%2)!=0) {
			System.out.println("Esse n�mero � �mpar, e o resultado dele elevado ao Quadrado � de: "+ Math.pow(numero, 2));
			
		}
		else {
			System.out.println("esse n�mero � Par, e a raiz quadrada dele �: "+ Math.sqrt(numero));
		}
		
		
		
		
		
		
		}
	

}
