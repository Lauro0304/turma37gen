package exercicios1;
import java.util.Scanner;

public class Exercicio1quesito3java {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		int segundos,a=60,b,hora;
		
		System.out.println("Quantos Segundos durara o evento?");
		segundos = ler.nextInt();
		
		b = segundos/a;
		hora = b/a;
		
		System.out.println("o evento durara " +hora+ " horas, "+ b + " minutos e "+segundos+" segundos" );
	}

}
