import java.util.Scanner;

public class exercicio2quesito3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
				
		String nome;
		int idade;
		
		System.out.println("Qual sua idade? ");
		idade=ler.nextInt();
		
		if(idade<0) {
			System.out.println("Você digitou uma idade inválida");
		}
		
		else if(idade==0) {
			System.out.println("Você ainda é um bebê, como está digitando?");
		}
		
		else if(idade<=14) {
			System.out.println("Você ainda tem uma idade Infantil");
			
		}
		else if(idade<=17) {
			System.out.println("Você tem uma idade Juvenil");
			
		}
		else
			System.out.println("Você é tem a idade de um Adulto");
		
		
		
	}

}
