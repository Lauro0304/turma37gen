package exercico2;

import java.util.Scanner;

public class auxilio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int auxilioEmergencial;
		int quantFilhos,adcFilhos=50;
		char pronome,recebe;
		
		
		System.out.println("Qual seu nome? ");
		nome = leia.next();
		System.out.println("Voc� recebe outro auxilio? S/N: ");
		recebe = leia.next().toUpperCase().charAt(0);
			if(recebe=='N') {
				System.out.println("Quantos filhos voc� tem? ");
				quantFilhos = leia.nextInt();
				
		}
			
		
		else  {
		System.out.println("Voc� n�o tem direito a receber outro auxilio...");
			
			
		}
		
		
		
	
		
		
		
		

	}

}
