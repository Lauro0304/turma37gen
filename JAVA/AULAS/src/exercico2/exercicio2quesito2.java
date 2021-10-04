package exercico2;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio2quesito2 {

	public static void main(String[] args)
	{
		
	Scanner numero = new Scanner(System.in);

	int[] numeroDigitado = new int[4];
	           
	          
	           for (int i=1; i<numeroDigitado.length; i++) 
	           {
		           System.out.print("Digite "+ i + "° numeros: "); 
		           numeroDigitado[i] = (numero.nextInt());
		       }
	           
	           
	           Arrays.sort(numeroDigitado);
	           
	           
	     
	          System.out.print("Ordem crescente:    "); 
	       	  for (int j = 1; j < numeroDigitado.length; j++) 
	       	  {
	       		System.out.print(numeroDigitado[j]+ "  ");       		
			  }
	       	  
	       	           
	        	 
	}
	}

