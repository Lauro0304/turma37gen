package exercicios1;

import java.util.Scanner;

public class Exercicio1quesito5java {

	public static void main(String[] args) {
		 
		Scanner ler = new Scanner(System.in);
		
		
		double a,b,c,media;
		
		
		System.out.println("Escreva a nota A: ");
		a= ler.nextDouble();
		System.out.println("Escreva a nota B: ");
		b= ler.nextDouble();
		System.out.println("Escreva a nota C: ");
		c= ler.nextDouble();
		
		
		media = (a+b+c)/3;
		
		
		System.out.printf("Sua media é de:%.2f ",media);
	
		
		
		
	}
	

}
