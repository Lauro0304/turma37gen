package exercicio3;

import java.util.Scanner;

public class exercicio3quesito2 {

	public static void main(String[] args) {
	
		Scanner num = new Scanner(System.in);
	
		int numero=0, impar=0, par=0;
		
		
		
		 for (int x=0;x<=9;x++) {
			 System.out.print("Escreva um número: ");
				numero = num.nextInt();
			 if(numero%2==0 && numero>0) {
				 par++; 
			 } 	 
		 
		     if(numero%2!=0 && numero>0) {
			 impar++;
		 }
		     
		 
		 
	 }
		 System.out.println("Quantidade de numeros pares: "+ par);
		 System.out.println("Quantidade de numeros ípares: "+ impar);
	

	}

}
