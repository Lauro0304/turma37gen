package exercicios1;
import java.util.Scanner;

public class Exercicio1quesito8java {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valor,total1,total2,totalfinal;
		
		
		System.out.println("qual o valor do carro na fabrica? ");
		valor = ler.nextInt();
		
		
		total1 = valor-(valor*0.28);
		
		total2 = valor-(valor*0.45);
		
		totalfinal = total1+total2;
		
		System.out.println("esse é o total que você pagará pelo carro "+totalfinal);
		
		
		

	}

}
